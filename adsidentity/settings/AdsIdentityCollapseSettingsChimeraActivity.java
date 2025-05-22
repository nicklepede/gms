package com.google.android.gms.adsidentity.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.edxt;
import defpackage.fmqy;
import defpackage.rzk;
import defpackage.vda;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdsIdentityCollapseSettingsChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fmqy.a.lK().r()) {
            setTheme(R.style.ThemeOverlay_GoogleMaterial3_DynamicColors_DayNight);
            getContainerActivity();
            int i = edxt.a;
        }
        vda vdaVar = new vda();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, vdaVar);
        bpVar.a();
    }
}
