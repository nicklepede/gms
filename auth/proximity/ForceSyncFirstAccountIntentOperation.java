package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acmy;
import defpackage.arxo;
import defpackage.asnd;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ForceSyncFirstAccountIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = new arxo("ProximityAuth", "ForceSyncFirstAccount");

    public ForceSyncFirstAccountIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.auth.proximity.FORCE_DEVICE_SYNC".equals(intent.getAction())) {
            return;
        }
        List h = asnd.h(this, getPackageName());
        if (h.isEmpty()) {
            b.m("No valid accounts could be fetched.", new Object[0]);
        } else {
            int i = acmy.a;
            acmy.a(this, (Account) h.get(0));
        }
    }

    ForceSyncFirstAccountIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
