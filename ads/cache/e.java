package com.google.android.gms.ads.cache;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e implements Closeable {
    public final byte[] a;
    public s b;
    public com.google.android.gms.ads.cache.io.e c;
    public com.google.android.gms.ads.cache.csi.a d;
    public int e;
    public boolean f;
    public final boolean g;
    public final /* synthetic */ f h;
    private boolean i;
    private int j;
    private String k;
    private com.google.android.gms.ads.nonagon.csi.i l;

    public e(f fVar, byte[] bArr, s sVar) {
        this.h = fVar;
        this.d = null;
        this.l = null;
        this.k = null;
        this.f = false;
        this.g = false;
        this.j = fVar.e;
        this.a = bArr;
        this.b = sVar;
    }

    public final void a() {
        com.google.android.gms.ads.cache.io.e eVar;
        boolean z;
        f fVar = this.h;
        synchronized (fVar.a) {
            try {
                try {
                    if (!this.i) {
                        int i = this.j;
                        int i2 = fVar.e;
                        if (i < i2) {
                            this.j = i2;
                            this.b = fVar.b(this.a);
                        }
                        s sVar = this.b;
                        if (sVar != null && this.c == null) {
                            this.c = fVar.c(sVar);
                        }
                        if (this.b == null && (eVar = this.c) != null) {
                            fVar.g(eVar, "ensureLatestSnapshot");
                            this.c = null;
                        }
                    }
                    z = false;
                    if (this.b != null && this.c != null && !this.i) {
                        z = true;
                    }
                } catch (g e) {
                    int i3 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.h("Cannot get latest snapshot: !", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        throw new g(null);
    }

    public final void b() {
        com.google.android.gms.ads.nonagon.csi.i iVar = this.l;
        if (iVar == null || this.c == null) {
            return;
        }
        ConcurrentHashMap a = iVar.a();
        try {
            a.put("lb", String.valueOf(this.c.a()));
            a.put("gqi", this.k);
            a.put("event_timestamp", String.valueOf(System.currentTimeMillis()));
            this.l.b(a);
        } catch (IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f fVar = this.h;
        synchronized (fVar.a) {
            if (this.i) {
                return;
            }
            com.google.android.gms.ads.cache.csi.a aVar = this.d;
            if (aVar != null) {
                aVar.a();
                this.d = null;
            }
            this.i = true;
            this.b = null;
            com.google.android.gms.ads.cache.io.e eVar = this.c;
            if (eVar != null) {
                fVar.g(eVar, "close");
                this.c = null;
            }
            fVar.d.remove(this);
        }
    }

    public e(f fVar, byte[] bArr, s sVar, boolean z, String str, int i, Context context) {
        this.h = fVar;
        this.d = null;
        this.l = null;
        this.k = null;
        this.f = false;
        this.j = fVar.e;
        this.a = bArr;
        this.b = sVar;
        this.g = z;
        this.l = new com.google.android.gms.ads.nonagon.csi.i(fVar.b, fVar.c, new com.google.android.gms.ads.nonagon.util.logging.csi.c(), context, null);
        this.k = str;
        this.e = i;
        this.f = true;
    }
}
