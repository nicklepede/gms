package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aclv;
import defpackage.aclw;
import defpackage.aclz;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.flcj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceSyncV2SyncFinishedIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "DeviceSyncV2FeatureIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FINISHED".equals(intent.getAction())) {
            if (!flcj.j()) {
                a.m("Received v2 sync finished broadcast but v2 registration is turned off!", new Object[0]);
                return;
            }
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (!asnd.m(this, account)) {
                a.m("Invalid account: %s", stringExtra);
                return;
            }
            if (flcj.g()) {
                int i = aclz.a;
                aclz.a(this, account);
                return;
            }
            try {
                aclv.a(this).a(account, intent.getIntExtra("invocation_reason", 0));
            } catch (aclw unused) {
                a.m("Failed to sync v1 devices.", new Object[0]);
                CryptauthDeviceSyncGcmTaskService.g(getApplicationContext(), account);
                int i2 = aclz.a;
                aclz.a(this, account);
            }
        }
    }
}
