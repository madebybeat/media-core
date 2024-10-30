package com.beatstreaming.show.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.SeasonEntityList;
import com.beatstreaming.show.entity.TitleEntity;
import com.beatstreaming.show.item.ShowSeasonListItemBinder;
import com.beatstreaming.show.section.context.ShowSeasonSectionContext;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class ShowSeasonListRequest extends HttpRequestBinding<SeasonEntityList, TitlePageBinding, HomeSectionBinding> {
    private final AppSourceEntity appSourceEntity;
    private final ShowSeasonListItemBinder showSeasonListItemBinder;

    @SneakyThrows
    public ShowSeasonListRequest(Context context, TitlePageBinding titlePageBinding, AppSourceEntity appSourceEntity, TitleEntity titleEntity, HomeSectionBinding homeSectionBinding, ShowSeasonListItemBinder showSeasonListItemBinder) {
        super(context, titlePageBinding.platformSection, titlePageBinding, homeSectionBinding, SeasonEntityList.class, Request.Method.GET);

        this.appSourceEntity = appSourceEntity;
        this.showSeasonListItemBinder = showSeasonListItemBinder;

        this.load(new URIBuilder(this.appSourceEntity.getUrl())
                .setPathSegments("api", "v1", "season", titleEntity.getId(), "list")
                .addParameter("id", titleEntity.getType().name())
                .build());
    }

    @Override
    public void onLoad(SeasonEntityList seasonEntityList) {
        this.resultBinding.section.init(new ShowSeasonSectionContext(this.context, new AppSourceListContext(this.appSourceEntity), seasonEntityList.getList(), this.showSeasonListItemBinder));

        super.onLoad(seasonEntityList);
    }
}