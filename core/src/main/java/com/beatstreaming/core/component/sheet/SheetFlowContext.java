package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.list.ListContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SheetFlowContext extends ListContext {
    private final Sheet sheet;
}
