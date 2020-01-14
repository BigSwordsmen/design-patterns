/**
 * fshows.com
 * Copyright (C) 2013-2019 All Rights Reserved.
 */
package com.design.pattern.strategy.test;

import com.design.pattern.strategy.context.StrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoj
 * @version StrategyController.java, v 0.1 2019-12-28 16:12
 */
@RestController
public class StrategyController {

    @Autowired
    private StrategyContext context;

    @RequestMapping("/method")
    public String method(Integer code) {
        return context.getInstance(code).method();
    }
}
