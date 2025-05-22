package com.google.android.gms.safebrowsing.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.dahb;
import defpackage.dahn;
import defpackage.dg;
import defpackage.fxxm;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SafeBrowsingSettingsChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        dg dgVar;
        super.onCreate(bundle);
        if (bundle == null) {
            String action = getIntent().getAction();
            if (action == null) {
                dgVar = new dahn();
            } else if (fxxm.n(action, "com.android.settings.action.SB_APPS")) {
                dgVar = new dahb();
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
