package com.beatstreaming.show.server;

import com.beatstreaming.beat.server.DefaultAppServer;
import com.beatstreaming.media.server.AppServerManager;

public class DefaultAppServerManager extends AppServerManager {
    public DefaultAppServerManager() {
        super(new DefaultAppServer());
    }
}
