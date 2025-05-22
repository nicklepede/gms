package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.bnmo;
import defpackage.bnqh;
import defpackage.bnqx;
import defpackage.bnst;
import defpackage.bntc;
import defpackage.boah;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.cauf;
import defpackage.epwm;
import defpackage.epwo;
import defpackage.frtk;
import defpackage.frun;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PeriodicRebuildIndexChimeraService extends RebuildIndexChimeraService {
    private static final Charset a = Charset.forName("UTF-8");

    public static void e(casd casdVar) {
        if (!frtk.a.lK().X()) {
            bnmo.a("UPDATE_INDEX Periodic Scheduling Disabled.");
            return;
        }
        catg catgVar = new catg();
        catgVar.j = "com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService";
        catgVar.t("PeriodicIndexRebuild");
        catgVar.l(false);
        catgVar.a = catn.j;
        catgVar.v(1);
        catgVar.e();
        if (!frun.l()) {
            catgVar.j();
        }
        casdVar.f(catgVar.b());
        bnmo.a("Task scheduled.");
    }

    private static long f(long j, long j2) {
        long j3 = j % j2;
        return j3 < 0 ? j3 + Math.abs(j2) : j3;
    }

    @Override // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final int d(cauf caufVar, bnqh bnqhVar) {
        bnqh bnqhVar2 = bnqhVar;
        if (!frtk.a.lK().Y()) {
            bnmo.a("UPDATE_INDEX Periodic Task Disabled.");
            return 0;
        }
        Context context = bnqhVar2.a;
        boah boahVar = bnqhVar2.b;
        bntc bntcVar = bnqhVar2.c;
        SharedPreferences sharedPreferences = boahVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("last-periodic-rebuild", 0L);
        Set<String> b = bnqh.b(context);
        String string = sharedPreferences.getString("instance-id", null);
        if (string == null) {
            synchronized (boahVar.h) {
                string = sharedPreferences.getString("instance-id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    sharedPreferences.edit().putString("instance-id", string).commit();
                }
            }
        }
        String str = string;
        bnmo.b("Considering %d packages for index rebuild.", Integer.valueOf(b.size()));
        for (String str2 : b) {
            if (bnst.f(str2)) {
                bnmo.b("Skipping package %s because automatic document deletion is disabled for it.", str2);
            } else {
                Charset charset = a;
                if (f(f(bnqx.a(bnqx.a(-3750763034362895579L, str2.getBytes(charset)), str.getBytes(charset)), frtk.b()) - f(j, frtk.b()), frtk.b()) + j < currentTimeMillis) {
                    long d = currentTimeMillis - boahVar.d(str2);
                    if (d < frtk.a.lK().s()) {
                        bnmo.d("Skipping package %s because we just indexed it %d minutes ago.", str2, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(d)));
                        bntcVar.f(str2, epwo.PERIODIC, epwm.THROTTLED);
                    } else {
                        long j2 = currentTimeMillis;
                        if (bnqhVar2.e(str2, j2, epwo.PERIODIC, false)) {
                            bnmo.b("Sent index request to package %s.", str2);
                        } else {
                            bnmo.b("Failed to send index request to package %s.", str2);
                        }
                        bnqhVar2 = bnqhVar;
                        currentTimeMillis = j2;
                    }
                } else {
                    bnmo.b("Skipping package %s because it is not scheduled in the current window.", str2);
                    bnqhVar2 = bnqhVar;
                }
            }
        }
        boahVar.c.edit().putLong("last-periodic-rebuild", currentTimeMillis).commit();
        return 0;
    }
}
