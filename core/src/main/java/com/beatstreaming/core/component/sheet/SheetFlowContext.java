package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.list.ListContext;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SheetFlowContext extends ListContext {
    private Sheet sheet;
}
