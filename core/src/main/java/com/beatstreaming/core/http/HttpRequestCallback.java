package com.beatstreaming.core.http;

public abstract class HttpRequestCallback<T> {
    public void onLoad(String data) {
    }

    public void onLoad(T data) {
    }
}
