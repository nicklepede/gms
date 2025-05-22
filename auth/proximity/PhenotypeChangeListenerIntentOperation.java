package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import defpackage.aejm;
import defpackage.aeox;
import defpackage.aura;
import defpackage.auua;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.auth.proximity");

    public PhenotypeChangeListenerIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.auth.proximity".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (!fnuf.J()) {
                aura.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", fnuf.C());
            }
            if (fnuf.I()) {
                aura.M("com.google.android.gms.auth.proximity.phonehub.NotificationOptInActivity", 0);
            }
            CryptauthDeviceSyncGcmTaskService.f(getApplicationContext());
            startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()));
            startService(BetterTogetherUnifiedSetupIntentOperation.a(getBaseContext()));
            startService(PhoneHubChimeraService.a(getBaseContext()));
            aejm.b();
            aeox.a(getBaseContext()).a();
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
