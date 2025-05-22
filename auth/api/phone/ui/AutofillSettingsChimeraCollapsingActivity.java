package com.google.android.gms.auth.api.phone.ui;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.abmq;
import defpackage.abms;
import defpackage.bp;
import defpackage.fnki;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AutofillSettingsChimeraCollapsingActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.sms_code_autofill_settings_title_for_settings_under_autofill_subcategory));
        if (fnki.e()) {
            abms abmsVar = new abms();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.content_frame, abmsVar, abmsVar.getClass().getName());
            bpVar.a();
            return;
        }
        abmq abmqVar = new abmq();
        bp bpVar2 = new bp(getSupportFragmentManager());
        bpVar2.z(R.id.content_frame, abmqVar, abmqVar.getClass().getName());
        bpVar2.a();
    }
}
