package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.list.ListContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class SheetFlowContext extends ListContext {
    private Sheet sheet;
}
