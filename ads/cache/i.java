package com.google.android.gms.ads.cache;

import defpackage.aspm;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
            aspm.i(inputStream, this.c, true);
        } catch (IOException unused) {
            aspm.b(this.a);
            aspm.b(this.c);
        }
    }
}
