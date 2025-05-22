package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import defpackage.aejm;
import defpackage.aeox;
import defpackage.apzs;
import defpackage.auad;
import defpackage.aura;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ProximityAuthInitIntentOperation extends apzs {
    private static final String[] a = {"com.google.android.gms.auth.proximity.phonehub.PhoneHubService"};

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        aura.H(this, a[0], true);
        aejm.b();
        if (!fnuf.J()) {
            aura.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", fnuf.C());
        }
        if (fnuf.I()) {
            aura.M("com.google.android.gms.auth.proximity.phonehub.NotificationOptInActivity", 0);
        }
        if ((i & 2) <= 0) {
            Context applicationContext = getApplicationContext();
            auad auadVar = FirstPartyDeviceRegistrationChimeraService.a;
            applicationContext.startService(new Intent().setClassName(applicationContext, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService").putExtra("EXTRA_IS_INIT_INTENT", true));
        }
        CryptauthDeviceSyncGcmTaskService.f(getApplicationContext());
        startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()));
        startService(BetterTogetherUnifiedSetupIntentOperation.a(getBaseContext()));
        startService(PhoneHubChimeraService.a(getBaseContext()));
        aejm.b();
        aeox.a(getBaseContext()).a();
    }
}
