package com.google.android.gms.ads.internal.util.client;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class d extends Thread {
    final /* synthetic */ String a;

    public d(String str) {
        this.a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new m().a(this.a);
    }
}
