package com.google.android.gms.udc.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.gms.R;
import defpackage.arwm;
import defpackage.asng;
import defpackage.asot;
import defpackage.dhbe;
import defpackage.dhbf;
import defpackage.dhbh;
import defpackage.dwbd;
import defpackage.dwbi;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.fspp;
import defpackage.ig;
import defpackage.qet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AuthenticatingWebViewChimeraActivity extends qet {
    public static final asot j = asot.d();
    public String k;
    public boolean l;
    public ProgressBar m;
    public String n;
    public WebView o;
    private Pattern p;
    private FrameLayout q;

    public static Pattern a() {
        String g = fspp.a.a().g();
        if (g == null) {
            g = "";
        }
        try {
            return Pattern.compile(g);
        } catch (PatternSyntaxException e) {
            ((ejhf) ((ejhf) ((ejhf) j.i()).s(e)).ah((char) 11887)).x("failed to compile whitelist pattern");
            return null;
        }
    }

    private final void k() {
        setContentView(R.layout.common_auth_webcontent);
        this.q = (FrameLayout) findViewById(R.id.common_auth_web_container);
        this.m = (ProgressBar) findViewById(R.id.common_auth_web_progress_bar);
        if (this.o == null) {
            CookieSyncManager.createInstance(this);
            CookieManager.getInstance().removeAllCookie();
            WebView webView = new WebView(this);
            this.o = webView;
            webView.setFocusable(true);
            this.o.setFocusableInTouchMode(true);
            this.o.clearCache(true);
            WebSettings settings = this.o.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(false);
            settings.setSaveFormData(false);
            settings.setAllowFileAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setCacheMode(1);
            settings.setUseWideViewPort(true);
            dhbe dhbeVar = new dhbe(this, new dwbi(eitj.l(this.p)));
            dhbeVar.i(dwbd.a);
            this.o.setWebViewClient(dhbeVar);
            this.o.setWebChromeClient(new dhbf(this));
            if (TextUtils.isEmpty(this.k)) {
                this.o.loadUrl(this.n);
            } else {
                String str = this.k;
                String str2 = this.n;
                arwm.r(str2, "Url must be set");
                new dhbh(this, str, str2, this).execute(new Void[0]);
            }
        }
        this.q.addView(this.o);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (this.o.canGoBack()) {
            this.o.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.qet, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.o != null) {
            this.q.removeAllViews();
        }
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!"com.google.android.gms".equals(asng.q(this))) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        arwm.s(intent.getData());
        this.n = intent.getData().toString();
        this.k = intent.getStringExtra("AuthWebviewAccountName");
        this.l = intent.getBooleanExtra("AuthWebviewShowProgressBar", false);
        this.p = a();
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("AuthWebviewTitle");
        boolean booleanExtra = intent.getBooleanExtra("AuthWebviewHomeAsUpEnabled", false);
        boolean z = !TextUtils.isEmpty(charSequenceExtra) || booleanExtra;
        ig hy = hy();
        if (z) {
            hy.o(booleanExtra);
            if (TextUtils.isEmpty(charSequenceExtra)) {
                hy.s(false);
            } else {
                hy.s(true);
                hy.A(charSequenceExtra);
            }
            hy.C();
        } else {
            hy.h();
        }
        k();
        setResult(-1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.o.restoreState(bundle);
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.o.saveState(bundle);
    }
}
