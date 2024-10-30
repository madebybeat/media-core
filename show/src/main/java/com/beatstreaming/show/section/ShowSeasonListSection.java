package com.beatstreaming.show.section;

import android.content.Context;

import com.beatstreaming.core.ui.Section;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.ShowEntity;
import com.beatstreaming.show.item.ShowSeasonListItemBinder;
import com.beatstreaming.show.section.context.ShowSeasonSectionContext;

import lombok.SneakyThrows;

public class ShowSeasonListSection extends Section<TitlePageBinding, HomeSectionBinding> {
    private final AppSourceEntity appSourceEntity;
    private final ShowSeasonListItemBinder showSeasonListItemBinder;

    @SneakyThrows
    public ShowSeasonListSection(Context context, TitlePageBinding titlePageBinding, AppSourceEntity appSourceEntity, ShowEntity showEntity, HomeSectionBinding homeSectionBinding, ShowSeasonListItemBinder seasonListItemBinder) {
        super(context, titlePageBinding.seasonSection, titlePageBinding, homeSectionBinding);

        this.appSourceEntity = appSourceEntity;
        this.showSeasonListItemBinder = seasonListItemBinder;

        this.resultBinding.section.init(new ShowSeasonSectionContext(this.context, new AppSourceListContext(this.appSourceEntity), showEntity.getSeasons(), this.showSeasonListItemBinder));
    }
}