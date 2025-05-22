package com.google.android.gms.ads.cache;

import android.content.Context;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.aupz;
import defpackage.bzps;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class j extends com.google.android.gms.ads.internal.cache.g implements bzps {
    private static f a;
    private static final Object b = new Object();
    private final f c;
    private final ExecutorService d;

    public j(Context context) {
        f c = c(context);
        aupz aupzVar = new aupz(Integer.MAX_VALUE, 10);
        this.c = c;
        this.d = aupzVar;
    }

    static f c(Context context) {
        com.google.android.gms.ads.internal.js.function.k kVar;
        synchronized (b) {
            if (a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    return null;
                }
                com.google.android.gms.ads.internal.config.p.c(applicationContext);
                try {
                    com.google.android.gms.ads.cache.io.b bVar = com.google.android.gms.ads.cache.io.b.a;
                    com.google.android.gms.ads.internal.js.function.b b2 = com.google.android.gms.ads.internal.c.b();
                    VersionInfoParcel versionInfoParcel = new VersionInfoParcel(251864004, 251864004);
                    synchronized (b2.a) {
                        if (b2.b == null) {
                            b2.b = new com.google.android.gms.ads.internal.js.function.k(com.google.android.gms.ads.internal.js.function.b.b(applicationContext), versionInfoParcel, ((Boolean) com.google.android.gms.ads.internal.flag.q.b.d()).booleanValue() ? (String) com.google.android.gms.ads.internal.config.p.a.g() : (String) com.google.android.gms.ads.internal.config.p.b.g(), null);
                        }
                        kVar = b2.b;
                    }
                    a = new f(applicationContext, bVar, kVar, new aupz(((Integer) com.google.android.gms.ads.internal.config.p.ai.g()).intValue(), 10), new com.google.android.gms.ads.internal.util.client.m());
                } catch (g e) {
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.h("Unable to create cache instance.", e);
                }
            }
            return a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0198, code lost:
    
        if (r4.a() > 0) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.ads.internal.cache.CacheEntryParcel f(com.google.android.gms.ads.internal.cache.CacheOffering r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.cache.j.f(com.google.android.gms.ads.internal.cache.CacheOffering, boolean):com.google.android.gms.ads.internal.cache.CacheEntryParcel");
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final long a(CacheOffering cacheOffering) {
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.L.g()).booleanValue()) {
            return -2L;
        }
        try {
            e a2 = this.c.a(cacheOffering, true);
            synchronized (a2.h.a) {
                a2.a();
                s sVar = a2.b;
                if (sVar != null) {
                    q qVar = sVar.f;
                    if (qVar == null) {
                        qVar = q.a;
                    }
                    int a3 = o.a(qVar.j);
                    if (a3 != 0 && a3 == 3) {
                    }
                    q qVar2 = a2.b.f;
                    if (qVar2 == null) {
                        qVar2 = q.a;
                    }
                    return qVar2.i;
                }
                return -2L;
            }
        } catch (g e) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Unable to get entry from cache.", e);
            return -2L;
        }
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final CacheEntryParcel d(CacheOffering cacheOffering) {
        return f(cacheOffering, false);
    }

    @Override // com.google.android.gms.ads.internal.cache.h
    public final CacheEntryParcel e(CacheOffering cacheOffering) {
        return f(cacheOffering, ((Boolean) com.google.android.gms.ads.internal.config.p.L.g()).booleanValue());
    }
}
