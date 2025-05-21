package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;
import defpackage.a;
import defpackage.arxo;
import defpackage.asng;
import defpackage.byjl;
import defpackage.rtk;
import defpackage.sxc;
import defpackage.szv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends szv {
    public Context b;
    public byjl c;
    private static final arxo e = new arxo("AccountSettings", "ModuleInitializer");
    static final String[] a = {"com.google.android.gms.accountsettings.mg.ui.main.MainActivity", "com.google.android.gms.accountsettings.ui.SettingsLoaderActivity", "com.google.android.gms.accountsettings.service.PurgeScreenDataService", "com.google.android.gms.accountsettings.ui.ZeroPartyEntryPointActivity", "com.google.android.gms.accountsettings.ui.SurveyActivity"};

    private static void e(Context context, String str, boolean z) {
        try {
            if (asng.a(context, str) != (true != z ? 2 : 1)) {
                asng.K(str, z);
            }
        } catch (IllegalArgumentException unused) {
            e.f(a.a(str, "Component '", "' is not available."), new Object[0]);
        }
    }

    @Override // defpackage.anya
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
        ((sxc) rtk.a(sxc.class, this.d)).d(this);
    }
}
