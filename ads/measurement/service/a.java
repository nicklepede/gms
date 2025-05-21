package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
