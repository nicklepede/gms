package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.cbkz;
import defpackage.cbla;
import defpackage.cbpu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class IntentHandlers$OnUpgradeOrBootOperation extends anya {
    private static final String[] a = {"com.google.android.gms.magictether.host.FirstTimeSetupDialogActivity", "com.google.android.gms.magictether.host.ProvisioningFailedDialogActivity", "com.google.android.gms.magictether.host.TetherListenerService", "com.google.android.gms.magictether.logging.DailyMetricsLoggerService", "com.google.android.gms.magictether.wifisync.WifiSyncService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (cbpu.a(this)) {
            return;
        }
        String[] strArr = a;
        int i2 = 0;
        while (true) {
            if (i2 >= 5) {
                break;
            }
            asng.H(this, strArr[i2], true);
            i2++;
        }
        Context baseContext = getBaseContext();
        cbkz.a(baseContext, (i & 2) > 0);
        cbla.a(baseContext, false);
    }
}
