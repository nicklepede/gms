package com.google.android.gms.googleone.smui;

import android.R;
import android.os.Bundle;
import defpackage.asej;
import defpackage.asot;
import defpackage.bjiy;
import defpackage.bjje;
import defpackage.bp;
import defpackage.ejhf;
import defpackage.fouo;
import defpackage.fuvb;
import defpackage.ipt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SmuiChimeraActivity extends bjiy {
    private static final asot k = asot.b("SmuiChimeraActivity", asej.UNKNOWN);

    @Override // defpackage.bjiy, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fouo.a.a().a()) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("account_name_key");
        if (stringExtra == null || stringExtra.length() == 0) {
            ((ejhf) k.j()).x("No account set in the intent");
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bjje bjjeVar = new bjje();
        bjjeVar.setArguments(ipt.a(new fuvb("account_name_key", stringExtra)));
        bpVar.z(R.id.content, bjjeVar, "SmuiRootFragment");
        bpVar.d();
    }
}
