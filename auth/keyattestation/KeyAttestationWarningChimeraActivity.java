package com.google.android.gms.auth.keyattestation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.auth.keyattestation.KeyAttestationWarningChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.adjj;
import defpackage.adlg;
import defpackage.arkc;
import defpackage.arkd;
import defpackage.arkf;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edjy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class KeyAttestationWarningChimeraActivity extends adlg implements edjy {
    public static final /* synthetic */ int h = 0;

    @Override // defpackage.adkg
    protected final String gG() {
        return "KeyAttestationWarningActivity";
    }

    @Override // defpackage.edjy
    public final void gs() {
        gD(adjj.d.a, adjj.d.b);
    }

    @Override // defpackage.edjy
    public final void jw() {
        gD(adjj.d.a, adjj.d.b);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        gD(adjj.d.a, adjj.d.b);
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (!arkd.a(this)) {
            Log.w("Auth", "[KeyAttestationWarningChimeraActivity] Invalid caller, finishing activity.");
            gD(adjj.d.a, adjj.d.b);
        }
        super.onCreate(bundle);
        arkf f = arkf.f(this, R.layout.auth_key_attestation_warning);
        setContentView(f.a());
        edfq edfqVar = (edfq) ((GlifLayout) f.a().findViewById(R.id.key_attestation_warning_layout)).q(edfq.class);
        edfr edfrVar = new edfr(this);
        edfrVar.b(R.string.sud_next_button_label);
        edfrVar.b = new View.OnClickListener() { // from class: abpa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyAttestationWarningChimeraActivity.this.jw();
            }
        };
        edfrVar.c = 5;
        edfrVar.d = R.style.SudGlifButton_Primary;
        edfqVar.b(edfrVar.a());
        arkc.e(f.a());
    }
}
