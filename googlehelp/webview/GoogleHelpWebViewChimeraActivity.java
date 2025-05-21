package com.google.android.gms.googlehelp.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.WebView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import defpackage.asej;
import defpackage.asot;
import defpackage.biqn;
import defpackage.birb;
import defpackage.birq;
import defpackage.bivh;
import defpackage.bivk;
import defpackage.bjay;
import defpackage.bjhz;
import defpackage.bjib;
import defpackage.bjij;
import defpackage.eble;
import defpackage.ejhf;
import defpackage.forr;
import defpackage.fosd;
import defpackage.fosp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GoogleHelpWebViewChimeraActivity extends Activity implements biqn {
    private HelpConfig c;
    private bjay d;
    private static final asot b = asot.b("gH_WebViewActivity", asej.GOOGLE_HELP);
    public static final String a = "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity";

    @Override // defpackage.biqn
    public final birq d() {
        throw null;
    }

    @Override // defpackage.biqn
    public final bivh e() {
        throw null;
    }

    @Override // defpackage.biqn
    public final HelpConfig hM() {
        return this.c;
    }

    @Override // defpackage.biqn
    public final bjay hN() {
        return this.d;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!(bivk.a(fosp.e()) && this.c == null) && this.c.P) {
            int i = eble.a;
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Uri uri;
        String str;
        this.c = HelpConfig.e(this, bundle, getIntent());
        this.d = new bjay(this);
        if (bivk.a(fosp.e()) && this.c != null) {
            if (bivk.a(fosd.c())) {
                birb.d(this.c.Q);
            }
            if (bivk.a(forr.a.a().b())) {
                ThemeSettings themeSettings = this.c.z;
                if (themeSettings == null || themeSettings.a != 2) {
                    setTheme(R.style.gh_NoActionBarLightActivityStyleMaterial3);
                } else {
                    setTheme(R.style.gh_NoActionBarDarkActivityStyleMaterial3);
                }
            }
            HelpConfig helpConfig = this.c;
            if (helpConfig.P) {
                ThemeSettings themeSettings2 = helpConfig.z;
                int i = eble.a;
            }
        }
        Intent intent2 = getIntent();
        bjib bjibVar = new bjib(this);
        if (bundle != null) {
            intent = new Intent();
            String string = bundle.getString("saved_instance_state_key_url");
            if (!TextUtils.isEmpty(string)) {
                intent.setData(Uri.parse(string));
            }
            ((ejhf) b.j()).x("URL not whitelisted or Intent not processable.");
            getIntent().setData(null);
            super.onCreate(null);
            setResult(0);
            finish();
            return;
        }
        intent = intent2;
        if (intent != null) {
            uri = intent.getData();
            str = uri == null ? "" : uri.toString();
        } else {
            uri = null;
            str = null;
        }
        if (!bjib.b(uri) || !bjib.c(uri.toString(), true)) {
            if (!TextUtils.isEmpty(str)) {
                bjib.e(this, uri, bjibVar.a);
            }
            ((ejhf) b.j()).x("URL not whitelisted or Intent not processable.");
            getIntent().setData(null);
            super.onCreate(null);
            setResult(0);
            finish();
            return;
        }
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView(webView);
        Uri data = intent2 != null ? intent2.getData() : null;
        if (data != null) {
            webView.loadUrl(data.toString());
        }
        int i2 = bjij.a;
        webView.setWebViewClient(new bjhz(this));
        setResult(-1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        bjay bjayVar = this.d;
        if (bjayVar != null) {
            bjayVar.close();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onRestart() {
        super.onRestart();
        if (!(bivk.a(fosp.e()) && this.c == null) && bivk.a(fosd.c())) {
            birb.d(this.c.Q);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        if (getIntent() != null && getIntent().getData() != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.c);
            bundle.putString("saved_instance_state_key_url", getIntent().getData().toString());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.biqn
    public final Context a() {
        return this;
    }
}
