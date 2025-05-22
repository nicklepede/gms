package com.google.android.gms.ads.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.h;
import defpackage.auua;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhenotypeFlagChangedIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.admob");
    static final String b = auua.f("com.google.android.gms");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action) || b.equals(action)) {
            if ("com.google.android.gms.admob".equals(stringExtra) || "com.google.android.gms".equals(stringExtra)) {
                p.c(this);
                if (com.google.android.gms.ads.internal.util.c.b()) {
                    h.d("Phenotype flags have changed.");
                }
                if (((Boolean) p.af.g()).booleanValue()) {
                    return;
                }
                d.a(this);
            }
        }
    }
}
