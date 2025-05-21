package com.google.android.gms.ads.social;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.admob.AppContextProvider;
import defpackage.fjwt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DoritosIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
            String valueOf = String.valueOf(action);
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.i("Accounts have changed: ".concat(valueOf));
            e a = e.a(AppContextProvider.a());
            if (!fjwt.a.a().p()) {
                a.c();
                return;
            }
            Context context = a.a;
            if (new b(context).b(i.a(context).d())) {
                a.c();
            }
        }
    }
}
