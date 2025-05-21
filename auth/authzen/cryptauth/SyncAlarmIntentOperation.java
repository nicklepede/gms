package com.google.android.gms.auth.authzen.cryptauth;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.ztx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SyncAlarmIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = new arxo("SyncAlarmIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        b.h("Received intent %s.", intent);
        ztx a2 = ztx.a(getBaseContext());
        Uri data = intent.getData();
        if (data == null) {
            ztx.c.f("no data URI in intent", new Object[0]);
            return;
        }
        String queryParameter = data.getQueryParameter("eventType");
        String queryParameter2 = data.getQueryParameter("accountName");
        String queryParameter3 = data.getQueryParameter("syncComponent");
        if (queryParameter == null || queryParameter2 == null || queryParameter3 == null) {
            ztx.c.f("Could not get some required parameter from intent. eventTypeStr: %s; accountName: %s; syncComponentsStr: %s", queryParameter, queryParameter2, queryParameter3);
            return;
        }
        try {
            int parseInt = Integer.parseInt(queryParameter);
            int parseInt2 = Integer.parseInt(queryParameter3);
            int intExtra = intent.getIntExtra("invocationReason", 0);
            int intExtra2 = intent.getIntExtra("retryCount", 0);
            if (intExtra == 0) {
                ztx.c.m("scheduled intent has no invocation reason", new Object[0]);
                i = 0;
            } else {
                i = intExtra;
            }
            synchronized (a2.a) {
                a2.e(parseInt, queryParameter2, parseInt2, i, intExtra2);
            }
        } catch (NumberFormatException e) {
            ztx.c.g("badly formatted uri integer parameters", e, new Object[0]);
        }
    }
}
