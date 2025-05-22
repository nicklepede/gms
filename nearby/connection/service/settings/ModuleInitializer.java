package com.google.android.gms.nearby.connection.service.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auua;
import defpackage.cheo;
import defpackage.chrg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = auua.f("com.google.android.gms.nearby");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        cheo.a(this, "com.google.android.gms.nearby.connection.service.settings.SettingsCollapsingToolbarActivity", false);
        chrg.a.b().p("Runtime state initialization complete. Nearby connections setting is disabled", new Object[0]);
    }
}
