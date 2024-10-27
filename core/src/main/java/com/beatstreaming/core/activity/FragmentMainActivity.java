package com.beatstreaming.core.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.beatstreaming.core.MainActivity;

import lombok.SneakyThrows;

public class FragmentMainActivity extends MainActivity {
    private final Class<? extends Fragment> activity;
    private final Class[] clazz;
    private final Object[] item;

    public FragmentMainActivity(Class<? extends Fragment> activity, Class[] clazz, Object[] item) {
        this.activity = activity;
        this.clazz = clazz;
        this.item = item;
    }

    @SneakyThrows
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), this.activity.getConstructor(clazz).newInstance(item))
                .addToBackStack(null)
                .commit();
    }
}
