package com.beatstreaming.media.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.google.android.material.snackbar.Snackbar;

public class AddToLibraryButton extends androidx.appcompat.widget.AppCompatButton implements ItemInit<Context>, ItemSetup<AddToLibraryButton, AddToLibraryContext> {
    private AddToLibraryContext saveToLibraryContext;

    public AddToLibraryButton(Context context) {
        super(context);
    }

    public AddToLibraryButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AddToLibraryButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void init(Context item) {
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                LibraryListStorage libraryListStorage = saveToLibraryContext.getLibraryListStorageManager().load(getContext());

                libraryListStorage.getList().add(new LibraryItemEntity(saveToLibraryContext.getAppSourceContext(), saveToLibraryContext.getItemType(), new SerializableItemEntity<>(saveToLibraryContext.getItemType().getClazz(), saveToLibraryContext.getImageItemEntity())));
                saveToLibraryContext.getLibraryListStorageManager().save(view.getContext(), libraryListStorage);

                Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), com.beatstreaming.media.R.string.page_collection_save_success, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public AddToLibraryButton setup(AddToLibraryContext saveToLibraryContext) {
        this.saveToLibraryContext = saveToLibraryContext;

        return this;
    }
}
