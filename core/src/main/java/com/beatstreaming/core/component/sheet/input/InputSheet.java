package com.beatstreaming.core.component.sheet.input;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.databinding.InputSheetBinding;
import com.beatstreaming.core.view.ItemInit;

public class InputSheet extends Sheet implements ItemInit<InputSheetContext> {
    protected InputSheetBinding inputSheetBinding;

    protected InputSheetContext inputSheetContext;

    public InputSheet(@NonNull Context context) {
        super(context);
    }

    public InputSheet(@NonNull Context context, int theme) {
        super(context, theme);
    }

    protected InputSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.inputSheetBinding = InputSheetBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.inputSheetBinding.getRoot());

        this.inputSheetBinding.inputSheetHeader.sheetTitle.setText(this.inputSheetContext.getTitle());
        this.inputSheetBinding.confirm.setText(this.inputSheetContext.getLabel());
        this.inputSheetBinding.input.setHint(this.inputSheetContext.getHint());

        this.inputSheetBinding.confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputSheetBinding.input.getEditText() == null) {
                    return;
                }

                dismiss();

                onCall(inputSheetBinding.input.getEditText().getText().toString());
            }
        });
    }

    @Override
    public void init(InputSheetContext inputSheetContext) {
        this.inputSheetContext = inputSheetContext;
    }

    public void onCall(String value) {

    }
}
