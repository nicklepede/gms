package com.google.android.gms.magictether.host;

import android.os.Bundle;
import defpackage.ceah;
import defpackage.ceel;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ProvisioningFailedDialogChimeraActivity extends ceel {
    @Override // defpackage.ceel, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((ceah) getSupportFragmentManager().h("dialog_fragment")) == null) {
            String str = this.j;
            String str2 = this.k;
            ceah ceahVar = new ceah();
            Bundle bundle2 = new Bundle();
            bundle2.putString("dialog_content_title", str);
            bundle2.putString("dialog_content_message", str2);
            ceahVar.setArguments(bundle2);
            ceahVar.show(getSupportFragmentManager(), "dialog_fragment");
        }
    }
}
