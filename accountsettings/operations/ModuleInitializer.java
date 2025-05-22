package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;
import defpackage.a;
import defpackage.auad;
import defpackage.aura;
import defpackage.casd;
import defpackage.tmt;
import defpackage.uta;
import defpackage.uvt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends uvt {
    public Context b;
    public casd c;
    private static final auad e = new auad("AccountSettings", "ModuleInitializer");
    static final String[] a = {"com.google.android.gms.accountsettings.mg.ui.main.MainActivity", "com.google.android.gms.accountsettings.ui.SettingsLoaderActivity", "com.google.android.gms.accountsettings.service.PurgeScreenDataService", "com.google.android.gms.accountsettings.ui.ZeroPartyEntryPointActivity", "com.google.android.gms.accountsettings.ui.SurveyActivity"};

    private static void e(Context context, String str, boolean z) {
        try {
            if (aura.a(context, str) != (true != z ? 2 : 1)) {
                aura.K(str, z);
            }
        } catch (IllegalArgumentException unused) {
            e.f(a.a(str, "Component '", "' is not available."), new Object[0]);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        String[] strArr = a;
        int length = strArr.length;
        for (int i2 = 0; i2 < 5; i2++) {
            e(this.b, strArr[i2], true);
        }
        e(this.b, "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity", true);
        e(this.b, "com.google.android.gms.accountsettings.ui.SafetyCenterActivityControlsActivity", false);
        Context context = this.b;
        e(context, "com.google.android.gms.accountsettings.ui.SearchEntryPointActivity", true);
        e(context, "com.google.android.gms.accountsettings.content.SettingsSearchContentProvider", true);
        this.c.f(PurgeScreenDataChimeraService.b());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((uta) tmt.a(uta.class, this.d)).d(this);
    }
}
