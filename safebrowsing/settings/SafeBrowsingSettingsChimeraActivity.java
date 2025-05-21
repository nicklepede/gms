package com.google.android.gms.safebrowsing.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.cxxe;
import defpackage.cxxq;
import defpackage.dg;
import defpackage.fvbo;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SafeBrowsingSettingsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        dg dgVar;
        super.onCreate(bundle);
        if (bundle == null) {
            String action = getIntent().getAction();
            if (action == null) {
                dgVar = new cxxq();
            } else if (fvbo.n(action, "com.android.settings.action.SB_APPS")) {
                dgVar = new cxxe();
            } else {
                finish();
                dgVar = null;
            }
            if (dgVar == null) {
                return;
            }
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.content_frame, dgVar);
            bpVar.d();
        }
    }
}
