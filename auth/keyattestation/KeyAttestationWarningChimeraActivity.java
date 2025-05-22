package com.google.android.gms.auth.keyattestation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.keyattestation.KeyAttestationWarningChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.afjq;
import defpackage.afln;
import defpackage.atmr;
import defpackage.atms;
import defpackage.atmu;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class KeyAttestationWarningChimeraActivity extends afln implements efwt {
    public static final /* synthetic */ int h = 0;

    @Override // defpackage.efwt
    public final void gH() {
        ActivityResult activityResult = afjq.d;
        gT(activityResult.a, activityResult.b);
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "KeyAttestationWarningActivity";
    }

    @Override // defpackage.efwt
    public final void jM() {
        ActivityResult activityResult = afjq.d;
        gT(activityResult.a, activityResult.b);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        ActivityResult activityResult = afjq.d;
        gT(activityResult.a, activityResult.b);
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (!atms.a(this)) {
            Log.w("Auth", "[KeyAttestationWarningChimeraActivity] Invalid caller, finishing activity.");
            ActivityResult activityResult = afjq.d;
            gT(activityResult.a, activityResult.b);
        }
        super.onCreate(bundle);
        atmu f = atmu.f(this, R.layout.auth_key_attestation_warning);
        setContentView(f.a());
        efsl efslVar = (efsl) ((GlifLayout) f.a().findViewById(R.id.key_attestation_warning_layout)).q(efsl.class);
        efsm efsmVar = new efsm(this);
        efsmVar.b(R.string.sud_next_button_label);
        efsmVar.b = new View.OnClickListener() { // from class: adpa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyAttestationWarningChimeraActivity.this.jM();
            }
        };
        efsmVar.c = 5;
        efsmVar.d = R.style.SudGlifButton_Primary;
        efslVar.b(efsmVar.a());
        atmr.e(f.a());
    }
}
