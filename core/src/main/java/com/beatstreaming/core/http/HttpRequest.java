package com.beatstreaming.core.http;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class HttpRequest {
    protected final Context context;

    protected final int method;
    protected final String url;

    private final RequestQueue requestQueue;

    public HttpRequest(Context context, int method, String url) {
        this.context = context;

        this.method = method;
        this.url = url;

        this.requestQueue = Volley.newRequestQueue(this.context);
    }

    public void load() {
        StringRequest stringRequest = new StringRequest(this.method, this.url, this::onLoad, this::onError);

        this.requestQueue.add(stringRequest);
    }

    public void onLoad(String data) {

    }

    public void onError(VolleyError volleyError) {

    }
}
