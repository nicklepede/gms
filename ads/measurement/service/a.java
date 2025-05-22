package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ String b;
    final /* synthetic */ b c;

    public a(b bVar, Bundle bundle, String str) {
        this.a = bundle;
        this.b = str;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.b("auto", "_iap", this.a, this.b);
    }
}
