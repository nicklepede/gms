package com.google.android.gms.adsidentity.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.eble;
import defpackage.fkas;
import defpackage.qgg;
import defpackage.tha;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdsIdentityCollapseSettingsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkas.a.a().r()) {
            setTheme(R.style.ThemeOverlay_GoogleMaterial3_DynamicColors_DayNight);
            getContainerActivity();
            int i = eble.a;
        }
        tha thaVar = new tha();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, thaVar);
        bpVar.a();
    }
}
