package com.google.android.gms.constellation.ui;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.auad;
import defpackage.avet;
import defpackage.avgs;
import defpackage.avgt;
import defpackage.avgu;
import defpackage.avgv;
import defpackage.avgw;
import defpackage.avgx;
import defpackage.avpa;
import defpackage.avpz;
import defpackage.avqf;
import defpackage.avqj;
import defpackage.eqjw;
import defpackage.ig;
import defpackage.rxx;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConstellationWebSettingsChimeraActivity extends rxx implements avgx {
    public static final auad j = avqj.a("web_settings");
    public WebView k;
    protected avet l;
    private Context m;
    private avpz n;
    private avqf o;
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

    @Override // defpackage.avgx
    public final void k(String str) {
        if (this.k != null) {
            runOnUiThread(new avgt(this, str));
        }
    }

    @Override // defpackage.avgx
    public final void l() {
        runOnUiThread(new avgu(this));
    }

    @Override // defpackage.avgx
    public final void m() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.k.getWindowToken(), 0);
    }

    @Override // defpackage.avgx
    public final void n() {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.k, 1);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        WebView webView = this.k;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.k.goBack();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.c11n_web_settings);
        j.d("Creating activity", new Object[0]);
        this.m = getApplicationContext();
        this.o = new avqf(UUID.randomUUID().toString());
        this.n = avpz.a(this.m);
        this.k = (WebView) findViewById(R.id.c11n_settings_webview);
        this.p = (LinearLayout) findViewById(R.id.c11n_web_error_view);
        ig hO = hO();
        avpa.a(this);
        if (!avpa.b(this)) {
            if (hO != null) {
                hO.C();
            }
            this.n.o(this.o, eqjw.CONSENT_SETTINGS_INIT_FAILURE);
            this.k.setVisibility(8);
            this.p.setVisibility(0);
            this.p.setOnClickListener(new avgs(this));
            return;
        }
        if (hO != null) {
            hO.h();
        }
        this.p.setVisibility(8);
        this.k.setVisibility(0);
        this.n.o(this.o, eqjw.CONSENT_SETTINGS_OPENED);
        this.k.getSettings().setJavaScriptEnabled(true);
        this.k.setWebViewClient(new avgw(this));
        this.l = new avet(getApplicationContext(), this, this.o);
        new avgv(this.m, this.k, this.l).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
