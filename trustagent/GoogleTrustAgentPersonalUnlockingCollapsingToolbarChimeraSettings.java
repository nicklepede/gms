package com.google.android.gms.trustagent;

import android.os.Bundle;
import defpackage.dgkq;
import defpackage.dglb;
import defpackage.dgmb;
import defpackage.dgmd;
import defpackage.dgmp;
import defpackage.ngn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentPersonalUnlockingCollapsingToolbarChimeraSettings extends dgmp implements dgmb {
    private final dgmd k = dgmd.a();

    @Override // defpackage.dgmp
    protected final ngn a() {
        return getIntent().getBooleanExtra("extra_check_started", false) ? new dgkq() : new dglb();
    }

    @Override // defpackage.dgmp
    protected final String c() {
        return "PersonalUnlockingSettingsFragment";
    }

    @Override // defpackage.dgmp, defpackage.dgmo, defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k.h(this);
    }

    @Override // defpackage.dgmo, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        this.k.i(this);
    }

    @Override // defpackage.dgmb
    public final void l() {
    }
}
