package com.google.android.gms.ads.internal.util.client;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
