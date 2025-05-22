package com.google.android.gms.trustagent;

import android.os.Bundle;
import defpackage.divv;
import defpackage.diwg;
import defpackage.dixg;
import defpackage.dixi;
import defpackage.dixu;
import defpackage.ozo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentPersonalUnlockingCollapsingToolbarChimeraSettings extends dixu implements dixg {
    private final dixi k = dixi.a();

    @Override // defpackage.dixu
    protected final ozo a() {
        return getIntent().getBooleanExtra("extra_check_started", false) ? new divv() : new diwg();
    }

    @Override // defpackage.dixu
    protected final String f() {
        return "PersonalUnlockingSettingsFragment";
    }

    @Override // defpackage.dixu, defpackage.dixt, defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k.h(this);
    }

    @Override // defpackage.dixt, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        this.k.i(this);
    }

    @Override // defpackage.dixg
    public final void l() {
    }
}
