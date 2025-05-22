package com.google.android.gms.crisisalerts.init;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.ausn;
import defpackage.azgv;
import defpackage.azhg;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsModuleInitIntentOperation extends azgv {
    static {
        azhg.a("ModIIO");
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ausn ausnVar = CrisisAlertsPersistentChimeraService.a;
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.android.gms.crisisalerts.init.CrisisAlertsPersistentService"));
        if (startService(intent2) == null) {
            ((eluo) ((eluo) CrisisAlertsPersistentChimeraService.a.j()).ai((char) 3362)).x("unable to start persistent service");
        }
    }
}
