package com.beatstreaming.show.app;

import com.beatstreaming.media.entity.AppSourceAuthorEntity;
import com.beatstreaming.media.entity.AppSourceEntity;

import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;

public class DefaultAppSourceEntity extends AppSourceEntity {
    public DefaultAppSourceEntity() throws URISyntaxException {
        super(new URIBuilder().setScheme("https").setHost("meta.show.api.beatstreaming.com").build().toString(), "", "", "", new AppSourceAuthorEntity("", ""));
    }
}
