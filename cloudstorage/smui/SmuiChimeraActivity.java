package com.google.android.gms.cloudstorage.smui;

import android.R;
import android.os.Bundle;
import defpackage.asjz;
import defpackage.askf;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bp;
import defpackage.eluo;
import defpackage.fpas;
import defpackage.fxqz;
import defpackage.irj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SmuiChimeraActivity extends asjz {
    private static final ausn k = ausn.b("SmuiChimeraActivity", auid.UNKNOWN);

    @Override // defpackage.asjz, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fpas.a.lK().a()) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("account_name_key");
        if (stringExtra == null || stringExtra.length() == 0) {
            ((eluo) k.j()).x("No account set in the intent");
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        askf askfVar = new askf();
        askfVar.setArguments(irj.a(new fxqz("account_name_key", stringExtra)));
        bpVar.z(R.id.content, askfVar, "SmuiRootFragment");
        bpVar.d();
    }
}
