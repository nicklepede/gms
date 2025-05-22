package com.google.android.gms.backup.settings.component;

import android.content.Intent;
import defpackage.ajwt;
import defpackage.also;
import defpackage.apzs;
import defpackage.auad;
import defpackage.ausn;
import defpackage.auub;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.cato;
import defpackage.eluo;
import defpackage.fobm;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SettingsModuleInitIntentOperation extends apzs {
    private static final auad a = ajwt.a("SettingsModuleInit");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        a.j("onInitRuntimeState", new Object[0]);
        if (NoBackupNotificationChimeraService.f(this)) {
            NoBackupNotificationChimeraService.d(this, 0, false);
        } else {
            NoBackupNotificationChimeraService.a.j("Disabled, not scheduling", new Object[0]);
        }
        ausn ausnVar = also.a;
        fobm fobmVar = fobm.a;
        if (!fobmVar.lK().f() || !auub.c()) {
            ((eluo) also.a.h()).x("Not scheduling task. Flag is off or device is wearable.");
            return;
        }
        catn e = catn.e((int) fobmVar.lK().a());
        fxxm.e(e, "fromInteger(...)");
        catg catgVar = new catg();
        catgVar.w("com.google.android.gms.backup.settings.notifications.BackupNotificationsTask");
        catgVar.t("backup_notifications");
        catgVar.a = e;
        catgVar.l(true);
        catgVar.v(2);
        catgVar.p = true;
        cato b = catgVar.b();
        ((eluo) also.a.h()).x("Scheduled backup notifications task successfully.");
        casd.a(this).f(b);
    }
}
