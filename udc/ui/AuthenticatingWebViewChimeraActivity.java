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
import defpackage.atzb;
import defpackage.aura;
import defpackage.ausn;
import defpackage.djmk;
import defpackage.djml;
import defpackage.djmn;
import defpackage.dyne;
import defpackage.dynj;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.fvle;
import defpackage.ig;
import defpackage.rxx;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AuthenticatingWebViewChimeraActivity extends rxx {
    public static final ausn j = ausn.d();
    public String k;
    public boolean l;
    public ProgressBar m;
    public String n;
    public WebView o;
    private Pattern p;
    private FrameLayout q;

    public static Pattern a() {
        try {
            return Pattern.compile(fvle.a.lK().g());
        } catch (PatternSyntaxException e) {
            ((eluo) ((eluo) ((eluo) j.i()).s(e)).ai((char) 11890)).x("failed to compile whitelist pattern");
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
            djmk djmkVar = new djmk(this, new dynj(elgo.l(this.p)));
            djmkVar.i(dyne.a);
            this.o.setWebViewClient(djmkVar);
            this.o.setWebChromeClient(new djml(this));
            if (TextUtils.isEmpty(this.k)) {
                this.o.loadUrl(this.n);
            } else {
                String str = this.k;
                String str2 = this.n;
                atzb.r(str2, "Url must be set");
                new djmn(this, str, str2, this).execute(new Void[0]);
            }
        }
        this.q.addView(this.o);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.o.canGoBack()) {
            this.o.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.o != null) {
            this.q.removeAllViews();
        }
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!"com.google.android.gms".equals(aura.q(this))) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        atzb.s(intent.getData());
        this.n = intent.getData().toString();
        this.k = intent.getStringExtra("AuthWebviewAccountName");
        this.l = intent.getBooleanExtra("AuthWebviewShowProgressBar", false);
        this.p = a();
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("AuthWebviewTitle");
        boolean booleanExtra = intent.getBooleanExtra("AuthWebviewHomeAsUpEnabled", false);
        boolean z = !TextUtils.isEmpty(charSequenceExtra) || booleanExtra;
        ig hO = hO();
        if (z) {
            hO.o(booleanExtra);
            if (TextUtils.isEmpty(charSequenceExtra)) {
                hO.s(false);
            } else {
                hO.s(true);
                hO.A(charSequenceExtra);
            }
            hO.C();
        } else {
            hO.h();
        }
        k();
        setResult(-1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.o.restoreState(bundle);
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.o.saveState(bundle);
    }
}
