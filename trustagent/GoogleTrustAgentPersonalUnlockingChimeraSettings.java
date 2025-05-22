package com.google.android.gms.trustagent;

import android.os.Bundle;
import com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingChimeraActivity;
import defpackage.ausn;
import defpackage.auub;
import defpackage.divv;
import defpackage.diwg;
import defpackage.dixg;
import defpackage.dixi;
import defpackage.dixv;
import defpackage.djat;
import defpackage.ozo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentPersonalUnlockingChimeraSettings extends dixv implements dixg {
    private final dixi l = dixi.a();

    private final void n() {
        if (auub.f()) {
            return;
        }
        dixi dixiVar = this.l;
        ausn ausnVar = TrustAgentOnboardingChimeraActivity.l;
        if (dixiVar.m("trust_agent_onboarding_shown_key")) {
            return;
        }
        TrustAgentOnboardingChimeraActivity.o(this);
    }

    @Override // defpackage.dixv
    protected final ozo a() {
        return getIntent().getBooleanExtra("extra_check_started", false) ? new divv() : new diwg();
    }

    @Override // defpackage.dixv
    protected final String k() {
        return "PersonalUnlockingSettingsFragment";
    }

    @Override // defpackage.dixg
    public final void l() {
        n();
    }

    @Override // defpackage.dixv, defpackage.dixs, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dixi dixiVar = this.l;
        dixiVar.h(this);
        if (Objects.equals(getIntent().getAction(), djat.c) || !dixiVar.k()) {
            return;
        }
        n();
    }

    @Override // defpackage.dixs, defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        this.l.i(this);
    }
}
