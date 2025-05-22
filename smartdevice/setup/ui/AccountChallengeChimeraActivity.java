package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.atmo;
import defpackage.atmr;
import defpackage.atzb;
import defpackage.auad;
import defpackage.bp;
import defpackage.dg;
import defpackage.dgbe;
import defpackage.dgrl;
import defpackage.dgrm;
import defpackage.dgrp;
import defpackage.dgrq;
import defpackage.dgrr;
import defpackage.dgrs;
import defpackage.dgrt;
import defpackage.dgyt;
import defpackage.fmya;
import defpackage.ip;
import defpackage.ryb;
import defpackage.xjq;
import defpackage.xkh;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AccountChallengeChimeraActivity extends ryb implements dgrs {
    private static final auad i = new dgyt(new String[]{"Setup", "UI", "AccountChallengeChimeraActivity"});
    xkh h;
    private dgrt j;

    @Override // defpackage.dgrs
    public final void o(int i2) {
        i.j("onAccountChallengesCompleted(errorCode=%s)", Integer.valueOf(i2));
        this.h.c("com.google", 2).o(getContainerActivity(), new dgrm(this, new Intent()));
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        boolean z = false;
        i.j("onBackPressed", new Object[0]);
        dgrt dgrtVar = this.j;
        if (dgrtVar.c != null) {
            return;
        }
        String str = dgrtVar.a;
        if (str != null && str.equals(dgrtVar.d.l)) {
            z = true;
        }
        dgrp dgrpVar = new dgrp(dgrtVar);
        Context context = dgrtVar.getContext();
        if (context != null) {
            ip a = dgbe.a(context);
            a.c(true);
            a.l(R.string.smartdevice_d2d_target_skip_primary_account_alert_title);
            a.setPositiveButton(R.string.common_skip, dgrpVar);
            a.setNegativeButton(R.string.common_cancel, dgrpVar);
            a.i(new dgrq(dgrtVar));
            if (z) {
                a.o(R.string.smartdevice_d2d_target_skip_primary_account_alert_message);
            }
            dgrtVar.c = a.create();
            dgrtVar.c.show();
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fmya.c()) {
            atmo.a(this);
        }
        atmr.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        int i2 = xjq.a;
        this.h = new xkh(this, null);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("accounts");
        boolean z = false;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            z = true;
        }
        atzb.b(z);
        if (bundle != null) {
            dg h = gY().h("challengeFragment");
            atzb.s(h);
            this.j = (dgrt) h;
        } else {
            this.j = dgrr.b(parcelableArrayListExtra, null, null, null, -1, true, false, false, null);
            bp bpVar = new bp(gY());
            bpVar.z(R.id.fragment_container, this.j, "challengeFragment");
            bpVar.a();
        }
    }

    @Override // defpackage.dgrs
    public final void p(ArrayList arrayList) {
        i.j("onAccountChallengesCompleted(accounts.size()=%s)", Integer.valueOf(arrayList != null ? arrayList.size() : 0));
        Intent intent = new Intent();
        intent.putExtra("accounts", arrayList);
        this.h.c("com.google", 1).o(getContainerActivity(), new dgrl(this, intent));
    }

    @Override // defpackage.dgrs
    public final void x(String str) {
    }
}
