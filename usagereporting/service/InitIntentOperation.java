package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InitIntentOperation extends apzs {
    static {
        ausn.b("UsageReporting", auid.USAGE_REPORTING);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        getApplicationContext();
        if ((i & 14) != 0) {
            startService(IntentOperation.getStartIntent(this, InitHandler.class, "com.google.android.gms.usagereporting.init"));
        }
    }
}
