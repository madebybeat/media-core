package com.beatstreaming.core.list.decorator;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beatstreaming.core.R;

public class HorizontalListSpaceDecoration extends RecyclerView.ItemDecoration {
    private final int firstItemSpace;
    private final int anyItemsSpace;

    public HorizontalListSpaceDecoration(Context context) {
        this.firstItemSpace = (int) context.getResources().getDimension(R.dimen.space_medium);
        this.anyItemsSpace = (int) context.getResources().getDimension(R.dimen.space_small);
    }

    @Override
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getAdapter() == null) {
            return;
        }

        int position = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();

        if (position == 0) {
            rect.left = firstItemSpace;
        }

        if (position == itemCount - 1) {
            rect.right = firstItemSpace;
        } else {
            rect.right = anyItemsSpace;
        }
    }
}
