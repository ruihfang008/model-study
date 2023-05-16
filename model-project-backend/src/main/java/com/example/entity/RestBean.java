package com.example.entity;

import lombok.Data;

/**
 * 其他bean
 * REST风格
 *
 * @author lulufang
 * @date 2023/05/16
 */
@Data
public class RestBean<T> {
    private int status;
    private boolean success;
    private T message;

    /**
     * 其他bean
     *
     * @param status  状态
     * @param success 成功
     * @param message 消息
     */
    private RestBean(int status, boolean success, T message) {
        this.status = status;
        this.success = success;
        this.message = message;
    }

    public static <T> RestBean<T> success() {
        return new RestBean<>(200, true, null);
    }

    public static <T> RestBean<T> success(T data) {
        return new RestBean<>(200, true, data);
    }

    public static <T> RestBean<T> failure(int status) {
        return new RestBean<>(status, false, null);
    }

    public static <T> RestBean<T> failure(int status, T data) {
        return new RestBean<>(status, false, data);
    }
}
