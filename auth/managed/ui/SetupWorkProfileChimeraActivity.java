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
import defpackage.abyf;
import defpackage.abzk;
import defpackage.abzm;
import defpackage.abzz;
import defpackage.arkc;
import defpackage.arkf;
import defpackage.asng;
import defpackage.dtjk;
import defpackage.edeq;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edjs;
import defpackage.edjy;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.flad;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetupWorkProfileChimeraActivity extends abyf implements edjy {
    public static final /* synthetic */ int j = 0;
    public fiwo i;
    private Uri k;
    private arkf l;

    public static void c(Context context, boolean z) {
        asng.H(context, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity", z);
    }

    private final void k() {
        arkf f = arkf.f(this, arkc.i(y()) ? flad.e() ? R.layout.setup_work_profile_activity_glif_v2 : R.layout.setup_work_profile_activity_glif : R.layout.setup_work_profile_activity);
        this.l = f;
        arkc.e(f.a());
        this.l.c(getString(R.string.auth_device_management_setup_work_profile_settings_entry));
        setContentView(this.l.a());
        if (this.l.a() instanceof SetupWizardLayout) {
            ((SetupWizardLayout) this.l.a()).t().a(this);
            this.l.b(false);
        } else {
            GlifLayout glifLayout = (GlifLayout) this.l.a().findViewById(R.id.setup_wizard_layout);
            edfq edfqVar = (edfq) glifLayout.q(edfq.class);
            edfr edfrVar = new edfr(this);
            edfrVar.b = new View.OnClickListener() { // from class: abyj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetupWorkProfileChimeraActivity.this.jw();
                }
            };
            edfrVar.c = 5;
            edfrVar.d = R.style.SudGlifButton_Primary;
            edfqVar.b(edfrVar.a());
            if (flad.d()) {
                abzz.b(glifLayout);
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
            ((edfq) ((GlifLayout) this.l.a()).q(edfq.class)).i.d(string);
        }
    }

    private final void n() {
        l(R.string.common_something_went_wrong);
        m(R.string.common_retry);
    }

    @Override // defpackage.edjy
    public final void gs() {
        onBackPressed();
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
        if (flad.c()) {
            arkc.g(this);
        } else {
            arkc.f(this, str);
        }
        if (flad.e()) {
            int i = edjs.a;
            if (edeq.w(this)) {
                setTheme(edjs.a(this));
            }
        }
    }

    @Override // defpackage.edjy
    public final void jw() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        startActivityForResult(PhoneskyDpcInstallChimeraActivity.k(this, "com.google.android.apps.work.clouddpc", false, extras), 0);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
        abzm.e();
        Uri uri = this.k;
        abzk d = abzm.d(this, "com.google.android.apps.work.clouddpc", null, null, null, null, !(uri != null), uri == null ? null : uri.toString());
        if (d.a.i != Status.b.i || (intent2 = d.b) == null) {
            n();
        } else {
            startActivityForResult(intent2, 1);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // defpackage.abyf, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkzn.e()) {
            ((dtjk) this.i.a()).a();
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (!fkzn.c() || !PhoneskyDpcInstallChimeraActivity.q(this) || devicePolicyManager.getDeviceOwner() != null || devicePolicyManager.getProfileOwner() != null) {
            c(this, false);
            finish();
        } else {
            this.k = getIntent().getData();
            k();
            setResult(0, new Intent().putExtra("intentionally_canceled", true));
        }
    }
}
