package com.google.android.gms.nearby.sharing.suw2;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.ctuh;
import defpackage.efrl;
import defpackage.efvx;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SetupWizardChimeraActivity extends ctuh {
    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        fxxm.f(theme, "theme");
        int i2 = efwn.a;
        boolean v = efrl.v(this);
        int i3 = R.style.SharingHeavyThemeOverlay;
        if (v && efrl.z(this)) {
            i3 = R.style.SharingBcStyleThemeOverlay;
        }
        theme.applyStyle(i3, true);
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.ctuh, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        efvx.e(getContainerActivity(), 6);
        super.onCreate(bundle);
        int i = efwn.a;
        if (efrl.s(this)) {
            setTheme(efwn.b(this));
        } else {
            String stringExtra = getIntent().getStringExtra("theme");
            boolean v = efrl.v(this);
            efwo d = efwo.d();
            int i2 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new efwo(v ? R.style.SudThemeGlifV4_DayNight : R.style.SudThemeGlifV4_Light, true).c(stringExtra, !v));
            if (efrl.w(this)) {
                setTheme(efwn.a(this));
            }
        }
        setContentView(R.layout.sharing_suw2_activity);
    }
}
