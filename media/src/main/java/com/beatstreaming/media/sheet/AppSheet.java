package com.beatstreaming.media.sheet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.R;
import com.beatstreaming.media.databinding.AppSheetBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.google.android.material.snackbar.Snackbar;

public class AppSheet extends Sheet implements ItemSetup<AppSheet, AppSourceEntity> {
    private AppSheetBinding appSheetBinding;

    protected AppSourceEntity appSourceEntity;

    public AppSheet(@NonNull Context context) {
        super(context);
    }

    public AppSheet(@NonNull Context context, int theme) {
        super(context, theme);
    }

    protected AppSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.appSheetBinding = AppSheetBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.appSheetBinding.getRoot());

        this.appSheetBinding.header.sheetTitle.setText(R.string.sheet_app_title);

        this.appSheetBinding.appWebsiteText.setText(this.appSourceEntity.getWebsite());
        this.appSheetBinding.appAuthorEmailText.setText(this.appSourceEntity.getAuthor().getEmail());

        this.appSheetBinding.appWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ClipboardManager) view.getContext().getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("Copied text", appSourceEntity.getWebsite().toString()));
                Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.sheet_app_website_copy_success, Toast.LENGTH_SHORT).show();
            }
        });

        this.appSheetBinding.appAuthorEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ClipboardManager) view.getContext().getSystemService(Context.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("Copied text", appSourceEntity.getAuthor().name));
                Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.sheet_app_author_email_copy_success, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public AppSheet setup(AppSourceEntity appSourceEntity) {
        this.appSourceEntity = appSourceEntity;

        return this;
    }
}
