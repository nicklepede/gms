package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.arjr;
import defpackage.arjs;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CantAddWorkAccountChimeraActivity extends qfn implements arjr {
    @Override // defpackage.arjr
    public final void n(arjs arjsVar, int i) {
        finish();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arjs.y(getString(R.string.auth_cant_add_work_account_message), getString(android.R.string.ok), null, true).show(gI(), "error_dialog");
    }
}
