package com.beatstreaming.youtube.player;

import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.TransferListener;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import lombok.SneakyThrows;

@UnstableApi
public class YouTubeDataSource implements HttpDataSource {
    public YouTubeDataSource() {

    }

    @Override
    public void addTransferListener(@NonNull TransferListener transferListener) {

    }

    @Override
    @SneakyThrows
    public long open(@NonNull DataSpec dataSpec) {
        return -1;
    }

    @Nullable
    @Override
    public Uri getUri() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public int read(@NonNull byte[] buffer, int offset, int length) {
        return -1;
    }

    @Override
    public void setRequestProperty(@NonNull String name, @NonNull String value) {

    }

    @Override
    public void clearRequestProperty(@NonNull String name) {

    }

    @Override
    public void clearAllRequestProperties() {

    }

    @Override
    public int getResponseCode() {
        return 0;
    }

    @NonNull
    @Override
    public Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }
}