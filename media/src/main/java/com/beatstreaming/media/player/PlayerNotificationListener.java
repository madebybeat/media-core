package com.beatstreaming.media.player;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import androidx.annotation.OptIn;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.session.MediaStyleNotificationHelper;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class PlayerNotificationListener extends PlayerListener<ContextualPlayer> {
    private final NotificationManager notificationManager;
    private final NotificationChannel notificationChannel;

    @SuppressLint("NewApi")
    public PlayerNotificationListener(ContextualPlayer player) {
        super(player);

        this.notificationManager = (NotificationManager) this.player.getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        this.notificationChannel = new NotificationChannel("beat", "Beat", NotificationManager.IMPORTANCE_LOW);

        this.notificationManager.createNotificationChannel(this.notificationChannel);
    }

    @Override
    public void onMediaItemTransition(MediaItem mediaItem, int reason) {
        Picasso.get()
                .load(this.player.getCurrent().getImage().getUrl())
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        @OptIn(markerClass = UnstableApi.class) NotificationCompat.Builder notification = new NotificationCompat.Builder(player.getContext(), "beat")
                                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                                .setSmallIcon(player.playerContext.getIcLauncher())
                                .setStyle(
                                        new MediaStyleNotificationHelper.MediaStyle(player.mediaSession)
                                                .setShowActionsInCompactView(1)
                                )
                                .setContentTitle(player.getCurrent().getName())
                                .setContentText(player.getCurrent().getAuthor())
                                .setLargeIcon(bitmap);

                        notificationManager.notify(1, notification.build());
                    }

                    @Override
                    public void onBitmapFailed(Exception exception, Drawable drawable) {

                    }

                    @Override
                    public void onPrepareLoad(Drawable drawable) {

                    }
                });
    }
}