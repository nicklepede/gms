package com.google.android.gms.common.analytics;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aszi;
import defpackage.auid;
import defpackage.ausn;
import defpackage.fpkd;
import defpackage.fpks;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CoreAnalyticsLogEventOperation extends IntentOperation {
    static {
        ausn.b("CoreAnalyticsLogEvent", auid.CORE);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) && fpkd.c()) {
            aszi.c();
            aszi.b(this, 12, fpks.c());
        } else if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            aszi.c();
            aszi.b(this, 13, fpks.c());
        }
    }
}
