package com.it.controller;

public class Result {
    private Object data;
    private Integer code;
    private String msc;

    public Result() {
    }

    public Result( Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    public Result( Integer code,Object data, String msc) {
        this.data = data;
        this.code = code;
        this.msc = msc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsc() {
        return msc;
    }

    public void setMsc(String msc) {
        this.msc = msc;
    }
}
