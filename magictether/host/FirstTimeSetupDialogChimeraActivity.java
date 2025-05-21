package com.google.android.gms.magictether.host;

import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.aseu;
import defpackage.bqqa;
import defpackage.cbqx;
import defpackage.cbtb;
import defpackage.cbvt;
import defpackage.fpzg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FirstTimeSetupDialogChimeraActivity extends cbvt {
    @Override // defpackage.cbvt, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((cbqx) getSupportFragmentManager().h("dialog_fragment")) == null) {
            String str = this.j;
            String str2 = this.k;
            ResultReceiver resultReceiver = (ResultReceiver) getIntent().getExtras().getParcelable("result_receiver");
            cbqx cbqxVar = new cbqx();
            Bundle bundle2 = new Bundle();
            bundle2.putString("dialog_title", str);
            bundle2.putString("dialog_message", str2);
            bundle2.putParcelable("dialog_result_receiver", resultReceiver);
            cbqxVar.setArguments(bundle2);
            cbqxVar.show(getSupportFragmentManager(), "dialog_fragment");
        }
        cbtb cbtbVar = new cbtb();
        if (fpzg.f()) {
            bqqa.a(aseu.AUTH_MAGICTETHER_PROVISION_DISPLAYED);
            cbtbVar.b("magictether_setup_notification_tapped_count");
        }
    }
}
