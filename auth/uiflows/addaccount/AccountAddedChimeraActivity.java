package com.google.android.gms.auth.uiflows.addaccount;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.AccountAddedChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import defpackage.adlg;
import defpackage.arkc;
import defpackage.arkf;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edgk;
import defpackage.edjy;
import defpackage.fkdk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountAddedChimeraActivity extends adlg implements edjy {
    private final void l() {
        edgk.f(getWindow(), false);
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "AccountAddedActivity";
    }

    @Override // defpackage.edjy
    public final void jw() {
        gD(-1, null);
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arkf f = arkf.f(this, arkc.i(t().a) ? fkdk.d() ? R.layout.auth_account_added_glif_activity_v2 : R.layout.auth_account_added_glif_activity : R.layout.auth_account_added_activity);
        setContentView(f.a());
        f.c(getTitle());
        if (f.a() instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) f.a();
            setupWizardLayout.t().a(this);
            setupWizardLayout.t().b.setVisibility(4);
            l();
        } else {
            edfq edfqVar = (edfq) ((GlifLayout) f.a().findViewById(R.id.setup_wizard_layout)).q(edfq.class);
            edfr edfrVar = new edfr(this);
            edfrVar.b(R.string.sud_next_button_label);
            edfrVar.b = new View.OnClickListener() { // from class: addv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountAddedChimeraActivity.this.jw();
                }
            };
            edfrVar.c = 5;
            edfrVar.d = R.style.SudGlifButton_Primary;
            edfqVar.b(edfrVar.a());
        }
        arkc.e(f.a());
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        l();
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        l();
    }

    @Override // defpackage.edjy
    public final void gs() {
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
    }
}
