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
import defpackage.adnz;
import defpackage.adpf;
import defpackage.efxr;
import defpackage.eluo;
import defpackage.pac;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FrpInterstitialChimeraActivity extends adpf implements pac {
    public static final /* synthetic */ int i = 0;
    public String h;
    private AsyncTask r;
    private efxr s;
    private View t;

    private final void l() {
        efxr efxrVar = this.s;
        View a = efxrVar.a(R.string.auth_gls_name_checking_info_title, R.layout.auth_setup_wizard_interstitial);
        TypedValue typedValue = new TypedValue();
        if (efxrVar.getContext().getTheme().resolveAttribute(R.attr.auth_setup_wizard_progress_bar_color, typedValue, true) && typedValue.type >= 28 && typedValue.type <= 31) {
            ((ProgressBar) a.findViewById(R.id.progress_bar)).setIndeterminateTintList(ColorStateList.valueOf(typedValue.data));
        }
        if (a.getId() != R.id.title_area) {
            efxrVar.getContext().getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                ((eluo) efxr.a.h()).x("WindowBackground is not a color but could be a drawable.");
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

    @Override // defpackage.pac
    public final void a() {
        m();
        Intent intent = new Intent();
        intent.putExtra("errorCode", 4);
        setResult(0, intent);
        finish();
    }

    @Override // defpackage.pac
    public final void c(SetupWizardNavBar setupWizardNavBar) {
        boolean z = this.m;
        setupWizardNavBar.a(z, z);
        setupWizardNavBar.a.setVisibility(4);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        efxr efxrVar = this.s;
        if (efxrVar != null) {
            efxrVar.removeView(this.t);
            l();
        }
    }

    @Override // defpackage.adpf, defpackage.adpc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            n(getIntent().getExtras());
        } else {
            n(bundle);
        }
        FrameLayout frameLayout = ((adpf) this).n;
        if ((frameLayout != null ? frameLayout.getChildAt(0) : null) == null) {
            efxr efxrVar = new efxr(this);
            this.s = efxrVar;
            setContentView(efxrVar);
            this.r = new adnz(this).execute(new Void[0]);
        }
        l();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        m();
        super.onDestroy();
    }

    @Override // defpackage.adpf, defpackage.adpc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_id", this.h);
    }

    @Override // defpackage.pac
    public final void b() {
    }
}
