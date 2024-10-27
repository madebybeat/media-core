package com.beatstreaming.core.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.beatstreaming.core.MainActivity;
import com.google.gson.Gson;

import lombok.SneakyThrows;

public class FragmentMainActivity extends MainActivity {
    private final Class<? extends Fragment> activity;
    private final Class[] clazz;

    public FragmentMainActivity(Class<? extends Fragment> activity, Class[] clazz) {
        this.activity = activity;
        this.clazz = clazz;
    }

    @SneakyThrows
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        Object[] data = new Gson().fromJson(this.getIntent().getStringExtra("data"), Object[].class);
        Object[] typed = new Object[data.length];

        for (int i = 0; i < data.length; i++) {
            typed[i] = clazz[i].cast(data[i]);
        }

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), this.activity.getConstructor(this.clazz).newInstance(typed))
                .addToBackStack(null)
                .commit();
    }
}
