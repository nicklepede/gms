package com.google.android.gms.credential.manager.credentialexchange;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.awkf;
import defpackage.awno;
import defpackage.bp;
import defpackage.fxqz;
import defpackage.fxxm;
import defpackage.irj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ExportCredentialsChimeraActivity extends awno {
    public ExportCredentialsChimeraActivity() {
        super(R.layout.pwm_activity_export);
    }

    @Override // defpackage.awno, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.B();
            int i = awkf.b;
            Intent intent = getIntent();
            fxxm.e(intent, "getIntent(...)");
            fxxm.f(intent, "requestIntent");
            awkf awkfVar = new awkf();
            awkfVar.setArguments(irj.a(new fxqz("request_intent_key", intent)));
            bpVar.t(R.id.fragment_container_view, awkfVar);
            bpVar.a();
        }
    }
}
