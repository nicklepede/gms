package com.google.android.gms.octarine.ui;

import android.R;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.gms.octarine.ui.OctarineChimeraActivity;
import defpackage.asqh;
import defpackage.bqnc;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cslz;
import defpackage.csma;
import defpackage.csmb;
import defpackage.cstq;
import defpackage.csvc;
import defpackage.csvt;
import defpackage.cswz;
import defpackage.cszh;
import defpackage.eble;
import defpackage.eijr;
import defpackage.etke;
import defpackage.fjul;
import defpackage.fqrh;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.ivf;
import defpackage.jpd;
import defpackage.jqu;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OctarineChimeraActivity extends qet implements csmb {
    public cstq j;
    public Bundle k;
    private cslz l;

    @Override // defpackage.csmb
    public final cslz a() {
        return this.l;
    }

    @Override // defpackage.csmb
    public final void b(cslz cslzVar) {
        this.l = cslzVar;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        cswz cswzVar = (cswz) getSupportFragmentManager().g(R.id.content);
        if (cswzVar == null || !cswz.b.contains(Integer.valueOf(i))) {
            super.onActivityResult(i, i2, intent);
        } else {
            cswzVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        setTitle("");
        etke b = etke.b(getIntent().getIntExtra("extra.themeChoice", 0));
        if (b == null) {
            b = etke.THEME_CHOICE_UNSPECIFIED;
        }
        new bqnc(this, com.google.android.gms.R.style.ActionBarAppThemeLight, com.google.android.gms.R.style.ActionBarAppThemeDark, b);
        int i = csvc.a;
        eijr eijrVar = bqqe.a;
        if (!csvc.a(getIntent(), new bqqa())) {
            super.onCreate(bundle);
            setResult(0, new Intent().putExtra("extra.errorCode", 1));
            finish();
            return;
        }
        csvt csvtVar = (csvt) csma.a(csvt.class, this, cszh.a(bundle, "activityScope"));
        this.l = csvtVar;
        csvtVar.b(this);
        super.onCreate(bundle);
        if (fjul.g()) {
            getContainerActivity();
            int i2 = eble.a;
        }
        getWindow().setStatusBarColor(0);
        if (fqrh.e() && asqh.f()) {
            Window window = getWindow();
            ivf.a(window, false);
            window.setNavigationBarColor(0);
            View decorView = window.getDecorView();
            itj itjVar = new itj() { // from class: csvs
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    view.setPadding(0, iwdVar.f(1).c, 0, iwdVar.f(64).e);
                    return iwdVar;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(decorView, itjVar);
        }
        jqu.a(this.j.j()).g(this, new jpd() { // from class: csvr
            @Override // defpackage.jpd
            public final void a(Object obj) {
                bp bpVar = new bp(OctarineChimeraActivity.this.getSupportFragmentManager());
                cswz cswzVar = new cswz();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("arg_account", (Account) obj);
                cswzVar.setArguments(bundle2);
                bpVar.F(R.id.content, cswzVar);
                bpVar.d();
            }
        });
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("activityScope", this.k);
    }
}
