package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dkdi;
import defpackage.dpya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OptinBroadcastOperation extends IntentOperation {
    static {
        ausn.b("UsageReportingOptInRec", auid.USAGE_REPORTING);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long longExtra = intent.getLongExtra("SOURCE_SERIAL_ID", -1L);
        if (longExtra == -1) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("OPT_VALUE", false);
        dkdi e = dkdi.e();
        synchronized (dkdi.c) {
            dkdi.r(dkdi.c(e.f), longExtra, booleanExtra);
            if (dpya.j()) {
                dkdi.r(dkdi.c(e.g), longExtra, booleanExtra);
            }
        }
        e.s(this);
    }
}
