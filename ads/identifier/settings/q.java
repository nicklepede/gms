package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import defpackage.casd;
import defpackage.catb;
import defpackage.cate;
import defpackage.fmqe;
import defpackage.fpvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class q {
    private static q a;
    private final casd b;

    public q(casd casdVar) {
        this.b = casdVar;
    }

    public static synchronized q a(Context context) {
        q qVar;
        synchronized (q.class) {
            if (a == null) {
                q qVar2 = new q(casd.a(context));
                a = qVar2;
                qVar2.b();
                a.c();
            }
            qVar = a;
        }
        return qVar;
    }

    public final void b() {
        if (fmqe.i()) {
            long k = fmqe.a.lK().k();
            catb catbVar = new catb();
            catbVar.j = "com.google.android.gms.ads.jams.NegotiationService";
            catbVar.e(0L, k);
            catbVar.t("ads.fetch_integrity_token.one_time");
            catbVar.y(0, fpvd.a.lK().m() ? 1 : 0);
            this.b.f(catbVar.b());
        }
    }

    public final void c() {
        if (fmqe.i()) {
            fmqe fmqeVar = fmqe.a;
            long m = fmqeVar.lK().m();
            long l = fmqeVar.lK().l();
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.ads.jams.NegotiationService";
            cateVar.b = l;
            cateVar.a = m;
            cateVar.t("ads.fetch_integrity_token.periodic");
            cateVar.y(0, fpvd.c() ? 1 : 0);
            cateVar.x(0, fpvd.c() ? 1 : 0);
            this.b.f(cateVar.b());
        }
    }
}
