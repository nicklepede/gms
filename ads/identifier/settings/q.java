package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.fjzz;
import defpackage.fnde;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class q {
    private static q a;
    private final byjl b;

    public q(byjl byjlVar) {
        this.b = byjlVar;
    }

    public static synchronized q a(Context context) {
        q qVar;
        synchronized (q.class) {
            if (a == null) {
                q qVar2 = new q(byjl.a(context));
                a = qVar2;
                qVar2.b();
                a.c();
            }
            qVar = a;
        }
        return qVar;
    }

    public final void b() {
        if (fjzz.i()) {
            long k = fjzz.a.a().k();
            bykj bykjVar = new bykj();
            bykjVar.j = "com.google.android.gms.ads.jams.NegotiationService";
            bykjVar.e(0L, k);
            bykjVar.t("ads.fetch_integrity_token.one_time");
            bykjVar.y(0, fnde.a.a().m() ? 1 : 0);
            this.b.f(bykjVar.b());
        }
    }

    public final void c() {
        if (fjzz.i()) {
            fjzz fjzzVar = fjzz.a;
            long m = fjzzVar.a().m();
            long l = fjzzVar.a().l();
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.ads.jams.NegotiationService";
            bykmVar.b = l;
            bykmVar.a = m;
            bykmVar.t("ads.fetch_integrity_token.periodic");
            bykmVar.y(0, fnde.c() ? 1 : 0);
            bykmVar.x(0, fnde.c() ? 1 : 0);
            this.b.f(bykmVar.b());
        }
    }
}
