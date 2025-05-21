package com.google.android.gms.constellation.ui;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.arxo;
import defpackage.ataq;
import defpackage.atcp;
import defpackage.atcq;
import defpackage.atcr;
import defpackage.atcs;
import defpackage.atct;
import defpackage.atcu;
import defpackage.atkx;
import defpackage.atlw;
import defpackage.atmc;
import defpackage.atmg;
import defpackage.enwd;
import defpackage.ig;
import defpackage.qet;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConstellationWebSettingsChimeraActivity extends qet implements atcu {
    public static final arxo j = atmg.a("web_settings");
    public WebView k;
    protected ataq l;
    private Context m;
    private atlw n;
    private atmc o;
    private LinearLayout p;

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                j.g("Couldn't url encode parameters", e, new Object[0]);
            }
        }
        return null;
    }

    @Override // defpackage.atcu
    public final void k(String str) {
        if (this.k != null) {
            runOnUiThread(new atcq(this, str));
        }
    }

    @Override // defpackage.atcu
    public final void l() {
        runOnUiThread(new atcr(this));
    }

    @Override // defpackage.atcu
    public final void m() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.k.getWindowToken(), 0);
    }

    @Override // defpackage.atcu
    public final void n() {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.k, 1);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        WebView webView = this.k;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.k.goBack();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.c11n_web_settings);
        j.d("Creating activity", new Object[0]);
        this.m = getApplicationContext();
        this.o = new atmc(UUID.randomUUID().toString());
        this.n = atlw.a(this.m);
        this.k = (WebView) findViewById(R.id.c11n_settings_webview);
        this.p = (LinearLayout) findViewById(R.id.c11n_web_error_view);
        ig hy = hy();
        atkx.a(this);
        if (!atkx.b(this)) {
            if (hy != null) {
                hy.C();
            }
            this.n.o(this.o, enwd.CONSENT_SETTINGS_INIT_FAILURE);
            this.k.setVisibility(8);
            this.p.setVisibility(0);
            this.p.setOnClickListener(new atcp(this));
            return;
        }
        if (hy != null) {
            hy.h();
        }
        this.p.setVisibility(8);
        this.k.setVisibility(0);
        this.n.o(this.o, enwd.CONSENT_SETTINGS_OPENED);
        this.k.getSettings().setJavaScriptEnabled(true);
        this.k.setWebViewClient(new atct(this));
        this.l = new ataq(getApplicationContext(), this, this.o);
        new atcs(this.m, this.k, this.l).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
