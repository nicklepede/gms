package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.R;
import defpackage.ausn;
import defpackage.auub;
import defpackage.booh;
import defpackage.eluo;
import defpackage.fniu;
import defpackage.rxx;
import defpackage.yjf;
import defpackage.yjg;
import defpackage.yjh;
import defpackage.yji;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenInternalConsentChimeraActivity extends rxx implements yjh {
    public static final ausn j = zsi.a("SaveAccountLinkingTokenInternalConsentChimeraActivity");
    private static final String k = "4";
    private WebView l;
    private View m;

    @Override // defpackage.yjh
    public final void a() {
        setResult(0);
        finish();
    }

    @Override // defpackage.yjh
    public final void k(String str) {
        Intent intent = new Intent();
        intent.putExtra("google_consent_result", str);
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.yjh
    public final void l() {
        this.m.setVisibility(8);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        setTheme(R.style.Identity_Theme_NoActionBar);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            ((eluo) j.i()).x("No intent was present, so finishing.");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("save_account_linking_token_google_consent_url");
        if (TextUtils.isEmpty(stringExtra)) {
            ((eluo) j.i()).x("Consent url was not present, so finishing.");
            finish();
            return;
        }
        String uri = Uri.parse(stringExtra).buildUpon().appendQueryParameter("result_channel", k).build().toString();
        if (fniu.a.lK().a()) {
            uri = booh.b(uri, getResources());
        }
        setContentView(R.layout.credential_save_account_linking_token_consent_container);
        this.m = findViewById(R.id.loading_progress);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.l = webView;
        webView.setWebViewClient(new yjg(this));
        this.l.setWebChromeClient(new yjf());
        this.l.setFocusable(true);
        this.l.setFocusableInTouchMode(true);
        this.l.setMapTrackballToArrowKeys(false);
        WebSettings settings = this.l.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        if (auub.a()) {
            settings.setDisabledActionModeMenuItems(7);
        }
        this.l.addJavascriptInterface(new yji(this), "GAL");
        this.l.setScrollbarFadingEnabled(false);
        this.l.loadUrl(uri);
    }
}
