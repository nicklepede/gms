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
import defpackage.auid;
import defpackage.aupz;
import defpackage.aurt;
import defpackage.ausn;
import defpackage.auts;
import defpackage.auub;
import defpackage.bkug;
import defpackage.bkum;
import defpackage.bkvb;
import defpackage.bkwf;
import defpackage.bkwh;
import defpackage.bkzw;
import defpackage.bkzz;
import defpackage.blah;
import defpackage.bldl;
import defpackage.blfl;
import defpackage.blfz;
import defpackage.blhp;
import defpackage.blhq;
import defpackage.blhr;
import defpackage.bliv;
import defpackage.blkg;
import defpackage.blmc;
import defpackage.blmd;
import defpackage.blmq;
import defpackage.blmv;
import defpackage.blmy;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhma;
import defpackage.dhmf;
import defpackage.edxt;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.eqgo;
import defpackage.erzl;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhbl;
import defpackage.frdz;
import defpackage.frff;
import defpackage.frfr;
import defpackage.frgy;
import defpackage.frmj;
import defpackage.frmv;
import defpackage.ind;
import defpackage.iwv;
import defpackage.wku;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleHelpSupportWebViewChimeraActivity extends bldl implements blmv, bkwh {
    public static final String j = "com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewActivity";
    public static final ausn k = ausn.b("gH_SupportWebView", auid.GOOGLE_HELP);
    public static String l;
    public String o;
    public String p;
    public WebView q;
    public View r;
    public boolean t;
    private eqgo v;
    private bkvb w;
    private BroadcastReceiver x;
    private int y;
    private wku z;
    ValueCallback m = null;
    public final List n = new ArrayList();
    public boolean s = false;
    public long u = 0;

    private final eqgo p() {
        if (this.v == null) {
            this.v = new aupz(Integer.MAX_VALUE, 9);
        }
        return this.v;
    }

    private final void q() {
        new blkg(this, 3, p()).executeOnExecutor(p(), new Void[0]);
    }

    private final void r() {
        setResult(0);
        finish();
    }

    private static final boolean s(HelpConfig helpConfig) {
        return bkzz.c(helpConfig.g(), frff.g(), frff.c(), frff.d());
    }

    @Override // defpackage.blmv
    public final void ac(Intent intent, ValueCallback valueCallback) {
        if (bliv.c(this.W)) {
            this.m = valueCallback;
            startActivityForResult(intent, 8244);
        }
    }

    @Override // defpackage.bkwh
    public final void c(bkum bkumVar) {
        List list = this.n;
        synchronized (list) {
            list.remove(bkumVar);
        }
    }

    @Override // defpackage.bkvc
    public final bkwf d() {
        throw null;
    }

    @Override // defpackage.bkvc
    public final bkzw e() {
        throw null;
    }

    @Override // defpackage.bkwh
    public final void f(bkum bkumVar) {
        List list = this.n;
        synchronized (list) {
            list.add(bkumVar);
        }
    }

    public final bkvb k() {
        if (this.w == null) {
            this.w = new bkvb();
        }
        return this.w;
    }

    public final void l() {
        findViewById(R.id.gh_progress_bar).setVisibility(8);
    }

    public final void m(boolean z) {
        ausn ausnVar = blfl.a;
        if (bkzz.b(frgy.d())) {
            fgrc v = blhp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            blhp blhpVar = (blhp) fgriVar;
            blhpVar.c = 146;
            blhpVar.b |= 1;
            int i = z ? 2 : 3;
            if (!fgriVar.L()) {
                v.U();
            }
            blhp blhpVar2 = (blhp) v.b;
            blhpVar2.d = i - 1;
            blhpVar2.b = 2 | blhpVar2.b;
            blhp blhpVar3 = (blhp) v.Q();
            HelpConfig ic = ic();
            fgrc v2 = blhq.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            blhq blhqVar = (blhq) v2.b;
            blhpVar3.getClass();
            blhqVar.d = blhpVar3;
            blhqVar.c = 3;
            blfl.J(this, ic, v2);
        }
        ausn ausnVar2 = blfz.a;
        fgrc v3 = blhr.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar2 = v3.b;
        blhr blhrVar = (blhr) fgriVar2;
        blhrVar.i = 257;
        blhrVar.b |= 256;
        int i2 = true != z ? 22 : 21;
        if (!fgriVar2.L()) {
            v3.U();
        }
        blhr blhrVar2 = (blhr) v3.b;
        blhrVar2.j = i2 - 1;
        blhrVar2.b |= 1024;
        blfz.E(this, v3, aurt.a);
    }

    public final void n() {
        new blkg(this, 2, p()).executeOnExecutor(p(), new Void[0]);
    }

    public final void o() {
        if (bkzz.b(frfr.c())) {
            l();
        }
        WebView webView = (WebView) findViewById(R.id.gh_home_screen_webview);
        this.q = webView;
        int i = blmy.a;
        webView.setWebViewClient(new blmd(this));
        WebView webView2 = this.q;
        WebSettings f = blmy.f(this, webView2);
        f.setSupportZoom(false);
        f.setBuiltInZoomControls(false);
        webView2.setBackgroundColor(blah.a(this, R.attr.ghf_surfaceColor));
        this.q.addJavascriptInterface(new blmc(this), "activity");
        View view = this.r;
        if (view != null) {
            view.setVisibility(8);
            this.q.setVisibility(0);
        }
        if (this.z == null) {
            this.z = new wku(this);
        }
        final wku wkuVar = this.z;
        final Account account = this.W.d;
        final String r = frdz.r();
        eqgo p = p();
        final dhma dhmaVar = new dhma();
        p.execute(new Runnable() { // from class: bllh
            @Override // java.lang.Runnable
            public final void run() {
                dhlw c;
                String str = GoogleHelpSupportWebViewChimeraActivity.j;
                wku wkuVar2 = wku.this;
                Account account2 = account;
                String str2 = r;
                dhma dhmaVar2 = dhmaVar;
                try {
                    try {
                        c = dhmr.d(new wkt(wkuVar2.a).b(account2, str2));
                    } catch (IOException | wjw | wkr e) {
                        c = dhmr.c(e);
                    }
                    boolean z = false;
                    if (c.i() != null && !((Set) c.i()).isEmpty()) {
                        z = true;
                    }
                    dhmaVar2.b(Boolean.valueOf(z));
                } catch (RuntimeException e2) {
                    dhmaVar2.a(e2);
                }
            }
        });
        dhmf dhmfVar = dhmaVar.a;
        dhmfVar.z(new dhlq() { // from class: bllm
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                boolean b = bkzz.b(frfr.c());
                GoogleHelpSupportWebViewChimeraActivity googleHelpSupportWebViewChimeraActivity = GoogleHelpSupportWebViewChimeraActivity.this;
                if (b) {
                    blmy.u(googleHelpSupportWebViewChimeraActivity.q, frdz.r(), googleHelpSupportWebViewChimeraActivity.p, googleHelpSupportWebViewChimeraActivity.o, bliy.a(googleHelpSupportWebViewChimeraActivity.W));
                } else {
                    googleHelpSupportWebViewChimeraActivity.q.loadUrl(GoogleHelpSupportWebViewChimeraActivity.l);
                }
            }
        });
        dhmfVar.y(new dhln() { // from class: blln
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) GoogleHelpSupportWebViewChimeraActivity.k.j()).s(exc)).x("Failed setting cookies for the Help guide default URL.");
                final GoogleHelpSupportWebViewChimeraActivity googleHelpSupportWebViewChimeraActivity = GoogleHelpSupportWebViewChimeraActivity.this;
                blfl.t(googleHelpSupportWebViewChimeraActivity, 102);
                blfz.r(googleHelpSupportWebViewChimeraActivity, 223);
                googleHelpSupportWebViewChimeraActivity.q.setVisibility(8);
                if (googleHelpSupportWebViewChimeraActivity.r == null) {
                    googleHelpSupportWebViewChimeraActivity.r = ((ViewStub) googleHelpSupportWebViewChimeraActivity.findViewById(R.id.gh_request_error_stub)).inflate();
                }
                googleHelpSupportWebViewChimeraActivity.r.setVisibility(0);
                bkwk.b(googleHelpSupportWebViewChimeraActivity.r, R.string.common_something_went_wrong, new View.OnClickListener() { // from class: bllk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GoogleHelpSupportWebViewChimeraActivity.this.o();
                    }
                });
            }
        });
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (bliv.c(this.W) && i == 8244) {
            ValueCallback valueCallback = this.m;
            if (valueCallback != null) {
                if (i2 == -1) {
                    Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(-1, intent);
                    if (bkzz.a(frmv.c())) {
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

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        WebView webView = this.q;
        if (webView != null && this.s) {
            webView.evaluateJavascript(frdz.a.lK().T(), null);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override // defpackage.bldl, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!auts.b(this)) {
            Toast.makeText(this, getString(R.string.gh_network_not_connected), 0).show();
            ((eluo) k.j()).x("No internet connection.");
            r();
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            ((eluo) k.j()).x("The intent that started the Activity is null.");
            r();
            return;
        }
        if (s(this.W) && intent.hasExtra("EXTRA_HELP_CONFIG")) {
            this.W = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG");
        }
        Uri data = intent.getData();
        if (bkzz.b(frfr.c())) {
            if (!TextUtils.equals(intent.getAction(), "android.intent.action.VIEW")) {
                ((eluo) k.j()).x("The intent action is not view.");
                r();
                return;
            }
        } else if (data == null) {
            ((eluo) k.j()).x("The intent data is null.");
            r();
            return;
        } else if (!blmq.d(data, true)) {
            ((eluo) k.j()).B("The URL is not allowed to be shown: %s", data.toSafeString());
            r();
            return;
        }
        HelpConfig helpConfig = this.W;
        if (helpConfig == null) {
            ((eluo) k.j()).x("The HelpConfig passed to the Activity is null ");
            r();
            return;
        }
        blah.c(this, helpConfig, R.style.gh_NoActionBarLightActivityStyleMaterial3, R.style.gh_NoActionBarDarkActivityStyleMaterial3, R.style.gh_NoActionBarDayNightActivityStyleMaterial3);
        HelpConfig helpConfig2 = this.W;
        if (helpConfig2.P) {
            ThemeSettings themeSettings = helpConfig2.z;
            int i = edxt.a;
        }
        setContentView(R.layout.gh_help_guide_activity);
        findViewById(R.id.gh_help_section).setVisibility(0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.gh_help_toolbar);
        hJ(toolbar);
        bkug.b(this, hO(), false);
        toolbar.x(null);
        if (bkzz.a(frmj.a.lK().c()) && auub.g()) {
            iwv.a(getWindow(), false);
            ((AppBarLayout) findViewById(R.id.gh_help_app_bar)).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: blli
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    String str = GoogleHelpSupportWebViewChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            ((FrameLayout) findViewById(R.id.gh_help_guide_content)).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bllj
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
            if (bkzz.a(frff.m())) {
                this.u = intent.getLongExtra("extra_help_guide_start_timestamp", this.u);
            }
            if (bkzz.b(frfr.c())) {
                n();
            } else {
                l = data.toString();
                o();
            }
            if (s(this.W)) {
                final bkvb k2 = k();
                final HelpConfig helpConfig3 = this.W;
                final dhma dhmaVar = new dhma();
                dhlw a = k2.a();
                a.w(eqex.a, new dhlq() { // from class: bkuv
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        ekvi ekviVar = (ekvi) obj;
                        boolean h = ekviVar.h();
                        bkvb bkvbVar = bkvb.this;
                        if (h && !TextUtils.isEmpty(((HelpConfig) ekviVar.c()).N) && !TextUtils.isEmpty(((HelpConfig) ekviVar.c()).I)) {
                            bkvbVar.b = false;
                        }
                        dhmaVar.b(Boolean.valueOf(bkvbVar.b));
                    }
                });
                Objects.requireNonNull(dhmaVar);
                a.y(new dhln() { // from class: bkuw
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        dhma.this.d(exc);
                    }
                });
                dhmf dhmfVar = dhmaVar.a;
                dhmfVar.z(new dhlq() { // from class: bkuy
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            bkvb.this.c(helpConfig3);
                        }
                    }
                });
                dhmfVar.y(new dhln() { // from class: bkuz
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        bkvb.this.c(helpConfig3);
                    }
                });
            } else if (bliv.c(this.W)) {
                k().c(this.W);
            }
        } else if (!s(this.W) || this.y != 2) {
            ((eluo) k.j()).x("The Help Guide entry point was not set properly.");
            r();
            return;
        } else {
            this.u = intent.getLongExtra("extra_help_guide_start_timestamp", this.u);
            q();
            k().c(this.W);
        }
        setResult(-1);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
        int intExtra;
        super.onNewIntent(intent);
        if (!bkzz.b(frmj.a.lK().e()) || !intent.hasExtra("EXTRA_HELP_CONFIG")) {
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
        fhbl fhblVar = helpConfig.X;
        fhbl fhblVar2 = this.W.X;
        if (fhblVar != null ? fhblVar.equals(fhblVar2) : fhblVar2 == null) {
            erzl erzlVar = helpConfig.W;
            erzl erzlVar2 = this.W.W;
            if (erzlVar != null ? erzlVar.equals(erzlVar2) : erzlVar2 == null) {
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

    @Override // defpackage.bldl, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        if (bliv.c(this.W)) {
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

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        if (bliv.c(this.W)) {
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
                    public final void jP(Context context, Intent intent) {
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
            ind.c(this, this.x, intentFilter, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", null, 4);
        }
    }
}
