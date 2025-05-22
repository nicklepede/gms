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
import defpackage.aurp;
import defpackage.auub;
import defpackage.bohn;
import defpackage.bsup;
import defpackage.bsur;
import defpackage.bsvi;
import defpackage.bzlv;
import defpackage.dg;
import defpackage.dqnk;
import defpackage.eeho;
import defpackage.eelx;
import defpackage.evad;
import defpackage.evae;
import defpackage.evai;
import defpackage.evaj;
import defpackage.evau;
import defpackage.evby;
import defpackage.evbz;
import defpackage.evxu;
import defpackage.evxw;
import defpackage.evzw;
import defpackage.fgrc;
import defpackage.fgre;
import defpackage.fgri;
import defpackage.fmkf;
import defpackage.fmkm;
import defpackage.fxxm;
import defpackage.iwv;
import defpackage.jvs;
import defpackage.rxx;
import defpackage.tkt;
import defpackage.uky;
import defpackage.ukz;
import defpackage.ulr;
import defpackage.uoq;
import defpackage.usq;
import defpackage.usr;
import defpackage.utb;
import defpackage.uto;
import defpackage.utr;
import defpackage.utt;
import defpackage.uuu;
import defpackage.uuv;
import defpackage.uvg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MainChimeraActivity extends rxx {
    public static final evxw j;
    public uoq k;
    public uvg l;
    public evxw m;
    public dqnk n;
    public bzlv o;
    public uuv p;
    bsup q;
    private boolean r;
    private bohn s;

    static {
        evxu evxuVar = (evxu) evxw.a.v();
        if (!evxuVar.b.L()) {
            evxuVar.U();
        }
        evxw evxwVar = (evxw) evxuVar.b;
        evxwVar.b |= 1;
        evxwVar.c = 0;
        j = (evxw) evxuVar.Q();
    }

    public final uky a() {
        return (ukz.b(this, "splashScreen") || ukz.b(this, "onboarding")) ? uky.CROSS_FADE : uky.INSTANT;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eelx a;
        if (fmkm.n() && motionEvent.getAction() == 0) {
            uvg uvgVar = this.l;
            if (!fmkm.n() || (a = uvgVar.a()) == null || !a.l() || uvgVar.d == null || uvgVar.c + 4000 > SystemClock.elapsedRealtime()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            eelx a2 = this.l.a();
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

    public final void k(dg dgVar, String str, uky ukyVar) {
        ukz.c(this, getSupportFragmentManager(), dgVar, str, ukyVar);
    }

    public final void l(utb utbVar) {
        if (uto.c(utbVar) && fmkm.a.lK().d()) {
            final uuv uuvVar = this.p;
            final String str = utbVar.b;
            fxxm.f(str, "accountName");
            uuu uuuVar = uuvVar.d;
            if (uuuVar != null && fxxm.n(str, uuuVar.a)) {
                aurp aurpVar = uuvVar.c;
                if (System.currentTimeMillis() - uuuVar.b < fmkf.a.lK().e()) {
                    return;
                }
            }
            aurp aurpVar2 = uuvVar.c;
            uuvVar.d = new uuu(str, System.currentTimeMillis());
            fxxm.e(uuvVar.b.submit(new Runnable() { // from class: uut
                @Override // java.lang.Runnable
                public final void run() {
                    Intent putExtra = new Intent("com.google.android.gms.octarine.action.WARMUP").putExtra("extra.accountName", str);
                    Context context = uuv.this.a;
                    uuh.b(putExtra, context);
                    WebSettings.getDefaultUserAgent(context);
                }
            }), "submit(...)");
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((usr) tkt.a(usr.class, this)).d(this);
        eeho.a = true;
        evzw b = evzw.b(getIntent().getIntExtra("extra.themeChoice", 0));
        if (b == null) {
            b = evzw.THEME_CHOICE_UNSPECIFIED;
        }
        new bsur(this, R.style.AsAppThemeLight, R.style.AsAppThemeDark, b);
        this.r = bsur.d();
        getWindow().setSoftInputMode(32);
        setTitle(getString(R.string.common_asm_google_account_title));
        if (fmkf.l()) {
            setContentView(R.layout.as_main_debug_activity);
        } else {
            setContentView(R.layout.as_main_activity);
        }
        this.k.a.b.g(this, new jvs() { // from class: usn
            @Override // defpackage.jvs
            public final void a(Object obj) {
                utb utbVar = (utb) obj;
                if (uto.c(utbVar)) {
                    MainChimeraActivity mainChimeraActivity = MainChimeraActivity.this;
                    if (ekus.a(bzlw.c(mainChimeraActivity.o, "google.account_settings.selected_account", null), utbVar.b)) {
                        return;
                    }
                    bzlt c = mainChimeraActivity.o.c();
                    c.h("google.account_settings.selected_account", utbVar.b);
                    bzlw.f(c);
                    mainChimeraActivity.l(utbVar);
                }
            }
        });
        if (fmkm.n()) {
            bsvi.b(this.k.e, this, new jvs() { // from class: uso
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    urd urdVar = (urd) obj;
                    if (fmkm.n()) {
                        MainChimeraActivity mainChimeraActivity = MainChimeraActivity.this;
                        if (urdVar instanceof urc) {
                            urc urcVar = (urc) urdVar;
                            mainChimeraActivity.l.d(mainChimeraActivity.findViewById(R.id.fragment_container), urcVar.a, urcVar.b, urcVar.c);
                        } else if (urdVar instanceof urb) {
                            mainChimeraActivity.l.b();
                        }
                    }
                }
            });
        }
        if (bundle == null) {
            int a = evai.a(getIntent().getIntExtra("extra.launchApi", 0));
            utt a2 = utr.a(getApplicationContext(), this.k.a());
            int i = this.m.c;
            String str = this.n.a;
            Intent intent = getIntent();
            fgrc v = evau.a.v();
            String stringExtra = intent.getStringExtra("extra.utmCampaign");
            if (stringExtra != null) {
                if (!v.b.L()) {
                    v.U();
                }
                evau evauVar = (evau) v.b;
                evauVar.b |= 4;
                evauVar.e = stringExtra;
            }
            String stringExtra2 = intent.getStringExtra("extra.utmMedium");
            if (stringExtra2 != null) {
                if (!v.b.L()) {
                    v.U();
                }
                evau evauVar2 = (evau) v.b;
                evauVar2.b |= 2;
                evauVar2.d = stringExtra2;
            }
            String stringExtra3 = intent.getStringExtra("extra.utmSource");
            if (stringExtra3 != null) {
                if (!v.b.L()) {
                    v.U();
                }
                evau evauVar3 = (evau) v.b;
                evauVar3.b |= 1;
                evauVar3.c = stringExtra3;
            }
            if ("com.google.android.gms.accountsettings.MY_ACCOUNT".equals(intent.getAction())) {
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                evau evauVar4 = (evau) fgriVar;
                evauVar4.b |= 1;
                evauVar4.c = "android-settings";
                if (!fgriVar.L()) {
                    v.U();
                }
                evau evauVar5 = (evau) v.b;
                evauVar5.b |= 2;
                evauVar5.d = "account";
            }
            int i2 = ((evau) v.b).b;
            evau evauVar6 = ((i2 & 4) == 0 && (i2 & 2) == 0 && (i2 & 1) == 0) ? null : (evau) v.Q();
            fgrc v2 = evaj.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            evaj evajVar = (evaj) fgriVar2;
            evajVar.b |= 2;
            evajVar.d = i;
            if (!fgriVar2.L()) {
                v2.U();
            }
            fgri fgriVar3 = v2.b;
            evaj evajVar2 = (evaj) fgriVar3;
            evajVar2.b |= 1;
            evajVar2.c = str;
            if (a != 0) {
                if (!fgriVar3.L()) {
                    v2.U();
                }
                evaj evajVar3 = (evaj) v2.b;
                evajVar3.e = a - 1;
                evajVar3.b |= 16;
            }
            if (evauVar6 != null) {
                if (!v2.b.L()) {
                    v2.U();
                }
                evaj evajVar4 = (evaj) v2.b;
                evajVar4.f = evauVar6;
                evajVar4.b = 32 | evajVar4.b;
            }
            fgrc v3 = evbz.a.v();
            fgre fgreVar = (fgre) evby.a.v();
            evad a3 = a2.a();
            if (!fgreVar.b.L()) {
                fgreVar.U();
            }
            evby evbyVar = (evby) fgreVar.b;
            a3.getClass();
            evbyVar.i = a3;
            evbyVar.b |= 128;
            fgrc v4 = evae.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            evae evaeVar = (evae) v4.b;
            evaj evajVar5 = (evaj) v2.Q();
            evajVar5.getClass();
            evaeVar.c = evajVar5;
            evaeVar.b |= 1;
            if (!fgreVar.b.L()) {
                fgreVar.U();
            }
            evby evbyVar2 = (evby) fgreVar.b;
            evae evaeVar2 = (evae) v4.Q();
            evaeVar2.getClass();
            evbyVar2.k = evaeVar2;
            evbyVar2.b |= 4096;
            if (!v3.b.L()) {
                v3.U();
            }
            evbz evbzVar = (evbz) v3.b;
            evby evbyVar3 = (evby) fgreVar.Q();
            evbyVar3.getClass();
            evbzVar.c = evbyVar3;
            evbzVar.b = 1 | evbzVar.b;
            a2.e(i, (evbz) v3.Q());
        }
        if (auub.f()) {
            Window window = getWindow();
            iwv.a(window, false);
            window.setNavigationBarColor(0);
            window.setNavigationBarDividerColor(getResources().getColor(R.color.navbar_divider, getTheme()));
        }
        this.k.a.j();
        uoq uoqVar = this.k;
        ulr ulrVar = uoqVar.a;
        ulrVar.h();
        ulrVar.g(uoqVar.g.b());
        this.k.c.g(this, new jvs() { // from class: usp
            @Override // defpackage.jvs
            public final void a(Object obj) {
                evxw evxwVar;
                MainChimeraActivity mainChimeraActivity = MainChimeraActivity.this;
                uop uopVar = (uop) obj;
                if (ukz.b(mainChimeraActivity, "navigation")) {
                    return;
                }
                if (uopVar == uop.PENDING) {
                    dg h = mainChimeraActivity.getSupportFragmentManager().h("onboarding");
                    if (h != null) {
                        bp bpVar = new bp(mainChimeraActivity.getSupportFragmentManager());
                        bpVar.m(h);
                        bpVar.d();
                        return;
                    }
                    return;
                }
                if (uopVar == uop.SPLASH && !ukz.b(mainChimeraActivity, "splashScreen")) {
                    mainChimeraActivity.k(new ukf(), "splashScreen", uky.FADE_IN);
                    return;
                }
                if (uopVar == uop.ONBOARDING && !ukz.b(mainChimeraActivity, "onboarding")) {
                    if (mainChimeraActivity.getResources().getConfiguration().orientation != 1) {
                        mainChimeraActivity.k(uie.x(MainChimeraActivity.j), "navigation", mainChimeraActivity.a());
                        return;
                    } else {
                        mainChimeraActivity.setRequestedOrientation(1);
                        mainChimeraActivity.k(new uip(), "onboarding", uky.CROSS_FADE);
                        return;
                    }
                }
                if (uopVar == uop.NAVIGATION) {
                    if (ukz.b(mainChimeraActivity, "onboarding")) {
                        tnl tnlVar = (tnl) mainChimeraActivity.k.b.b.ii();
                        evxwVar = tnlVar != null ? tnm.b(tnlVar.a()) : null;
                        if (evxwVar == null) {
                            evxu evxuVar = (evxu) evxw.a.v();
                            if (!evxuVar.b.L()) {
                                evxuVar.U();
                            }
                            evxw evxwVar2 = (evxw) evxuVar.b;
                            evxwVar2.b |= 1;
                            evxwVar2.c = 0;
                            evxwVar = (evxw) evxuVar.Q();
                        }
                    } else {
                        evxwVar = MainChimeraActivity.j;
                    }
                    mainChimeraActivity.setRequestedOrientation(-1);
                    mainChimeraActivity.k(uie.x(evxwVar), "navigation", mainChimeraActivity.a());
                }
            }
        });
        if (this.q == null) {
            this.q = bsup.b(this);
        }
        usq usqVar = new usq(this, this.q);
        this.s = usqVar;
        usqVar.d(this);
        l(this.k.a());
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("wasDarkThemeEnabled", this.r);
    }
}
