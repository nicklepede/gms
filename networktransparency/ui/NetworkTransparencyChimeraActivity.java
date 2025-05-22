package com.google.android.gms.networktransparency.ui;

import android.app.Activity;
import android.os.Bundle;
import defpackage.caxo;
import defpackage.cblb;
import defpackage.cbnt;
import defpackage.cudq;
import defpackage.cudt;
import defpackage.fvp;
import defpackage.fxws;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NetworkTransparencyChimeraActivity extends cudt {
    public caxo j;
    public cblb k;
    public cbnt l;

    @Override // defpackage.cbbl
    public final caxo a() {
        caxo caxoVar = this.j;
        if (caxoVar != null) {
            return caxoVar;
        }
        fxxm.j("settingsEnvironmentFactory");
        return null;
    }

    @Override // defpackage.cbbl, defpackage.deaf
    protected final void l(fxws fxwsVar) {
        super.l(new fvp(-1904129322, true, new cudq(this, fxwsVar)));
    }

    @Override // defpackage.cudt, defpackage.deaf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cbnt cbntVar = this.l;
        if (cbntVar == null) {
            fxxm.j("surveyLauncher");
            cbntVar = null;
        }
        Activity containerActivity = getContainerActivity();
        fxxm.e(containerActivity, "getContainerActivity(...)");
        cbntVar.a(containerActivity, null);
    }
}
