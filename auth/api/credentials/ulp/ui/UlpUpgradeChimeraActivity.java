package com.google.android.gms.auth.api.credentials.ulp.ui;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.ulp.ui.UlpUpgradeChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aaus;
import defpackage.aava;
import defpackage.aavb;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonp;
import defpackage.dqoj;
import defpackage.enso;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fxxm;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yez;
import defpackage.ygq;
import defpackage.zsi;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UlpUpgradeChimeraActivity extends rxx {
    public static final /* synthetic */ int m = 0;
    private static final ausn n = zsi.a("UlpUpgradeChimeraActivity");
    public WebView j;
    public View k;
    public String l;
    private boni o;
    private Account p;
    private aavb q;
    private dqoj r;

    public final void a(yez yezVar) {
        yezVar.f(n);
        boni boniVar = this.o;
        Account account = this.p;
        if (account != null) {
            boniVar = bonh.a(this, account.name);
        }
        fgrc v = ensq.a.v();
        aavb aavbVar = this.q;
        String a = aavbVar != null ? aavbVar.d : bonp.a();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ensq ensqVar = (ensq) fgriVar;
        a.getClass();
        ensqVar.b |= 2;
        ensqVar.e = a;
        if (!fgriVar.L()) {
            v.U();
        }
        ensq ensqVar2 = (ensq) v.b;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        fgrc l = yezVar.l();
        if (!l.b.L()) {
            l.U();
        }
        enso ensoVar = (enso) l.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 209;
        ensoVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        ensq ensqVar3 = (ensq) v.b;
        enso ensoVar3 = (enso) l.Q();
        ensoVar3.getClass();
        ensqVar3.s = ensoVar3;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v.Q());
        setResult(yezVar.a(), yezVar.b());
        finish();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        WebView webView = this.j;
        if (webView == null || !webView.canGoBack()) {
            this.q.b();
        } else {
            this.j.goBack();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.o = bonh.a(this, null);
        setTheme(R.style.UlpUpgrade);
        super.onCreate(bundle);
        setContentView(R.layout.credentials_ulp_upgrade);
        this.j = (WebView) findViewById(R.id.web_view);
        this.k = findViewById(R.id.spinner);
        String stringExtra = getIntent().getStringExtra("calling_package");
        if (stringExtra == null) {
            a((yez) yez.c().c(28453, ygq.a("packageName")));
            return;
        }
        this.l = stringExtra;
        Account account = (Account) getIntent().getParcelableExtra("ulp_account");
        if (account == null) {
            a((yez) yez.c().c(28453, ygq.a("ulpAccount")));
            return;
        }
        this.p = account;
        this.q = (aavb) new jxw(this, new aava(getApplication(), this.p)).a(aavb.class);
        this.r = new dqoj(this.q);
        WebView webView = this.j;
        WebSettings settings = webView.getSettings();
        webView.setWebViewClient(new aaus(this));
        settings.setUseWideViewPort(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setNeedInitialFocus(false);
        settings.setSupportZoom(false);
        dqoj dqojVar = this.r;
        fxxm.f(webView, "webView");
        webView.addJavascriptInterface(dqojVar, "KidOnboarding");
        this.q.b.g(this, new jvs() { // from class: aauq
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                UlpUpgradeChimeraActivity ulpUpgradeChimeraActivity = UlpUpgradeChimeraActivity.this;
                if (intValue == 1) {
                    ulpUpgradeChimeraActivity.j.loadUrl(booh.b(Uri.parse(fnil.a.lK().c()).buildUpon().appendQueryParameter("package", ulpUpgradeChimeraActivity.l).appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("theme", "gm").build().toString(), ulpUpgradeChimeraActivity.getResources()));
                } else {
                    if (intValue != 2) {
                        throw new IllegalStateException(a.j(intValue, "Unrecognized fragment type: "));
                    }
                    ulpUpgradeChimeraActivity.j.setVisibility(0);
                    ulpUpgradeChimeraActivity.k.setVisibility(8);
                }
            }
        });
        this.q.c.g(this, new jvs() { // from class: aaur
            @Override // defpackage.jvs
            public final void a(Object obj) {
                UlpUpgradeChimeraActivity.this.a((yez) obj);
            }
        });
        this.q.h.i();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        WebView webView = this.j;
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }
}
