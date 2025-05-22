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
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkvc;
import defpackage.bkvq;
import defpackage.bkwf;
import defpackage.bkzw;
import defpackage.bkzz;
import defpackage.blfn;
import defpackage.blmo;
import defpackage.blmq;
import defpackage.blmy;
import defpackage.edxt;
import defpackage.eluo;
import defpackage.frkk;
import defpackage.frkw;
import defpackage.frli;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleHelpWebViewChimeraActivity extends Activity implements bkvc {
    private HelpConfig c;
    private blfn d;
    private static final ausn b = ausn.b("gH_WebViewActivity", auid.GOOGLE_HELP);
    public static final String a = "com.google.android.gms.googlehelp.webview.GoogleHelpWebViewActivity";

    @Override // defpackage.bkvc
    public final bkwf d() {
        throw null;
    }

    @Override // defpackage.bkvc
    public final bkzw e() {
        throw null;
    }

    @Override // defpackage.bkvc
    public final HelpConfig ic() {
        return this.c;
    }

    @Override // defpackage.bkvc
    public final blfn id() {
        return this.d;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!(bkzz.a(frli.e()) && this.c == null) && this.c.P) {
            int i = edxt.a;
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Uri uri;
        String str;
        this.c = HelpConfig.e(this, bundle, getIntent());
        this.d = new blfn(this);
        if (bkzz.a(frli.e()) && this.c != null) {
            if (bkzz.a(frkw.c())) {
                bkvq.d(this.c.Q);
            }
            if (bkzz.a(frkk.a.lK().b())) {
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
                int i = edxt.a;
            }
        }
        Intent intent2 = getIntent();
        blmq blmqVar = new blmq(this);
        if (bundle != null) {
            intent = new Intent();
            String string = bundle.getString("saved_instance_state_key_url");
            if (!TextUtils.isEmpty(string)) {
                intent.setData(Uri.parse(string));
            }
            ((eluo) b.j()).x("URL not whitelisted or Intent not processable.");
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
        if (!blmq.b(uri) || !blmq.c(uri.toString(), true)) {
            if (!TextUtils.isEmpty(str)) {
                blmq.e(this, uri, blmqVar.a);
            }
            ((eluo) b.j()).x("URL not whitelisted or Intent not processable.");
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
        int i2 = blmy.a;
        webView.setWebViewClient(new blmo(this));
        setResult(-1);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        blfn blfnVar = this.d;
        if (blfnVar != null) {
            blfnVar.close();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onRestart() {
        super.onRestart();
        if (!(bkzz.a(frli.e()) && this.c == null) && bkzz.a(frkw.c())) {
            bkvq.d(this.c.Q);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        if (getIntent() != null && getIntent().getData() != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", this.c);
            bundle.putString("saved_instance_state_key_url", getIntent().getData().toString());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.bkvc
    public final Context a() {
        return this;
    }
}
