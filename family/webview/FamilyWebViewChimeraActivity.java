package com.google.android.gms.family.webview;

import android.accounts.Account;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.family.webview.FamilyWebViewChimeraActivity;
import defpackage.atzb;
import defpackage.bcgw;
import defpackage.bcgz;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.ryt;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FamilyWebViewChimeraActivity extends ryt {
    public String j;
    public WebView k;
    private Account l;
    private bcgz m;
    private View n;

    public final void a() {
        setResult(0);
        finish();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (this.k.canGoBack()) {
            this.k.goBack();
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        NetworkInfo activeNetworkInfo;
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.i("Family", String.format(Locale.US, "[FamilyWebViewChimeraActivity] FamilyWebViewChimeraActivity called with no intent", new Object[0]));
            a();
            return;
        }
        setContentView(R.layout.fm_webview);
        this.k = (WebView) findViewById(R.id.webview);
        this.n = findViewById(R.id.no_connection);
        this.m = bcgz.a();
        String stringExtra = intent.getStringExtra("accountName");
        if (stringExtra == null) {
            a();
            return;
        }
        this.l = new Account(stringExtra, "com.google");
        String stringExtra2 = intent.getStringExtra("webviewUrl");
        this.j = stringExtra2;
        if (stringExtra2 == null) {
            a();
            return;
        }
        this.k.clearCache(true);
        this.k.setWebViewClient(new bcgw(getContainerActivity()));
        WebSettings settings = this.k.getSettings();
        String userAgentString = settings.getUserAgentString();
        ModuleManager moduleManager = ModuleManager.get(this);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("os", "Android").put("osVersion", String.valueOf(Build.VERSION.SDK_INT)).put("app", "com.google.android.gms");
            try {
                i = moduleManager.getCurrentModule().moduleVersion;
            } catch (Exception e) {
                Log.e("Family", String.format(Locale.US, "[UserAgentHelper] Unable to determine module version.", new Object[0]), e);
                i = 0;
            }
            put.put("appVersion", String.valueOf(i));
        } catch (JSONException unused) {
        }
        settings.setUserAgentString(userAgentString + " " + String.format(Locale.US, "FmIdWebView (%s)", jSONObject.toString().replaceAll("\\(|\\)", "_")));
        settings.setJavaScriptEnabled(true);
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting() || this.j == null) {
            this.k.setVisibility(8);
            findViewById(R.id.fm_webview_loading_screen).setVisibility(8);
            this.n.setVisibility(0);
            return;
        }
        this.n.setVisibility(8);
        final Account account = this.l;
        final String str = this.j;
        atzb.s(str);
        final bcgz bcgzVar = this.m;
        dhlw a = dhmr.a(bcgzVar.b, new Callable() { // from class: bcgx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = {str};
                bcgz bcgzVar2 = bcgz.this;
                wkt wktVar = bcgzVar2.a;
                Account account2 = account;
                elim S = elim.S(wktVar.b(account2, strArr));
                synchronized (bcgzVar2) {
                    bcgzVar2.d = S;
                    elim elimVar = bcgzVar2.d;
                    CookieManager cookieManager = bcgzVar2.c;
                    int i2 = elgo.d;
                    elgj elgjVar = new elgj();
                    elsn listIterator = elimVar.listIterator();
                    while (listIterator.hasNext()) {
                        String str2 = (String) listIterator.next();
                        Iterator it = bcgz.c(str2, cookieManager).iterator();
                        while (it.hasNext()) {
                            elgjVar.i(bcgz.b(str2, ((bcgy) it.next()).a));
                        }
                    }
                    bcgzVar2.e = elgjVar.g();
                    bcgzVar2.d(account2);
                }
                return null;
            }
        });
        a.y(new dhln() { // from class: bcgv
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                Log.e("Family", String.format(Locale.US, "[FamilyWebViewChimeraActivity] Failed to set user auth cookies.", new Object[0]));
            }
        });
        a.u(getContainerActivity(), new dhlq() { // from class: bcgt
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                FamilyWebViewChimeraActivity familyWebViewChimeraActivity = FamilyWebViewChimeraActivity.this;
                WebView webView = familyWebViewChimeraActivity.k;
                String str2 = familyWebViewChimeraActivity.j;
                atzb.s(str2);
                webView.loadUrl(str2);
            }
        });
        a.r(getContainerActivity(), new dhln() { // from class: bcgu
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                Log.e("Family", String.format(Locale.US, "[FamilyWebViewChimeraActivity] Webview initialization failed:", new Object[0]), exc);
                FamilyWebViewChimeraActivity.this.a();
            }
        });
    }
}
