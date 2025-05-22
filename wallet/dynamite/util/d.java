package com.google.android.gms.wallet.dynamite.util;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.volley.toolbox.ImageLoader;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class d implements ImageLoader.ImageCache {
    private final LruCache a = new LruCache(20);

    @Override // com.android.volley.toolbox.ImageLoader.ImageCache
    public final Bitmap getBitmap(String str) {
        return (Bitmap) this.a.get(str);
    }

    @Override // com.android.volley.toolbox.ImageLoader.ImageCache
    public final void putBitmap(String str, Bitmap bitmap) {
        this.a.put(str, bitmap);
    }
}
