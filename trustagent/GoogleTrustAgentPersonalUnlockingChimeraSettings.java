package com.google.android.gms.trustagent;

import android.os.Bundle;
import com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingChimeraActivity;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dgkq;
import defpackage.dglb;
import defpackage.dgmb;
import defpackage.dgmd;
import defpackage.dgmq;
import defpackage.dgpo;
import defpackage.ngn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentPersonalUnlockingChimeraSettings extends dgmq implements dgmb {
    private final dgmd l = dgmd.a();

    private final void n() {
        if (asqh.f()) {
            return;
        }
        dgmd dgmdVar = this.l;
        asot asotVar = TrustAgentOnboardingChimeraActivity.l;
        if (dgmdVar.m("trust_agent_onboarding_shown_key")) {
            return;
        }
        TrustAgentOnboardingChimeraActivity.o(this);
    }

    @Override // defpackage.dgmq
    protected final ngn a() {
        return getIntent().getBooleanExtra("extra_check_started", false) ? new dgkq() : new dglb();
    }

    @Override // defpackage.dgmq
    protected final String k() {
        return "PersonalUnlockingSettingsFragment";
    }

    @Override // defpackage.dgmb
    public final void l() {
        n();
    }

    @Override // defpackage.dgmq, defpackage.dgmn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dgmd dgmdVar = this.l;
        dgmdVar.h(this);
        if (Objects.equals(getIntent().getAction(), dgpo.c) || !dgmdVar.k()) {
            return;
        }
        n();
    }

    @Override // defpackage.dgmn, defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        this.l.i(this);
    }
}
