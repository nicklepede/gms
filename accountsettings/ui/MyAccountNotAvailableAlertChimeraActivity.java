package com.google.android.gms.accountsettings.ui;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.cq;
import defpackage.ryt;
import defpackage.utm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MyAccountNotAvailableAlertChimeraActivity extends ryt {
    cq j;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.AsAlertDialogThemeLight);
        setFinishOnTouchOutside(false);
        utm utmVar = new utm();
        this.j = utmVar;
        utmVar.show(getSupportFragmentManager(), "nosettings");
    }
}
