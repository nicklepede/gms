package com.google.android.gms.ads.internal.js;

import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class s implements com.google.android.gms.ads.internal.gmsg.e {
    final /* synthetic */ ag a;
    final /* synthetic */ ah b;
    final /* synthetic */ k c;

    public s(ah ahVar, ag agVar, k kVar) {
        this.a = agVar;
        this.c = kVar;
        this.b = ahVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        com.google.android.gms.ads.internal.c.j();
        System.currentTimeMillis();
        ah ahVar = this.b;
        synchronized (ahVar.a) {
            ag agVar = this.a;
            if (agVar.e() != -1 && agVar.e() != 1) {
                ahVar.h = 0;
                k kVar = this.c;
                kVar.f("/log", com.google.android.gms.ads.internal.gmsg.d.a);
                kVar.f("/result", com.google.android.gms.ads.internal.gmsg.d.b);
                agVar.h(kVar);
                ahVar.g = agVar;
            }
        }
    }
}
