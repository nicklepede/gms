package com.google.android.gms.ads.identifier.settings;

import android.util.LruCache;
import android.util.Pair;
import java.lang.ref.SoftReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class ad {
    private final LruCache a;
    private final long b;

    public ad(long j, long j2) {
        this.a = j <= 0 ? null : new LruCache((int) j);
        this.b = j2;
    }

    final synchronized Object a(String str) {
        Pair pair;
        if (str != null) {
            LruCache lruCache = this.a;
            if (lruCache != null && (pair = (Pair) lruCache.get(str)) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() <= this.b) {
                return ((SoftReference) pair.second).get();
            }
        }
        return null;
    }

    final synchronized void b(String str, Object obj) {
        if (str != null) {
            LruCache lruCache = this.a;
            if (lruCache != null) {
                lruCache.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), new SoftReference(obj)));
            }
        }
    }
}
