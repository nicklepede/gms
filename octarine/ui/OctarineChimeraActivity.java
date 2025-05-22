package com.google.android.gms.octarine.ui;

import android.R;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import com.google.android.gms.octarine.ui.OctarineChimeraActivity;
import defpackage.auub;
import defpackage.bsur;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cuve;
import defpackage.cuvf;
import defpackage.cuvg;
import defpackage.cvcv;
import defpackage.cveh;
import defpackage.cvex;
import defpackage.cvgc;
import defpackage.cvij;
import defpackage.edxt;
import defpackage.ekww;
import defpackage.evzw;
import defpackage.fmkm;
import defpackage.ftlf;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.iwv;
import defpackage.jvs;
import defpackage.jxj;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OctarineChimeraActivity extends rxx implements cuvg {
    public cvcv j;
    public Bundle k;
    private cuve l;

    private final void k() {
        try {
            CookieManager.getInstance();
        } catch (AndroidRuntimeException unused) {
            setResult(0, new Intent().putExtra("extra.errorCode", 3));
            finish();
        }
    }

    @Override // defpackage.cuvg
    public final cuve a() {
        return this.l;
    }

    @Override // defpackage.cuvg
    public final void b(cuve cuveVar) {
        this.l = cuveVar;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        cvgc cvgcVar = (cvgc) getSupportFragmentManager().g(R.id.content);
        if (cvgcVar == null || !cvgc.b.contains(Integer.valueOf(i))) {
            super.onActivityResult(i, i2, intent);
        } else {
            cvgcVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        setTitle("");
        k();
        evzw b = evzw.b(getIntent().getIntExtra("extra.themeChoice", 0));
        if (b == null) {
            b = evzw.THEME_CHOICE_UNSPECIFIED;
        }
        new bsur(this, com.google.android.gms.R.style.ActionBarAppThemeLight, com.google.android.gms.R.style.ActionBarAppThemeDark, b);
        int i = cveh.a;
        ekww ekwwVar = bsxv.a;
        if (!cveh.a(getIntent(), new bsxr())) {
            super.onCreate(bundle);
            setResult(0, new Intent().putExtra("extra.errorCode", 1));
            finish();
            return;
        }
        cvex cvexVar = (cvex) cuvf.a(cvex.class, this, cvij.a(bundle, "activityScope"));
        this.l = cvexVar;
        cvexVar.b(this);
        super.onCreate(bundle);
        if (fmkm.f()) {
            getContainerActivity();
            int i2 = edxt.a;
        }
        getWindow().setStatusBarColor(0);
        if (ftlf.e() && auub.f()) {
            Window window = getWindow();
            iwv.a(window, false);
            window.setNavigationBarColor(0);
            View decorView = window.getDecorView();
            iuz iuzVar = new iuz() { // from class: cvew
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    view.setPadding(0, ixtVar.f(1).c, 0, ixtVar.f(64).e);
                    return ixtVar;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(decorView, iuzVar);
        }
        jxj.a(this.j.j()).g(this, new jvs() { // from class: cvev
            @Override // defpackage.jvs
            public final void a(Object obj) {
                bp bpVar = new bp(OctarineChimeraActivity.this.getSupportFragmentManager());
                cvgc cvgcVar = new cvgc();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("arg_account", (Account) obj);
                cvgcVar.setArguments(bundle2);
                bpVar.F(R.id.content, cvgcVar);
                bpVar.d();
            }
        });
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("activityScope", this.k);
    }
}
