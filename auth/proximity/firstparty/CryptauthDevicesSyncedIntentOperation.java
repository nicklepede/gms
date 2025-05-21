package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aans;
import defpackage.aclv;
import defpackage.aclw;
import defpackage.aclz;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.flcg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthDevicesSyncedIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "CryptauthDevicesSyncedIntentOperation");

    public CryptauthDevicesSyncedIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("permit_id");
            Account account = null;
            if (stringExtra == null) {
                a.m("No permit ID was found from intent.", new Object[0]);
            } else {
                String substring = stringExtra.substring(34);
                for (Account account2 : asnd.h(this, getPackageName())) {
                    if (true == aans.a(account2.name).equals(substring)) {
                        account = account2;
                    }
                }
                if (account == null) {
                    a.m("Invalid account: %s", substring);
                }
            }
            if (flcg.h()) {
                CryptauthDeviceSyncGcmTaskService.f(getApplicationContext());
                int intExtra = intent.getIntExtra("invocation_reason", 0);
                if (!flcg.a.a().l() || intExtra != 4) {
                    try {
                        aclv.a(this).b(account, intExtra);
                        return;
                    } catch (aclw unused) {
                        a.m("Failed to sync devices.", new Object[0]);
                        if (account != null) {
                            CryptauthDeviceSyncGcmTaskService.g(getApplicationContext(), account);
                            return;
                        }
                        return;
                    }
                }
            }
            int i = aclz.a;
            aclz.a(this, account);
        }
    }

    CryptauthDevicesSyncedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
