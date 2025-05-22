package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aemm;
import defpackage.auad;
import defpackage.auqx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthGcmProximityBroadcastIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "CryptauthGcmProximityBroadcastIntentOperation");
    private final aemm b;

    public CryptauthGcmProximityBroadcastIntentOperation() {
        this.b = new aemm();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.authzen.GCM_DEVICE_PROXIMITY".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (auqx.m(this, account)) {
                this.b.a(this, account, intent.getStringExtra("bluetooth_mac_address"));
            } else {
                a.m("Invalid account: %s", stringExtra);
            }
        }
    }

    CryptauthGcmProximityBroadcastIntentOperation(Context context, aemm aemmVar) {
        attachBaseContext(context);
        this.b = aemmVar;
    }
}
