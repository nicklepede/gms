package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acmm;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.ejqk;
import defpackage.ejqn;
import defpackage.ejtk;
import defpackage.esjn;
import defpackage.flcj;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceSyncV2FeatureIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "DeviceSyncV2FeatureIntentOperation");
    private final acmm b;

    public DeviceSyncV2FeatureIntentOperation() {
        this.b = new acmm();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String name;
        if ("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE".equals(intent.getAction()) && flcj.i()) {
            String stringExtra = intent.getStringExtra("account_name");
            Account account = new Account(stringExtra, "com.google");
            if (!asnd.m(this, account)) {
                a.m("Invalid account: %s", stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("feature_name");
            esjn[] values = esjn.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    a.m("Couldn't retrieve feature name from hashed value", new Object[0]);
                    name = esjn.UNKNOWN_FEATURE.name();
                    break;
                }
                esjn esjnVar = values[i];
                String name2 = esjnVar.name();
                int i2 = ejqn.b;
                long c = ejqk.a.c(name2, Charset.forName("UTF-8")).c();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(c);
                if (ejtk.e.g().n(allocate.array()).equals(stringExtra2)) {
                    name = esjnVar.name();
                    break;
                }
                i++;
            }
            this.b.a(this, account, name);
        }
    }

    DeviceSyncV2FeatureIntentOperation(Context context, acmm acmmVar) {
        attachBaseContext(context);
        this.b = acmmVar;
    }
}
