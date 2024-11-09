package com.beatstreaming.youtube.player;

import androidx.annotation.NonNull;

import com.beatstreaming.youtube.http.YouTubePlayerRequest;
import com.beatstreaming.youtube.http.YouTubePlayerResponse;
import com.google.gson.Gson;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class YouTubePlayerInterceptor implements Interceptor {
    @NonNull
    @Override
    @SneakyThrows
    public Response intercept(@NonNull Chain chain) {
        Response response = chain.proceed(new Request.Builder()
                .url(new URIBuilder()
                        .setScheme("https")
                        .setHost("www.youtube.com")
                        .setPathSegments("youtubei", "v1", "player")
                        .build().toURL())
                .addHeader("User-Agent", "com.google.android.youtube/19.35.36(Linux; U; Android 13; en_US; SM-S908E Build/TP1A.220624.014) gzip")
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
}