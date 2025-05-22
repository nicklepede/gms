package com.google.android.gms.thunderbird.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.auub;
import defpackage.bp;
import defpackage.dihz;
import defpackage.diie;
import defpackage.fvik;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdSettingsChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (auub.g()) {
            getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }
        if (fvik.a.lK().aW()) {
            getOnBackPressedDispatcher().b(this, new dihz(this));
        }
        if (getSupportFragmentManager().b() == 0) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new diie());
            bpVar.w(null);
            bpVar.a();
        }
    }
}
