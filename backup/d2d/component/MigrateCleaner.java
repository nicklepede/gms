package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.Build;
import defpackage.ajql;
import defpackage.ajwt;
import defpackage.akew;
import defpackage.akfi;
import defpackage.akfz;
import defpackage.akko;
import defpackage.akmg;
import defpackage.akxj;
import defpackage.apzs;
import defpackage.atpw;
import defpackage.atpx;
import defpackage.atzb;
import defpackage.focl;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MigrateCleaner extends apzs {
    private static final ajwt a = new ajwt("MigrateCleaner");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (!akfz.a()) {
            a.h("Not running for non-user 0.", new Object[0]);
            return;
        }
        try {
            akmg a2 = akmg.a(this);
            atzb.j();
            atpx atpxVar = a2.a;
            if (atpxVar.contains("migration_start_time_millis")) {
                long currentTimeMillis = System.currentTimeMillis() - atpxVar.getLong("migration_start_time_millis", 0L);
                if (currentTimeMillis >= 0 && currentTimeMillis < a2.b) {
                    a.m("MigrateCleaner was run while migration was in progress, skipping.", new Object[0]);
                    return;
                }
            }
            akfi.f(this);
            akko akkoVar = new akko(this);
            akkoVar.c();
            akkoVar.b();
            if (Build.VERSION.SDK_INT < 26) {
                akew akewVar = new akew(this);
                akewVar.a("com.google.android.gms.backup.component.D2dTransportService", false);
                akewVar.a("com.google.android.gms.backup.BackupTransportService", true);
            }
            try {
                if ("com.google.android.gms/.backup.migrate.service.D2dTransport".equals(new ajql(this).d())) {
                    a.h("D2D transport was selected, selecting cloud transport.", new Object[0]);
                    new ajql(this).n("com.google.android.gms/.backup.BackupTransportService");
                    return;
                }
            } catch (SecurityException e) {
                if (!focl.a.lK().az()) {
                    throw e;
                }
                akxj.a(4);
                a.g("Unexpected SecurityException (hasPermission = %b)", e, Boolean.valueOf(ind.a(this, "android.permission.BACKUP") == 0));
            }
            a.d("D2D transport was not selected, not selecting cloud transport.", new Object[0]);
        } catch (atpw e2) {
            akxj.a(3);
            a.n("Unable to check if migration in progress, skipping.", e2, new Object[0]);
        }
    }
}
