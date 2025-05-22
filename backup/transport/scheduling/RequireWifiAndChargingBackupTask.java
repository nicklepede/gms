package com.google.android.gms.backup.transport.scheduling;

import android.net.ConnectivityManager;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajhz;
import defpackage.ajla;
import defpackage.ajwt;
import defpackage.amep;
import defpackage.ameu;
import defpackage.ammb;
import defpackage.auad;
import defpackage.cauf;
import defpackage.fobp;
import defpackage.foda;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RequireWifiAndChargingBackupTask extends GmsTaskBoundService {
    public static final auad a = ajwt.a("RequireWifiAndChargingBackupTask");

    private static final void d(int i) {
        if (fobp.a.lK().r()) {
            new ameu();
            ameu.a(2, i);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!ammb.a()) {
            a.j("Won't run, disabled", new Object[0]);
            d(2);
            return 2;
        }
        boolean c = amep.c(this);
        if (((ConnectivityManager) getSystemService(ConnectivityManager.class)).isActiveNetworkMetered() && c) {
            a.m("Task unexpectedly started on metered network.", new Object[0]);
            d(4);
            return 2;
        }
        a.h("Requesting backup", new Object[0]);
        ajhz ajhzVar = new ajhz();
        ajhzVar.a = c;
        ajhzVar.b = true;
        ajhzVar.c = false;
        ajhzVar.d = foda.h();
        ajhzVar.e = foda.i();
        ajhzVar.g = false;
        ajhzVar.h = true;
        ajhzVar.i = false;
        new ajla(this).b(new BackUpNowConfig(ajhzVar));
        return 0;
    }
}
