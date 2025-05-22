package com.google.android.gms.ads.internal.util;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.a;
        bVar.b = Thread.currentThread();
        bVar.a();
    }
}
