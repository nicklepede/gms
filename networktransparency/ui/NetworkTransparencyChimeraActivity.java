package com.google.android.gms.networktransparency.ui;

import android.app.Activity;
import android.os.Bundle;
import defpackage.byow;
import defpackage.bzck;
import defpackage.bzfc;
import defpackage.crul;
import defpackage.cruo;
import defpackage.fuy;
import defpackage.fvau;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NetworkTransparencyChimeraActivity extends cruo {
    public byow j;
    public bzck k;
    public bzfc l;

    @Override // defpackage.byst
    public final byow a() {
        byow byowVar = this.j;
        if (byowVar != null) {
            return byowVar;
        }
        fvbo.j("settingsEnvironmentFactory");
        return null;
    }

    @Override // defpackage.byst, defpackage.dbpz
    protected final void l(fvau fvauVar) {
        super.l(new fuy(-1904129322, true, new crul(this, fvauVar)));
    }

    @Override // defpackage.cruo, defpackage.dbpz, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bzfc bzfcVar = this.l;
        if (bzfcVar == null) {
            fvbo.j("surveyLauncher");
            bzfcVar = null;
        }
        Activity containerActivity = getContainerActivity();
        fvbo.e(containerActivity, "getContainerActivity(...)");
        bzfcVar.a(containerActivity, null);
    }
}
