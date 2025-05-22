package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aemm;
import defpackage.auad;
import defpackage.auqx;
import defpackage.emdt;
import defpackage.emdw;
import defpackage.emgt;
import defpackage.euzc;
import defpackage.fnts;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceSyncV2FeatureIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "DeviceSyncV2FeatureIntentOperation");
    private final aemm b;

    public DeviceSyncV2FeatureIntentOperation() {
        this.b = new aemm();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String name;
        if ("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE".equals(intent.getAction()) && fnts.i()) {
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (!auqx.m(this, account)) {
                a.m("Invalid account: %s", stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("feature_name");
            euzc[] values = euzc.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    a.m("Couldn't retrieve feature name from hashed value", new Object[0]);
                    name = euzc.UNKNOWN_FEATURE.name();
                    break;
                }
                euzc euzcVar = values[i];
                String name2 = euzcVar.name();
                int i2 = emdw.b;
                long c = emdt.a.c(name2, Charset.forName("UTF-8")).c();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(c);
                if (emgt.e.g().n(allocate.array()).equals(stringExtra2)) {
                    name = euzcVar.name();
                    break;
                }
                i++;
            }
            this.b.a(this, account, name);
        }
    }

    DeviceSyncV2FeatureIntentOperation(Context context, aemm aemmVar) {
        attachBaseContext(context);
        this.b = aemmVar;
    }
}
