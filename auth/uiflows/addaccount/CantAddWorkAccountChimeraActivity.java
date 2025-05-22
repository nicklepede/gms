package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.atmg;
import defpackage.atmh;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CantAddWorkAccountChimeraActivity extends ryr implements atmg {
    @Override // defpackage.atmg
    public final void n(atmh atmhVar, int i) {
        finish();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        atmh.y(getString(R.string.auth_cant_add_work_account_message), getString(android.R.string.ok), null, true).show(gY(), "error_dialog");
    }
}
