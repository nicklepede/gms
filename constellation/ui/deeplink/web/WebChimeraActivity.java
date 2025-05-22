package com.google.android.gms.constellation.ui.deeplink.web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.google.android.gms.R;
import com.google.android.gms.constellation.ui.deeplink.web.WebChimeraActivity;
import defpackage.auad;
import defpackage.auzk;
import defpackage.avmr;
import defpackage.avnh;
import defpackage.avnx;
import defpackage.avob;
import defpackage.avoc;
import defpackage.avod;
import defpackage.avoe;
import defpackage.avoj;
import defpackage.avpz;
import defpackage.avqj;
import defpackage.bsxe;
import defpackage.caqj;
import defpackage.dyng;
import defpackage.dynk;
import defpackage.fgsa;
import defpackage.fpcm;
import defpackage.fxqu;
import defpackage.fxsr;
import defpackage.fxuv;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fyap;
import defpackage.fyeb;
import defpackage.jxm;
import defpackage.rxx;
import defpackage.wfu;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class WebChimeraActivity extends rxx {
    public static final auad j = avqj.a("c11n_web_chimera_activity");
    public WebView k;
    public final caqj l = new caqj(Looper.getMainLooper());

    private static final avoj a(fxqu fxquVar) {
        return (avoj) fxquVar.a();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auad auadVar = j;
        auadVar.d("onCreate WebChimeraActivity", new Object[0]);
        setTheme(R.style.Theme_GoogleMaterial_DayNight_NoActionBar);
        avob avobVar = new avob(this);
        int i = fxya.a;
        jxm jxmVar = new jxm(new fxxg(avoj.class), new avoc(this), avobVar, new avod(this));
        avoj a = a(jxmVar);
        fxxm.f(a, "viewModel");
        WebView webView = new WebView(this);
        this.k = webView;
        setContentView(webView);
        WebView webView2 = this.k;
        if (webView2 == null) {
            fxxm.j("webView");
            webView2 = null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        fgsa fgsaVar = fpcm.b().b;
        fxxm.e(fgsaVar, "getElementList(...)");
        ArrayList arrayList = new ArrayList(fxsr.o(fgsaVar, 10));
        Iterator<E> it = fgsaVar.iterator();
        while (it.hasNext()) {
            arrayList.add(avmr.b(it, "https://", "/*"));
        }
        dyng b = dyng.b(fxsr.af(arrayList));
        WebView webView3 = this.k;
        if (webView3 == null) {
            fxxm.j("webView");
            webView3 = null;
        }
        webView3.setWebViewClient(new avnh(b, a));
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        dynk.a(data);
        if (data == null || !b.c(data)) {
            auadVar.d("Unable to handle landing url generated from the deep link handler", new Object[0]);
            finish();
        } else {
            fpcm fpcmVar = fpcm.a;
            if (fpcmVar.lK().f()) {
                auadVar.d("user is part of the web mo test group", new Object[0]);
                WebView webView4 = this.k;
                if (webView4 == null) {
                    fxxm.j("webView");
                    webView4 = null;
                }
                byte[] bytes = fpcmVar.lK().c().getBytes(fyap.a);
                fxxm.e(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 1);
                fxxm.e(encodeToString, "encodeToString(...)");
                webView4.loadData(encodeToString, "text/html", "base64");
            } else {
                WebView webView5 = this.k;
                if (webView5 == null) {
                    fxxm.j("webView");
                    webView5 = null;
                }
                webView5.loadUrl(String.valueOf(getIntent().getData()));
            }
            WebView webView6 = this.k;
            if (webView6 == null) {
                fxxm.j("webView");
                webView6 = null;
            }
            avpz a2 = avpz.a(this);
            Intent intent2 = getIntent();
            fxxm.f(webView6, "webView");
            avoj.a.d("addJavascriptInterface", new Object[0]);
            auzk auzkVar = new auzk(webView6.getContext());
            wfu wfuVar = new wfu(webView6.getContext());
            fxuv fxuvVar = bsxe.a;
            webView6.addJavascriptInterface(new avnx(a, auzkVar, wfuVar, fyeb.b(bsxe.d)), "PhoneIdentityJsBridge");
            a.e = a2;
            a.f = intent2 != null ? intent2.getData() : null;
        }
        a(jxmVar).c.g(this, new avoe(new fxwo() { // from class: avnz
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                final String str = (String) obj;
                fxxm.f(str, "jscallbackResponse");
                WebChimeraActivity webChimeraActivity = WebChimeraActivity.this;
                final WebView webView7 = webChimeraActivity.k;
                if (webView7 == null) {
                    fxxm.j("webView");
                    webView7 = null;
                }
                webChimeraActivity.l.post(new Runnable() { // from class: avny
                    @Override // java.lang.Runnable
                    public final void run() {
                        auad auadVar2 = WebChimeraActivity.j;
                        String str2 = str;
                        auadVar2.d("runJavascript: %s", str2);
                        webView7.loadUrl("javascript:+".concat(String.valueOf(str2)));
                    }
                });
                return fxrq.a;
            }
        }));
        a(jxmVar).d.g(this, new avoe(new fxwo() { // from class: avoa
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                WebChimeraActivity.this.finish();
                return fxrq.a;
            }
        }));
    }

    @Override // defpackage.rxx, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        fxxm.f(keyEvent, "event");
        if (i == 4) {
            WebView webView = this.k;
            WebView webView2 = null;
            if (webView == null) {
                fxxm.j("webView");
                webView = null;
            }
            if (webView.canGoBack()) {
                WebView webView3 = this.k;
                if (webView3 == null) {
                    fxxm.j("webView");
                } else {
                    webView2 = webView3;
                }
                webView2.goBack();
                return true;
            }
            i = 4;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
