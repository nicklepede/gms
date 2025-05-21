package com.google.android.gms.ads.internal.httpcache;

import android.os.Binder;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
