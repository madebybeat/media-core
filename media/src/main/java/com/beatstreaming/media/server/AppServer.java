package com.beatstreaming.media.server;

import java.net.URI;

import lombok.Data;

@Data
public class AppServer {
    private final URI uri;

    public AppServer() {
        this.uri = this.getUri();
    }

    public URI getUri() {
        return null;
    }
}
