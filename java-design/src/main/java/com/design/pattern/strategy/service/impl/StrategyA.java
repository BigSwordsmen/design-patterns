package com.design.pattern.strategy.service.impl;

import com.design.pattern.strategy.service.Strategy;
import org.springframework.stereotype.Service;

/**
 * @author zhaoj
 * @version StrategyA.java, v 0.1 2019-12-28 16:07
 */
@Service(value = "strategyA")
public class StrategyA implements Strategy {
    /**
     * 策略方法
     */
    @Override
    public String method() {
        return "我是A策略实现方案！";
    }
}
