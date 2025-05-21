package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.dhsa;
import defpackage.dnnr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OptinBroadcastOperation extends IntentOperation {
    static {
        asot.b("UsageReportingOptInRec", asej.USAGE_REPORTING);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long longExtra = intent.getLongExtra("SOURCE_SERIAL_ID", -1L);
        if (longExtra == -1) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("OPT_VALUE", false);
        dhsa e = dhsa.e();
        synchronized (dhsa.c) {
            dhsa.q(dhsa.c(e.f), longExtra, booleanExtra);
            if (dnnr.j()) {
                dhsa.q(dhsa.c(e.g), longExtra, booleanExtra);
            }
        }
        e.r(this);
    }
}
