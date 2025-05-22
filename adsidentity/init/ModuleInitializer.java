package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.apzs;
import defpackage.aura;
import defpackage.fmqw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ModuleInitializer extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        AppContextProvider.a();
        aura.M("com.google.android.gms.adsidentity.settings.AdsIdentitySettingsActivity", 1);
        fmqw.c();
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        AppContextProvider.a();
        aura.K("com.google.android.gms.adsidentity.settings.AdsIdentityIaSettingsActivity", true);
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
    }
}
