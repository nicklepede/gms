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
import defpackage.asot;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgx;
import defpackage.doea;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fvbo;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wit;
import defpackage.wkg;
import defpackage.xul;
import defpackage.yvc;
import defpackage.yvk;
import defpackage.yvl;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UlpUpgradeChimeraActivity extends qet {
    public static final /* synthetic */ int m = 0;
    private static final asot n = xul.a("UlpUpgradeChimeraActivity");
    public WebView j;
    public View k;
    public String l;
    private bmgq o;
    private Account p;
    private yvl q;
    private doea r;

    public final void a(wit witVar) {
        witVar.f(n);
        bmgq bmgqVar = this.o;
        Account account = this.p;
        if (account != null) {
            bmgqVar = bmgp.a(this, account.name);
        }
        fecj v = elfd.a.v();
        yvl yvlVar = this.q;
        String a = yvlVar != null ? yvlVar.d : bmgx.a();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elfd elfdVar = (elfd) fecpVar;
        a.getClass();
        elfdVar.b |= 2;
        elfdVar.e = a;
        if (!fecpVar.L()) {
            v.U();
        }
        elfd elfdVar2 = (elfd) v.b;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        fecj k = witVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 209;
        elfbVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        elfd elfdVar3 = (elfd) v.b;
        elfb elfbVar3 = (elfb) k.Q();
        elfbVar3.getClass();
        elfdVar3.s = elfbVar3;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v.Q());
        setResult(witVar.a(), witVar.b());
        finish();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        WebView webView = this.j;
        if (webView == null || !webView.canGoBack()) {
            this.q.b();
        } else {
            this.j.goBack();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.o = bmgp.a(this, null);
        setTheme(R.style.UlpUpgrade);
        super.onCreate(bundle);
        setContentView(R.layout.credentials_ulp_upgrade);
        this.j = (WebView) findViewById(R.id.web_view);
        this.k = findViewById(R.id.spinner);
        String stringExtra = getIntent().getStringExtra("calling_package");
        if (stringExtra == null) {
            a((wit) wit.c().c(28453, wkg.a("packageName")));
            return;
        }
        this.l = stringExtra;
        Account account = (Account) getIntent().getParcelableExtra("ulp_account");
        if (account == null) {
            a((wit) wit.c().c(28453, wkg.a("ulpAccount")));
            return;
        }
        this.p = account;
        this.q = (yvl) new jrh(this, new yvk(getApplication(), this.p)).a(yvl.class);
        this.r = new doea(this.q);
        WebView webView = this.j;
        WebSettings settings = webView.getSettings();
        webView.setWebViewClient(new yvc(this));
        settings.setUseWideViewPort(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setNeedInitialFocus(false);
        settings.setSupportZoom(false);
        doea doeaVar = this.r;
        fvbo.f(webView, "webView");
        webView.addJavascriptInterface(doeaVar, "KidOnboarding");
        this.q.b.g(this, new jpd() { // from class: yva
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                UlpUpgradeChimeraActivity ulpUpgradeChimeraActivity = UlpUpgradeChimeraActivity.this;
                if (intValue == 1) {
                    ulpUpgradeChimeraActivity.j.loadUrl(bmhp.b(Uri.parse(fkrm.a.a().c()).buildUpon().appendQueryParameter("package", ulpUpgradeChimeraActivity.l).appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("theme", "gm").build().toString(), ulpUpgradeChimeraActivity.getResources()));
                } else {
                    if (intValue != 2) {
                        throw new IllegalStateException(a.j(intValue, "Unrecognized fragment type: "));
                    }
                    ulpUpgradeChimeraActivity.j.setVisibility(0);
                    ulpUpgradeChimeraActivity.k.setVisibility(8);
                }
            }
        });
        this.q.c.g(this, new jpd() { // from class: yvb
            @Override // defpackage.jpd
            public final void a(Object obj) {
                UlpUpgradeChimeraActivity.this.a((wit) obj);
            }
        });
        this.q.h.i();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        WebView webView = this.j;
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }
}
