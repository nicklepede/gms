package com.google.android.gms.nearby.sharing.main;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cpkx;
import defpackage.cpla;
import defpackage.ftdn;
import defpackage.fxxm;
import defpackage.iwv;
import defpackage.rxu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class MainChimeraActivity extends cpla {
    @Override // defpackage.cpla, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ftdn.c()) {
            finish();
        } else {
            iwv.a(getWindow(), false);
            rxu.a(this, cpkx.b);
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        fxxm.f(intent, "intent");
        setIntent(intent);
        super.onNewIntent(intent);
    }
}
