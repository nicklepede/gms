package com.google.android.gms.accountsettings.ui;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.cq;
import defpackage.qfp;
import defpackage.sxo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class MyAccountNotAvailableAlertChimeraActivity extends qfp {
    cq j;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.AsAlertDialogThemeLight);
        setFinishOnTouchOutside(false);
        sxo sxoVar = new sxo();
        this.j = sxoVar;
        sxoVar.show(getSupportFragmentManager(), "nosettings");
    }
}
