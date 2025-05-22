package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acns;
import defpackage.aelv;
import defpackage.aelw;
import defpackage.aelz;
import defpackage.auad;
import defpackage.auqx;
import defpackage.fntp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthDevicesSyncedIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "CryptauthDevicesSyncedIntentOperation");

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
                for (Account account2 : auqx.h(this, getPackageName())) {
                    if (true == acns.a(account2.name).equals(substring)) {
                        account = account2;
                    }
                }
                if (account == null) {
                    a.m("Invalid account: %s", substring);
                }
            }
            if (fntp.g()) {
                CryptauthDeviceSyncGcmTaskService.f(getApplicationContext());
                int intExtra = intent.getIntExtra("invocation_reason", 0);
                if (!fntp.a.lK().k() || intExtra != 4) {
                    try {
                        aelv.a(this).b(account, intExtra);
                        return;
                    } catch (aelw unused) {
                        a.m("Failed to sync devices.", new Object[0]);
                        if (account != null) {
                            CryptauthDeviceSyncGcmTaskService.g(getApplicationContext(), account);
                            return;
                        }
                        return;
                    }
                }
            }
            int i = aelz.a;
            aelz.a(this, account);
        }
    }

    CryptauthDevicesSyncedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
