package com.beatstreaming.youtube.player;

import androidx.annotation.NonNull;

import com.beatstreaming.youtube.http.YouTubePlayerRequest;
import com.beatstreaming.youtube.http.YouTubePlayerResponse;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class YouTubePlayerHttpClient extends OkHttpClient {
    public YouTubePlayerHttpClient() {
        this.interceptors().add(new Interceptor() {
            @NonNull
            @Override
            public Response intercept(@NonNull Chain chain) throws IOException {
                Response response = chain.proceed(new Request.Builder()
                        .url(new HttpUrl.Builder()
                                .scheme("https")
                                .host("www.youtube.com")
                                .addPathSegment("youtubei/v1/player")
                                .build())
                        .addHeader("User-Agent", "")
                        .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), new Gson().toJson(new YouTubePlayerRequest(chain.request().url().queryParameter("id")))))
                        .build());

                try (ResponseBody responseBody = response.body()) {
                    if (responseBody == null) {
                        return chain.proceed(chain.request());
                    }

                    YouTubePlayerResponse youTubePlayerResponse = new Gson().fromJson(responseBody.string(), YouTubePlayerResponse.class);
                    String uri = youTubePlayerResponse.getStreamingData().getAdaptiveFormats()[0].getUrl();

                    Request request = new Request.Builder().url(uri).build();

                    responseBody.close();

                    return chain.proceed(request);
                }
            }
        });
    }
}