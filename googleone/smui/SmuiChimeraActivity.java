package com.google.android.gms.googleone.smui;

import android.R;
import android.os.Bundle;
import defpackage.auid;
import defpackage.ausn;
import defpackage.blok;
import defpackage.bloq;
import defpackage.bp;
import defpackage.eluo;
import defpackage.frni;
import defpackage.fxqz;
import defpackage.irj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SmuiChimeraActivity extends blok {
    private static final ausn k = ausn.b("SmuiChimeraActivity", auid.GOOGLEONE);

    @Override // defpackage.blok, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (frni.a.lK().a()) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("account_name_key");
        if (stringExtra == null || stringExtra.length() == 0) {
            ((eluo) k.j()).x("No account set in the intent");
            return;
        }
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bloq bloqVar = new bloq();
            bloqVar.setArguments(irj.a(new fxqz("account_name_key", stringExtra)));
            bpVar.z(R.id.content, bloqVar, "SmuiRootFragment");
            bpVar.d();
        }
    }
}
