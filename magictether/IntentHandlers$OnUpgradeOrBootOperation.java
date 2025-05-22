package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.cdtr;
import defpackage.cdts;
import defpackage.cdym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class IntentHandlers$OnUpgradeOrBootOperation extends apzs {
    private static final String[] a = {"com.google.android.gms.magictether.host.FirstTimeSetupDialogActivity", "com.google.android.gms.magictether.host.ProvisioningFailedDialogActivity", "com.google.android.gms.magictether.host.TetherListenerService", "com.google.android.gms.magictether.logging.DailyMetricsLoggerService", "com.google.android.gms.magictether.wifisync.WifiSyncService"};

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (cdym.a(this)) {
            return;
        }
        String[] strArr = a;
        int i2 = 0;
        while (true) {
            if (i2 >= 5) {
                break;
            }
            aura.H(this, strArr[i2], true);
            i2++;
        }
        Context baseContext = getBaseContext();
        cdtr.a(baseContext, (i & 2) > 0);
        cdts.a(baseContext, false);
    }
}
