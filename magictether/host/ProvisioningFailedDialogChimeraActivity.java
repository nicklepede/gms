package com.google.android.gms.magictether.host;

import android.os.Bundle;
import defpackage.cbrp;
import defpackage.cbvt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ProvisioningFailedDialogChimeraActivity extends cbvt {
    @Override // defpackage.cbvt, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((cbrp) getSupportFragmentManager().h("dialog_fragment")) == null) {
            String str = this.j;
            String str2 = this.k;
            cbrp cbrpVar = new cbrp();
            Bundle bundle2 = new Bundle();
            bundle2.putString("dialog_content_title", str);
            bundle2.putString("dialog_content_message", str2);
            cbrpVar.setArguments(bundle2);
            cbrpVar.show(getSupportFragmentManager(), "dialog_fragment");
        }
    }
}
