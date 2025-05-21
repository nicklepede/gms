package com.google.android.gms.platformconfigurator;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.asqx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PlatformConfiguratorModuleInitIntentOperation extends anya {
    private static void e(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, PhenotypeConfigurationUpdateListener.class, asqx.c(intent.getAction()));
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        e(this, intent);
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        e(this, intent);
    }

    @Override // defpackage.anya
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
