package com.design.pattern.strategy.service.impl;

import com.design.pattern.strategy.service.Strategy;
import org.springframework.stereotype.Service;

/**
 * @author zhaoj
 * @version StrategyB.java, v 0.1 2019-12-28 16:09
 */
@Service(value = "strategyB")
public class StrategyB implements Strategy {
    /**
     * 策略方法
     */
    @Override
    public String method() {
        return "我是B策略实现方案！";
    }
}
