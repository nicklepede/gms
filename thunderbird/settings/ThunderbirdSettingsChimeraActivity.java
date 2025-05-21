package com.google.android.gms.thunderbird.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asqh;
import defpackage.bp;
import defpackage.dfwu;
import defpackage.dfwz;
import defpackage.fsnb;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdSettingsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (asqh.g()) {
            getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }
        if (fsnb.a.a().aW()) {
            getOnBackPressedDispatcher().b(this, new dfwu(this));
        }
        if (getSupportFragmentManager().b() == 0) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new dfwz());
            bpVar.w(null);
            bpVar.a();
        }
    }
}
