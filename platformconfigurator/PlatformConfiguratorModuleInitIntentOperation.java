package com.google.android.gms.platformconfigurator;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.auur;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PlatformConfiguratorModuleInitIntentOperation extends apzs {
    private static void e(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, PhenotypeConfigurationUpdateListener.class, auur.c(intent.getAction()));
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        e(this, intent);
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        e(this, intent);
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        e(this, intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent, boolean z) {
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.platformconfigurator".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            e(this, intent);
        } else {
            super.onHandleIntent(intent, z);
        }
    }
}
