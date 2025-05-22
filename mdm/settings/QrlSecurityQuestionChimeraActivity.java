package com.google.android.gms.mdm.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.cfgo;
import defpackage.cfgz;
import defpackage.fuow;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class QrlSecurityQuestionChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfgo.f(this) || !fuow.j()) {
            finish();
        } else if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.content_frame, new cfgz());
            bpVar.d();
        }
    }
}
