package com.py.springboot.base;

import com.py.springboot.enums.StateEnum;

/**
 * BaseResult
 * 统一的返回对象
 *
 * @author pysasuke
 * @date 2017/9/14
 */
public class BaseResult<T> {

    private Integer state;

    private String message;

    private T data;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResult(T data) {
        this.data = data;
    }

    public BaseResult(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public BaseResult(Integer state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "state=" + state +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public static BaseResult success() {
        return new BaseResult(StateEnum.SUCCESS.getState(), StateEnum.SUCCESS.getStateInfo());
    }

    public static BaseResult error() {
        return new BaseResult(StateEnum.FAIL.getState(), StateEnum.FAIL.getStateInfo());
    }
}
