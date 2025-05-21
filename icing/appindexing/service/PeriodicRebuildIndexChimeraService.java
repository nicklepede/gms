package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.blfw;
import defpackage.bljp;
import defpackage.blkf;
import defpackage.blmb;
import defpackage.blmk;
import defpackage.bltp;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.byln;
import defpackage.eniv;
import defpackage.enix;
import defpackage.fpad;
import defpackage.fpbg;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PeriodicRebuildIndexChimeraService extends RebuildIndexChimeraService {
    private static final Charset a = Charset.forName("UTF-8");

    public static void e(byjl byjlVar) {
        if (!fpad.a.a().Y()) {
            blfw.a("UPDATE_INDEX Periodic Scheduling Disabled.");
            return;
        }
        byko bykoVar = new byko();
        bykoVar.j = "com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService";
        bykoVar.t("PeriodicIndexRebuild");
        bykoVar.l(false);
        bykoVar.a = bykv.j;
        bykoVar.v(1);
        bykoVar.e();
        if (!fpbg.l()) {
            bykoVar.j();
        }
        byjlVar.f(bykoVar.b());
        blfw.a("Task scheduled.");
    }

    private static long f(long j, long j2) {
        long j3 = j % j2;
        return j3 < 0 ? j3 + Math.abs(j2) : j3;
    }

    @Override // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final int d(byln bylnVar, bljp bljpVar) {
        bljp bljpVar2 = bljpVar;
        if (!fpad.a.a().Z()) {
            blfw.a("UPDATE_INDEX Periodic Task Disabled.");
            return 0;
        }
        Context context = bljpVar2.a;
        bltp bltpVar = bljpVar2.b;
        blmk blmkVar = bljpVar2.c;
        SharedPreferences sharedPreferences = bltpVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("last-periodic-rebuild", 0L);
        Set<String> b = bljp.b(context);
        String string = sharedPreferences.getString("instance-id", null);
        if (string == null) {
            synchronized (bltpVar.h) {
                string = sharedPreferences.getString("instance-id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    sharedPreferences.edit().putString("instance-id", string).commit();
                }
            }
        }
        String str = string;
        blfw.b("Considering %d packages for index rebuild.", Integer.valueOf(b.size()));
        for (String str2 : b) {
            if (blmb.f(str2)) {
                blfw.b("Skipping package %s because automatic document deletion is disabled for it.", str2);
            } else {
                Charset charset = a;
                if (f(f(blkf.a(blkf.a(-3750763034362895579L, str2.getBytes(charset)), str.getBytes(charset)), fpad.b()) - f(j, fpad.b()), fpad.b()) + j < currentTimeMillis) {
                    long d = currentTimeMillis - bltpVar.d(str2);
                    if (d < fpad.a.a().s()) {
                        blfw.d("Skipping package %s because we just indexed it %d minutes ago.", str2, Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(d)));
                        blmkVar.f(str2, enix.PERIODIC, eniv.THROTTLED);
                    } else {
                        long j2 = currentTimeMillis;
                        if (bljpVar2.e(str2, j2, enix.PERIODIC, false)) {
                            blfw.b("Sent index request to package %s.", str2);
                        } else {
                            blfw.b("Failed to send index request to package %s.", str2);
                        }
                        bljpVar2 = bljpVar;
                        currentTimeMillis = j2;
                    }
                } else {
                    blfw.b("Skipping package %s because it is not scheduled in the current window.", str2);
                    bljpVar2 = bljpVar;
                }
            }
        }
        bltpVar.c.edit().putLong("last-periodic-rebuild", currentTimeMillis).commit();
        return 0;
    }
}
