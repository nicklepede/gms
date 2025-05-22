package com.google.android.gms.nearby.sharing.quicksettings;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.colj;
import defpackage.comx;
import defpackage.csbx;
import defpackage.csdv;
import defpackage.fvp;
import defpackage.fxxm;
import defpackage.iwv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class QuickSettingsChimeraActivity extends csbx {
    public colj f;

    public final colj b() {
        colj coljVar = this.f;
        if (coljVar != null) {
            return coljVar;
        }
        fxxm.j("analyticsLogger");
        return null;
    }

    @Override // defpackage.csbx, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        comx.b(this);
        iwv.a(getWindow(), false);
        colj f = colj.f(this);
        fxxm.f(f, "<set-?>");
        this.f = f;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(1440689894, true, new csdv(this)));
        setContentView(composeView);
    }
}
