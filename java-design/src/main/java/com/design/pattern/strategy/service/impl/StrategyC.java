package com.design.pattern.strategy.service.impl;

import com.design.pattern.strategy.service.Strategy;
import org.springframework.stereotype.Service;

/**
 * @author zhaoj
 * @version StrategyC.java, v 0.1 2019-12-28 16:10
 */
@Service(value = "strategyC")
public class StrategyC implements Strategy {
    /**
     * 策略方法
     */
    @Override
    public String method() {
        return "我是C策略实现方案！";
    }
}
