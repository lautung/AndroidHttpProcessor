package com.lautung.httpprocessor.httpprocessor;

/**
 * 顶层的回调接口
 */
public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
