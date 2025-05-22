package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aelv;
import defpackage.aelw;
import defpackage.aelz;
import defpackage.auad;
import defpackage.auqx;
import defpackage.fnts;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceSyncV2SyncFinishedIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "DeviceSyncV2FeatureIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FINISHED".equals(intent.getAction())) {
            if (!fnts.j()) {
                a.m("Received v2 sync finished broadcast but v2 registration is turned off!", new Object[0]);
                return;
            }
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (!auqx.m(this, account)) {
                a.m("Invalid account: %s", stringExtra);
                return;
            }
            if (fnts.g()) {
                int i = aelz.a;
                aelz.a(this, account);
                return;
            }
            try {
                aelv.a(this).a(account, intent.getIntExtra("invocation_reason", 0));
            } catch (aelw unused) {
                a.m("Failed to sync v1 devices.", new Object[0]);
                CryptauthDeviceSyncGcmTaskService.g(getApplicationContext(), account);
                int i2 = aelz.a;
                aelz.a(this, account);
            }
        }
    }
}
