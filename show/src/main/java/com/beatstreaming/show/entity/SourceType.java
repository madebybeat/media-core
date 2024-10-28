package com.beatstreaming.show.entity;

import com.showstreaming.show.R;

public enum SourceType {
    RENT(R.string.source_type_rent_title),
    BUY(R.string.source_type_buy_title),
    FLATRATE(R.string.source_type_flatrate_title),;

    public final int title;

    SourceType(int title) {
        this.title = title;
    }
}
