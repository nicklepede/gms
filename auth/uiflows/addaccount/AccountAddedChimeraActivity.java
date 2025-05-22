package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.AccountAddedChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import defpackage.afln;
import defpackage.atmr;
import defpackage.atmu;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.eftf;
import defpackage.efwt;
import defpackage.fmtw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountAddedChimeraActivity extends afln implements efwt {
    private final void l() {
        eftf.f(getWindow(), false);
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "AccountAddedActivity";
    }

    @Override // defpackage.efwt
    public final void jM() {
        gT(-1, null);
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        atmu f = atmu.f(this, atmr.i(t().a) ? fmtw.d() ? R.layout.auth_account_added_glif_activity_v2 : R.layout.auth_account_added_glif_activity : R.layout.auth_account_added_activity);
        setContentView(f.a());
        f.c(getTitle());
        if (f.a() instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) f.a();
            setupWizardLayout.t().a(this);
            setupWizardLayout.t().b.setVisibility(4);
            l();
        } else {
            efsl efslVar = (efsl) ((GlifLayout) f.a().findViewById(R.id.setup_wizard_layout)).q(efsl.class);
            efsm efsmVar = new efsm(this);
            efsmVar.b(R.string.sud_next_button_label);
            efsmVar.b = new View.OnClickListener() { // from class: afdx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountAddedChimeraActivity.this.jM();
                }
            };
            efsmVar.c = 5;
            efsmVar.d = R.style.SudGlifButton_Primary;
            efslVar.b(efsmVar.a());
        }
        atmr.e(f.a());
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        l();
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        l();
    }

    @Override // defpackage.efwt
    public final void gH() {
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
    }
}
