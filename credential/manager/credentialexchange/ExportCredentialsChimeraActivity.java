package com.google.android.gms.credential.manager.credentialexchange;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.augf;
import defpackage.aujo;
import defpackage.bp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ExportCredentialsChimeraActivity extends aujo {
    public ExportCredentialsChimeraActivity() {
        super(R.layout.pwm_activity_export);
    }

    @Override // defpackage.aujo, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.B();
            augf augfVar = new augf();
            augfVar.setArguments(getIntent().getExtras());
            bpVar.t(R.id.fragment_container_view, augfVar);
            bpVar.a();
        }
    }
}
