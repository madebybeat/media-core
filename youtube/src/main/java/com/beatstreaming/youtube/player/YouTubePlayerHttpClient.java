package com.beatstreaming.youtube.player;

import com.beatstreaming.youtube.http.YouTubePlayerRequest;
import com.beatstreaming.youtube.http.YouTubePlayerResponse;
import com.google.gson.Gson;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.util.List;

public class YouTubePlayerHttpClient extends OkHttpClient {
    @Override
    public List<Interceptor> interceptors() {
        this.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(new Request.Builder()
                        .url(new HttpUrl.Builder()
                                .scheme("https")
                                .host("www.youtube.com")
                                .addPathSegment("youtubei/v1/player")
                                .build())
                        .addHeader("User-Agent", "")
                        .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), new Gson().toJson(new YouTubePlayerRequest(chain.request().httpUrl().queryParameter("id")))))
                        .build());

                try (ResponseBody responseBody = response.body()) {
                    YouTubePlayerResponse youTubePlayerResponse = new Gson().fromJson(responseBody.string(), YouTubePlayerResponse.class);
                    String uri = youTubePlayerResponse.getStreamingData().getAdaptiveFormats()[0].getUrl();

                    Request request = new Request.Builder().url(uri).build();

                    responseBody.close();

                    return chain.proceed(request);
                }
            }
        });

        return super.interceptors();
    }
}