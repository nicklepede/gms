package com.google.android.gms.backup.transport.scheduling;

import android.net.ConnectivityManager;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahhj;
import defpackage.ahkk;
import defpackage.ahwd;
import defpackage.akds;
import defpackage.akdx;
import defpackage.akky;
import defpackage.arxo;
import defpackage.byln;
import defpackage.flkf;
import defpackage.fllq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RequireWifiAndChargingBackupTask extends GmsTaskBoundService {
    public static final arxo a = ahwd.a("RequireWifiAndChargingBackupTask");

    private static final void d(int i) {
        if (flkf.a.a().r()) {
            new akdx().b(2, i);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!akky.a()) {
            a.j("Won't run, disabled", new Object[0]);
            d(2);
            return 2;
        }
        boolean c = akds.c(this);
        if (((ConnectivityManager) getSystemService(ConnectivityManager.class)).isActiveNetworkMetered() && c) {
            a.m("Task unexpectedly started on metered network.", new Object[0]);
            d(4);
            return 2;
        }
        a.h("Requesting backup", new Object[0]);
        ahhj ahhjVar = new ahhj();
        ahhjVar.a = c;
        ahhjVar.b = true;
        ahhjVar.c = false;
        ahhjVar.d = fllq.h();
        ahhjVar.e = fllq.i();
        ahhjVar.g = false;
        ahhjVar.h = true;
        ahhjVar.i = false;
        new ahkk(this).b(new BackUpNowConfig(ahhjVar));
        return 0;
    }
}
