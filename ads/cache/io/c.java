package com.google.android.gms.ads.cache.io;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class c extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ e a;
    private boolean b;
    private long c;

    public c(e eVar) {
        this.a = eVar;
    }

    private final void a() {
        if (this.b) {
            throw new IOException("invalidated InputStream");
        }
        this.a.d();
    }

    private final void b() {
        c(1L);
    }

    private final void c(long j) {
        while (true) {
            e eVar = this.a;
            if (!eVar.g() || eVar.f - this.c >= j) {
                return;
            }
            try {
                eVar.a.wait();
                a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("interrupted while waiting for data", e);
            }
        }
    }

    private final boolean d() {
        e eVar = this.a;
        return !eVar.g() && eVar.f <= this.c;
    }

    @Override // java.io.InputStream
    public final int available() {
        int max;
        e eVar = this.a;
        synchronized (eVar.a) {
            a();
            max = Math.max(0, (int) (eVar.f - this.c));
        }
        return max;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e eVar = this.a;
        Object obj = eVar.a;
        synchronized (obj) {
            a();
            this.b = true;
            eVar.e.remove(this);
            obj.notifyAll();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        e eVar = this.a;
        synchronized (eVar.a) {
            a();
            b();
            if (d()) {
                return -1;
            }
            eVar.d.seek(this.c);
            int read = eVar.d.read();
            this.c++;
            return read;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        e eVar = this.a;
        synchronized (eVar.a) {
            while (eVar.g() && available() < j) {
                c(j);
            }
            if (!eVar.g()) {
                j = Math.min(j, available());
            }
            this.c += j;
        }
        return j;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 < 0 || i < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        e eVar = this.a;
        synchronized (eVar.a) {
            a();
            b();
            if (d()) {
                return -1;
            }
            int min = Math.min(available(), i2);
            eVar.d.seek(this.c);
            int read = eVar.d.read(bArr, i, min);
            if (read >= 0) {
                this.c += read;
            }
            return read;
        }
    }
}
