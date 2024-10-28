package com.beatstreaming.show.server;

import com.beatstreaming.media.server.AppServer;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;

import lombok.SneakyThrows;

public class DefaultAppServer extends AppServer {
    @Override
    @SneakyThrows
    public URI getUrl() {
        return new URIBuilder().setScheme("https").setHost("server.show.api.beatstreaming.com").build();
    }
}
