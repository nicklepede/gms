package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.anya;
import defpackage.asng;
import defpackage.fkaq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        AppContextProvider.a();
        asng.M("com.google.android.gms.adsidentity.settings.AdsIdentitySettingsActivity", 1);
        fkaq.c();
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        AppContextProvider.a();
        asng.K("com.google.android.gms.adsidentity.settings.AdsIdentityIaSettingsActivity", true);
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
    }
}
