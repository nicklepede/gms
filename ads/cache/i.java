package com.google.android.gms.ads.cache;

import defpackage.autg;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class i implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ long b;
    final /* synthetic */ OutputStream c;

    public i(InputStream inputStream, long j, OutputStream outputStream) {
        this.a = inputStream;
        this.b = j;
        this.c = outputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InputStream inputStream = this.a;
            inputStream.skip(this.b);
            autg.i(inputStream, this.c, true);
        } catch (IOException unused) {
            autg.b(this.a);
            autg.b(this.c);
        }
    }
}
