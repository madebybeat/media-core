package com.beatstreaming.core.list.decorator;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beatstreaming.beat.R;

public class GridSpaceDecoration extends RecyclerView.ItemDecoration {
    private final int space;

    public GridSpaceDecoration(Context context) {
        this.space = (int) context.getResources().getDimension(R.dimen.space_medium);
    }

    @Override
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int position = recyclerView.getChildAdapterPosition(view);

        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }

        int span = ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanCount();

        int column = position % span;

        rect.top = space;
        rect.bottom = space;

        rect.left = space - column * space / span;
        rect.right = (column + 1) * space / span;
    }
}
