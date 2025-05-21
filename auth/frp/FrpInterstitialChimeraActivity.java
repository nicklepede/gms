package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.R;
import defpackage.abnz;
import defpackage.abpf;
import defpackage.edkv;
import defpackage.ejhf;
import defpackage.ngz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FrpInterstitialChimeraActivity extends abpf implements ngz {
    public static final /* synthetic */ int i = 0;
    public String h;
    private AsyncTask r;
    private edkv s;
    private View t;

    private final void l() {
        edkv edkvVar = this.s;
        View a = edkvVar.a(R.string.auth_gls_name_checking_info_title, R.layout.auth_setup_wizard_interstitial);
        TypedValue typedValue = new TypedValue();
        if (edkvVar.getContext().getTheme().resolveAttribute(R.attr.auth_setup_wizard_progress_bar_color, typedValue, true) && typedValue.type >= 28 && typedValue.type <= 31) {
            ((ProgressBar) a.findViewById(R.id.progress_bar)).setIndeterminateTintList(ColorStateList.valueOf(typedValue.data));
        }
        if (a.getId() != R.id.title_area) {
            edkvVar.getContext().getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                ((ejhf) edkv.a.h()).x("WindowBackground is not a color but could be a drawable.");
            } else {
                a.setBackgroundColor(typedValue.data);
            }
        }
        this.t = a;
    }

    private final synchronized void m() {
        AsyncTask asyncTask = this.r;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.r = null;
        }
    }

    private final void n(Bundle bundle) {
        this.h = bundle.getString("account_id");
    }

    @Override // defpackage.ngz
    public final void a() {
        m();
        Intent intent = new Intent();
        intent.putExtra("errorCode", 4);
        setResult(0, intent);
        finish();
    }

    @Override // defpackage.ngz
    public final void c(SetupWizardNavBar setupWizardNavBar) {
        boolean z = this.m;
        setupWizardNavBar.a(z, z);
        setupWizardNavBar.a.setVisibility(4);
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        edkv edkvVar = this.s;
        if (edkvVar != null) {
            edkvVar.removeView(this.t);
            l();
        }
    }

    @Override // defpackage.abpf, defpackage.abpc, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            n(getIntent().getExtras());
        } else {
            n(bundle);
        }
        FrameLayout frameLayout = ((abpf) this).n;
        if ((frameLayout != null ? frameLayout.getChildAt(0) : null) == null) {
            edkv edkvVar = new edkv(this);
            this.s = edkvVar;
            setContentView(edkvVar);
            this.r = new abnz(this).execute(new Void[0]);
        }
        l();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        m();
        super.onDestroy();
    }

    @Override // defpackage.abpf, defpackage.abpc, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_id", this.h);
    }

    @Override // defpackage.ngz
    public final void b() {
    }
}
