package com.beatstreaming.show.app;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class DefaultAppSourceStorageItem extends AppSourceStorageItem {
    @SneakyThrows
    public DefaultAppSourceStorageItem() {
        super(new AppSourceEntity());

        this.appSourceEntity.url = new URIBuilder().setScheme("https").setHost("meta.show.api.beatstreaming.com").build().toString();
    }
}
