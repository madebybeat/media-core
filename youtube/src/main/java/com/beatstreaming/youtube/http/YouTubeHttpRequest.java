package com.beatstreaming.youtube.http;

import android.content.Context;

import com.beatstreaming.core.http.HttpRequest;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;

import lombok.SneakyThrows;

public class YouTubeHttpRequest extends HttpRequest {
    public YouTubeHttpRequest(Context context, int method) {
        super(context, method);
    }

    @SneakyThrows
    @Override
    protected void load(URI url) {
        super.load(new URIBuilder(url).setScheme("https").setHost("https://www.youtube.com").build());
    }
}
