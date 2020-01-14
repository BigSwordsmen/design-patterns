package com.design.pattern.strategy.context;

import com.design.pattern.strategy.service.Strategy;
import com.design.pattern.strategy.StrategyEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhaoj
 * @version StrategyContext.java, v 0.1 2019-12-28 16:26
 */

@Component
public class StrategyContext {
    private final Map<String, Strategy> strategyMap = new ConcurrentHashMap<>();
    //方式一

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    private void init() {
        strategyMap.putAll(applicationContext.getBeansOfType(Strategy.class));
    }

    //方式二

    @Autowired
    public StrategyContext(Map<String, Strategy> strategyMap) {
        this.strategyMap.clear();
        strategyMap.forEach((k, v) -> this.strategyMap.put(k, v));
    }

    public Strategy getInstance(Integer code) {
        String beanName = StrategyEnum.getByCode(code).getName();
        return this.getInstanceByBeanName(beanName);
        //return this.getInstanceByBeanName2(beanName);
    }

    private Strategy getInstanceByBeanName(String beanName) {
        if (!StringUtils.isEmpty(beanName)) {
            return strategyMap.get(beanName);
        }
        return null;
    }

    private Strategy getInstanceByBeanName2(String beanName) {
        if (!StringUtils.isEmpty(beanName)) {
            return (Strategy) applicationContext.getBean(beanName);
        }
        return null;
    }


}
