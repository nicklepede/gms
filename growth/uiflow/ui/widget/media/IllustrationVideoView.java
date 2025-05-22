package com.google.android.gms.growth.uiflow.ui.widget.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ekvl;
import defpackage.eluo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class IllustrationVideoView extends TextureView implements TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener {
    private static final ausn g = ausn.b("UiFlow", auid.GROWTH_UIFLOW);
    public MediaPlayer a;
    public Uri b;
    public int c;
    public int d;
    public MediaPlayer.OnCompletionListener e;
    public MediaPlayer.OnPreparedListener f;
    private Surface h;

    public IllustrationVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = 0;
        setSurfaceTextureListener(this);
    }

    private final boolean e() {
        int i;
        return (this.a == null || (i = this.c) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void a() {
        b();
        if (this.h == null || this.b == null) {
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.a = mediaPlayer;
        mediaPlayer.setSurface(this.h);
        this.a.setOnPreparedListener(this);
        this.a.setOnInfoListener(this);
        this.a.setOnErrorListener(this);
        this.a.setOnCompletionListener(this);
        try {
            this.a.setDataSource(getContext(), this.b);
            this.a.prepareAsync();
            this.c = 1;
        } catch (IOException e) {
            ((eluo) ((eluo) g.i()).s(e)).x("Unable to set data source");
            this.c = -1;
            this.d = -1;
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.release();
        this.a = null;
        this.c = 0;
        this.d = 0;
    }

    public final void c() {
        if (e()) {
            MediaPlayer mediaPlayer = this.a;
            ekvl.y(mediaPlayer);
            mediaPlayer.start();
            this.c = 3;
        }
        this.d = 3;
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        MediaPlayer mediaPlayer = this.a;
        ekvl.y(mediaPlayer);
        return mediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.c != -1) {
            this.c = 5;
            this.d = 5;
        }
        MediaPlayer.OnCompletionListener onCompletionListener = this.e;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ((eluo) g.j()).E("MediaPlayer error. what= %d, extra= %d", i, i2);
        this.c = -1;
        this.d = -1;
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        ((eluo) g.h()).E("MediaPlayer prepared. seek= %d, target= %d", 0, this.d);
        this.c = 2;
        MediaPlayer.OnPreparedListener onPreparedListener = this.f;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(mediaPlayer);
        }
        if (this.d == 3) {
            c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface;
        Surface surface2 = this.h;
        if (surface2 != null) {
            surface2.release();
            this.h = null;
        }
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (surfaceTexture2 != null) {
            this.h = new Surface(surfaceTexture2);
        }
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null && (surface = this.h) != null) {
            mediaPlayer.setSurface(surface);
        } else if (this.h != null) {
            a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        Surface surface = this.h;
        if (surface != null) {
            surface.release();
            this.h = null;
        }
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return true;
        }
        mediaPlayer.setSurface(null);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
