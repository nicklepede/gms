package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.arjz;
import defpackage.arkc;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.bp;
import defpackage.ddpz;
import defpackage.degi;
import defpackage.degj;
import defpackage.degm;
import defpackage.degn;
import defpackage.dego;
import defpackage.degp;
import defpackage.degq;
import defpackage.denq;
import defpackage.dg;
import defpackage.fkhl;
import defpackage.ip;
import defpackage.qex;
import defpackage.vnp;
import defpackage.vog;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountChallengeChimeraActivity extends qex implements degp {
    private static final arxo i = new denq(new String[]{"Setup", "UI", "AccountChallengeChimeraActivity"});
    vog h;
    private degq j;

    @Override // defpackage.degp
    public final void o(int i2) {
        i.j("onAccountChallengesCompleted(errorCode=%s)", Integer.valueOf(i2));
        this.h.c("com.google", 2).o(getContainerActivity(), new degj(this, new Intent()));
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        boolean z = false;
        i.j("onBackPressed", new Object[0]);
        degq degqVar = this.j;
        if (degqVar.c != null) {
            return;
        }
        String str = degqVar.a;
        if (str != null && str.equals(degqVar.d.l)) {
            z = true;
        }
        degm degmVar = new degm(degqVar);
        Context context = degqVar.getContext();
        if (context != null) {
            ip a = ddpz.a(context);
            a.c(true);
            a.j(R.string.smartdevice_d2d_target_skip_primary_account_alert_title);
            a.setPositiveButton(R.string.common_skip, degmVar);
            a.setNegativeButton(R.string.common_cancel, degmVar);
            a.p(new degn(degqVar));
            if (z) {
                a.m(R.string.smartdevice_d2d_target_skip_primary_account_alert_message);
            }
            degqVar.c = a.create();
            degqVar.c.show();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkhl.c()) {
            arjz.a(this);
        }
        arkc.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        int i2 = vnp.a;
        this.h = new vog(this, null);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("accounts");
        boolean z = false;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            z = true;
        }
        arwm.b(z);
        if (bundle != null) {
            dg h = gI().h("challengeFragment");
            arwm.s(h);
            this.j = (degq) h;
        } else {
            this.j = dego.b(parcelableArrayListExtra, null, null, null, -1, true, false, false, null);
            bp bpVar = new bp(gI());
            bpVar.z(R.id.fragment_container, this.j, "challengeFragment");
            bpVar.a();
        }
    }

    @Override // defpackage.degp
    public final void p(ArrayList arrayList) {
        i.j("onAccountChallengesCompleted(accounts.size()=%s)", Integer.valueOf(arrayList != null ? arrayList.size() : 0));
        Intent intent = new Intent();
        intent.putExtra("accounts", arrayList);
        this.h.c("com.google", 1).o(getContainerActivity(), new degi(this, intent));
    }

    @Override // defpackage.degp
    public final void x(String str) {
    }
}
