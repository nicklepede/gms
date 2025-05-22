package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import defpackage.auua;
import defpackage.chen;
import defpackage.cheo;
import defpackage.chke;
import defpackage.ckpb;
import defpackage.ckyj;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PhenotypeChangeIntentOperation extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.nearby");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (chen.k(this)) {
            return;
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        boolean as = ftey.as();
        if (as != cheo.b(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService")) {
            ckpb.a.d().Q("onFlagChanged %s: %s", "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", as);
            cheo.a(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", as);
            if (ftey.as()) {
                ckyj.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", null);
            }
        }
        if (!ftey.M()) {
            TaskSchedulerChimeraService.f(this);
        }
        chke.d(getApplicationContext(), new Intent("com.google.android.gms.nearby.fastpair.common.ACTION_FLAG_UPDATED"));
    }
}
