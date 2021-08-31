package com.tang.blog.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shengyi
 * @create 2021/8/24 - 21:04
 *
 * 消息处理类，code为状态码，200表示请求成功，400表示请求失败
 * 有两个默认静态的无参构造器，请求成功或失败时调用
 */

public class Message {
    private int code;
    private String msg;
    private Object data;

    public static Message success(Object data) {
        Message result = new Message();
        result.setCode(200);
        result.setMsg("请求成功");
        if (data != null) {
            result.setData(data);
        } else {
            result.setData("");
        }
        return result;
    }


    public static Message fail(Object data) {
        Message result = new Message();
        result.setCode(400);
        result.setMsg("请求失败");
        if (data != null) {
            result.setData(data);
        } else {
            result.setData("");
        }
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
