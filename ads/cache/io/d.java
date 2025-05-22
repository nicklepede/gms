package com.google.android.gms.ads.cache.io;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class d extends OutputStream {
    final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    private final void a() {
        e eVar = this.a;
        if (this != eVar.c) {
            throw new IOException("attempt to reuse closed OutputStream");
        }
        eVar.d();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e eVar = this.a;
        Object obj = eVar.a;
        synchronized (obj) {
            a();
            eVar.c = null;
            obj.notifyAll();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        e eVar = this.a;
        Object obj = eVar.a;
        synchronized (obj) {
            a();
            eVar.d.seek(eVar.f);
            eVar.d.write(i);
            eVar.f++;
            obj.notifyAll();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 < 0 || i < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        e eVar = this.a;
        Object obj = eVar.a;
        synchronized (obj) {
            a();
            eVar.d.seek(eVar.f);
            eVar.d.write(bArr, i, i2);
            eVar.f += i2;
            obj.notifyAll();
        }
    }
}
