package com.google.android.gms.nearby.fastpair;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import defpackage.asqg;
import defpackage.cexc;
import defpackage.cexd;
import defpackage.cfcs;
import defpackage.cigw;
import defpackage.ciqe;
import defpackage.fqld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PhenotypeChangeIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.nearby");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (cexc.j(this)) {
            return;
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        boolean ar = fqld.ar();
        if (ar != cexd.b(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService")) {
            cigw.a.d().Q("onFlagChanged %s: %s", "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", ar);
            cexd.a(this, "com.google.android.gms.nearby.fastpair.service.WearableDataListenerService", ar);
            if (fqld.ar()) {
                ciqe.c(this, "com.google.android.gms.nearby.fastpair.service.ACTION_START_WEARABLE_SERVICE", null);
            }
        }
        if (!fqld.L()) {
            TaskSchedulerChimeraService.f(this);
        }
        cfcs.d(getApplicationContext(), new Intent("com.google.android.gms.nearby.fastpair.common.ACTION_FLAG_UPDATED"));
    }
}
