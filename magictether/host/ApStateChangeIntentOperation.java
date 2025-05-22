package com.google.android.gms.magictether.host;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cdyn;
import defpackage.cdzc;
import defpackage.cdzd;
import defpackage.ceam;
import defpackage.ceeg;
import defpackage.ceeh;
import defpackage.ceem;
import defpackage.fssz;
import defpackage.fstg;
import defpackage.kar;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ApStateChangeIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fssz.e() || fssz.i()) {
            return;
        }
        if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction()) || "com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("wifi_state", -1);
            if ("com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED".equals(intent.getAction()) || intExtra == 11 || intExtra == 14) {
                new ceeh(new ceeg(getApplicationContext())).a();
                cdzc.f();
                if (cdyn.c(fstg.j())) {
                    ceem.c().k();
                    ceam a = ceam.a(getApplicationContext());
                    if (a != null) {
                        a.c(false);
                    }
                } else {
                    ceem.c().i();
                    cdzd.a(getApplicationContext()).c(false);
                }
                kar.a(getApplicationContext()).e(new Intent("com.google.android.gms.magictether.AP_FINISHED_DISABLING"));
            }
        }
    }
}
