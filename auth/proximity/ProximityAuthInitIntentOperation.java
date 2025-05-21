package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import defpackage.acjm;
import defpackage.acox;
import defpackage.anya;
import defpackage.arxo;
import defpackage.asng;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ProximityAuthInitIntentOperation extends anya {
    private static final String[] a = {"com.google.android.gms.auth.proximity.phonehub.PhoneHubService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asng.H(this, a[0], true);
        acjm.b();
        if (!flcw.J()) {
            asng.H(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", flcw.C());
        }
        if (flcw.I()) {
            asng.M("com.google.android.gms.auth.proximity.phonehub.NotificationOptInActivity", 0);
        }
        if ((i & 2) <= 0) {
            Context applicationContext = getApplicationContext();
            arxo arxoVar = FirstPartyDeviceRegistrationChimeraService.a;
            applicationContext.startService(new Intent().setClassName(applicationContext, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService").putExtra("EXTRA_IS_INIT_INTENT", true));
        }
        CryptauthDeviceSyncGcmTaskService.f(getApplicationContext());
        startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()));
        startService(BetterTogetherUnifiedSetupIntentOperation.a(getBaseContext()));
        startService(PhoneHubChimeraService.a(getBaseContext()));
        acjm.b();
        acox.a(getBaseContext()).a();
    }
}
