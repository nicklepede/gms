package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import defpackage.acjm;
import defpackage.acox;
import defpackage.asng;
import defpackage.asqg;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.auth.proximity");

    public PhenotypeChangeListenerIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.auth.proximity".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (!flcw.J()) {
                asng.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", flcw.C());
            }
            if (flcw.I()) {
                asng.M("com.google.android.gms.auth.proximity.phonehub.NotificationOptInActivity", 0);
            }
            CryptauthDeviceSyncGcmTaskService.f(getApplicationContext());
            startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()));
            startService(BetterTogetherUnifiedSetupIntentOperation.a(getBaseContext()));
            startService(PhoneHubChimeraService.a(getBaseContext()));
            acjm.b();
            acox.a(getBaseContext()).a();
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
