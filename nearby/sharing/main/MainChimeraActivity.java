package com.google.android.gms.nearby.sharing.main;

import android.content.Intent;
import android.os.Bundle;
import defpackage.cncp;
import defpackage.cncs;
import defpackage.fqjv;
import defpackage.fvbo;
import defpackage.ivf;
import defpackage.qeq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class MainChimeraActivity extends cncs {
    @Override // defpackage.cncs, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fqjv.c()) {
            finish();
        } else {
            ivf.a(getWindow(), false);
            qeq.a(this, cncp.b);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        fvbo.f(intent, "intent");
        setIntent(intent);
        super.onNewIntent(intent);
    }
}
