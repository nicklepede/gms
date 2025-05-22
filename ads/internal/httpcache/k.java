package com.google.android.gms.ads.internal.httpcache;

import android.os.Binder;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class k implements Runnable {
    final /* synthetic */ n a;

    public k(n nVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.a;
        if (nVar.a == null) {
            return;
        }
        nVar.a.m();
        Binder.flushPendingCommands();
    }
}
