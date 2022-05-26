package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangz1
 * @since 2022/5/13 19:21
 */
public class RestResponse {
    private Integer status;
    private String message;
    private List<?> data = new ArrayList<>();

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
