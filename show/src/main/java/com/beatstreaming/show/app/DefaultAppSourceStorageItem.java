package com.beatstreaming.show.app;

import com.beatstreaming.media.entity.AppSourceAuthorEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;

import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;

public class DefaultAppSourceStorageItem extends AppSourceStorageItem {
    public DefaultAppSourceStorageItem() throws URISyntaxException {
        super(new AppSourceEntity(new URIBuilder().setScheme("https").setHost("meta.show.api.beatstreaming.com").build().toString(), "", "", "", new AppSourceAuthorEntity()));
    }
}
