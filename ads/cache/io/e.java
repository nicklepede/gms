package com.google.android.gms.ads.cache.io;

import defpackage.aspm;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class e implements Closeable {
    public final Object a = new Object();
    public final File b;
    public OutputStream c;
    public RandomAccessFile d;
    public final Set e;
    public long f;

    public e(File file) {
        this.b = file;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.d = randomAccessFile;
        this.f = randomAccessFile.length();
        this.e = new HashSet();
    }

    public final long a() {
        long j;
        synchronized (this.a) {
            d();
            j = this.f;
        }
        return j;
    }

    public final InputStream b() {
        c cVar;
        synchronized (this.a) {
            d();
            cVar = new c(this);
            this.e.add(cVar);
        }
        return cVar;
    }

    public final OutputStream c() {
        d dVar;
        synchronized (this.a) {
            d();
            OutputStream outputStream = this.c;
            if (outputStream != null) {
                aspm.b(outputStream);
            }
            f();
            this.d.setLength(0L);
            this.f = 0L;
            dVar = new d(this);
            this.c = dVar;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.a) {
            d();
            f();
            this.d.close();
            this.d = null;
        }
    }

    public final void d() {
        if (this.d == null) {
            throw new IOException("StreamingFile is closed; no further operations are valid");
        }
    }

    public void e() {
        throw null;
    }

    public final void f() {
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aspm.b((InputStream) it.next());
        }
        set.clear();
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            d();
            z = this.c != null;
        }
        return z;
    }
}
