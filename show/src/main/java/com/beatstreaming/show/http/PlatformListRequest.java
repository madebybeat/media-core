package com.beatstreaming.show.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.PlatformEntityList;
import com.beatstreaming.show.entity.TitleEntity;
import com.beatstreaming.show.item.PlatformListItemBinder;
import com.beatstreaming.show.section.context.PlatformSectionContext;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class PlatformListRequest extends HttpRequestBinding<PlatformEntityList, TitlePageBinding, HomeSectionBinding> {
    private final AppSourceEntity appSourceEntity;
    private final PlatformListItemBinder platformListItemBinder;

    @SneakyThrows
    public PlatformListRequest(Context context, TitlePageBinding titlePageBinding, AppSourceEntity appSourceEntity, TitleEntity titleEntity, HomeSectionBinding homeSectionBinding, PlatformListItemBinder platformListItemBinder) {
        super(context, titlePageBinding.platformSection, titlePageBinding, homeSectionBinding, PlatformEntityList.class, Request.Method.GET);

        this.appSourceEntity = appSourceEntity;
        this.platformListItemBinder = platformListItemBinder;

        this.load(new URIBuilder(this.appSourceEntity.getUrl())
                .setPathSegments("api", "v1", "source", titleEntity.getId())
                .addParameter("id", titleEntity.getType().name())
                .build());
    }

    @Override
    public void onLoad(PlatformEntityList platformEntityList) {
        this.resultBinding.section.init(new PlatformSectionContext(this.context, new AppSourceListContext(this.appSourceEntity), platformEntityList.getList(), this.platformListItemBinder));

        super.onLoad(platformEntityList);
    }
}