package com.google.android.gms.nearby.sharing.quicksettings;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.cmdb;
import defpackage.cmep;
import defpackage.cptc;
import defpackage.cpva;
import defpackage.fuy;
import defpackage.fvbo;
import defpackage.ivf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class QuickSettingsChimeraActivity extends cptc {
    public cmdb f;

    public final cmdb b() {
        cmdb cmdbVar = this.f;
        if (cmdbVar != null) {
            return cmdbVar;
        }
        fvbo.j("analyticsLogger");
        return null;
    }

    @Override // defpackage.cptc, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cmep.b(this);
        ivf.a(getWindow(), false);
        cmdb f = cmdb.f(this);
        fvbo.f(f, "<set-?>");
        this.f = f;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(1440689894, true, new cpva(this)));
        setContentView(composeView);
    }
}
