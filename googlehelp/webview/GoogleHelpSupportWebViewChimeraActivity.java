package com.google.android.gms.googlehelp.webview;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewChimeraActivity;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asnz;
import defpackage.asot;
import defpackage.aspy;
import defpackage.asqh;
import defpackage.bipr;
import defpackage.bipx;
import defpackage.biqm;
import defpackage.birq;
import defpackage.birs;
import defpackage.bivh;
import defpackage.bivk;
import defpackage.bivs;
import defpackage.biyw;
import defpackage.bjaw;
import defpackage.bjbk;
import defpackage.bjda;
import defpackage.bjdb;
import defpackage.bjdc;
import defpackage.bjeg;
import defpackage.bjfr;
import defpackage.bjhn;
import defpackage.bjho;
import defpackage.bjib;
import defpackage.bjig;
import defpackage.bjij;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfau;
import defpackage.dfaz;
import defpackage.eble;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensv;
import defpackage.eplm;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fems;
import defpackage.folg;
import defpackage.fomm;
import defpackage.fomy;
import defpackage.foof;
import defpackage.fotq;
import defpackage.fouc;
import defpackage.iln;
import defpackage.ivf;
import defpackage.uov;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GoogleHelpSupportWebViewChimeraActivity extends biyw implements bjig, birs {
    public static final String j = "com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewActivity";
    public static final asot k = asot.b("gH_SupportWebView", asej.GOOGLE_HELP);
    public static String l;
    public String o;
    public String p;
    public WebView q;
    public View r;
    public boolean t;
    private ensv v;
    private biqm w;
    private BroadcastReceiver x;
    private int y;
    private uov z;
    ValueCallback m = null;
    public final List n = new ArrayList();
    public boolean s = false;
    public long u = 0;

    private final ensv p() {
        if (this.v == null) {
            this.v = new asmf(Integer.MAX_VALUE, 9);
        }
        return this.v;
    }

    private final void q() {
        new bjfr(this, 3, p()).executeOnExecutor(p(), new Void[0]);
    }

    private final void r() {
        setResult(0);
        finish();
    }

    private static final boolean s(HelpConfig helpConfig) {
        return bivk.c(helpConfig.g(), fomm.g(), fomm.c(), fomm.d());
    }

    @Override // defpackage.bjig
    public final void ac(Intent intent, ValueCallback valueCallback) {
        if (bjeg.c(this.W)) {
            this.m = valueCallback;
            startActivityForResult(intent, 8244);
        }
    }

    @Override // defpackage.birs
    public final void c(bipx bipxVar) {
        List list = this.n;
        synchronized (list) {
            list.remove(bipxVar);
        }
    }

    @Override // defpackage.biqn
    public final birq d() {
        throw null;
    }

    @Override // defpackage.biqn
    public final bivh e() {
        throw null;
    }

    @Override // defpackage.birs
    public final void f(bipx bipxVar) {
        List list = this.n;
        synchronized (list) {
            list.add(bipxVar);
        }
    }

    public final biqm k() {
        if (this.w == null) {
            this.w = new biqm();
        }
        return this.w;
    }

    public final void l() {
        findViewById(R.id.gh_progress_bar).setVisibility(8);
    }

    public final void m(boolean z) {
        asot asotVar = bjaw.a;
        if (bivk.b(foof.d())) {
            fecj v = bjda.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            bjda bjdaVar = (bjda) fecpVar;
            bjdaVar.c = 146;
            bjdaVar.b |= 1;
            int i = z ? 2 : 3;
            if (!fecpVar.L()) {
                v.U();
            }
            bjda bjdaVar2 = (bjda) v.b;
            bjdaVar2.d = i - 1;
            bjdaVar2.b = 2 | bjdaVar2.b;
            bjda bjdaVar3 = (bjda) v.Q();
            HelpConfig hM = hM();
            fecj v2 = bjdb.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            bjdb bjdbVar = (bjdb) v2.b;
            bjdaVar3.getClass();
            bjdbVar.d = bjdaVar3;
            bjdbVar.c = 3;
            bjaw.J(this, hM, v2);
        }
        asot asotVar2 = bjbk.a;
        fecj v3 = bjdc.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar2 = v3.b;
        bjdc bjdcVar = (bjdc) fecpVar2;
        bjdcVar.i = 257;
        bjdcVar.b |= 256;
        int i2 = true != z ? 22 : 21;
        if (!fecpVar2.L()) {
            v3.U();
        }
        bjdc bjdcVar2 = (bjdc) v3.b;
        bjdcVar2.j = i2 - 1;
        bjdcVar2.b |= 1024;
        bjbk.E(this, v3, asnz.a);
    }

    public final void n() {
        new bjfr(this, 2, p()).executeOnExecutor(p(), new Void[0]);
    }

    public final void o() {
        if (bivk.b(fomy.c())) {
            l();
        }
        WebView webView = (WebView) findViewById(R.id.gh_home_screen_webview);
        this.q = webView;
        int i = bjij.a;
        webView.setWebViewClient(new bjho(this));
        WebView webView2 = this.q;
        WebSettings f = bjij.f(this, webView2);
        f.setSupportZoom(false);
        f.setBuiltInZoomControls(false);
        webView2.setBackgroundColor(bivs.a(this, R.attr.ghf_surfaceColor));
        this.q.addJavascriptInterface(new bjhn(this), "activity");
        View view = this.r;
        if (view != null) {
            view.setVisibility(8);
            this.q.setVisibility(0);
        }
        if (this.z == null) {
            this.z = new uov(this);
        }
        final uov uovVar = this.z;
        final Account account = this.W.d;
        final String r = folg.r();
        ensv p = p();
        final dfau dfauVar = new dfau();
        p.execute(new Runnable() { // from class: bjgs
            @Override // java.lang.Runnable
            public final void run() {
                dfaq c;
                String str = GoogleHelpSupportWebViewChimeraActivity.j;
                uov uovVar2 = uov.this;
                Account account2 = account;
                String str2 = r;
                dfau dfauVar2 = dfauVar;
                try {
                    try {
                        c = dfbl.d(new uou(uovVar2.a).b(account2, str2));
                    } catch (IOException | unx | uos e) {
                        c = dfbl.c(e);
                    }
                    boolean z = false;
                    if (c.i() != null && !((Set) c.i()).isEmpty()) {
                        z = true;
                    }
                    dfauVar2.b(Boolean.valueOf(z));
                } catch (RuntimeException e2) {
                    dfauVar2.a(e2);
                }
            }
        });
        dfaz dfazVar = dfauVar.a;
        dfazVar.z(new dfak() { // from class: bjgx
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                boolean b = bivk.b(fomy.c());
                GoogleHelpSupportWebViewChimeraActivity googleHelpSupportWebViewChimeraActivity = GoogleHelpSupportWebViewChimeraActivity.this;
                if (b) {
                    bjij.u(googleHelpSupportWebViewChimeraActivity.q, folg.r(), googleHelpSupportWebViewChimeraActivity.p, googleHelpSupportWebViewChimeraActivity.o, bjej.a(googleHelpSupportWebViewChimeraActivity.W));
                } else {
                    googleHelpSupportWebViewChimeraActivity.q.loadUrl(GoogleHelpSupportWebViewChimeraActivity.l);
                }
            }
        });
        dfazVar.y(new dfah() { // from class: bjgy
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) GoogleHelpSupportWebViewChimeraActivity.k.j()).s(exc)).x("Failed setting cookies for the Help guide default URL.");
                final GoogleHelpSupportWebViewChimeraActivity googleHelpSupportWebViewChimeraActivity = GoogleHelpSupportWebViewChimeraActivity.this;
                bjaw.t(googleHelpSupportWebViewChimeraActivity, 102);
                bjbk.r(googleHelpSupportWebViewChimeraActivity, 223);
                googleHelpSupportWebViewChimeraActivity.q.setVisibility(8);
                if (googleHelpSupportWebViewChimeraActivity.r == null) {
                    googleHelpSupportWebViewChimeraActivity.r = ((ViewStub) googleHelpSupportWebViewChimeraActivity.findViewById(R.id.gh_request_error_stub)).inflate();
                }
                googleHelpSupportWebViewChimeraActivity.r.setVisibility(0);
                birv.b(googleHelpSupportWebViewChimeraActivity.r, R.string.common_something_went_wrong, new View.OnClickListener() { // from class: bjgv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GoogleHelpSupportWebViewChimeraActivity.this.o();
                    }
                });
            }
        });
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (bjeg.c(this.W) && i == 8244) {
            ValueCallback valueCallback = this.m;
            if (valueCallback != null) {
                if (i2 == -1) {
                    Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(-1, intent);
                    if (bivk.a(fouc.c())) {
                        int length = parseResult.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            Uri uri = parseResult[i3];
                            if (!TextUtils.isEmpty(uri.getAuthority()) && uri.getAuthority().contains("@")) {
                                parseResult = null;
                                break;
                            }
                            i3++;
                        }
                    }
                    valueCallback.onReceiveValue(parseResult);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }
            this.m = null;
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        WebView webView = this.q;
        if (webView != null && this.s) {
            webView.evaluateJavascript(folg.a.a().T(), null);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override // defpackage.biyw, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!aspy.b(this)) {
            Toast.makeText(this, getString(R.string.gh_network_not_connected), 0).show();
            ((ejhf) k.j()).x("No internet connection.");
            r();
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            ((ejhf) k.j()).x("The intent that started the Activity is null.");
            r();
            return;
        }
        if (s(this.W) && intent.hasExtra("EXTRA_HELP_CONFIG")) {
            this.W = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
        }
        Uri data = intent.getData();
        if (bivk.b(fomy.c())) {
            if (!TextUtils.equals(intent.getAction(), "android.intent.action.VIEW")) {
                ((ejhf) k.j()).x("The intent action is not view.");
                r();
                return;
            }
        } else if (data == null) {
            ((ejhf) k.j()).x("The intent data is null.");
            r();
            return;
        } else if (!bjib.d(data, true)) {
            ((ejhf) k.j()).B("The URL is not allowed to be shown: %s", data.toSafeString());
            r();
            return;
        }
        HelpConfig helpConfig = this.W;
        if (helpConfig == null) {
            ((ejhf) k.j()).x("The HelpConfig passed to the Activity is null ");
            r();
            return;
        }
        bivs.c(this, helpConfig, R.style.gh_NoActionBarLightActivityStyleMaterial3, R.style.gh_NoActionBarDarkActivityStyleMaterial3, R.style.gh_NoActionBarDayNightActivityStyleMaterial3);
        HelpConfig helpConfig2 = this.W;
        if (helpConfig2.P) {
            ThemeSettings themeSettings = helpConfig2.z;
            int i = eble.a;
        }
        setContentView(R.layout.gh_help_guide_activity);
        findViewById(R.id.gh_help_section).setVisibility(0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.gh_help_toolbar);
        ht(toolbar);
        bipr.b(this, hy(), false);
        toolbar.x(null);
        if (bivk.a(fotq.a.a().c()) && asqh.g()) {
            ivf.a(getWindow(), false);
            ((AppBarLayout) findViewById(R.id.gh_help_app_bar)).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bjgt
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    String str = GoogleHelpSupportWebViewChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            ((FrameLayout) findViewById(R.id.gh_help_guide_content)).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bjgu
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    String str = GoogleHelpSupportWebViewChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
        }
        int intExtra = intent.getIntExtra("extra_help_guide_entrypoint", 0);
        this.y = intExtra;
        if (intExtra == 1) {
            if (bivk.a(fomm.m())) {
                this.u = intent.getLongExtra("extra_help_guide_start_timestamp", this.u);
            }
            if (bivk.b(fomy.c())) {
                n();
            } else {
                l = data.toString();
                o();
            }
            if (s(this.W)) {
                final biqm k2 = k();
                final HelpConfig helpConfig3 = this.W;
                final dfau dfauVar = new dfau();
                dfaq a = k2.a();
                a.w(enre.a, new dfak() { // from class: biqg
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        eiid eiidVar = (eiid) obj;
                        boolean h = eiidVar.h();
                        biqm biqmVar = biqm.this;
                        if (h && !TextUtils.isEmpty(((HelpConfig) eiidVar.c()).N) && !TextUtils.isEmpty(((HelpConfig) eiidVar.c()).I)) {
                            biqmVar.b = false;
                        }
                        dfauVar.b(Boolean.valueOf(biqmVar.b));
                    }
                });
                Objects.requireNonNull(dfauVar);
                a.y(new dfah() { // from class: biqh
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        dfau.this.d(exc);
                    }
                });
                dfaz dfazVar = dfauVar.a;
                dfazVar.z(new dfak() { // from class: biqj
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            biqm.this.c(helpConfig3);
                        }
                    }
                });
                dfazVar.y(new dfah() { // from class: biqk
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        biqm.this.c(helpConfig3);
                    }
                });
            } else if (bjeg.c(this.W)) {
                k().c(this.W);
            }
        } else if (!s(this.W) || this.y != 2) {
            ((ejhf) k.j()).x("The Help Guide entry point was not set properly.");
            r();
            return;
        } else {
            this.u = intent.getLongExtra("extra_help_guide_start_timestamp", this.u);
            q();
            k().c(this.W);
        }
        setResult(-1);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onNewIntent(Intent intent) {
        int intExtra;
        super.onNewIntent(intent);
        if (!bivk.b(fotq.a.a().e()) || !intent.hasExtra("EXTRA_HELP_CONFIG")) {
            if (s(this.W) && (intExtra = intent.getIntExtra("extra_help_guide_entrypoint", 0)) != this.y && intExtra == 2 && intent.hasExtra("EXTRA_HELP_CONFIG")) {
                this.W = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
                this.u = intent.getLongExtra("extra_help_guide_start_timestamp", this.u);
                setIntent(intent);
                q();
                return;
            }
            return;
        }
        HelpConfig helpConfig = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
        int intExtra2 = intent.getIntExtra("extra_help_guide_entrypoint", 0);
        fems femsVar = helpConfig.X;
        fems femsVar2 = this.W.X;
        if (femsVar != null ? femsVar.equals(femsVar2) : femsVar2 == null) {
            eplm eplmVar = helpConfig.W;
            eplm eplmVar2 = this.W.W;
            if (eplmVar != null ? eplmVar.equals(eplmVar2) : eplmVar2 == null) {
                if (TextUtils.equals(helpConfig.g(), this.W.g()) && intExtra2 == this.y) {
                    return;
                }
            }
        }
        this.W = helpConfig;
        this.u = intent.getLongExtra("extra_help_guide_start_timestamp", this.u);
        setIntent(intent);
        if (intExtra2 == 2) {
            q();
        } else {
            n();
        }
    }

    @Override // defpackage.biyw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        super.onPause();
        if (bjeg.c(this.W)) {
            BroadcastReceiver broadcastReceiver = this.x;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.x = null;
            }
            if (this.t) {
                ChatRequestAndConversationChimeraService.N(false, this, this.W);
            }
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        if (bjeg.c(this.W)) {
            if (this.t) {
                ChatRequestAndConversationChimeraService.N(true, this, this.W);
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT");
            intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
            intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
            if (this.x == null) {
                this.x = new TracingBroadcastReceiver() { // from class: com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewChimeraActivity.1
                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jz(Context context, Intent intent) {
                        GoogleHelpSupportWebViewChimeraActivity googleHelpSupportWebViewChimeraActivity = GoogleHelpSupportWebViewChimeraActivity.this;
                        if (googleHelpSupportWebViewChimeraActivity.t) {
                            return;
                        }
                        if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT") || intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY") || intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE")) {
                            ChatRequestAndConversationChimeraService.N(true, context, googleHelpSupportWebViewChimeraActivity.W);
                            googleHelpSupportWebViewChimeraActivity.t = true;
                        }
                    }
                };
            }
            iln.c(this, this.x, intentFilter, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", null, 4);
        }
    }
}
