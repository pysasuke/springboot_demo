package com.py.springboot.enums;

/**
 * StateEnum
 * 状态码枚举类
 * @author pysasuke
 * @date 2017/9/14
 */
public enum StateEnum {
    SUCCESS(200, "操作成功"),
    FAIL(10000, "操作失败");

    private int state;

    private String stateInfo;

    private StateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static StateEnum stateOf(int index) {
        for (StateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
