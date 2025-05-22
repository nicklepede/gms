package com.google.android.gms.magictether.host;

import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.auio;
import defpackage.bsxr;
import defpackage.cdzp;
import defpackage.cebt;
import defpackage.ceel;
import defpackage.fstc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FirstTimeSetupDialogChimeraActivity extends ceel {
    @Override // defpackage.ceel, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((cdzp) getSupportFragmentManager().h("dialog_fragment")) == null) {
            String str = this.j;
            String str2 = this.k;
            ResultReceiver resultReceiver = (ResultReceiver) getIntent().getExtras().getParcelable("result_receiver");
            cdzp cdzpVar = new cdzp();
            Bundle bundle2 = new Bundle();
            bundle2.putString("dialog_title", str);
            bundle2.putString("dialog_message", str2);
            bundle2.putParcelable("dialog_result_receiver", resultReceiver);
            cdzpVar.setArguments(bundle2);
            cdzpVar.show(getSupportFragmentManager(), "dialog_fragment");
        }
        cebt cebtVar = new cebt();
        if (fstc.e()) {
            bsxr.a(auio.AUTH_MAGICTETHER_PROVISION_DISPLAYED);
            cebtVar.b("magictether_setup_notification_tapped_count");
        }
    }
}
