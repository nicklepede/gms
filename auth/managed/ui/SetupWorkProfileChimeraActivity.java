package com.google.android.gms.auth.managed.ui;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import defpackage.adyf;
import defpackage.adzk;
import defpackage.adzm;
import defpackage.adzz;
import defpackage.atmr;
import defpackage.atmu;
import defpackage.aura;
import defpackage.dvtw;
import defpackage.efrl;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efwn;
import defpackage.efwt;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fnrl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetupWorkProfileChimeraActivity extends adyf implements efwt {
    public static final /* synthetic */ int j = 0;
    public flml i;
    private Uri k;
    private atmu l;

    public static void c(Context context, boolean z) {
        aura.H(context, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity", z);
    }

    private final void k() {
        atmu f = atmu.f(this, atmr.i(y()) ? fnrl.d() ? R.layout.setup_work_profile_activity_glif_v2 : R.layout.setup_work_profile_activity_glif : R.layout.setup_work_profile_activity);
        this.l = f;
        atmr.e(f.a());
        this.l.c(getString(R.string.auth_device_management_setup_work_profile_settings_entry));
        setContentView(this.l.a());
        if (this.l.a() instanceof SetupWizardLayout) {
            ((SetupWizardLayout) this.l.a()).t().a(this);
            this.l.b(false);
        } else {
            GlifLayout glifLayout = (GlifLayout) this.l.a().findViewById(R.id.setup_wizard_layout);
            efsl efslVar = (efsl) glifLayout.q(efsl.class);
            efsm efsmVar = new efsm(this);
            efsmVar.b = new View.OnClickListener() { // from class: adyj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetupWorkProfileChimeraActivity.this.jM();
                }
            };
            efsmVar.c = 5;
            efsmVar.d = R.style.SudGlifButton_Primary;
            efslVar.b(efsmVar.a());
            if (fnrl.c()) {
                adzz.b(glifLayout);
            }
        }
        Uri uri = this.k;
        if (uri != null && uri.getQueryParameterNames().contains("et")) {
            l(R.string.auth_device_management_setup_work_profile_enrollment_link_description);
        }
        m(R.string.common_next);
    }

    private final void l(int i) {
        if (this.l.a() instanceof SetupWizardLayout) {
            ((TextView) ((SetupWizardLayout) this.l.a()).findViewById(R.id.auth_managed_setup_work_profile_description)).setText(i);
        } else {
            ((GlifLayout) this.l.a()).F(i);
        }
    }

    private final void m(int i) {
        String string = getString(i);
        if (this.l.a() instanceof SetupWizardLayout) {
            ((SetupWizardLayout) this.l.a()).t().a.setText(string);
        } else {
            ((efsl) ((GlifLayout) this.l.a()).q(efsl.class)).i.d(string);
        }
    }

    private final void n() {
        l(R.string.common_something_went_wrong);
        m(R.string.common_retry);
    }

    @Override // defpackage.efwt
    public final void gH() {
        onBackPressed();
    }

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
        atmr.g(this);
        if (fnrl.d()) {
            int i = efwn.a;
            if (efrl.w(this)) {
                setTheme(efwn.a(this));
            }
        }
    }

    @Override // defpackage.efwt
    public final void jM() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        startActivityForResult(PhoneskyDpcInstallChimeraActivity.k(this, "com.google.android.apps.work.clouddpc", false, extras), 0);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i == 1 && i2 == -1) {
                finish();
                return;
            }
            return;
        }
        if (i2 != -1) {
            n();
            return;
        }
        adzm.e();
        Uri uri = this.k;
        adzk d = adzm.d(this, "com.google.android.apps.work.clouddpc", null, null, null, null, !(uri != null), uri == null ? null : uri.toString());
        if (d.a.i != Status.b.i || (intent2 = d.b) == null) {
            n();
        } else {
            startActivityForResult(intent2, 1);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // defpackage.adyf, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fnqv.e()) {
            ((dvtw) this.i.a()).a();
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (!fnqv.c() || !PhoneskyDpcInstallChimeraActivity.q(this) || devicePolicyManager.getDeviceOwner() != null || devicePolicyManager.getProfileOwner() != null) {
            c(this, false);
            finish();
        } else {
            this.k = getIntent().getData();
            k();
            setResult(0, new Intent().putExtra("intentionally_canceled", true));
        }
    }
}
