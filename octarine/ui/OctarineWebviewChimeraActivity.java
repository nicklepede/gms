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
import defpackage.abbh;
import defpackage.aour;
import defpackage.aqup;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.asqh;
import defpackage.asqx;
import defpackage.baqr;
import defpackage.bbyj;
import defpackage.bcpl;
import defpackage.bmar;
import defpackage.bp;
import defpackage.bqna;
import defpackage.bqnc;
import defpackage.bqng;
import defpackage.bqnj;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cale;
import defpackage.cslv;
import defpackage.cslw;
import defpackage.cslx;
import defpackage.cslz;
import defpackage.csma;
import defpackage.csmb;
import defpackage.csms;
import defpackage.csna;
import defpackage.csnc;
import defpackage.csnt;
import defpackage.csny;
import defpackage.csoa;
import defpackage.csok;
import defpackage.csol;
import defpackage.csow;
import defpackage.csox;
import defpackage.cspe;
import defpackage.cspf;
import defpackage.cspn;
import defpackage.cspy;
import defpackage.cspz;
import defpackage.csqe;
import defpackage.csqi;
import defpackage.csqn;
import defpackage.csqr;
import defpackage.csqs;
import defpackage.csrb;
import defpackage.csrc;
import defpackage.csrr;
import defpackage.csrs;
import defpackage.cssd;
import defpackage.csso;
import defpackage.cssp;
import defpackage.cssz;
import defpackage.cstb;
import defpackage.csua;
import defpackage.csvc;
import defpackage.csxb;
import defpackage.csxc;
import defpackage.csxy;
import defpackage.csxz;
import defpackage.csya;
import defpackage.csyc;
import defpackage.csyd;
import defpackage.csyv;
import defpackage.csyw;
import defpackage.csyx;
import defpackage.csyz;
import defpackage.cszd;
import defpackage.cszh;
import defpackage.cszk;
import defpackage.cszm;
import defpackage.cszp;
import defpackage.cszq;
import defpackage.cszr;
import defpackage.cszx;
import defpackage.ctaa;
import defpackage.ctab;
import defpackage.ctag;
import defpackage.ctak;
import defpackage.ctal;
import defpackage.ctan;
import defpackage.ctao;
import defpackage.ctau;
import defpackage.ctax;
import defpackage.ctaz;
import defpackage.ctba;
import defpackage.ctbb;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dg;
import defpackage.dglc;
import defpackage.dnlj;
import defpackage.duju;
import defpackage.dwbd;
import defpackage.dwbk;
import defpackage.eble;
import defpackage.eblf;
import defpackage.eihn;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eius;
import defpackage.ensv;
import defpackage.esfx;
import defpackage.eshc;
import defpackage.etgi;
import defpackage.etke;
import defpackage.fiwj;
import defpackage.fjul;
import defpackage.fqqr;
import defpackage.fqrh;
import defpackage.fuuq;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.ivf;
import defpackage.joo;
import defpackage.kyw;
import defpackage.qet;
import defpackage.syp;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OctarineWebviewChimeraActivity extends qet implements csmb, csxb, csok, cspe, csrb, csrr, csso {
    public static final arxo j = new arxo("Octarine", "OctarineWebViewActivity");
    public boolean A;
    public boolean B;
    String C;
    Bundle D;
    public String E;
    public String F;
    public boolean G;
    public int H;
    public int I;
    public csrs J;
    public csrc K;
    public cspf L;
    public cspn M;
    csnt N;
    cspz O;
    public csyx P;
    csxc Q;
    public int R;
    public boolean S;
    public String T;
    public csua U;
    public Bundle V;
    public Bundle W;
    public bqna Z;
    public cssz aa;
    public ctaz ab;
    public csqi ac;
    private cslz ad;
    public cszd k;
    public dwbk l;
    public dwbk m;
    public CookieManager n;
    InputMethodManager o;
    public ctab p;
    public ensv q;
    SwipeRefreshLayout r;
    View s;
    public cszx t;
    public View u;
    public ctak v;
    public boolean w;
    public ctal x;
    Bundle y;
    boolean z;
    public final cszq X = new cszq();
    private boolean ae = false;
    public final HashSet Y = new HashSet();

    public static final int J(String str, boolean z) {
        if (z) {
            return ctan.a(Uri.parse(str)) ? 2 : 3;
        }
        return 1;
    }

    private final bqna K() {
        if (!fqrh.d() && this.Z == null) {
            this.Z = bqna.b(this);
        }
        return this.Z;
    }

    private final etke L() {
        etke b = etke.b(getIntent().getIntExtra("extra.themeChoice", 0));
        return b == null ? etke.THEME_CHOICE_UNSPECIFIED : b;
    }

    private final void M() {
        cszd cszdVar;
        if (this.p == null || (cszdVar = this.k) == null || cszdVar.a() == null || !fjul.d()) {
            return;
        }
        Intent intent = getIntent();
        long longExtra = eihn.a(intent.getStringExtra("extra.accountName"), q()) ? intent.getLongExtra("extra.prewarmTimestamp", 0L) : 0L;
        this.p.d(intent.getIntExtra("extra.asResourceId", 0), intent.getBooleanExtra("extra.asIsDeepLink", false), longExtra != 0 ? Long.valueOf(longExtra) : null, this.X.a);
    }

    private final void N(Intent intent) {
        if (intent == null || eihn.a(this.k.f(), intent.getStringExtra("authAccount")) || !bmar.e(K(), intent.getStringExtra("authAccount"))) {
            return;
        }
        this.B = true;
        this.u.setImportantForAccessibility(2);
        String stringExtra = intent.getStringExtra("authAccount");
        eiig.x(stringExtra);
        this.k.l(new Account(stringExtra, "com.google"));
        this.t.d();
        B(new Runnable() { // from class: csxr
            @Override // java.lang.Runnable
            public final void run() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = OctarineWebviewChimeraActivity.this;
                octarineWebviewChimeraActivity.ab.e(octarineWebviewChimeraActivity.F);
                octarineWebviewChimeraActivity.A = true;
            }
        });
    }

    public final void A(final String str) {
        y();
        if (this.n.hasCookies()) {
            z();
            return;
        }
        dfaq p = p(o(), this.E);
        p.u(getContainerActivity(), new dfak() { // from class: csxk
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                OctarineWebviewChimeraActivity.this.z();
            }
        });
        p.r(getContainerActivity(), new dfah() { // from class: csxl
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                OctarineWebviewChimeraActivity.this.D(str);
            }
        });
    }

    final void B(final Runnable runnable) {
        y();
        dfaq p = p(o(), this.E);
        p.u(getContainerActivity(), new dfak() { // from class: csxd
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                OctarineWebviewChimeraActivity.this.x();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        p.r(getContainerActivity(), new dfah() { // from class: csxo
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                OctarineWebviewChimeraActivity.j.g("Webview initialization failed.", exc, "");
                OctarineWebviewChimeraActivity.this.I(3);
            }
        });
    }

    public final void C(String str, boolean z) {
        if (!z) {
            this.r.setEnabled(false);
            this.Y.add(str);
            return;
        }
        HashSet hashSet = this.Y;
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.r.setEnabled(true);
        }
    }

    public final void D(final String str) {
        ctba ctbaVar;
        this.u.setVisibility(8);
        this.w = true;
        if (!eihn.a(this.ab.b(), "about:blank")) {
            this.ab.e("about:blank");
        }
        if (F()) {
            ctba ctbaVar2 = (ctba) getSupportFragmentManager().h("error_tag");
            String c = asqx.c(ctbaVar2 != null ? ctbaVar2.a.getText().toString() : null);
            if (!asqx.d(c) && !c.equals(str) && (ctbaVar = (ctba) getSupportFragmentManager().h("error_tag")) != null) {
                ctbaVar.y(str);
            }
        } else {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(R.id.octarine_webview_container, ctba.x(str), "error_tag");
            bpVar.b();
        }
        this.v.b(R.string.octarine_snackbar_error_setting_loading, R.string.common_try_again, new View.OnClickListener() { // from class: csxm
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
        if (this.ab.b() != null) {
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
        cszq cszqVar = this.X;
        cszqVar.d();
        Intent putExtra = new Intent().putExtra("extra.errorCode", i - 1).putExtra("extra.latencyMetrics", cszqVar.a.r());
        M();
        setResult(0, putExtra);
        finish();
    }

    @Override // defpackage.csmb
    public final cslz a() {
        return this.ad;
    }

    @Override // defpackage.csmb
    public final void b(cslz cslzVar) {
        this.ad = cslzVar;
    }

    @Override // defpackage.csok, defpackage.csso
    public final void c() {
        cszq cszqVar = this.X;
        cszqVar.d();
        Intent intent = new Intent();
        Bundle bundle = this.D;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("authAccount", q()).putExtra("extra.latencyMetrics", cszqVar.a.r());
        String a = this.U.a();
        if (a != null) {
            intent.putExtra("extra.consistencyToken", a);
        }
        M();
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.csok
    public final void d(final String str) {
        this.q.execute(new Runnable() { // from class: csxn
            @Override // java.lang.Runnable
            public final void run() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = OctarineWebviewChimeraActivity.this;
                String str2 = str;
                try {
                    Context applicationContext = octarineWebviewChimeraActivity.getApplicationContext();
                    String q = octarineWebviewChimeraActivity.q();
                    String str3 = uny.a;
                    if (str2.equals(uoh.e(applicationContext, q))) {
                        return;
                    }
                    octarineWebviewChimeraActivity.s();
                } catch (IOException | unx unused) {
                    octarineWebviewChimeraActivity.s();
                }
            }
        });
    }

    @Override // defpackage.cspe
    public final void e(bbyj bbyjVar, int i) {
        this.R = i;
        bbyjVar.b(getContainerActivity());
    }

    @Override // defpackage.csrb
    public final void f(int i) {
        this.I = i;
        startActivityForResult(new Intent("com.google.android.gms.settings.VERIFY_APPS_SETTINGS").setPackage("com.google.android.gms"), 3);
    }

    @Override // defpackage.csrr
    public final void g(int i) {
        this.H = i;
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyActivity");
        intent.putExtra("extra_from_intent", "from_security_advisor");
        startActivityForResult(intent, 2);
    }

    @Override // defpackage.csso
    public final void h() {
        int i = -(true == eihn.a(this.ab.b(), "about:blank") ? 2 : 1);
        if (!this.ab.a.canGoBackOrForward(i)) {
            c();
        } else {
            this.w = false;
            this.ab.a.goBackOrForward(i);
        }
    }

    @Override // defpackage.csso
    public final void i() {
        View currentFocus = getWindow().getCurrentFocus();
        if (currentFocus != null) {
            this.o.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // defpackage.csso
    public final void j(etgi etgiVar) {
        w(etgiVar);
    }

    @Override // defpackage.csso
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

    @Override // defpackage.csxb, defpackage.csso
    public final void l(String str) {
        t(str, J(str, G(str)));
    }

    @Override // defpackage.csso
    public final void m() {
        this.ab.c();
    }

    @Override // defpackage.csso
    public final void n(Map map) {
        this.D = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = this.D;
            if (bundle != null) {
                String valueOf = String.valueOf((String) entry.getKey());
                bundle.putString("result.".concat(valueOf), (String) entry.getValue());
            }
        }
    }

    final Account o() {
        Account a = this.k.a();
        eiig.x(a);
        return a;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.z = true;
            if (i2 == -1) {
                N(intent);
                return;
            }
            return;
        }
        if (i == 2) {
            int i4 = this.H;
            if (i4 >= 0) {
                csrs csrsVar = this.J;
                if (csrsVar.b) {
                    csrsVar.e(i4);
                    return;
                }
                return;
            }
            i = 2;
        }
        if (i == 3) {
            int i5 = this.I;
            if (i5 >= 0) {
                csrc csrcVar = this.K;
                if (csrcVar.a) {
                    csrcVar.e(i5);
                    return;
                }
                return;
            }
            i = 3;
        }
        if (i == 5 && (i3 = this.R) >= 0) {
            if (this.L.a) {
                this.L.f(cspf.e(i2, intent, i3));
            }
        } else if (i == 10 && i2 == -1) {
            N(intent);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        h();
    }

    @Override // defpackage.qet, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.P.c();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int i;
        ModuleManager moduleManager;
        final OctarineWebviewChimeraActivity octarineWebviewChimeraActivity = this;
        if (fqrh.d()) {
            new bqnc(octarineWebviewChimeraActivity, R.style.ActionBarAppThemeLight, R.style.ActionBarAppThemeDark, octarineWebviewChimeraActivity.L());
        }
        super.onCreate(bundle);
        if (fqrh.g()) {
            Intent intent = new Intent();
            intent.setClassName(octarineWebviewChimeraActivity, "com.google.android.gms.octarine.ui.OctarineActivity");
            intent.putExtras(octarineWebviewChimeraActivity.getIntent());
            intent.addFlags(33554432);
            octarineWebviewChimeraActivity.startActivity(intent);
            octarineWebviewChimeraActivity.finish();
            return;
        }
        int i2 = csvc.a;
        eijr eijrVar = bqqe.a;
        bqqa bqqaVar = new bqqa();
        if (fqrh.d() && !csvc.a(octarineWebviewChimeraActivity.getIntent(), bqqaVar)) {
            octarineWebviewChimeraActivity.setResult(0, new Intent().putExtra("extra.errorCode", 1));
            octarineWebviewChimeraActivity.finish();
            return;
        }
        ctbb ctbbVar = new ctbb();
        if (fqrh.d()) {
            aour a = ((cslw) csma.a(cslw.class, octarineWebviewChimeraActivity, cszh.a(bundle, "activityScope"))).d().a(null, joo.a(this), this, this, cszh.a(bundle, "activeAccountScope"), ctbbVar, this, this, this, this, this);
            octarineWebviewChimeraActivity = this;
            Object cast = csyd.class.cast(a);
            if (cast == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((csyd) ((cslx) cast)).c(octarineWebviewChimeraActivity);
        }
        if (bundle != null) {
            octarineWebviewChimeraActivity.X.f(bundle);
        }
        octarineWebviewChimeraActivity.X.e();
        if (!fqrh.d()) {
            new bqnc(octarineWebviewChimeraActivity, R.style.ActionBarAppThemeLight, R.style.ActionBarAppThemeDark, octarineWebviewChimeraActivity.L());
        }
        if (fjul.g()) {
            octarineWebviewChimeraActivity.getContainerActivity();
            int i3 = eble.a;
        }
        octarineWebviewChimeraActivity.getWindow().setStatusBarColor(0);
        if (!fqrh.d() && bundle == null && !csvc.a(octarineWebviewChimeraActivity.getIntent(), bqqaVar)) {
            octarineWebviewChimeraActivity.I(2);
            return;
        }
        if (fqrh.e() && asqh.f()) {
            Window window = octarineWebviewChimeraActivity.getWindow();
            ivf.a(window, false);
            window.setNavigationBarColor(0);
            View decorView = window.getDecorView();
            itj itjVar = new itj() { // from class: csxw
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    arxo arxoVar = OctarineWebviewChimeraActivity.j;
                    view.setPadding(0, iwdVar.f(1).c, 0, iwdVar.f(64).e);
                    return iwdVar;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(decorView, itjVar);
        }
        octarineWebviewChimeraActivity.setTitle("");
        octarineWebviewChimeraActivity.setContentView(true != fjul.i() ? R.layout.octarine_webview1 : R.layout.octarine_webview);
        eshc b = eshc.b(octarineWebviewChimeraActivity.getIntent().getIntExtra("extra.initialTitleType", 1));
        if (b == null) {
            b = eshc.NORMAL;
        }
        eshc eshcVar = b;
        esfx b2 = esfx.b(octarineWebviewChimeraActivity.getIntent().getIntExtra("extra.initialAccountDisplay", 1));
        if (b2 == null) {
            b2 = esfx.HIDE;
        }
        if (!fqrh.d()) {
            octarineWebviewChimeraActivity.k = new cszd(duju.a(), new syp(), new asmf(Integer.MAX_VALUE, 9));
        }
        csya csyaVar = new csya(octarineWebviewChimeraActivity);
        cszd cszdVar = octarineWebviewChimeraActivity.k;
        csyx csyxVar = new csyx(octarineWebviewChimeraActivity, null, (ViewGroup) octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_frame), octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_swipe_refresh_layout), eshcVar, b2, cszdVar, cszdVar, duju.a(), csyaVar, new View.OnClickListener() { // from class: csxx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                if (octarineWebviewChimeraActivity2.P.k == eshd.GO_BACK_OR_CLOSE) {
                    octarineWebviewChimeraActivity2.h();
                } else {
                    octarineWebviewChimeraActivity2.c();
                }
            }
        }, new MenuItem.OnMenuItemClickListener() { // from class: csxe
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                String str = octarineWebviewChimeraActivity2.P.n;
                if (asqx.d(str)) {
                    OctarineWebviewChimeraActivity.j.d("Attempting to launch GoogleHelp with empty help context and URL.", new Object[0]);
                } else {
                    fecj v = etgi.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    etgi etgiVar = (etgi) v.b;
                    str.getClass();
                    etgiVar.b |= 1;
                    etgiVar.c = str;
                    octarineWebviewChimeraActivity2.w((etgi) v.Q());
                }
                return true;
            }
        }, new csyw() { // from class: csxf
            @Override // defpackage.csyw
            public final Drawable a(etgk etgkVar) {
                return sid.c(OctarineWebviewChimeraActivity.this, etgkVar);
            }
        });
        octarineWebviewChimeraActivity.P = csyxVar;
        ctbbVar.a = csyxVar;
        octarineWebviewChimeraActivity.w = false;
        octarineWebviewChimeraActivity.r = (SwipeRefreshLayout) octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_swipe_refresh_layout);
        octarineWebviewChimeraActivity.s = octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_progress);
        View findViewById = octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_frame);
        bqnj.h(octarineWebviewChimeraActivity.r, R.attr.actionBarBackground);
        if (fqrh.d()) {
            i = Integer.MAX_VALUE;
        } else {
            i = Integer.MAX_VALUE;
            octarineWebviewChimeraActivity.q = new asmf(Integer.MAX_VALUE, 9);
        }
        octarineWebviewChimeraActivity.v = new ctak(octarineWebviewChimeraActivity, findViewById);
        octarineWebviewChimeraActivity.o = (InputMethodManager) octarineWebviewChimeraActivity.getSystemService("input_method");
        if (fqrh.d()) {
            moduleManager = null;
        } else {
            octarineWebviewChimeraActivity.n = CookieManager.getInstance();
            octarineWebviewChimeraActivity.t = cszx.a();
            octarineWebviewChimeraActivity.T = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.callingPackageName");
            octarineWebviewChimeraActivity.S = octarineWebviewChimeraActivity.getIntent().getBooleanExtra("extra.disableClearcut", false);
            ModuleManager moduleManager2 = ModuleManager.get(octarineWebviewChimeraActivity);
            octarineWebviewChimeraActivity.x = new ctal(moduleManager2, octarineWebviewChimeraActivity.T);
            octarineWebviewChimeraActivity.U = new csua(octarineWebviewChimeraActivity.n);
            moduleManager = moduleManager2;
        }
        octarineWebviewChimeraActivity.H = -1;
        octarineWebviewChimeraActivity.I = -1;
        octarineWebviewChimeraActivity.R = -1;
        if (!fqrh.d()) {
            octarineWebviewChimeraActivity.l = new ctao(Pattern.compile(asqx.c(fqqr.i())), Pattern.compile(asqx.c(fqqr.h())));
            octarineWebviewChimeraActivity.m = new ctao(Pattern.compile(asqx.c(fqqr.f())), Pattern.compile(asqx.c(fqqr.e())));
            WebView fiwjVar = fjul.i() ? new fiwj(octarineWebviewChimeraActivity) : new ctau(octarineWebviewChimeraActivity);
            if (octarineWebviewChimeraActivity.u == null) {
                octarineWebviewChimeraActivity.u = fiwjVar;
            }
            if (octarineWebviewChimeraActivity.ab == null) {
                octarineWebviewChimeraActivity.ab = new ctaz(fiwjVar);
            }
        }
        final FrameLayout frameLayout = (FrameLayout) octarineWebviewChimeraActivity.findViewById(R.id.octarine_webview_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        octarineWebviewChimeraActivity.u.setLayoutParams(layoutParams);
        octarineWebviewChimeraActivity.u.setFilterTouchesWhenObscured(true);
        frameLayout.addView(octarineWebviewChimeraActivity.u, 0);
        if (fjul.i() || fjul.f()) {
            int b3 = eblf.b(octarineWebviewChimeraActivity.u, R.attr.colorSurfaceContainer);
            findViewById.setBackgroundColor(b3);
            octarineWebviewChimeraActivity.u.setBackgroundColor(b3);
            if (fjul.i()) {
                cszk.a(octarineWebviewChimeraActivity.u);
                octarineWebviewChimeraActivity.P.y = new csyv() { // from class: csxg
                    @Override // defpackage.csyv
                    public final void a(float f) {
                        frameLayout.setBackgroundColor(eblf.b(OctarineWebviewChimeraActivity.this.u, f < 0.666f ? R.attr.colorSurfaceContainerHigh : R.attr.colorSurfaceContainer));
                    }
                };
            }
        } else {
            octarineWebviewChimeraActivity.u.setBackgroundColor(bqnj.a(octarineWebviewChimeraActivity, R.attr.actionBarBackground, R.color.google_white));
        }
        if (octarineWebviewChimeraActivity.getIntent().hasExtra("extra.consistencyToken")) {
            octarineWebviewChimeraActivity.C = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.consistencyToken");
        }
        csxy csxyVar = new csxy(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.l);
        csxyVar.i(dwbd.a);
        octarineWebviewChimeraActivity.ab.k(csxyVar);
        WebSettings a2 = octarineWebviewChimeraActivity.ab.a();
        a2.setUserAgentString(octarineWebviewChimeraActivity.ab.a().getUserAgentString() + " " + octarineWebviewChimeraActivity.x.a());
        a2.setJavaScriptEnabled(true);
        a2.setSupportMultipleWindows(true);
        csxc csxcVar = new csxc(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ab);
        octarineWebviewChimeraActivity.Q = csxcVar;
        octarineWebviewChimeraActivity.ab.j(csxcVar);
        View view = octarineWebviewChimeraActivity.u;
        if (view instanceof ctau) {
            ((ctau) view).a = new ctax() { // from class: csxt
                @Override // defpackage.ctax
                public final void a(boolean z) {
                    OctarineWebviewChimeraActivity.this.C("over_scroll", z);
                }
            };
        }
        octarineWebviewChimeraActivity.r.a = new kyw() { // from class: csxu
            @Override // defpackage.kyw
            public final void a() {
                OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                octarineWebviewChimeraActivity2.A(octarineWebviewChimeraActivity2.getString(R.string.common_something_went_wrong));
            }
        };
        octarineWebviewChimeraActivity.P.o(new csyz() { // from class: csxv
            @Override // defpackage.csyz
            public final void a(boolean z) {
                OctarineWebviewChimeraActivity.this.C("app_bar_config", z);
            }
        });
        csyx csyxVar2 = octarineWebviewChimeraActivity.P;
        csyxVar2.w = new csyc(octarineWebviewChimeraActivity);
        csyxVar2.c();
        findViewById.setSystemUiVisibility(1280);
        octarineWebviewChimeraActivity.u.setOnTouchListener(new View.OnTouchListener() { // from class: csxh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return OctarineWebviewChimeraActivity.this.B;
            }
        });
        if (!fjul.i()) {
            octarineWebviewChimeraActivity.u.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: csxi
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                    octarineWebviewChimeraActivity2.P.l(octarineWebviewChimeraActivity2.u.getScrollY() > 0);
                }
            });
            octarineWebviewChimeraActivity.u.postDelayed(new Runnable() { // from class: csxj
                @Override // java.lang.Runnable
                public final void run() {
                    OctarineWebviewChimeraActivity octarineWebviewChimeraActivity2 = OctarineWebviewChimeraActivity.this;
                    if (fjul.f()) {
                        octarineWebviewChimeraActivity2.P.l(octarineWebviewChimeraActivity2.u.getScrollY() > 0);
                    } else {
                        octarineWebviewChimeraActivity2.P.m(octarineWebviewChimeraActivity2.u.getScrollY() > 0, true);
                    }
                }
            }, 100L);
        }
        if (bundle == null || bundle.isEmpty()) {
            cszd cszdVar2 = octarineWebviewChimeraActivity.k;
            String stringExtra = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.accountName");
            eiig.x(stringExtra);
            cszdVar2.l(new Account(stringExtra, "com.google"));
            if (!fqrh.d()) {
                octarineWebviewChimeraActivity.p = ctaa.a(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.k, octarineWebviewChimeraActivity.T, octarineWebviewChimeraActivity.S);
            }
            String stringExtra2 = octarineWebviewChimeraActivity.getIntent().getStringExtra("extra.url");
            eiig.x(stringExtra2);
            octarineWebviewChimeraActivity.F = stringExtra2;
            octarineWebviewChimeraActivity.P.f(null);
            octarineWebviewChimeraActivity.G = true;
        } else {
            Account account = (Account) bundle.getParcelable("account");
            eiig.x(account);
            octarineWebviewChimeraActivity.k.l(account);
            if (!fqrh.d()) {
                octarineWebviewChimeraActivity.p = ctaa.a(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.k, octarineWebviewChimeraActivity.T, octarineWebviewChimeraActivity.S);
            }
            String string = bundle.getString("currentUrl");
            eiig.x(string);
            octarineWebviewChimeraActivity.F = string;
            octarineWebviewChimeraActivity.G = bundle.getBoolean("webviewStillBlank");
            octarineWebviewChimeraActivity.y = bundle.getBundle("webviewState");
            Bundle bundle2 = bundle.getBundle("appBar");
            eiig.x(bundle2);
            if (bundle2.getInt("accountDisplay") == 3 && !octarineWebviewChimeraActivity.getIntent().getBooleanExtra("allowAccountSwitching", false)) {
                bundle2.putInt("accountDisplay", 2);
            }
            octarineWebviewChimeraActivity.P.f(bundle2);
        }
        new csxz(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.K()).d(octarineWebviewChimeraActivity);
        octarineWebviewChimeraActivity.E = octarineWebviewChimeraActivity.F;
        if (!fqrh.d()) {
            octarineWebviewChimeraActivity.N = new csnt(ctbbVar);
            ctaz ctazVar = octarineWebviewChimeraActivity.ab;
            cstb cstbVar = new cstb();
            AuthSmsCodeReceiver authSmsCodeReceiver = new AuthSmsCodeReceiver(octarineWebviewChimeraActivity.ab);
            final TelephonyManager telephonyManager = (TelephonyManager) octarineWebviewChimeraActivity.getSystemService("phone");
            octarineWebviewChimeraActivity.aa = new cssz(octarineWebviewChimeraActivity, this, ctazVar, cstbVar, authSmsCodeReceiver, new fuuq() { // from class: cssw
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    int i4 = cssz.f;
                    return telephonyManager;
                }
            });
            octarineWebviewChimeraActivity.K = new csrc(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ab, new fuuq() { // from class: csqx
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    aqxd aqxdVar = cxyl.a;
                    return new aqxo(qfp.this, (boolean[]) null);
                }
            });
            ctaz ctazVar2 = octarineWebviewChimeraActivity.ab;
            aqxd aqxdVar = dglc.a;
            final aqxo aqxoVar = new aqxo(octarineWebviewChimeraActivity, (boolean[][]) null);
            octarineWebviewChimeraActivity.J = new csrs(octarineWebviewChimeraActivity, this, ctazVar2, new fuuq() { // from class: csrp
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    return aqxo.this;
                }
            }, new fuuq() { // from class: csro
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    return (KeyguardManager) qfp.this.getSystemService("keyguard");
                }
            });
            octarineWebviewChimeraActivity.L = new cspf(octarineWebviewChimeraActivity, new fuuq() { // from class: cspc
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    Activity containerActivity = com.google.android.chimera.android.Activity.this.getContainerActivity();
                    aqxd aqxdVar2 = baqr.a;
                    return new bbpw(containerActivity);
                }
            }, octarineWebviewChimeraActivity.ab);
            csqn csqnVar = new csqn(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ab, octarineWebviewChimeraActivity.getApplicationContext(), this, octarineWebviewChimeraActivity.k);
            csqs csqsVar = new csqs(octarineWebviewChimeraActivity, octarineWebviewChimeraActivity.ab, new csqr(octarineWebviewChimeraActivity.getApplicationContext()));
            eius eiusVar = new eius();
            eiusVar.c(octarineWebviewChimeraActivity.N);
            eiusVar.c(octarineWebviewChimeraActivity.J);
            eiusVar.c(octarineWebviewChimeraActivity.K);
            eiusVar.c(octarineWebviewChimeraActivity.L);
            eiusVar.c(csqnVar);
            eiusVar.c(csqsVar);
            eiusVar.c(new cssp(octarineWebviewChimeraActivity));
            final Context applicationContext = octarineWebviewChimeraActivity.getApplicationContext();
            eiusVar.c(new csol(applicationContext, octarineWebviewChimeraActivity.k, null, bqna.b(applicationContext), this, new asmf(i, 9), new fuuq() { // from class: csoc
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    arxo arxoVar = csol.a;
                    return new vay(applicationContext);
                }
            }));
            eiig.x(moduleManager);
            eiusVar.c(new csoa(moduleManager));
            eiusVar.c(this.aa);
            ctaz ctazVar3 = this.ab;
            cszd cszdVar3 = this.k;
            Context applicationContext2 = getApplicationContext();
            aqxd aqxdVar2 = cale.a;
            final aqxo aqxoVar2 = new aqxo((Context) this, (char[][][]) null);
            eiusVar.c(new cssd(applicationContext2, this, this, ctazVar3, cszdVar3, null, new fuuq() { // from class: csru
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    arxo arxoVar = cssd.a;
                    return aqxo.this;
                }
            }, new csms() { // from class: csrz
                @Override // defpackage.csms
                public final void a(dgvl dgvlVar) {
                    arxo arxoVar = cssd.a;
                    aqxd aqxdVar3 = dgvm.a;
                    new aqxo(this, dgvlVar);
                }
            }, cszp.a(getApplicationContext())));
            eiusVar.c(new csna(this));
            eiusVar.c(new csnc(this));
            eiusVar.c(new csny(getPackageManager(), aqup.d(this), this.ab));
            eiusVar.c(new csqe(this, new abbh() { // from class: csqc
                @Override // defpackage.abbh
                public final aqxo a(String str) {
                    arxo arxoVar = csqe.a;
                    abbl abblVar = new abbl();
                    abblVar.a = str;
                    abblVar.f = 4;
                    abbm a3 = abblVar.a();
                    Context a4 = AppContextProvider.a();
                    aqxd aqxdVar3 = abbk.a;
                    return new aqxo(a4, a3);
                }
            }));
            ctaz ctazVar4 = this.ab;
            Context applicationContext3 = getApplicationContext();
            Activity containerActivity = getContainerActivity();
            aqxd aqxdVar3 = baqr.a;
            final bcpl bcplVar = new bcpl(this);
            this.M = new cspn(applicationContext3, containerActivity, ctazVar4, new fuuq() { // from class: csph
                @Override // defpackage.fuuq, defpackage.fuup
                public final Object a() {
                    arxo arxoVar = cspn.a;
                    return bcpl.this;
                }
            });
            csox csoxVar = new csox(new csow(getApplicationContext().getContentResolver()), this.ab, this, this.q);
            eiusVar.c(this.M);
            eiusVar.c(csoxVar);
            cspz cspzVar = new cspz(this.ab, this, this, this.k, this.p, new cspy(this, new cszm(this, new ctag(this, new dnlj())), this.q));
            octarineWebviewChimeraActivity = this;
            octarineWebviewChimeraActivity.O = cspzVar;
            eiusVar.c(cspzVar);
            octarineWebviewChimeraActivity.ac = new csqi(eiusVar.g(), octarineWebviewChimeraActivity.ab, octarineWebviewChimeraActivity);
        }
        octarineWebviewChimeraActivity.r(octarineWebviewChimeraActivity.E);
        octarineWebviewChimeraActivity.ae = true;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        if (this.ae) {
            this.M.j();
            duju.a().e(this.k);
            if (fqrh.d()) {
                return;
            }
            this.aa.stopListeningForSmsCodes();
            this.ac.b();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        super.onPause();
        this.M.e();
        this.t.e(o());
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        this.w = false;
        if (this.z) {
            this.z = false;
            Bundle bundle = this.y;
            if (bundle != null) {
                E();
                this.ab.h(bundle);
                this.y = null;
            } else {
                this.ab.f();
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
        this.M.f();
        this.P.s();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (fqrh.d()) {
            bundle.putBundle("activityScope", this.V);
            bundle.putBundle("activeAccountScope", this.W);
        }
        bundle.putParcelable("account", o());
        bundle.putString("currentUrl", this.E);
        bundle.putBoolean("webviewStillBlank", this.G);
        Bundle bundle2 = new Bundle();
        this.ab.i(bundle2);
        bundle.putBundle("webviewState", bundle2);
        bundle.putBundle("appBar", this.P.a());
        this.X.g(bundle);
    }

    final dfaq p(Account account, String str) {
        dfaq b = this.t.b(account, str);
        b.y(new dfah() { // from class: csxq
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                OctarineWebviewChimeraActivity.j.g("Failed to set user auth cookies.", exc, "");
                OctarineWebviewChimeraActivity.this.p.a();
            }
        });
        return b;
    }

    public final String q() {
        String f = this.k.f();
        eiig.x(f);
        return f;
    }

    public final void r(String str) {
        this.ac.a(str);
    }

    public final void s() {
        this.t.d();
        runOnUiThread(new Runnable() { // from class: csxp
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
        int ordinal = this.P.l.ordinal();
        esfx esfxVar = ordinal != 2 ? ordinal != 3 ? esfx.HIDE : esfx.SHOW_AND_ALLOW_SWITCHING : esfx.SHOW_ONLY;
        Intent putExtra = cslv.b(str, q()).putExtra("extra.initialTitleType", this.P.b().e).putExtra("extra.initialAccountDisplay", esfxVar.e).putExtra("extra.callingPackageName", this.T).putExtra("extra.disableClearcut", this.S);
        putExtra.putExtra("extra.themeChoice", L().d);
        if (esfxVar == esfx.SHOW_AND_ALLOW_SWITCHING) {
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
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", bqnj.a(this, R.attr.actionBarLegacyFillSecondary200, R.color.google_grey200));
        } catch (Resources.NotFoundException unused) {
        }
        bundle.putString("com.android.browser.application_id", getPackageName());
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (!parse.isOpaque() && parse.getQueryParameter("hl") == null) {
            buildUpon.appendQueryParameter("hl", cszr.a().toLanguageTag());
        }
        String c = asqx.c(fqqr.d());
        if (Patterns.WEB_URL.matcher(c).matches() && this.m.c(parse)) {
            buildUpon = Uri.parse(c).buildUpon().appendQueryParameter("hl", cszr.a().toLanguageTag()).appendQueryParameter("Email", q()).appendQueryParameter("continue", buildUpon.build().toString());
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", buildUpon.build()).putExtras(bundle));
        } catch (ActivityNotFoundException unused2) {
            this.v.b(R.string.common_no_browser_found, android.R.string.cancel, new View.OnClickListener() { // from class: csxs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    arxo arxoVar = OctarineWebviewChimeraActivity.j;
                }
            });
        }
    }

    public final void w(etgi etgiVar) {
        bqng.a(this, etgiVar, this.k.f());
    }

    public final void x() {
        Bundle bundle = this.y;
        if (bundle != null) {
            this.ab.h(bundle);
            this.y = null;
        } else if (this.ab.b() != null) {
            u();
        } else {
            if (G(this.E)) {
                this.ab.e(this.E);
                return;
            }
            this.p.e();
            v(this.E);
            c();
        }
    }

    final void y() {
        if (this.C == null || this.U.a() != null) {
            return;
        }
        csua csuaVar = this.U;
        String str = this.C;
        eiig.x(str);
        csuaVar.a.setCookie("https://google.com", a.a(str, "CONSISTENCY=", "; Max-Age=300; secure"));
    }

    public final void z() {
        this.w = false;
        if (F()) {
            this.ab.d();
        } else {
            this.ab.f();
        }
    }
}
