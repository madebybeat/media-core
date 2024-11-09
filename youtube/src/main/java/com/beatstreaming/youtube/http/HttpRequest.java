package com.beatstreaming.youtube.http;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import lombok.SneakyThrows;

public class HttpRequest extends com.beatstreaming.core.http.HttpRequest {
    public HttpRequest(Context context, int method) {
        super(context, method);
    }

    @SneakyThrows
    @Override
    protected void load(URI url) {
        super.load(new URIBuilder(url).setScheme("https").setHost("https://www.youtube.com").build());
    }

    @Override
    public StringRequest getRequest() {
        return new StringRequest(Request.Method.GET, url.toString(), this::onLoad, this::onError) {
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> headers = new HashMap<>();

                headers.put("User-Agent", "com.google.android.youtube/19.35.36(Linux; U; Android 13; en_US; SM-S908E Build/TP1A.220624.014) gzip");

                return headers;
            }
        };
    }
}
