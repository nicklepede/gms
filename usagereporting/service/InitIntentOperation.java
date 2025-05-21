package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InitIntentOperation extends anya {
    static {
        asot.b("UsageReporting", asej.USAGE_REPORTING);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        getApplicationContext();
        if ((i & 14) != 0) {
            startService(IntentOperation.getStartIntent(this, InitHandler.class, "com.google.android.gms.usagereporting.init"));
        }
    }
}
