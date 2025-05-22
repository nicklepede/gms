package com.google.android.gms.octarine.ui;

import android.accounts.Account;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.AndroidRuntimeException;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.octarine.AppContextProvider;
import com.google.android.gms.octarine.jsbridges.telephony.AuthSmsCodeReceiver;
import com.google.android.gms.octarine.ui.OctarineWebviewChimeraActivity;
import defpackage.a;
import defpackage.adbh;
import defpackage.aqxi;
import defpackage.asxe;
import defpackage.aszs;
import defpackage.atad;
import defpackage.auad;
import defpackage.aupz;
import defpackage.auub;
import defpackage.auur;
import defpackage.bcun;
import defpackage.becb;
import defpackage.beqy;
import defpackage.bohj;
import defpackage.bp;
import defpackage.bsup;
import defpackage.bsur;
import defpackage.bsuv;
import defpackage.bsuy;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cctu;
import defpackage.cuva;
import defpackage.cuvb;
import defpackage.cuvc;
import defpackage.cuve;
import defpackage.cuvf;
import defpackage.cuvg;
import defpackage.cuvx;
import defpackage.cuwf;
import defpackage.cuwh;
import defpackage.cuwy;
import defpackage.cuxd;
import defpackage.cuxf;
import defpackage.cuxp;
import defpackage.cuxq;
import defpackage.cuyb;
import defpackage.cuyc;
import defpackage.cuyj;
import defpackage.cuyk;
import defpackage.cuys;
import defpackage.cuzd;
import defpackage.cuze;
import defpackage.cuzj;
import defpackage.cuzn;
import defpackage.cuzs;
import defpackage.cuzw;
import defpackage.cuzx;
import defpackage.cvag;
import defpackage.cvah;
import defpackage.cvaw;
import defpackage.cvax;
import defpackage.cvbi;
import defpackage.cvbt;
import defpackage.cvbu;
import defpackage.cvce;
import defpackage.cvcg;
import defpackage.cvdf;
import defpackage.cveh;
import defpackage.cvge;
import defpackage.cvgf;
import defpackage.cvha;
import defpackage.cvhb;
import defpackage.cvhc;
import defpackage.cvhe;
import defpackage.cvhf;
import defpackage.cvhy;
import defpackage.cvhz;
import defpackage.cvib;
import defpackage.cvif;
import defpackage.cvij;
import defpackage.cvim;
import defpackage.cvio;
import defpackage.cvir;
import defpackage.cvis;
import defpackage.cvit;
import defpackage.cviz;
import defpackage.cvjb;
import defpackage.cvje;
import defpackage.cvjf;
import defpackage.cvjk;
import defpackage.cvjo;
import defpackage.cvjp;
import defpackage.cvjr;
import defpackage.cvjs;
import defpackage.cvjy;
import defpackage.cvkb;
import defpackage.cvkd;
import defpackage.cvke;
import defpackage.cvkf;
import defpackage.dg;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.diwh;
import defpackage.dpvs;
import defpackage.dwug;
import defpackage.dyne;
import defpackage.dynl;
import defpackage.edxt;
import defpackage.edxu;
import defpackage.ekus;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.elhx;
import defpackage.eqgo;
import defpackage.euvl;
import defpackage.euwr;
import defpackage.evwa;
import defpackage.evzw;
import defpackage.flmg;
import defpackage.fmkm;
import defpackage.ftkp;
import defpackage.ftlf;
import defpackage.fxqo;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.iwv;
import defpackage.jvd;
import defpackage.mrr;
import defpackage.rxx;
import defpackage.uun;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OctarineWebviewChimeraActivity extends rxx implements cuvg, cvge, cuxp, cuyj, cvag, cvaw, cvbt {
    public static final auad j = new auad("Octarine", "OctarineWebViewActivity");
    boolean A;
    public boolean B;
    public boolean C;
    String D;
    Bundle E;
    public String F;
    public String G;
    public boolean H;
    public int I;
    public int J;
    public cvax K;
    public cvah L;
    public cuyk M;
    public cuys N;
    cuwy O;
    cuze P;
    public cvhz Q;
    cvgf R;
    public int S;
    public boolean T;
    public String U;
    public cvdf V;
    public Bundle W;
    public Bundle X;
    public bsup aa;
    public cvce ab;
    public cvkd ac;
    public cuzn ad;
    private cuve ae;
    public cvif k;
    public dynl l;
    public dynl m;
    public CookieManager n;
    InputMethodManager o;
    public cvjf p;
    public eqgo q;
    SwipeRefreshLayout r;
    View s;
    public cviz t;
    public View u;
    public cvjo v;
    public boolean w;
    public cvjp x;
    public cvjb y;
    Bundle z;
    public final cvis Y = new cvis();
    private boolean af = false;
    public final HashSet Z = new HashSet();

    public static final int J(String str, boolean z) {
        if (z) {
            return cvjr.a(Uri.parse(str)) ? 2 : 3;
        }
        return 1;
    }

    private final bsup K() {
        if (!ftlf.d() && this.aa == null) {
            this.aa = bsup.b(this);
        }
        return this.aa;
    }

    private final evzw L() {
        evzw b = evzw.b(getIntent().getIntExtra("extra.themeChoice", 0));
        return b == null ? evzw.THEME_CHOICE_UNSPECIFIED : b;
    }

    private final void M() {
        cvif cvifVar;
        if (this.p == null || (cvifVar = this.k) == null || cvifVar.a() == null || !fmkm.d()) {
            return;
        }
        Intent intent = getIntent();
        long longExtra = ekus.a(intent.getStringExtra("extra.accountName"), q()) ? intent.getLongExtra("extra.prewarmTimestamp", 0L) : 0L;
        this.p.d(intent.getIntExtra("extra.asResourceId", 0), intent.getBooleanExtra("extra.asIsDeepLink", false), longExtra != 0 ? Long.valueOf(longExtra) : null, this.Y.a);
    }

    private final void N(Intent intent) {
        if (intent == null || ekus.a(this.k.f(), intent.getStringExtra("authAccount")) || !bohj.e(K(), intent.getStringExtra("authAccount"))) {
            return;
        }
        this.C = true;
        this.u.setImportantForAccessibility(2);
        String stringExtra = intent.getStringExtra("authAccount");
        ekvl.y(stringExtra);
        this.k.l(new Account(stringExtra, "com.google"));
        this.t.d();
        B(new Runnable() { // from class: cvgt
            @Override // java.lang.Runnable
            public final void run() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = OctarineWebviewChimeraActivity.this;
                octarineWebviewChimeraActivity.ac.e(octarineWebviewChimeraActivity.G);
                octarineWebviewChimeraActivity.B = true;
            }
        });
    }

    public final void A(final String str) {
        y();
        if (this.n.hasCookies()) {
            z();
            return;
        }
        dhlw p = p(o(), this.F);
        p.u(getContainerActivity(), new dhlq() { // from class: cvgm
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                OctarineWebviewChimeraActivity.this.z();
            }
        });
        p.r(getContainerActivity(), new dhln() { // from class: cvgn
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                OctarineWebviewChimeraActivity.this.D(str);
            }
        });
    }

    final void B(final Runnable runnable) {
        y();
        dhlw p = p(o(), this.F);
        p.u(getContainerActivity(), new dhlq() { // from class: cvgg
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                OctarineWebviewChimeraActivity.this.x();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        p.r(getContainerActivity(), new dhln() { // from class: cvgr
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                OctarineWebviewChimeraActivity.j.g("Webview initialization failed.", exc, "");
                OctarineWebviewChimeraActivity.this.I(3);
            }
        });
    }

    public final void C(String str, boolean z) {
        if (!z) {
            this.r.setEnabled(false);
            this.Z.add(str);
            return;
        }
        HashSet hashSet = this.Z;
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.r.setEnabled(true);
        }
    }

    public final void D(final String str) {
        cvke cvkeVar;
        this.u.setVisibility(8);
        this.w = true;
        if (!ekus.a(this.ac.b(), "about:blank")) {
            this.ac.e("about:blank");
        }
        if (F()) {
            cvke cvkeVar2 = (cvke) getSupportFragmentManager().h("error_tag");
            String c = auur.c(cvkeVar2 != null ? cvkeVar2.a.getText().toString() : null);
            if (!auur.d(c) && !c.equals(str) && (cvkeVar = (cvke) getSupportFragmentManager().h("error_tag")) != null) {
                cvkeVar.y(str);
            }
        } else {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(R.id.octarine_webview_container, cvke.x(str), "error_tag");
            bpVar.b();
        }
        this.v.b(R.string.octarine_snackbar_error_setting_loading, R.string.common_try_again, new View.OnClickListener() { // from class: cvgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OctarineWebviewChimeraActivity.this.A(str);
            }
        });
    }

    public final void E() {
        if (this.s.getVisibility() == 0) {
            return;
        }
        if (this.ac.b() != null) {
            this.r.k(true);
            return;
        }
        this.u.setVisibility(4);
        this.s.setVisibility(0);
        C("progress", false);
    }

    public final boolean F() {
        dg h = getSupportFragmentManager().h("error_tag");
        return h != null && h.isVisible();
    }

    public final boolean G(String str) {
        return this.l.c(Uri.parse(str));
    }

    public final void I(int i) {
        cvis cvisVar = this.Y;
        cvisVar.d();
        Intent putExtra = new Intent().putExtra("extra.errorCode", i - 1).putExtra("extra.latencyMetrics", cvisVar.a.r());
        M();
        setResult(0, putExtra);
        finish();
    }

    @Override // defpackage.cuvg
    public final cuve a() {
        return this.ae;
    }

    @Override // defpackage.cuvg
    public final void b(cuve cuveVar) {
        this.ae = cuveVar;
    }

    @Override // defpackage.cuxp, defpackage.cvbt
    public final void c() {
        cvis cvisVar = this.Y;
        cvisVar.d();
        Intent intent = new Intent();
        Bundle bundle = this.E;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("authAccount", q()).putExtra("extra.latencyMetrics", cvisVar.a.r());
        String a = this.V.a();
        if (a != null) {
            intent.putExtra("extra.consistencyToken", a);
        }
        M();
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.cuxp
    public final void d(final String str) {
        this.q.execute(new Runnable() { // from class: cvgp
            @Override // java.lang.Runnable
            public final void run() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = OctarineWebviewChimeraActivity.this;
                String str2 = str;
                try {
                    Context applicationContext = octarineWebviewChimeraActivity.getApplicationContext();
                    String q = octarineWebviewChimeraActivity.q();
                    String str3 = wjx.a;
                    if (str2.equals(wkg.e(applicationContext, q))) {
                        return;
                    }
                    octarineWebviewChimeraActivity.s();
                } catch (IOException | wjw unused) {
                    octarineWebviewChimeraActivity.s();
                }
            }
        });
    }

    @Override // defpackage.cuyj
    public final void e(becb becbVar, int i) {
        this.S = i;
        becbVar.b(getContainerActivity());
    }

    @Override // defpackage.cvag
    public final void f(int i) {
        this.J = i;
        startActivityForResult(new Intent("com.google.android.gms.settings.VERIFY_APPS_SETTINGS").setPackage("com.google.android.gms"), 3);
    }

    @Override // defpackage.cvaw
    public final void g(int i) {
        this.I = i;
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyActivity");
        intent.putExtra("extra_from_intent", "from_security_advisor");
        startActivityForResult(intent, 2);
    }

    @Override // defpackage.cvbt
    public final void h() {
        int i = -(true == ekus.a(this.ac.b(), "about:blank") ? 2 : 1);
        if (!this.ac.a.canGoBackOrForward(i)) {
            c();
        } else {
            this.w = false;
            this.ac.a.goBackOrForward(i);
        }
    }

    @Override // defpackage.cvbt
    public final void i() {
        View currentFocus = getWindow().getCurrentFocus();
        if (currentFocus != null) {
            this.o.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // defpackage.cvbt
    public final void j(evwa evwaVar) {
        w(evwaVar);
    }

    @Override // defpackage.cvbt
    public final void k(int i, Map map) {
        Intent putExtra = new Intent().setAction("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.accountName", q()).putExtra("extra.screenId", i).putExtra("extra.callingPackageName", getIntent().getStringExtra("extra.callingPackageName")).putExtra("extra.themeChoice", L().d);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String valueOf = String.valueOf((String) entry.getKey());
            bundle.putString("extra.screen.".concat(valueOf), (String) entry.getValue());
        }
        putExtra.putExtras(bundle);
        startActivityForResult(putExtra, 4);
    }

    @Override // defpackage.cvge, defpackage.cvbt
    public final void l(String str) {
        t(str, J(str, G(str)));
    }

    @Override // defpackage.cvbt
    public final void m() {
        this.ac.c();
    }

    @Override // defpackage.cvbt
    public final void n(Map map) {
        this.E = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = this.E;
            if (bundle != null) {
                String valueOf = String.valueOf((String) entry.getKey());
                bundle.putString("result.".concat(valueOf), (String) entry.getValue());
            }
        }
    }

    final Account o() {
        Account a = this.k.a();
        ekvl.y(a);
        return a;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (this.af) {
            if (i == 1) {
                this.A = true;
                if (i2 == -1) {
                    N(intent);
                    return;
                }
                return;
            }
            if (i == 2) {
                int i4 = this.I;
                if (i4 >= 0) {
                    cvax cvaxVar = this.K;
                    if (cvaxVar.b) {
                        cvaxVar.e(i4);
                        return;
                    }
                    return;
                }
                i = 2;
            }
            if (i == 3) {
                int i5 = this.J;
                if (i5 >= 0) {
                    cvah cvahVar = this.L;
                    if (cvahVar.a) {
                        cvahVar.e(i5);
                        return;
                    }
                    return;
                }
                i = 3;
            }
            if (i == 5 && (i3 = this.S) >= 0) {
                if (this.M.a) {
                    this.M.f(cuyk.e(i2, intent, i3));
                }
            } else if (i == 10 && i2 == -1) {
                N(intent);
            }
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        h();
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.af) {
            this.Q.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ?? r14;
        int i;
        int i2;
        ModuleManager moduleManager;
        final OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this;
        if (ftlf.d()) {
            new bsur(octarineWebviewChimeraActivity, R.style.ActionBarAppThemeLight, R.style.ActionBarAppThemeDark, octarineWebviewChimeraActivity.L());
        }
        super.onCreate(bundle);
        if (ftlf.g()) {
            Intent intent = new Intent();
            intent.setClassName(octarineWebviewChimeraActivity, "com.google.android.gms.octarine.ui.OctarineActivity");
            intent.putExtras(octarineWebviewChimeraActivity.getIntent());
            intent.addFlags(33554432);
            octarineWebviewChimeraActivity.startActivity(intent);
            octarineWebviewChimeraActivity.finish();
            return;
        }
        int i3 = cveh.a;
        ekww ekwwVar = bsxv.a;
        bsxr bsxrVar = new bsxr();
        if (ftlf.d() && !cveh.a(octarineWebviewChimeraActivity.getIntent(), bsxrVar)) {
            octarineWebviewChimeraActivity.setResult(0, new Intent().putExtra("extra.errorCode", 1));
            octarineWebviewChimeraActivity.finish();
            return;
        }
        if (!ftlf.d() && bundle == null && !cveh.a(octarineWebviewChimeraActivity.getIntent(), bsxrVar)) {
            octarineWebviewChimeraActivity.I(2);
            return;
        }
        cvkf cvkfVar = new cvkf();
        if (ftlf.d()) {
            r14 = 0;
            aqxi a = ((cuvb) cuvf.a(cuvb.class, octarineWebviewChimeraActivity, cvij.a(bundle, "activityScope"))).d().a(null, jvd.a(this), this, this, cvij.a(bundle, "activeAccountScope"), cvkfVar, this, this, this, this, this);
            octarineWebviewChimeraActivity = this;
            Object cast = cvhf.class.cast(a);
            if (cast == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((cvhf) ((cuvc) cast)).c(octarineWebviewChimeraActivity);
        } else {
            r14 = 0;
        }
        if (bundle != null) {
            octarineWebviewChimeraActivity.Y.f(bundle);
        }
        octarineWebviewChimeraActivity.Y.e();
        if (bundle == null || bundle.isEmpty()) {
            String stringExtra = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.url");
            ekvl.y(stringExtra);
            octarineWebviewChimeraActivity.G = stringExtra;
        } else {
            String string = bundle.getString("currentUrl");
            ekvl.y(string);
            octarineWebviewChimeraActivity.G = string;
        }
        if (!ftlf.d()) {
            new bsur(octarineWebviewChimeraActivity, R.style.ActionBarAppThemeLight, R.style.ActionBarAppThemeDark, octarineWebviewChimeraActivity.L());
            octarineWebviewChimeraActivity.y = new cvjb(octarineWebviewChimeraActivity.G);
        }
        if (fmkm.f()) {
            octarineWebviewChimeraActivity.getContainerActivity();
            int i4 = edxt.a;
        }
        octarineWebviewChimeraActivity.getWindow().setStatusBarColor(r14);
        if (ftlf.e() && auub.f()) {
            Window window = octarineWebviewChimeraActivity.getWindow();
            iwv.a(window, r14);
            window.setNavigationBarColor(r14);
            View decorView = window.getDecorView();
            iuz iuzVar = new iuz() { // from class: cvgy
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    auad auadVar = OctarineWebviewChimeraActivity.j;
                    view.setPadding(0, ixtVar.f(1).c, 0, ixtVar.f(64).e);
                    return ixtVar;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(decorView, iuzVar);
        }
        octarineWebviewChimeraActivity.setTitle("");
        octarineWebviewChimeraActivity.setContentView(true != octarineWebviewChimeraActivity.y.a() ? R.layout.octarine_webview1 : R.layout.octarine_webview);
        euwr b = euwr.b(octarineWebviewChimeraActivity.getIntent().getIntExtra("extra.initialTitleType", 1));
        if (b == null) {
            b = euwr.NORMAL;
        }
        euwr euwrVar = b;
        euvl b2 = euvl.b(octarineWebviewChimeraActivity.getIntent().getIntExtra("extra.initialAccountDisplay", 1));
        if (b2 == null) {
            b2 = euvl.HIDE;
        }
        if (!ftlf.d()) {
            octarineWebviewChimeraActivity.k = new cvif(dwug.a(), new uun(), new aupz(Integer.MAX_VALUE, 9));
        }
        cvhc cvhcVar = new cvhc(octarineWebviewChimeraActivity);
        cvif cvifVar = octarineWebviewChimeraActivity.k;
        cvhz cvhzVar = new cvhz(octarineWebviewChimeraActivity, null, (ViewGroup) octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_frame), octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_swipe_refresh_layout), euwrVar, b2, cvifVar, cvifVar, octarineWebviewChimeraActivity.y, dwug.a(), cvhcVar, new View.OnClickListener() { // from class: cvgz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                if (octarineWebviewChimeraActivity2.Q.k == euws.GO_BACK_OR_CLOSE) {
                    octarineWebviewChimeraActivity2.h();
                } else {
                    octarineWebviewChimeraActivity2.c();
                }
            }
        }, new MenuItem.OnMenuItemClickListener() { // from class: cvgh
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                String str = octarineWebviewChimeraActivity2.Q.n;
                if (auur.d(str)) {
                    OctarineWebviewChimeraActivity.j.d("Attempting to launch GoogleHelp with empty help context and URL.", new Object[0]);
                } else {
                    fgrc v = evwa.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    evwa evwaVar = (evwa) v.b;
                    str.getClass();
                    evwaVar.b |= 1;
                    evwaVar.c = str;
                    octarineWebviewChimeraActivity2.w((evwa) v.Q());
                }
                return true;
            }
        }, new cvhy() { // from class: cvgi
            @Override // defpackage.cvhy
            public final Drawable a(evwc evwcVar) {
                return uck.c(OctarineWebviewChimeraActivity.this, evwcVar);
            }
        });
        octarineWebviewChimeraActivity.Q = cvhzVar;
        cvkfVar.a = cvhzVar;
        octarineWebviewChimeraActivity.w = false;
        octarineWebviewChimeraActivity.r = (SwipeRefreshLayout) octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_swipe_refresh_layout);
        octarineWebviewChimeraActivity.s = octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_progress);
        View findViewById = octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_frame);
        bsuy.g(octarineWebviewChimeraActivity.r, R.attr.actionBarBackground);
        if (ftlf.d()) {
            i = 9;
            i2 = Integer.MAX_VALUE;
        } else {
            i = 9;
            i2 = Integer.MAX_VALUE;
            octarineWebviewChimeraActivity.q = new aupz(Integer.MAX_VALUE, 9);
        }
        octarineWebviewChimeraActivity.v = new cvjo(octarineWebviewChimeraActivity, findViewById);
        octarineWebviewChimeraActivity.o = (InputMethodManager) octarineWebviewChimeraActivity.getSystemService("input_method");
        if (ftlf.d()) {
            moduleManager = null;
        } else {
            octarineWebviewChimeraActivity.n = CookieManager.getInstance();
            octarineWebviewChimeraActivity.t = cviz.a();
            octarineWebviewChimeraActivity.U = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.callingPackageName");
            octarineWebviewChimeraActivity.T = octarineWebviewChimeraActivity.getIntent().getBooleanExtra("extra.disableClearcut", false);
            ModuleManager moduleManager2 = ModuleManager.get(octarineWebviewChimeraActivity);
            octarineWebviewChimeraActivity.x = new cvjp(moduleManager2, octarineWebviewChimeraActivity.U, octarineWebviewChimeraActivity.y);
            octarineWebviewChimeraActivity.V = new cvdf(octarineWebviewChimeraActivity.n);
            moduleManager = moduleManager2;
        }
        octarineWebviewChimeraActivity.I = -1;
        octarineWebviewChimeraActivity.J = -1;
        octarineWebviewChimeraActivity.S = -1;
        if (!ftlf.d()) {
            octarineWebviewChimeraActivity.l = new cvjs(Pattern.compile(ftkp.i()), Pattern.compile(ftkp.h()));
            octarineWebviewChimeraActivity.m = new cvjs(Pattern.compile(ftkp.f()), Pattern.compile(ftkp.e()));
            try {
                WebView flmgVar = octarineWebviewChimeraActivity.y.a() ? new flmg(octarineWebviewChimeraActivity) : new cvjy(octarineWebviewChimeraActivity);
                if (octarineWebviewChimeraActivity.u == null) {
                    octarineWebviewChimeraActivity.u = flmgVar;
                }
                if (octarineWebviewChimeraActivity.ac == null) {
                    octarineWebviewChimeraActivity.ac = new cvkd(flmgVar);
                }
            } catch (AndroidRuntimeException unused) {
                octarineWebviewChimeraActivity.I(4);
                return;
            }
        }
        FrameLayout frameLayout = (FrameLayout) octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        octarineWebviewChimeraActivity.u.setLayoutParams(layoutParams);
        octarineWebviewChimeraActivity.u.setFilterTouchesWhenObscured(true);
        if (octarineWebviewChimeraActivity.y.a()) {
            octarineWebviewChimeraActivity.u.setId(R.id.octarine_webview);
        }
        frameLayout.addView(octarineWebviewChimeraActivity.u, 0);
        if (octarineWebviewChimeraActivity.y.a() || fmkm.e()) {
            octarineWebviewChimeraActivity.u.setBackgroundColor(edxu.b(octarineWebviewChimeraActivity.u, R.attr.colorSurfaceContainer));
            if (octarineWebviewChimeraActivity.y.a()) {
                cvim.a(octarineWebviewChimeraActivity.u);
            }
        } else {
            octarineWebviewChimeraActivity.u.setBackgroundColor(bsuy.a(octarineWebviewChimeraActivity, R.attr.actionBarBackground, R.color.google_white));
        }
        if (octarineWebviewChimeraActivity.getIntent().hasExtra("extra.consistencyToken")) {
            octarineWebviewChimeraActivity.D = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.consistencyToken");
        }
        cvha cvhaVar = new cvha(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.l);
        cvhaVar.i(dyne.a);
        octarineWebviewChimeraActivity.ac.k(cvhaVar);
        WebSettings a2 = octarineWebviewChimeraActivity.ac.a();
        a2.setUserAgentString(octarineWebviewChimeraActivity.ac.a().getUserAgentString() + " " + octarineWebviewChimeraActivity.x.a());
        a2.setJavaScriptEnabled(true);
        a2.setSupportMultipleWindows(true);
        cvgf cvgfVar = new cvgf(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ac);
        octarineWebviewChimeraActivity.R = cvgfVar;
        octarineWebviewChimeraActivity.ac.j(cvgfVar);
        View view = octarineWebviewChimeraActivity.u;
        if (view instanceof cvjy) {
            ((cvjy) view).a = new cvkb() { // from class: cvgv
                @Override // defpackage.cvkb
                public final void a(boolean z) {
                    OctarineWebviewChimeraActivity.this.C("over_scroll", z);
                }
            };
        }
        octarineWebviewChimeraActivity.r.a = new mrr() { // from class: cvgw
            @Override // defpackage.mrr
            public final void a() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                octarineWebviewChimeraActivity2.A(octarineWebviewChimeraActivity2.getString(R.string.common_something_went_wrong));
            }
        };
        octarineWebviewChimeraActivity.Q.q(new cvib() { // from class: cvgx
            @Override // defpackage.cvib
            public final void a(boolean z) {
                OctarineWebviewChimeraActivity.this.C("app_bar_config", z);
            }
        });
        cvhz cvhzVar2 = octarineWebviewChimeraActivity.Q;
        cvhzVar2.w = new cvhe(octarineWebviewChimeraActivity);
        cvhzVar2.d();
        findViewById.setSystemUiVisibility(1280);
        octarineWebviewChimeraActivity.u.setOnTouchListener(new View.OnTouchListener() { // from class: cvgj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return OctarineWebviewChimeraActivity.this.C;
            }
        });
        if (!octarineWebviewChimeraActivity.y.a()) {
            octarineWebviewChimeraActivity.u.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: cvgk
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                    octarineWebviewChimeraActivity2.Q.n(octarineWebviewChimeraActivity2.u.getScrollY() > 0);
                }
            });
            octarineWebviewChimeraActivity.u.postDelayed(new Runnable() { // from class: cvgl
                @Override // java.lang.Runnable
                public final void run() {
                    OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                    if (fmkm.e()) {
                        octarineWebviewChimeraActivity2.Q.n(octarineWebviewChimeraActivity2.u.getScrollY() > 0);
                    } else {
                        octarineWebviewChimeraActivity2.Q.o(octarineWebviewChimeraActivity2.u.getScrollY() > 0, true);
                    }
                }
            }, 100L);
        }
        if (bundle == null || bundle.isEmpty()) {
            cvif cvifVar2 = octarineWebviewChimeraActivity.k;
            String stringExtra2 = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.accountName");
            ekvl.y(stringExtra2);
            cvifVar2.l(new Account(stringExtra2, "com.google"));
            if (!ftlf.d()) {
                octarineWebviewChimeraActivity.p = cvje.a(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.k, octarineWebviewChimeraActivity.U, octarineWebviewChimeraActivity.T);
            }
            octarineWebviewChimeraActivity.Q.g(null);
            octarineWebviewChimeraActivity.H = true;
        } else {
            Account account = (Account) bundle.getParcelable("account");
            ekvl.y(account);
            octarineWebviewChimeraActivity.k.l(account);
            if (!ftlf.d()) {
                octarineWebviewChimeraActivity.p = cvje.a(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.k, octarineWebviewChimeraActivity.U, octarineWebviewChimeraActivity.T);
            }
            octarineWebviewChimeraActivity.H = bundle.getBoolean("webviewStillBlank");
            octarineWebviewChimeraActivity.z = bundle.getBundle("webviewState");
            Bundle bundle2 = bundle.getBundle("appBar");
            ekvl.y(bundle2);
            if (bundle2.getInt("accountDisplay") == 3 && !octarineWebviewChimeraActivity.getIntent().getBooleanExtra("allowAccountSwitching", false)) {
                bundle2.putInt("accountDisplay", 2);
            }
            octarineWebviewChimeraActivity.Q.g(bundle2);
        }
        new cvhb(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.K()).d(octarineWebviewChimeraActivity);
        octarineWebviewChimeraActivity.F = octarineWebviewChimeraActivity.G;
        if (!ftlf.d()) {
            octarineWebviewChimeraActivity.O = new cuwy(cvkfVar);
            cvkd cvkdVar = octarineWebviewChimeraActivity.ac;
            cvcg cvcgVar = new cvcg();
            AuthSmsCodeReceiver authSmsCodeReceiver = new AuthSmsCodeReceiver(octarineWebviewChimeraActivity.ac);
            final TelephonyManager telephonyManager = (TelephonyManager) octarineWebviewChimeraActivity.getSystemService("phone");
            octarineWebviewChimeraActivity.ab = new cvce(octarineWebviewChimeraActivity, this, cvkdVar, cvcgVar, authSmsCodeReceiver, new fxqo() { // from class: cvcb
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    int i5 = cvce.f;
                    return telephonyManager;
                }
            });
            octarineWebviewChimeraActivity.L = new cvah(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ac, new fxqo() { // from class: cvac
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    aszs aszsVar = daii.a;
                    return new atad(ryt.this, (boolean[]) null);
                }
            });
            cvkd cvkdVar2 = octarineWebviewChimeraActivity.ac;
            aszs aszsVar = diwh.a;
            final atad atadVar = new atad(octarineWebviewChimeraActivity, (boolean[][]) null);
            octarineWebviewChimeraActivity.K = new cvax(octarineWebviewChimeraActivity, this, cvkdVar2, new fxqo() { // from class: cvau
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    return atad.this;
                }
            }, new fxqo() { // from class: cvat
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    return (KeyguardManager) ryt.this.getSystemService("keyguard");
                }
            });
            octarineWebviewChimeraActivity.M = new cuyk(octarineWebviewChimeraActivity, new fxqo() { // from class: cuyh
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    Activity containerActivity = com.google.android.chimera.android.Activity.this.getContainerActivity();
                    aszs aszsVar2 = bcun.a;
                    return new bdtn(containerActivity);
                }
            }, octarineWebviewChimeraActivity.ac);
            cuzs cuzsVar = new cuzs(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ac, octarineWebviewChimeraActivity.getApplicationContext(), this, octarineWebviewChimeraActivity.k);
            cuzx cuzxVar = new cuzx(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ac, new cuzw(octarineWebviewChimeraActivity.getApplicationContext()));
            elhx elhxVar = new elhx();
            elhxVar.c(octarineWebviewChimeraActivity.O);
            elhxVar.c(octarineWebviewChimeraActivity.K);
            elhxVar.c(octarineWebviewChimeraActivity.L);
            elhxVar.c(octarineWebviewChimeraActivity.M);
            elhxVar.c(cuzsVar);
            elhxVar.c(cuzxVar);
            elhxVar.c(new cvbu(octarineWebviewChimeraActivity));
            final Context applicationContext = octarineWebviewChimeraActivity.getApplicationContext();
            elhxVar.c(new cuxq(applicationContext, octarineWebviewChimeraActivity.k, null, bsup.b(applicationContext), this, new aupz(i2, i), new fxqo() { // from class: cuxh
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    auad auadVar = cuxq.a;
                    return new wwy(applicationContext);
                }
            }));
            ekvl.y(moduleManager);
            elhxVar.c(new cuxf(moduleManager));
            elhxVar.c(this.ab);
            cvkd cvkdVar3 = this.ac;
            cvif cvifVar3 = this.k;
            Context applicationContext2 = getApplicationContext();
            aszs aszsVar2 = cctu.a;
            final atad atadVar2 = new atad((Context) this, (char[][][]) null);
            elhxVar.c(new cvbi(applicationContext2, this, this, cvkdVar3, cvifVar3, null, new fxqo() { // from class: cvaz
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    auad auadVar = cvbi.a;
                    return atad.this;
                }
            }, new cuvx() { // from class: cvbe
                @Override // defpackage.cuvx
                public final void a(djgr djgrVar) {
                    auad auadVar = cvbi.a;
                    aszs aszsVar3 = djgs.a;
                    new atad(this, djgrVar);
                }
            }, cvir.a(getApplicationContext())));
            elhxVar.c(new cuwf(this));
            elhxVar.c(new cuwh(this));
            elhxVar.c(new cuxd(getPackageManager(), asxe.d(this), this.ac));
            elhxVar.c(new cuzj(this, new adbh() { // from class: cuzh
                @Override // defpackage.adbh
                public final atad a(String str) {
                    auad auadVar = cuzj.a;
                    adbl adblVar = new adbl();
                    adblVar.a = str;
                    adblVar.f = 4;
                    adbm a3 = adblVar.a();
                    Context a4 = AppContextProvider.a();
                    aszs aszsVar3 = adbk.a;
                    return new atad(a4, a3);
                }
            }));
            cvkd cvkdVar4 = this.ac;
            Context applicationContext3 = getApplicationContext();
            Activity containerActivity = getContainerActivity();
            aszs aszsVar3 = bcun.a;
            final beqy beqyVar = new beqy(this);
            this.N = new cuys(applicationContext3, containerActivity, cvkdVar4, new fxqo() { // from class: cuym
                @Override // defpackage.fxqo, defpackage.fxqn
                public final Object a() {
                    auad auadVar = cuys.a;
                    return beqy.this;
                }
            });
            cuyc cuycVar = new cuyc(new cuyb(getApplicationContext().getContentResolver()), this.ac, this, this.q);
            elhxVar.c(this.N);
            elhxVar.c(cuycVar);
            cuze cuzeVar = new cuze(this.ac, this, this, this.k, this.p, new cuzd(this, new cvio(this, new cvjk(this, new dpvs())), this.q));
            octarineWebviewChimeraActivity = this;
            octarineWebviewChimeraActivity.P = cuzeVar;
            elhxVar.c(cuzeVar);
            octarineWebviewChimeraActivity.ad = new cuzn(elhxVar.g(), octarineWebviewChimeraActivity.ac, octarineWebviewChimeraActivity);
        }
        octarineWebviewChimeraActivity.r(octarineWebviewChimeraActivity.F);
        octarineWebviewChimeraActivity.af = true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        if (this.af) {
            this.N.j();
            dwug.a().e(this.k);
            if (ftlf.d()) {
                return;
            }
            this.ab.stopListeningForSmsCodes();
            this.ad.b();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        if (this.af) {
            this.N.e();
            this.t.e(o());
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (isFinishing() || !this.af) {
            return;
        }
        this.w = false;
        if (this.A) {
            this.A = false;
            Bundle bundle = this.z;
            if (bundle != null) {
                E();
                this.ac.h(bundle);
                this.z = null;
            } else {
                this.ac.f();
            }
        } else {
            E();
            if (this.t.g(o())) {
                this.n.removeAllCookie();
                B(null);
            } else {
                x();
            }
        }
        this.N.f();
        this.Q.u();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.af) {
            if (ftlf.d()) {
                bundle.putBundle("activityScope", this.W);
                bundle.putBundle("activeAccountScope", this.X);
            }
            bundle.putParcelable("account", o());
            bundle.putString("currentUrl", this.F);
            bundle.putBoolean("webviewStillBlank", this.H);
            Bundle bundle2 = new Bundle();
            this.ac.i(bundle2);
            bundle.putBundle("webviewState", bundle2);
            bundle.putBundle("appBar", this.Q.a());
            this.Y.g(bundle);
        }
    }

    final dhlw p(Account account, String str) {
        dhlw b = this.t.b(account, str);
        b.y(new dhln() { // from class: cvgs
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                OctarineWebviewChimeraActivity.j.g("Failed to set user auth cookies.", exc, "");
                OctarineWebviewChimeraActivity.this.p.a();
            }
        });
        return b;
    }

    public final String q() {
        String f = this.k.f();
        ekvl.y(f);
        return f;
    }

    public final void r(String str) {
        this.ad.a(str);
    }

    public final void s() {
        this.t.d();
        runOnUiThread(new Runnable() { // from class: cvgq
            @Override // java.lang.Runnable
            public final void run() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = OctarineWebviewChimeraActivity.this;
                octarineWebviewChimeraActivity.D(octarineWebviewChimeraActivity.getString(R.string.common_something_went_wrong));
            }
        });
    }

    public final void t(String str, int i) {
        if (i == 2) {
            c();
            return;
        }
        if (i != 3) {
            this.p.e();
            v(str);
            return;
        }
        int ordinal = this.Q.l.ordinal();
        euvl euvlVar = ordinal != 2 ? ordinal != 3 ? euvl.HIDE : euvl.SHOW_AND_ALLOW_SWITCHING : euvl.SHOW_ONLY;
        Intent putExtra = cuva.b(str, q()).putExtra("extra.initialTitleType", this.Q.b().e).putExtra("extra.initialAccountDisplay", euvlVar.e).putExtra("extra.callingPackageName", this.U).putExtra("extra.disableClearcut", this.T);
        putExtra.putExtra("extra.themeChoice", L().d);
        if (euvlVar == euvl.SHOW_AND_ALLOW_SWITCHING) {
            putExtra.putExtra("allowAccountSwitching", true);
        }
        startActivityForResult(putExtra, 1);
    }

    public final void u() {
        this.s.setVisibility(8);
        this.u.setVisibility(0);
        C("progress", true);
        this.r.k(false);
    }

    public final void v(String str) {
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        try {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", bsuy.a(this, R.attr.actionBarLegacyFillSecondary200, R.color.google_grey200));
        } catch (Resources.NotFoundException unused) {
        }
        bundle.putString("com.android.browser.application_id", getPackageName());
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (!parse.isOpaque() && parse.getQueryParameter("hl") == null) {
            buildUpon.appendQueryParameter("hl", cvit.a().toLanguageTag());
        }
        String d = ftkp.d();
        if (Patterns.WEB_URL.matcher(d).matches() && this.m.c(parse)) {
            buildUpon = Uri.parse(d).buildUpon().appendQueryParameter("hl", cvit.a().toLanguageTag()).appendQueryParameter("Email", q()).appendQueryParameter("continue", buildUpon.build().toString());
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", buildUpon.build()).putExtras(bundle));
        } catch (ActivityNotFoundException unused2) {
            this.v.b(R.string.common_no_browser_found, android.R.string.cancel, new View.OnClickListener() { // from class: cvgu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    auad auadVar = OctarineWebviewChimeraActivity.j;
                }
            });
        }
    }

    public final void w(evwa evwaVar) {
        bsuv.a(this, evwaVar, this.k.f());
    }

    public final void x() {
        Bundle bundle = this.z;
        if (bundle != null) {
            this.ac.h(bundle);
            this.z = null;
        } else if (this.ac.b() != null) {
            u();
        } else {
            if (G(this.F)) {
                this.ac.e(this.F);
                return;
            }
            this.p.e();
            v(this.F);
            c();
        }
    }

    final void y() {
        if (this.D == null || this.V.a() != null) {
            return;
        }
        cvdf cvdfVar = this.V;
        String str = this.D;
        ekvl.y(str);
        cvdfVar.a.setCookie("https://google.com", a.a(str, "CONSISTENCY=", "; Max-Age=300; secure"));
    }

    public final void z() {
        this.w = false;
        if (F()) {
            this.ac.d();
        } else {
            this.ac.f();
        }
    }
}
