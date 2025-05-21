package com.google.android.gms.common.analytics;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aqwt;
import defpackage.asej;
import defpackage.asot;
import defpackage.fmsf;
import defpackage.fmsu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CoreAnalyticsLogEventOperation extends IntentOperation {
    static {
        asot.b("CoreAnalyticsLogEvent", asej.CORE);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) && fmsf.c()) {
            aqwt.c();
            aqwt.b(this, 12, fmsu.c());
        } else if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            aqwt.c();
            aqwt.b(this, 13, fmsu.c());
        }
    }
}
