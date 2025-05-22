package com.google.android.gms.auth.authzen.cryptauth;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.abtx;
import defpackage.auad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SyncAlarmIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("SyncAlarmIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        b.h("Received intent %s.", intent);
        abtx a2 = abtx.a(getBaseContext());
        Uri data = intent.getData();
        if (data == null) {
            abtx.c.f("no data URI in intent", new Object[0]);
            return;
        }
        String queryParameter = data.getQueryParameter("eventType");
        String queryParameter2 = data.getQueryParameter("accountName");
        String queryParameter3 = data.getQueryParameter("syncComponent");
        if (queryParameter == null || queryParameter2 == null || queryParameter3 == null) {
            abtx.c.f("Could not get some required parameter from intent. eventTypeStr: %s; accountName: %s; syncComponentsStr: %s", queryParameter, queryParameter2, queryParameter3);
            return;
        }
        try {
            int parseInt = Integer.parseInt(queryParameter);
            int parseInt2 = Integer.parseInt(queryParameter3);
            int intExtra = intent.getIntExtra("invocationReason", 0);
            int intExtra2 = intent.getIntExtra("retryCount", 0);
            if (intExtra == 0) {
                abtx.c.m("scheduled intent has no invocation reason", new Object[0]);
                i = 0;
            } else {
                i = intExtra;
            }
            synchronized (a2.a) {
                a2.e(parseInt, queryParameter2, parseInt2, i, intExtra2);
            }
        } catch (NumberFormatException e) {
            abtx.c.g("badly formatted uri integer parameters", e, new Object[0]);
        }
    }
}
