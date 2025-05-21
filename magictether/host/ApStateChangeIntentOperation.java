package com.google.android.gms.magictether.host;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cbpv;
import defpackage.cbqk;
import defpackage.cbql;
import defpackage.cbru;
import defpackage.cbvo;
import defpackage.cbvp;
import defpackage.cbvu;
import defpackage.fpzd;
import defpackage.fpzk;
import defpackage.juc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ApStateChangeIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fpzd.e() || fpzd.i()) {
            return;
        }
        if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction()) || "com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("wifi_state", -1);
            if ("com.google.android.gms.magictether.MAGICTETHER_HOST_DISABLED".equals(intent.getAction()) || intExtra == 11 || intExtra == 14) {
                new cbvp(new cbvo(getApplicationContext())).a();
                cbqk.f();
                if (cbpv.c(fpzk.j())) {
                    cbvu.c().k();
                    cbru a = cbru.a(getApplicationContext());
                    if (a != null) {
                        a.c(false);
                    }
                } else {
                    cbvu.c().i();
                    cbql.a(getApplicationContext()).c(false);
                }
                juc.a(getApplicationContext()).e(new Intent("com.google.android.gms.magictether.AP_FINISHED_DISABLING"));
            }
        }
    }
}
