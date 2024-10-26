package com.beatstreaming.core.component.sheet.input;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InputSheetContext {
    private final int title;
    private final int hint;
    private final int label;
}
