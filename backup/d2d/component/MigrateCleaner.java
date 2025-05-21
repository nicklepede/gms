package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.Build;
import defpackage.ahpv;
import defpackage.ahwd;
import defpackage.aieg;
import defpackage.aies;
import defpackage.aifj;
import defpackage.aijy;
import defpackage.ailq;
import defpackage.aiwt;
import defpackage.anya;
import defpackage.arnh;
import defpackage.arni;
import defpackage.arwm;
import defpackage.fllb;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MigrateCleaner extends anya {
    private static final ahwd a = new ahwd("MigrateCleaner");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (!aifj.a()) {
            a.h("Not running for non-user 0.", new Object[0]);
            return;
        }
        try {
            ailq a2 = ailq.a(this);
            arwm.j();
            arni arniVar = a2.a;
            if (arniVar.contains("migration_start_time_millis")) {
                long currentTimeMillis = System.currentTimeMillis() - arniVar.getLong("migration_start_time_millis", 0L);
                if (currentTimeMillis >= 0 && currentTimeMillis < a2.b) {
                    a.m("MigrateCleaner was run while migration was in progress, skipping.", new Object[0]);
                    return;
                }
            }
            aies.f(this);
            aijy aijyVar = new aijy(this);
            aijyVar.c();
            aijyVar.b();
            if (Build.VERSION.SDK_INT < 26) {
                aieg aiegVar = new aieg(this);
                aiegVar.a("com.google.android.gms.backup.component.D2dTransportService", false);
                aiegVar.a("com.google.android.gms.backup.BackupTransportService", true);
            }
            try {
                if ("com.google.android.gms/.backup.migrate.service.D2dTransport".equals(new ahpv(this).d())) {
                    a.h("D2D transport was selected, selecting cloud transport.", new Object[0]);
                    new ahpv(this).o("com.google.android.gms/.backup.BackupTransportService");
                    return;
                }
            } catch (SecurityException e) {
                if (!fllb.a.a().az()) {
                    throw e;
                }
                aiwt.a(4);
                a.g("Unexpected SecurityException (hasPermission = %b)", e, Boolean.valueOf(iln.a(this, "android.permission.BACKUP") == 0));
            }
            a.d("D2D transport was not selected, not selecting cloud transport.", new Object[0]);
        } catch (arnh e2) {
            aiwt.a(3);
            a.n("Unable to check if migration in progress, skipping.", e2, new Object[0]);
        }
    }
}
