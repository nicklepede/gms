package com.google.android.gms.nearby.connection.service.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;
import defpackage.cexd;
import defpackage.cfju;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = asqg.f("com.google.android.gms.nearby");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        cexd.a(this, "com.google.android.gms.nearby.connection.service.settings.SettingsCollapsingToolbarActivity", false);
        cfju.a.b().p("Runtime state initialization complete. Nearby connections setting is disabled", new Object[0]);
    }
}
