package com.google.android.gms.ads.social;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.fjwt;
import defpackage.fnde;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e {
    private static final Object b = new Object();
    private static e c;
    public final Context a;
    private final byjl d;
    private final SharedPreferences e;

    public e(Context context, byjl byjlVar, SharedPreferences sharedPreferences) {
        this.a = context;
        this.d = byjlVar;
        this.e = sharedPreferences;
    }

    public static e a(Context context) {
        e eVar;
        synchronized (b) {
            if (c == null) {
                c = new e(context, byjl.a(context), context.getSharedPreferences("social.package_doritos", 4));
            }
            eVar = c;
        }
        return eVar;
    }

    public final void b() {
        SharedPreferences sharedPreferences = this.e;
        long j = sharedPreferences.getInt("gms:ads:social:doritos:doritos_refresh_period_s", -1);
        long d = fjwt.d();
        int i = sharedPreferences.getInt("gms:ads:social:doritos:doritos_refresh_flex_s", -1);
        long c2 = fjwt.c();
        if (j == d && i == c2) {
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("DSID periodic task parameters have changed.");
        e();
    }

    public final void c() {
        if (d.b(this.a).a("ads.social.doritos-immediate") != 0) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.i("Immediate DSID task failed. Scheduling one-off");
            d();
        }
    }

    public final void d() {
        String w = defpackage.a.w(fjwt.b(), "Scheduling one-off DSID refresh task. Flex: ", " s.");
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d(w);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        bykjVar.t("ads.social.doritos-oneoff");
        bykjVar.x(0, 1);
        bykjVar.g(0);
        bykjVar.v(1);
        bykjVar.e(0L, fjwt.b());
        this.d.f(bykjVar.b());
    }

    public final void e() {
        int d = (int) fjwt.d();
        int c2 = (int) fjwt.c();
        String s = defpackage.a.s(c2, d, "Scheduling periodic DSID refresh task. period: ", " s, flex: ", " s.");
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d(s);
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        bykmVar.t("ads.social.doritos");
        fjwt fjwtVar = fjwt.a;
        bykmVar.x(0, fjwtVar.a().l() ? 1 : 0);
        bykmVar.v(1);
        bykmVar.y(0, fjwtVar.a().n() ? 1 : 0);
        bykmVar.f(0, fjwtVar.a().m() ? 1 : 0);
        if (fnde.a.a().n()) {
            bykmVar.j(byki.a(fjwt.d()));
        } else {
            bykmVar.a = fjwt.d();
            bykmVar.b = fjwt.c();
        }
        this.d.f(bykmVar.b());
        this.e.edit().putInt("gms:ads:social:doritos:doritos_refresh_period_s", d).putInt("gms:ads:social:doritos:doritos_refresh_flex_s", c2).commit();
    }
}
