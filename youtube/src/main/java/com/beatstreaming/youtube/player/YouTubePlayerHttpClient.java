package com.beatstreaming.youtube.player;

import com.beatstreaming.youtube.entity.payload.YouTubePlayer;
import com.google.gson.Gson;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

public class YouTubePlayerHttpClient extends OkHttpClient {
    @Override
    public List<Interceptor> interceptors() {
        this.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                chain.proceed(new Request.Builder()
                        .url(new HttpUrl.Builder()
                                .scheme("https")
                                .host("www.youtube.com")
                                .addPathSegment("youtubei/v1/player")
                                .build())
                        .addHeader("User-Agent", "")
                        .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), new Gson().toJson(new YouTubePlayer(chain.request().urlString()))))
                        .build());

                return null;
            }
        });

        return super.interceptors();
    }
}