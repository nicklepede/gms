package com.google.android.gms.accountsettings.mg.ui.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity;
import defpackage.asnv;
import defpackage.asqh;
import defpackage.bmav;
import defpackage.bqna;
import defpackage.bqnc;
import defpackage.bqns;
import defpackage.bxdf;
import defpackage.dg;
import defpackage.dodb;
import defpackage.eble;
import defpackage.ebuz;
import defpackage.ebzi;
import defpackage.eskq;
import defpackage.eskr;
import defpackage.eskv;
import defpackage.eskw;
import defpackage.eslh;
import defpackage.esml;
import defpackage.esmm;
import defpackage.etic;
import defpackage.etie;
import defpackage.etke;
import defpackage.fecj;
import defpackage.fecl;
import defpackage.fecp;
import defpackage.fjue;
import defpackage.fjul;
import defpackage.fvbo;
import defpackage.ivf;
import defpackage.jpd;
import defpackage.qet;
import defpackage.rrk;
import defpackage.rsv;
import defpackage.spx;
import defpackage.spy;
import defpackage.sqq;
import defpackage.sss;
import defpackage.sws;
import defpackage.swt;
import defpackage.sxd;
import defpackage.sxq;
import defpackage.sxt;
import defpackage.sxv;
import defpackage.syw;
import defpackage.syx;
import defpackage.szi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class MainChimeraActivity extends qet {
    public static final etie j;
    public sss k;
    public szi l;
    public etie m;
    public dodb n;
    public bxdf o;
    public syx p;
    bqna q;
    private boolean r;
    private bmav s;

    static {
        etic eticVar = (etic) etie.a.v();
        if (!eticVar.b.L()) {
            eticVar.U();
        }
        etie etieVar = (etie) eticVar.b;
        etieVar.b |= 1;
        etieVar.c = 0;
        j = (etie) eticVar.Q();
    }

    public final spx a() {
        return (spy.b(this, "splashScreen") || spy.b(this, "onboarding")) ? spx.CROSS_FADE : spx.INSTANT;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ebzi a;
        if (fjul.o() && motionEvent.getAction() == 0) {
            szi sziVar = this.l;
            if (!fjul.o() || (a = sziVar.a()) == null || !a.l() || sziVar.d == null || sziVar.c + 4000 > SystemClock.elapsedRealtime()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            ebzi a2 = this.l.a();
            if (a2 != null) {
                Rect rect = new Rect();
                a2.j.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    this.l.b();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k(dg dgVar, String str, spx spxVar) {
        spy.c(this, getSupportFragmentManager(), dgVar, str, spxVar);
    }

    public final void l(sxd sxdVar) {
        if (sxq.c(sxdVar) && fjul.a.a().e()) {
            final syx syxVar = this.p;
            final String str = sxdVar.b;
            fvbo.f(str, "accountName");
            syw sywVar = syxVar.d;
            if (sywVar != null && fvbo.n(str, sywVar.a)) {
                asnv asnvVar = syxVar.c;
                if (System.currentTimeMillis() - sywVar.b < fjue.a.a().e()) {
                    return;
                }
            }
            asnv asnvVar2 = syxVar.c;
            syxVar.d = new syw(str, System.currentTimeMillis());
            fvbo.e(syxVar.b.submit(new Runnable() { // from class: syv
                @Override // java.lang.Runnable
                public final void run() {
                    Intent putExtra = new Intent("com.google.android.gms.octarine.action.WARMUP").putExtra("extra.accountName", str);
                    Context context = syx.this.a;
                    syj.b(putExtra, context);
                    WebSettings.getDefaultUserAgent(context);
                }
            }), "submit(...)");
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((swt) rrk.a(swt.class, this)).d(this);
        ebuz.a = true;
        etke b = etke.b(getIntent().getIntExtra("extra.themeChoice", 0));
        if (b == null) {
            b = etke.THEME_CHOICE_UNSPECIFIED;
        }
        new bqnc(this, R.style.AsAppThemeLight, R.style.AsAppThemeDark, b);
        if (rsv.a) {
            getContainerActivity();
            int i = eble.a;
        }
        this.r = bqnc.d();
        getWindow().setSoftInputMode(32);
        setTitle(getString(R.string.common_asm_google_account_title));
        if (fjue.k()) {
            setContentView(R.layout.as_main_debug_activity);
        } else {
            setContentView(R.layout.as_main_activity);
        }
        this.k.a.b.g(this, new jpd() { // from class: swp
            @Override // defpackage.jpd
            public final void a(Object obj) {
                sxd sxdVar = (sxd) obj;
                if (sxq.c(sxdVar)) {
                    MainChimeraActivity mainChimeraActivity = MainChimeraActivity.this;
                    if (eihn.a(bxdg.c(mainChimeraActivity.o, "google.account_settings.selected_account", null), sxdVar.b)) {
                        return;
                    }
                    bxdd c = mainChimeraActivity.o.c();
                    c.h("google.account_settings.selected_account", sxdVar.b);
                    bxdg.f(c);
                    mainChimeraActivity.l(sxdVar);
                }
            }
        });
        if (fjul.o()) {
            bqns.b(this.k.e, this, new jpd() { // from class: swq
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    svf svfVar = (svf) obj;
                    if (fjul.o()) {
                        MainChimeraActivity mainChimeraActivity = MainChimeraActivity.this;
                        if (svfVar instanceof sve) {
                            sve sveVar = (sve) svfVar;
                            mainChimeraActivity.l.d(mainChimeraActivity.findViewById(R.id.fragment_container), sveVar.a, sveVar.b, sveVar.c);
                        } else if (svfVar instanceof svd) {
                            mainChimeraActivity.l.b();
                        }
                    }
                }
            });
        }
        if (bundle == null) {
            int a = eskv.a(getIntent().getIntExtra("extra.launchApi", 0));
            sxv a2 = sxt.a(getApplicationContext(), this.k.a());
            int i2 = this.m.c;
            String str = this.n.a;
            Intent intent = getIntent();
            fecj v = eslh.a.v();
            String stringExtra = intent.getStringExtra("extra.utmCampaign");
            if (stringExtra != null) {
                if (!v.b.L()) {
                    v.U();
                }
                eslh eslhVar = (eslh) v.b;
                eslhVar.b |= 4;
                eslhVar.e = stringExtra;
            }
            String stringExtra2 = intent.getStringExtra("extra.utmMedium");
            if (stringExtra2 != null) {
                if (!v.b.L()) {
                    v.U();
                }
                eslh eslhVar2 = (eslh) v.b;
                eslhVar2.b |= 2;
                eslhVar2.d = stringExtra2;
            }
            String stringExtra3 = intent.getStringExtra("extra.utmSource");
            if (stringExtra3 != null) {
                if (!v.b.L()) {
                    v.U();
                }
                eslh eslhVar3 = (eslh) v.b;
                eslhVar3.b |= 1;
                eslhVar3.c = stringExtra3;
            }
            if ("com.google.android.gms.accountsettings.MY_ACCOUNT".equals(intent.getAction())) {
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                eslh eslhVar4 = (eslh) fecpVar;
                eslhVar4.b |= 1;
                eslhVar4.c = "android-settings";
                if (!fecpVar.L()) {
                    v.U();
                }
                eslh eslhVar5 = (eslh) v.b;
                eslhVar5.b |= 2;
                eslhVar5.d = "account";
            }
            int i3 = ((eslh) v.b).b;
            eslh eslhVar6 = ((i3 & 4) == 0 && (i3 & 2) == 0 && (i3 & 1) == 0) ? null : (eslh) v.Q();
            fecj v2 = eskw.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            eskw eskwVar = (eskw) fecpVar2;
            eskwVar.b |= 2;
            eskwVar.d = i2;
            if (!fecpVar2.L()) {
                v2.U();
            }
            fecp fecpVar3 = v2.b;
            eskw eskwVar2 = (eskw) fecpVar3;
            eskwVar2.b |= 1;
            eskwVar2.c = str;
            if (a != 0) {
                if (!fecpVar3.L()) {
                    v2.U();
                }
                eskw eskwVar3 = (eskw) v2.b;
                eskwVar3.e = a - 1;
                eskwVar3.b |= 16;
            }
            if (eslhVar6 != null) {
                if (!v2.b.L()) {
                    v2.U();
                }
                eskw eskwVar4 = (eskw) v2.b;
                eskwVar4.f = eslhVar6;
                eskwVar4.b = 32 | eskwVar4.b;
            }
            fecj v3 = esmm.a.v();
            fecl feclVar = (fecl) esml.a.v();
            eskq a3 = a2.a();
            if (!feclVar.b.L()) {
                feclVar.U();
            }
            esml esmlVar = (esml) feclVar.b;
            a3.getClass();
            esmlVar.i = a3;
            esmlVar.b |= 128;
            fecj v4 = eskr.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            eskr eskrVar = (eskr) v4.b;
            eskw eskwVar5 = (eskw) v2.Q();
            eskwVar5.getClass();
            eskrVar.c = eskwVar5;
            eskrVar.b |= 1;
            if (!feclVar.b.L()) {
                feclVar.U();
            }
            esml esmlVar2 = (esml) feclVar.b;
            eskr eskrVar2 = (eskr) v4.Q();
            eskrVar2.getClass();
            esmlVar2.k = eskrVar2;
            esmlVar2.b |= 4096;
            if (!v3.b.L()) {
                v3.U();
            }
            esmm esmmVar = (esmm) v3.b;
            esml esmlVar3 = (esml) feclVar.Q();
            esmlVar3.getClass();
            esmmVar.c = esmlVar3;
            esmmVar.b = 1 | esmmVar.b;
            a2.e(i2, (esmm) v3.Q());
        }
        if (asqh.f()) {
            Window window = getWindow();
            ivf.a(window, false);
            window.setNavigationBarColor(0);
            window.setNavigationBarDividerColor(getResources().getColor(R.color.navbar_divider, getTheme()));
        }
        this.k.a.j();
        sss sssVar = this.k;
        sqq sqqVar = sssVar.a;
        sqqVar.h();
        sqqVar.g(sssVar.g.b());
        this.k.c.g(this, new jpd() { // from class: swr
            @Override // defpackage.jpd
            public final void a(Object obj) {
                etie etieVar;
                MainChimeraActivity mainChimeraActivity = MainChimeraActivity.this;
                ssr ssrVar = (ssr) obj;
                if (spy.b(mainChimeraActivity, "navigation")) {
                    return;
                }
                if (ssrVar == ssr.PENDING) {
                    dg h = mainChimeraActivity.getSupportFragmentManager().h("onboarding");
                    if (h != null) {
                        bp bpVar = new bp(mainChimeraActivity.getSupportFragmentManager());
                        bpVar.n(h);
                        bpVar.d();
                        return;
                    }
                    return;
                }
                if (ssrVar == ssr.SPLASH && !spy.b(mainChimeraActivity, "splashScreen")) {
                    mainChimeraActivity.k(new spd(), "splashScreen", spx.FADE_IN);
                    return;
                }
                if (ssrVar == ssr.ONBOARDING && !spy.b(mainChimeraActivity, "onboarding")) {
                    if (mainChimeraActivity.getResources().getConfiguration().orientation != 1) {
                        mainChimeraActivity.k(snc.x(MainChimeraActivity.j), "navigation", mainChimeraActivity.a());
                        return;
                    } else {
                        mainChimeraActivity.setRequestedOrientation(1);
                        mainChimeraActivity.k(new snn(), "onboarding", spx.CROSS_FADE);
                        return;
                    }
                }
                if (ssrVar == ssr.NAVIGATION) {
                    if (spy.b(mainChimeraActivity, "onboarding")) {
                        ruc rucVar = (ruc) mainChimeraActivity.k.b.b.hT();
                        etieVar = rucVar != null ? rud.b(rucVar.a()) : null;
                        if (etieVar == null) {
                            etic eticVar = (etic) etie.a.v();
                            if (!eticVar.b.L()) {
                                eticVar.U();
                            }
                            etie etieVar2 = (etie) eticVar.b;
                            etieVar2.b |= 1;
                            etieVar2.c = 0;
                            etieVar = (etie) eticVar.Q();
                        }
                    } else {
                        etieVar = MainChimeraActivity.j;
                    }
                    mainChimeraActivity.setRequestedOrientation(-1);
                    mainChimeraActivity.k(snc.x(etieVar), "navigation", mainChimeraActivity.a());
                }
            }
        });
        if (this.q == null) {
            this.q = bqna.b(this);
        }
        sws swsVar = new sws(this, this.q);
        this.s = swsVar;
        swsVar.d(this);
        l(this.k.a());
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("wasDarkThemeEnabled", this.r);
    }
}
