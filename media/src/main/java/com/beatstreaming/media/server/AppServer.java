package com.beatstreaming.media.server;

import java.net.URI;

import lombok.Data;

@Data
public class AppServer {
    private final URI url;

    public AppServer() {
        this.url = this.getUrl();
    }

    public URI getUrl() {
        return null;
    }
}
