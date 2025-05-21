package com.google.android.gms.nearby.connection.service.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.cfju;
import defpackage.cgbz;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SettingsChimeraCollapsingToolbarActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.connections_product_name));
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new cgbz());
            bpVar.a();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        cfju.a.b().p("SettingsCollapsingToolbarActivity has started", new Object[0]);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        cfju.a.b().p("SettingsCollapsingToolbarActivity has stopped", new Object[0]);
    }
}
