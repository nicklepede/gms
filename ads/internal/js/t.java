package com.google.android.gms.ads.internal.js;

import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class t implements com.google.android.gms.ads.internal.gmsg.e {
    final /* synthetic */ com.google.android.gms.ads.internal.util.ae a;
    final /* synthetic */ ah b;
    final /* synthetic */ k c;

    public t(ah ahVar, k kVar, com.google.android.gms.ads.internal.util.ae aeVar) {
        this.c = kVar;
        this.a = aeVar;
        this.b = ahVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.ads.internal.gmsg.e, java.lang.Object] */
    @Override // com.google.android.gms.ads.internal.gmsg.e
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        ah ahVar = this.b;
        synchronized (ahVar.a) {
            com.google.android.gms.ads.internal.util.client.h.i("JS Engine is requesting an update");
            if (ahVar.h == 0) {
                com.google.android.gms.ads.internal.util.client.h.i("Starting reload.");
                ahVar.h = 2;
                ahVar.a();
            }
            this.c.g("/requestReload", this.a.a);
        }
    }
}
