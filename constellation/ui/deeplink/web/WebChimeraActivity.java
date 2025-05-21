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
import defpackage.arxo;
import defpackage.asvo;
import defpackage.atio;
import defpackage.atje;
import defpackage.atju;
import defpackage.atjy;
import defpackage.atjz;
import defpackage.atka;
import defpackage.atkb;
import defpackage.atkg;
import defpackage.atlw;
import defpackage.atmg;
import defpackage.bqpn;
import defpackage.byhr;
import defpackage.dwbf;
import defpackage.dwbj;
import defpackage.fedh;
import defpackage.fmkv;
import defpackage.fuuw;
import defpackage.fuwt;
import defpackage.fuyx;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fver;
import defpackage.fvid;
import defpackage.jqx;
import defpackage.qet;
import defpackage.ujv;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class WebChimeraActivity extends qet {
    public static final arxo j = atmg.a("c11n_web_chimera_activity");
    public WebView k;
    public final byhr l = new byhr(Looper.getMainLooper());

    private static final atkg a(fuuw fuuwVar) {
        return (atkg) fuuwVar.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arxo arxoVar = j;
        arxoVar.d("onCreate WebChimeraActivity", new Object[0]);
        setTheme(R.style.Theme_GoogleMaterial_DayNight_NoActionBar);
        atjy atjyVar = new atjy(this);
        int i = fvcc.a;
        jqx jqxVar = new jqx(new fvbi(atkg.class), new atjz(this), atjyVar, new atka(this));
        atkg a = a(jqxVar);
        fvbo.f(a, "viewModel");
        WebView webView = new WebView(this);
        this.k = webView;
        setContentView(webView);
        WebView webView2 = this.k;
        if (webView2 == null) {
            fvbo.j("webView");
            webView2 = null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        fedh fedhVar = fmkv.b().b;
        fvbo.e(fedhVar, "getElementList(...)");
        ArrayList arrayList = new ArrayList(fuwt.o(fedhVar, 10));
        Iterator<E> it = fedhVar.iterator();
        while (it.hasNext()) {
            arrayList.add(atio.b(it, "https://", "/*"));
        }
        dwbf b = dwbf.b(fuwt.af(arrayList));
        WebView webView3 = this.k;
        if (webView3 == null) {
            fvbo.j("webView");
            webView3 = null;
        }
        webView3.setWebViewClient(new atje(b, a));
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        dwbj.a(data);
        if (data == null || !b.c(data)) {
            arxoVar.d("Unable to handle landing url generated from the deep link handler", new Object[0]);
            finish();
        } else {
            fmkv fmkvVar = fmkv.a;
            if (fmkvVar.a().f()) {
                arxoVar.d("user is part of the web mo test group", new Object[0]);
                WebView webView4 = this.k;
                if (webView4 == null) {
                    fvbo.j("webView");
                    webView4 = null;
                }
                String c = fmkvVar.a().c();
                fvbo.c(c);
                byte[] bytes = c.getBytes(fver.a);
                fvbo.e(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 1);
                fvbo.e(encodeToString, "encodeToString(...)");
                webView4.loadData(encodeToString, "text/html", "base64");
            } else {
                WebView webView5 = this.k;
                if (webView5 == null) {
                    fvbo.j("webView");
                    webView5 = null;
                }
                webView5.loadUrl(String.valueOf(getIntent().getData()));
            }
            WebView webView6 = this.k;
            if (webView6 == null) {
                fvbo.j("webView");
                webView6 = null;
            }
            atlw a2 = atlw.a(this);
            Intent intent2 = getIntent();
            fvbo.f(webView6, "webView");
            atkg.a.d("addJavascriptInterface", new Object[0]);
            asvo asvoVar = new asvo(webView6.getContext());
            ujv ujvVar = new ujv(webView6.getContext());
            fuyx fuyxVar = bqpn.a;
            webView6.addJavascriptInterface(new atju(a, asvoVar, ujvVar, fvid.b(bqpn.d)), "PhoneIdentityJsBridge");
            a.e = a2;
            a.f = intent2 != null ? intent2.getData() : null;
        }
        a(jqxVar).c.g(this, new atkb(new fvaq() { // from class: atjw
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                final String str = (String) obj;
                fvbo.f(str, "jscallbackResponse");
                WebChimeraActivity webChimeraActivity = WebChimeraActivity.this;
                final WebView webView7 = webChimeraActivity.k;
                if (webView7 == null) {
                    fvbo.j("webView");
                    webView7 = null;
                }
                webChimeraActivity.l.post(new Runnable() { // from class: atjv
                    @Override // java.lang.Runnable
                    public final void run() {
                        arxo arxoVar2 = WebChimeraActivity.j;
                        String str2 = str;
                        arxoVar2.d("runJavascript: %s", str2);
                        webView7.loadUrl("javascript:+".concat(String.valueOf(str2)));
                    }
                });
                return fuvs.a;
            }
        }));
        a(jqxVar).d.g(this, new atkb(new fvaq() { // from class: atjx
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                WebChimeraActivity.this.finish();
                return fuvs.a;
            }
        }));
    }

    @Override // defpackage.qet, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        fvbo.f(keyEvent, "event");
        if (i == 4) {
            WebView webView = this.k;
            WebView webView2 = null;
            if (webView == null) {
                fvbo.j("webView");
                webView = null;
            }
            if (webView.canGoBack()) {
                WebView webView3 = this.k;
                if (webView3 == null) {
                    fvbo.j("webView");
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
