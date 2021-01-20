package com.zlz.base;

/**
 * Created by zzl on 2021-01-08.
 */
public class Ajson {
    private String code="0000";
    private String msg;
    private String token;
    private Object vo;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getVo() {
        return vo;
    }

    public void setVo(Object vo) {
        this.vo = vo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
