package com.google.android.gms.auth.easyunlock;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import com.google.android.gms.auth.easyunlock.config.EasyUnlockSupportReporterIntentOperation;
import defpackage.acws;
import defpackage.apzs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class EasyUnlockInitIntentOperation extends apzs {
    static {
        acws.a("EasyUnlockInitIntentOperation");
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return;
        }
        Context baseContext = getBaseContext();
        baseContext.startService(EasyUnlockSupportReporterIntentOperation.a(baseContext));
        baseContext.startService(EasyUnlockChimeraService.a(baseContext));
    }
}
