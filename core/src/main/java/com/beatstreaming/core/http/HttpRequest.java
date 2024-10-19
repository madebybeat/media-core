package com.beatstreaming.core.http;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.net.URI;

import lombok.Setter;

public class HttpRequest {
    protected final Context context;
    protected final int method;

    @Setter
    protected URI url;

    private final RequestQueue requestQueue;

    public HttpRequest(Context context, int method) {
        this(context, method, null);
    }

    public HttpRequest(Context context, int method, URI url) {
        this.context = context;
        this.method = method;

        this.requestQueue = Volley.newRequestQueue(this.context);
    }

    protected void load(URI url) {
        this.url = url;

        this.load();
    }

    public void load() {
        StringRequest stringRequest = new StringRequest(this.method, this.url.toString(), this::onLoad, this::onError);

        this.requestQueue.add(stringRequest);

        this.onLoading();
    }

    public void onLoading() {

    }

    public void onLoad(String data) {

    }

    public void onError(VolleyError volleyError) {

    }
}
