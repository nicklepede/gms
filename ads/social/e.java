package com.google.android.gms.ads.social;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.fmmx;
import defpackage.fpvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e {
    private static final Object b = new Object();
    private static e c;
    public final Context a;
    private final casd d;
    private final SharedPreferences e;

    public e(Context context, casd casdVar, SharedPreferences sharedPreferences) {
        this.a = context;
        this.d = casdVar;
        this.e = sharedPreferences;
    }

    public static e a(Context context) {
        e eVar;
        synchronized (b) {
            if (c == null) {
                c = new e(context, casd.a(context), context.getSharedPreferences("social.package_doritos", 4));
            }
            eVar = c;
        }
        return eVar;
    }

    public final void b() {
        SharedPreferences sharedPreferences = this.e;
        long j = sharedPreferences.getInt("gms:ads:social:doritos:doritos_refresh_period_s", -1);
        long d = fmmx.d();
        int i = sharedPreferences.getInt("gms:ads:social:doritos:doritos_refresh_flex_s", -1);
        long c2 = fmmx.c();
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
        String w = defpackage.a.w(fmmx.b(), "Scheduling one-off DSID refresh task. Flex: ", " s.");
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d(w);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        catbVar.t("ads.social.doritos-oneoff");
        catbVar.x(0, 1);
        catbVar.g(0);
        catbVar.v(1);
        catbVar.e(0L, fmmx.b());
        this.d.f(catbVar.b());
    }

    public final void e() {
        int d = (int) fmmx.d();
        int c2 = (int) fmmx.c();
        String s = defpackage.a.s(c2, d, "Scheduling periodic DSID refresh task. period: ", " s, flex: ", " s.");
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d(s);
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.ads.social.GcmSchedulerWakeupService";
        cateVar.t("ads.social.doritos");
        fmmx fmmxVar = fmmx.a;
        cateVar.x(0, fmmxVar.lK().l() ? 1 : 0);
        cateVar.v(1);
        cateVar.y(0, fmmxVar.lK().n() ? 1 : 0);
        cateVar.f(0, fmmxVar.lK().m() ? 1 : 0);
        if (fpvd.a.lK().n()) {
            cateVar.j(cata.a(fmmx.d()));
        } else {
            cateVar.a = fmmx.d();
            cateVar.b = fmmx.c();
        }
        this.d.f(cateVar.b());
        this.e.edit().putInt("gms:ads:social:doritos:doritos_refresh_period_s", d).putInt("gms:ads:social:doritos:doritos_refresh_flex_s", c2).commit();
    }
}
