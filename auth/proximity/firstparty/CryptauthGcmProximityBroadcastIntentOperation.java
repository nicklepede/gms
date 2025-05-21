package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acmm;
import defpackage.arxo;
import defpackage.asnd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthGcmProximityBroadcastIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "CryptauthGcmProximityBroadcastIntentOperation");
    private final acmm b;

    public CryptauthGcmProximityBroadcastIntentOperation() {
        this.b = new acmm();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.authzen.GCM_DEVICE_PROXIMITY".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (asnd.m(this, account)) {
                this.b.a(this, account, intent.getStringExtra("bluetooth_mac_address"));
            } else {
                a.m("Invalid account: %s", stringExtra);
            }
        }
    }

    CryptauthGcmProximityBroadcastIntentOperation(Context context, acmm acmmVar) {
        attachBaseContext(context);
        this.b = acmmVar;
    }
}
