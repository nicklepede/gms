package com.google.android.gms.cloudstorage.smui;

import android.R;
import android.os.Bundle;
import defpackage.aqhi;
import defpackage.aqho;
import defpackage.asej;
import defpackage.asot;
import defpackage.bp;
import defpackage.ejhf;
import defpackage.fmje;
import defpackage.fuvb;
import defpackage.ipt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SmuiChimeraActivity extends aqhi {
    private static final asot k = asot.b("SmuiChimeraActivity", asej.UNKNOWN);

    @Override // defpackage.aqhi, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fmje.a.a().a()) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("account_name_key");
        if (stringExtra == null || stringExtra.length() == 0) {
            ((ejhf) k.j()).x("No account set in the intent");
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        aqho aqhoVar = new aqho();
        aqhoVar.setArguments(ipt.a(new fuvb("account_name_key", stringExtra)));
        bpVar.z(R.id.content, aqhoVar, "SmuiRootFragment");
        bpVar.d();
    }
}
