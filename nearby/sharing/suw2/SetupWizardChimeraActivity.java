package com.google.android.gms.nearby.sharing.suw2;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.crlc;
import defpackage.edeq;
import defpackage.edjc;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SetupWizardChimeraActivity extends crlc {
    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        fvbo.f(theme, "theme");
        int i2 = edjs.a;
        boolean v = edeq.v(this);
        int i3 = R.style.SharingHeavyThemeOverlay;
        if (v && edeq.z(this)) {
            i3 = R.style.SharingBcStyleThemeOverlay;
        }
        theme.applyStyle(i3, true);
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.crlc, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        edjc.e(getContainerActivity(), 6);
        super.onCreate(bundle);
        int i = edjs.a;
        if (edeq.s(this)) {
            setTheme(edjs.b(this));
        } else {
            String stringExtra = getIntent().getStringExtra("theme");
            boolean v = edeq.v(this);
            edjt d = edjt.d();
            int i2 = d.a;
            String str = d.b;
            boolean z = d.c;
            setTheme(new edjt(v ? R.style.SudThemeGlifV4_DayNight : R.style.SudThemeGlifV4_Light, true).c(stringExtra, !v));
            if (edeq.w(this)) {
                setTheme(edjs.a(this));
            }
        }
        setContentView(R.layout.sharing_suw2_activity);
    }
}
