package com.beatstreaming.core.layout;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;

public class ListGridLayoutManager extends GridLayoutManager {
    public ListGridLayoutManager(Context context) {
        super(context, 2);
    }
}
