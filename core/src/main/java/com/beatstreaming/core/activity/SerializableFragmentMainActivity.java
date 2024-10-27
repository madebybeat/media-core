package com.beatstreaming.core.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.beatstreaming.core.MainActivity;
import com.google.gson.Gson;

import lombok.SneakyThrows;

public class SerializableFragmentMainActivity<T> extends MainActivity {
    private final Class<? extends Fragment> activity;
    private final Class<T> item;

    public SerializableFragmentMainActivity(Class<? extends Fragment> activity, Class<T> item) {
        this.activity = activity;
        this.item = item;
    }

    @SneakyThrows
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        T data = new Gson().fromJson(this.getIntent().getStringExtra("data"), item);

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), this.activity.getConstructor(this.item).newInstance(data))
                .addToBackStack(null)
                .commit();
    }
}
