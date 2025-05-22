package com.google.android.gms.auth.login;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.acnv;
import defpackage.adau;
import defpackage.adpf;
import defpackage.adpg;
import defpackage.adph;
import defpackage.adpx;
import defpackage.xbw;
import j$.util.DesugarCollections;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BrowserChimeraActivity extends adpf implements View.OnFocusChangeListener {
    public static final /* synthetic */ int B = 0;
    private boolean C;
    private String D;
    private acnv G;
    private AsyncTask H;
    public String h;
    public String i;
    public String r;
    public String s;
    public String t;
    public Map u;
    public CustomWebView v;
    public CookieManager y;
    public boolean w = false;
    public boolean x = false;
    private boolean E = false;
    private ArrayList F = null;
    public String z = null;
    public String A = null;

    public static boolean b(String str, acnv acnvVar) {
        String path;
        if (str == null) {
            return false;
        }
        try {
            path = new URI(str).getPath();
        } catch (URISyntaxException unused) {
        }
        return path != null && acnvVar.b(str) && path.startsWith("/EmbeddedSetup");
    }

    public static void l(String str) {
        if (str == null) {
            return;
        }
        try {
            URI uri = new URI(str);
            uri.getHost();
            uri.getPath();
        } catch (URISyntaxException unused) {
        }
    }

    public final void a(Bundle bundle) {
        this.h = bundle.getString("account_name");
        this.i = bundle.getString("url");
        this.r = bundle.getString("access_token");
        this.C = bundle.getBoolean("creating_account");
        this.F = bundle.getStringArrayList("allowed_domains");
        this.z = bundle.getString("purchaser_email");
        this.A = bundle.getString("purchaser_name");
    }

    public final void c(adau adauVar) {
        String str = this.h;
        boolean z = this.C;
        ArrayList arrayList = this.F;
        int i = ShowErrorChimeraActivity.i;
        startActivityForResult(new Intent().setClassName(AppContextProvider.a(), "com.google.android.gms.auth.login.ShowErrorActivity").putExtra("isCreatingAccount", z).putExtra("detail", (String) null).putExtra("accountName", str).putExtra("status", adauVar.ak).putExtra("isAddingAccount", true).putExtra("allowSkip", arrayList == null), 109);
    }

    @Override // defpackage.adpf, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        CustomWebView customWebView;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0 || (customWebView = this.v) == null || !customWebView.canGoBack()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.v.goBack();
        return true;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 1) {
            setResult(1);
        } else {
            setResult(0);
        }
        finish();
    }

    @Override // defpackage.adpf, defpackage.adpc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Locale locale = Locale.getDefault();
        this.s = locale.getLanguage();
        this.t = locale.getCountry();
        String language = locale.getLanguage();
        this.D = language;
        if (language.isEmpty()) {
            this.u = null;
        } else {
            if (!this.t.isEmpty()) {
                this.D = this.D + "-" + this.t;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("Accept-Language", this.D);
            this.u = DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        this.G = acnv.a(xbw.k());
        setContentView(R.layout.auth_browser_add_account_activity);
        if (bundle != null) {
            this.w = bundle.getBoolean("interactivity_completed", false);
            this.E = bundle.getBoolean("waiting_for_network", false);
            this.x = bundle.getBoolean("background_task_started", false);
            a(bundle);
        } else {
            a(getIntent().getExtras());
        }
        CustomWebView customWebView = (CustomWebView) findViewById(R.id.activity_root).findViewById(R.id.webview);
        this.v = customWebView;
        customWebView.clearCache(true);
        this.v.a();
        CookieSyncManager.createInstance(this);
        this.y = CookieManager.getInstance();
        this.v.setWebViewClient(new adpx(this, this.G));
        this.v.setWebChromeClient(new adph(this));
        WebSettings settings = this.v.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setLightTouchEnabled(false);
        settings.setNeedInitialFocus(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        this.v.setMapTrackballToArrowKeys(false);
        this.v.setFocusable(true);
        this.v.setFocusableInTouchMode(true);
        this.v.getSettings().setUseWideViewPort(false);
        adpg adpgVar = new adpg(this);
        this.H = adpgVar;
        adpgVar.execute(new Void[0]);
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.H;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.H = null;
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            setResult(0);
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.adpf, defpackage.adpc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("access_token", this.r);
        bundle.putString("account_name", this.h);
        bundle.putBoolean("creating_account", this.C);
        bundle.putStringArrayList("allowed_domains", this.F);
        bundle.putString("purchaser_email", this.z);
        bundle.putString("purchaser_name", this.A);
        bundle.putString("url", this.i);
        bundle.putBoolean("interactivity_completed", this.w);
        bundle.putBoolean("waiting_for_network", this.E);
        bundle.putBoolean("background_task_started", this.x);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
    }
}
