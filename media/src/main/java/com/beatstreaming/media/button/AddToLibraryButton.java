package com.beatstreaming.media.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.content.res.AppCompatResources;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.R;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.google.android.material.snackbar.Snackbar;

public class AddToLibraryButton extends PageHeaderButton implements ItemSetup<AddToLibraryButton, AddToLibraryContext>, ItemRefresh {
    private AddToLibraryContext saveToLibraryContext;

    public AddToLibraryButton(Context context) {
        super(context);

        this.init(context);
    }

    public AddToLibraryButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.init(context);
    }

    public AddToLibraryButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.init(context);
    }

    @Override
    public void init(Context item) {
        super.init(item);

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                LibraryListStorage libraryListStorage = saveToLibraryContext.getLibraryListStorageManager().load(getContext());

                if (libraryListStorage.has(saveToLibraryContext.getImageItemEntity())) {
                    libraryListStorage.find(saveToLibraryContext.getImageItemEntity()).ifPresent(target -> libraryListStorage.remove((ItemEntity) target));

                    Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), com.beatstreaming.media.R.string.page_collection_remove_from_library_success, Toast.LENGTH_SHORT).show();
                } else {
                    libraryListStorage.add(new LibraryItemEntity(saveToLibraryContext.getAppSourceContext(), saveToLibraryContext.getItemType(), new SerializableItemEntity<>(saveToLibraryContext.getItemType().getClazz(), saveToLibraryContext.getImageItemEntity())));

                    Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), com.beatstreaming.media.R.string.page_collection_add_to_library_success, Toast.LENGTH_SHORT).show();
                }

                saveToLibraryContext.getLibraryListStorageManager().save(getContext(), libraryListStorage);

                refresh();
            }
        });
    }

    @Override
    public AddToLibraryButton setup(AddToLibraryContext saveToLibraryContext) {
        this.saveToLibraryContext = saveToLibraryContext;

        this.refresh();

        return this;
    }

    @Override
    public void refresh() {
        LibraryListStorage libraryListStorage = saveToLibraryContext.getLibraryListStorageManager().load(getContext());

        if (libraryListStorage.has(this.saveToLibraryContext.getImageItemEntity())) {
            this.setText(R.string.page_collection_remove_from_library);
            this.setIcon(AppCompatResources.getDrawable(this.getContext(), R.drawable.playlist_remove));
        } else {
            this.setText(R.string.page_collection_add_to_library);
            this.setIcon(AppCompatResources.getDrawable(this.getContext(), R.drawable.playlist_add));
        }
    }
}
