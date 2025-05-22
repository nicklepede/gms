package com.google.android.gms.ads.cache.io;

import java.io.File;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class f extends e {
    public int g;
    final /* synthetic */ g h;
    private final File i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, File file) {
        super(file);
        this.h = gVar;
        this.i = file;
        this.g = 1;
    }

    @Override // com.google.android.gms.ads.cache.io.e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g gVar = this.h;
        synchronized (gVar.b) {
            int i = this.g - 1;
            this.g = i;
            if (i != 0) {
                return;
            }
            gVar.c.remove(this.i);
            super.close();
        }
    }

    @Override // com.google.android.gms.ads.cache.io.e
    public final void e() {
        g gVar = this.h;
        synchronized (gVar.b) {
            this.g = 0;
            gVar.c.remove(this.i);
            synchronized (this.a) {
                d();
                super.f();
                this.b.delete();
                this.d.close();
                this.d = null;
            }
        }
    }
}
