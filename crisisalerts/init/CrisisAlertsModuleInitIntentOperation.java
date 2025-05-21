package com.google.android.gms.crisisalerts.init;

import android.content.ComponentName;
import android.content.Intent;
import defpackage.asot;
import defpackage.axcv;
import defpackage.axdg;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsModuleInitIntentOperation extends axcv {
    static {
        axdg.a("ModIIO");
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asot asotVar = CrisisAlertsPersistentChimeraService.a;
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.android.gms.crisisalerts.init.CrisisAlertsPersistentService"));
        if (startService(intent2) == null) {
            ((ejhf) ((ejhf) CrisisAlertsPersistentChimeraService.a.j()).ah((char) 3358)).x("unable to start persistent service");
        }
    }
}
