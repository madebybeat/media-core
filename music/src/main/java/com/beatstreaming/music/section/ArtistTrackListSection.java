package com.beatstreaming.music.section;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.core.component.Section;
import com.beatstreaming.core.component.SectionContext;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class ArtistTrackListSection extends Section<AppSourceContext, TrackEntity, SectionContext<AppSourceContext, TrackEntity>> {
    public ArtistTrackListSection(Context context) {
        super(context);

        this.init(context);
    }

    public ArtistTrackListSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public ArtistTrackListSection(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        super.init(context);

        this.sectionContext = ListSectionContext.<AppSourceContext, TrackEntity>builder().title(R.string.page_artist_section_tracks_title).build();
    }
}
