package com.google.android.gms.ads.internal.js;

import defpackage.ensv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class v implements Runnable {
    final /* synthetic */ ag a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ah c;
    final /* synthetic */ k d;

    public v(ah ahVar, ag agVar, k kVar, ArrayList arrayList) {
        this.a = agVar;
        this.d = kVar;
        this.b = arrayList;
        this.c = ahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.a) {
            ag agVar = this.a;
            if (agVar.e() != -1 && agVar.e() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.config.p.aY.g()).booleanValue()) {
                    agVar.g(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    agVar.f();
                }
                ensv ensvVar = com.google.android.gms.ads.internal.util.future.e.c;
                final k kVar = this.d;
                Objects.requireNonNull(kVar);
                ensvVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.js.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.d();
                    }
                });
                String.valueOf(com.google.android.gms.ads.internal.config.p.d.g());
                agVar.e();
                ArrayList arrayList = this.b;
                if (!arrayList.isEmpty()) {
                    String.valueOf(arrayList.get(0));
                }
                com.google.android.gms.ads.internal.c.j();
                System.currentTimeMillis();
            }
        }
    }
}
