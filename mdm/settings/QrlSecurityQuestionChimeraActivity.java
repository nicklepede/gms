package com.google.android.gms.mdm.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.ccxq;
import defpackage.ccya;
import defpackage.fruc;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class QrlSecurityQuestionChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ccxq.f(this) || !fruc.k()) {
            finish();
        } else if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.content_frame, new ccya());
            bpVar.d();
        }
    }
}
