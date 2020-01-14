package com.design.pattern.strategy;

/**
 * @author zhaoj
 * @version StrategyEnum.java, v 0.1 2019-12-28 17:38
 */
public enum StrategyEnum {
    /**
     * 策略枚举类
     */
    STRATEGY_A(1, "strategyA"),
    STRATEGY_B(2, "strategyB"),
    STRATEGY_C(3, "strategyC");

    private Integer code;

    private String name;

    StrategyEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static StrategyEnum getByCode(Integer code) {
        StrategyEnum[] values = StrategyEnum.values();
        for (StrategyEnum strategyEnum : values) {
            if (strategyEnum.getCode().equals(code)) {
                return strategyEnum;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }
}
