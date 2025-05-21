package com.google.android.gms.auth.api.phone.ui;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.fkth;
import defpackage.qgg;
import defpackage.zmq;
import defpackage.zms;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AutofillSettingsChimeraCollapsingActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.sms_code_autofill_settings_title_for_settings_under_autofill_subcategory));
        if (fkth.e()) {
            zms zmsVar = new zms();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.content_frame, zmsVar, zmsVar.getClass().getName());
            bpVar.a();
            return;
        }
        zmq zmqVar = new zmq();
        bp bpVar2 = new bp(getSupportFragmentManager());
        bpVar2.z(R.id.content_frame, zmqVar, zmqVar.getClass().getName());
        bpVar2.a();
    }
}
