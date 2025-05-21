package com.google.android.gms.auth.easyunlock;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import com.google.android.gms.auth.easyunlock.config.EasyUnlockSupportReporterIntentOperation;
import defpackage.aaws;
import defpackage.anya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EasyUnlockInitIntentOperation extends anya {
    static {
        aaws.a("EasyUnlockInitIntentOperation");
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return;
        }
        Context baseContext = getBaseContext();
        baseContext.startService(EasyUnlockSupportReporterIntentOperation.a(baseContext));
        baseContext.startService(EasyUnlockChimeraService.a(baseContext));
    }
}
