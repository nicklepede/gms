package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import defpackage.ahwd;
import defpackage.ajrv;
import defpackage.anya;
import defpackage.arxo;
import defpackage.asot;
import defpackage.asqh;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykw;
import defpackage.ejhf;
import defpackage.flkc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SettingsModuleInitIntentOperation extends anya {
    private static final arxo a = ahwd.a("SettingsModuleInit");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        a.j("onInitRuntimeState", new Object[0]);
        if (NoBackupNotificationChimeraService.f(this)) {
            NoBackupNotificationChimeraService.d(this, 0, false);
        } else {
            NoBackupNotificationChimeraService.a.j("Disabled, not scheduling", new Object[0]);
        }
        asot asotVar = ajrv.a;
        if (!flkc.a.a().f() || !asqh.c()) {
            ((ejhf) ajrv.a.h()).x("Not scheduling task. Flag is off or device is wearable.");
            return;
        }
        bykv e = bykv.e((int) flkc.a.a().a());
        fvbo.e(e, "fromInteger(...)");
        byko bykoVar = new byko();
        bykoVar.w("com.google.android.gms.backup.settings.notifications.BackupNotificationsTask");
        bykoVar.t("backup_notifications");
        bykoVar.a = e;
        bykoVar.l(true);
        bykoVar.v(2);
        bykoVar.p = true;
        bykw b = bykoVar.b();
        ((ejhf) ajrv.a.h()).x("Scheduled backup notifications task successfully.");
        byjl.a(this).f(b);
    }
}
