package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.WebView;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.gms.googlehelp.fragments.AccountPickerContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auid;
import defpackage.auio;
import defpackage.aupz;
import defpackage.aura;
import defpackage.aurt;
import defpackage.ausn;
import defpackage.auts;
import defpackage.auub;
import defpackage.bcld;
import defpackage.bctg;
import defpackage.bcth;
import defpackage.bkty;
import defpackage.bkua;
import defpackage.bkuc;
import defpackage.bkud;
import defpackage.bkuf;
import defpackage.bkug;
import defpackage.bkum;
import defpackage.bkup;
import defpackage.bkuq;
import defpackage.bkur;
import defpackage.bkus;
import defpackage.bkvb;
import defpackage.bkvc;
import defpackage.bkvd;
import defpackage.bkvf;
import defpackage.bkvh;
import defpackage.bkvi;
import defpackage.bkvj;
import defpackage.bkvq;
import defpackage.bkwf;
import defpackage.bkwg;
import defpackage.bkwh;
import defpackage.bkwk;
import defpackage.bkwq;
import defpackage.bkzw;
import defpackage.bkzy;
import defpackage.bkzz;
import defpackage.blag;
import defpackage.blah;
import defpackage.blaq;
import defpackage.blau;
import defpackage.blaz;
import defpackage.blbf;
import defpackage.blbm;
import defpackage.blbq;
import defpackage.blcx;
import defpackage.bldc;
import defpackage.bldd;
import defpackage.blde;
import defpackage.bldf;
import defpackage.bldg;
import defpackage.bldh;
import defpackage.bldi;
import defpackage.bldl;
import defpackage.bldm;
import defpackage.blfa;
import defpackage.blfl;
import defpackage.blfn;
import defpackage.blfz;
import defpackage.blhp;
import defpackage.blhq;
import defpackage.blhr;
import defpackage.blig;
import defpackage.blij;
import defpackage.blik;
import defpackage.blin;
import defpackage.bliv;
import defpackage.bljc;
import defpackage.bljj;
import defpackage.bljl;
import defpackage.bljo;
import defpackage.bljq;
import defpackage.blkf;
import defpackage.blkg;
import defpackage.blkh;
import defpackage.blki;
import defpackage.blkm;
import defpackage.blkn;
import defpackage.blku;
import defpackage.blkx;
import defpackage.bllc;
import defpackage.blmm;
import defpackage.blmq;
import defpackage.blmt;
import defpackage.blmv;
import defpackage.blmy;
import defpackage.bp;
import defpackage.bsl;
import defpackage.caqj;
import defpackage.czgg;
import defpackage.edtp;
import defpackage.edxt;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fhaz;
import defpackage.fhbb;
import defpackage.fhbc;
import defpackage.fhbd;
import defpackage.fhbf;
import defpackage.fjva;
import defpackage.fjvd;
import defpackage.fjvw;
import defpackage.frdz;
import defpackage.frff;
import defpackage.frfl;
import defpackage.frgm;
import defpackage.frgy;
import defpackage.frhq;
import defpackage.frhw;
import defpackage.friu;
import defpackage.frja;
import defpackage.frjd;
import defpackage.frjy;
import defpackage.frkb;
import defpackage.frke;
import defpackage.frkk;
import defpackage.frkq;
import defpackage.frkt;
import defpackage.frkw;
import defpackage.frll;
import defpackage.frlo;
import defpackage.frlu;
import defpackage.frma;
import defpackage.frmd;
import defpackage.frmj;
import defpackage.frmp;
import defpackage.frmv;
import defpackage.frne;
import defpackage.imz;
import defpackage.itr;
import defpackage.iwv;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class HelpChimeraActivity extends bldl implements bkud, bkwh, bkvc, blmv {
    private static int ab;
    public OpenSearchView L;
    public bljj M;
    public String O;
    public String P;
    public Integer Q;
    public WebView R;
    public WebView S;
    public blmm T;
    public View U;
    int V;
    private blau ad;
    private bkwg ae;
    private boolean al;
    private SparseArray am;
    private Deque an;
    public AppBarLayout q;
    public View r;
    public View s;
    public blaz t;
    public bljl u;
    blbf v;
    public bkty w;
    public bkzw x;
    public bkwf y;
    public bkuf z;
    public static final ausn j = ausn.b("gH_HelpActivity", auid.GOOGLE_HELP);
    public static final String k = "gH_HelpActivity-".concat(String.valueOf(blbf.class.getSimpleName()));
    public static final String l = "gH_HelpActivity-".concat(String.valueOf(blau.class.getSimpleName()));
    private static final Set aa = new bsl();
    ValueCallback m = null;
    public final eqgo n = new aupz(Integer.MAX_VALUE, 10);
    public final eqgo o = new aupz(Integer.MAX_VALUE, 9);
    public final bcth p = new bcth();
    private final Handler ac = new caqj(Looper.getMainLooper());
    private bkvf af = new bkvf();
    private final bkvf ag = new bkvf();
    public final bkvf A = new bkvf();
    private final bkvf ah = new bkvf();
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    private boolean ai = false;
    private boolean aj = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    private boolean ak = false;
    public boolean I = false;
    public boolean J = false;
    public Boolean K = null;
    public final List N = new ArrayList();

    public HelpChimeraActivity() {
        new bsl();
        this.V = 1;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
    }

    public static final boolean aq() {
        return bkzz.a(frfl.a.lK().r());
    }

    private final void ar(String str) {
        ((eluo) j.i()).B("%s", str);
        setResult(0);
        finish();
    }

    private final void as(String str, boolean z) {
        HelpConfig helpConfig;
        String str2;
        t(true);
        bljj bljjVar = this.M;
        if (bljjVar != null) {
            bljjVar.f();
        }
        if (ai() && z && !TextUtils.isEmpty(this.W.k())) {
            this.p.c();
            HelpConfig helpConfig2 = this.W;
            if (helpConfig2 != null && !TextUtils.isEmpty(helpConfig2.k())) {
                try {
                    str2 = (String) bllc.b(this).get();
                } catch (InterruptedException | ExecutionException e) {
                    ((eluo) ((eluo) blki.e.i()).s(e)).x("unable to get js fingerprint");
                    str2 = "";
                }
                String format = String.format(frdz.y(), frdz.z(), this.W.k(), Uri.encode(str));
                bkvi bkviVar = new bkvi();
                bkviVar.g = format;
                bkviVar.u = str2;
                bkviVar.z = 2;
                bkviVar.q = false;
                bkvj a = bkviVar.a();
                bcth bcthVar = new bcth();
                bcthVar.c();
                new blki(this, a, bkvd.h(1, -1, "", -1.0f, 1, 1, bcthVar, 3), ag(), false, true, Calendar.getInstance(), true, false).executeOnExecutor(this.o, new Void[0]);
            }
        } else {
            new blig(this, new bldh(this), str).executeOnExecutor(this.o, new Void[0]);
        }
        if (bkzz.a(frll.a.lK().b())) {
            blfz.v(this, 131, 1);
            blfl.z(this, this.W, 84, 1);
        }
        blfa.a(this, auio.GOOGLEHELP_SEARCH_SEARCH_QUERY_SUBMITTED);
        int i = blku.e;
        if (!bkzz.a(frll.c()) || (helpConfig = this.W) == null || helpConfig.d == null) {
            return;
        }
        fgrc i2 = blku.i(11);
        fgrc v = fhbc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fhbc fhbcVar = (fhbc) v.b;
        str.getClass();
        fhbcVar.b |= 1;
        fhbcVar.c = str;
        if (!i2.b.L()) {
            i2.U();
        }
        fhaz fhazVar = (fhaz) i2.b;
        fhbc fhbcVar2 = (fhbc) v.Q();
        fhaz fhazVar2 = fhaz.a;
        fhbcVar2.getClass();
        fhazVar.d = fhbcVar2;
        fhazVar.c = 3;
        new blku((fhaz) i2.Q(), this).executeOnExecutor(this.n, new Void[0]);
    }

    private final void at() {
        this.ak = true;
        Intent intent = getIntent();
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.removeExtra("EXTRA_GOOGLE_HELP");
        }
        this.W.O(null);
        intent.putExtra("EXTRA_HELP_CONFIG", this.W);
        intent.putExtra("EXTRA_START_TICK", System.nanoTime());
        intent.addFlags(67108864);
        startActivity(intent);
    }

    private final void au(final Runnable runnable) {
        if (this.ai) {
            runnable.run();
        } else {
            this.ag.addObserver(new Observer() { // from class: blch
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    ausn ausnVar = HelpChimeraActivity.j;
                    runnable.run();
                }
            });
        }
    }

    private final void av(final Runnable runnable) {
        if (this.aj) {
            runnable.run();
        } else {
            this.ah.addObserver(new Observer() { // from class: blcq
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    ausn ausnVar = HelpChimeraActivity.j;
                    runnable.run();
                }
            });
        }
    }

    private final void aw(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(frdz.w() + str));
            intent.addFlags(268435456);
            intent.addFlags(32768);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(frdz.a.lK().W().concat(String.valueOf(str))));
            try {
                startActivity(intent2);
            } catch (ActivityNotFoundException e) {
                ((eluo) ((eluo) j.j()).s(e)).x("Can't view GmsCore in Play Store");
            }
        }
    }

    private final boolean ax() {
        String str = this.W.b;
        frgm frgmVar = frgm.a;
        return bkzz.c(str, frgmVar.lK().c(), frgmVar.lK().b(), frgmVar.lK().a());
    }

    public static blhr n(HelpChimeraActivity helpChimeraActivity) {
        fgrc v = blhr.a.v();
        int i = helpChimeraActivity.o().e;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        blhr blhrVar = (blhr) fgriVar;
        blhrVar.b |= 2097152;
        blhrVar.q = i;
        if (!fgriVar.L()) {
            v.U();
        }
        blhr blhrVar2 = (blhr) v.b;
        blhrVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        blhrVar2.n = -1;
        if (blhrVar2.q != 2 || helpChimeraActivity.l() == null) {
            return (blhr) v.Q();
        }
        bkvd l2 = helpChimeraActivity.l();
        int i2 = l2.b;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        blhr blhrVar3 = (blhr) fgriVar2;
        blhrVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        blhrVar3.n = i2;
        String str = l2.c;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        blhr blhrVar4 = (blhr) fgriVar3;
        str.getClass();
        blhrVar4.b |= 4096;
        blhrVar4.l = str;
        bkvj bkvjVar = l2.a;
        if (bkvjVar != null) {
            if (!fgriVar3.L()) {
                v.U();
            }
            blhr blhrVar5 = (blhr) v.b;
            String str2 = bkvjVar.g;
            str2.getClass();
            blhrVar5.b |= 8192;
            blhrVar5.m = str2;
        }
        return (blhr) v.Q();
    }

    public final void A() {
        new blkh(this).executeOnExecutor(this.o, new Void[0]);
    }

    public final void B() {
        eqgo eqgoVar = this.o;
        eqgoVar.execute(new blkx(this, eqgoVar));
    }

    final void C() {
        this.S.setVisibility(8);
        if (this.U == null) {
            this.U = ((ViewStub) findViewById(R.id.gh_request_error_stub)).inflate();
        }
        this.U.setVisibility(0);
        bkwk.b(this.U, R.string.common_something_went_wrong, new View.OnClickListener() { // from class: blcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpChimeraActivity.this.A();
            }
        });
        w();
        P(false);
    }

    public final void D() {
        MaterialToolbar materialToolbar;
        this.x = new bkzw(this);
        if (bkzz.a(frlo.c())) {
            aszs aszsVar = czgg.a;
            atad atadVar = new atad((Context) this, (short[]) null);
            int i = blkm.e;
            if (!this.W.v()) {
                new blkm(this, atadVar).executeOnExecutor(this.n, new Void[0]);
            }
        }
        bkvh c = GoogleHelpChimeraService.c(this.W);
        if (c == null || c.c) {
            if (!ah() && !am()) {
                if (bkzz.a(frjd.a.lK().a())) {
                    HelpConfig helpConfig = this.W;
                    blin.a(helpConfig.aj, this.o, this, helpConfig, this.x, this.X);
                } else {
                    blin.a(null, this.o, this, this.W, this.x, this.X);
                }
            }
            if (!aq() || !this.F) {
                bkwq.a(this.o, new bldc(this), this.W, this.X);
            }
            GoogleHelpChimeraService.i(this.W, true);
        }
        if (bkzz.a(frkq.c()) && !ah() && !am()) {
            eqgo eqgoVar = this.o;
            new bkua(this, eqgoVar).executeOnExecutor(eqgoVar, new Void[0]);
        }
        blah.c(this, this.W, R.style.gh_NoActionBarLightActivityStyleMaterial3, R.style.gh_NoActionBarDarkActivityStyleMaterial3, R.style.gh_NoActionBarDayNightActivityStyleMaterial3);
        HelpConfig helpConfig2 = this.W;
        if (helpConfig2.P) {
            ThemeSettings themeSettings = helpConfig2.z;
            int i2 = edxt.a;
        }
        HelpConfig helpConfig3 = this.W;
        blfn blfnVar = this.X;
        ausn ausnVar = blfz.a;
        ThemeSettings themeSettings2 = helpConfig3.z;
        int i3 = 194;
        if (themeSettings2 != null) {
            int i4 = themeSettings2.a;
            if (i4 == 0 || i4 == 1) {
                i3 = 193;
            } else if (i4 == 2) {
                i3 = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            }
        }
        blhr blhrVar = blhr.a;
        fgrc v = blhrVar.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        blhr blhrVar2 = (blhr) fgriVar;
        blhrVar2.i = 182;
        blhrVar2.b |= 256;
        if (!fgriVar.L()) {
            v.U();
        }
        blhr blhrVar3 = (blhr) v.b;
        blhrVar3.j = i3 - 1;
        blhrVar3.b |= 1024;
        aurt aurtVar = aurt.a;
        blfz.J(this, helpConfig3, blfnVar, v);
        HelpConfig helpConfig4 = this.W;
        ausn ausnVar2 = blfl.a;
        if (bkzz.b(frgy.d())) {
            ThemeSettings themeSettings3 = helpConfig4.z;
            int i5 = 30;
            if (themeSettings3 != null) {
                int i6 = themeSettings3.a;
                if (i6 == 0 || i6 == 1) {
                    i5 = 29;
                } else if (i6 == 2) {
                    i5 = 28;
                }
            }
            fgrc v2 = blhp.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            blhp blhpVar = (blhp) fgriVar2;
            blhpVar.c = 53;
            blhpVar.b |= 1;
            if (!fgriVar2.L()) {
                v2.U();
            }
            blhp blhpVar2 = (blhp) v2.b;
            blhpVar2.d = i5 - 1;
            blhpVar2.b |= 2;
            blhp blhpVar3 = (blhp) v2.Q();
            fgrc v3 = blhq.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            blhq blhqVar = (blhq) v3.b;
            blhpVar3.getClass();
            blhqVar.d = blhpVar3;
            blhqVar.c = 3;
            blfl.J(this, helpConfig4, v3);
        }
        HelpConfig helpConfig5 = this.W;
        blfn blfnVar2 = this.X;
        int i7 = true != bkwk.e(this) ? 193 : AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
        fgrc v4 = blhrVar.v();
        if (!v4.b.L()) {
            v4.U();
        }
        fgri fgriVar3 = v4.b;
        blhr blhrVar4 = (blhr) fgriVar3;
        blhrVar4.i = 188;
        blhrVar4.b |= 256;
        if (!fgriVar3.L()) {
            v4.U();
        }
        blhr blhrVar5 = (blhr) v4.b;
        blhrVar5.j = i7 - 1;
        blhrVar5.b |= 1024;
        blfz.J(this, helpConfig5, blfnVar2, v4);
        HelpConfig helpConfig6 = this.W;
        boolean e = bkwk.e(this);
        if (bkzz.b(frgy.d())) {
            int i8 = true != e ? 29 : 28;
            fgrc v5 = blhp.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            fgri fgriVar4 = v5.b;
            blhp blhpVar4 = (blhp) fgriVar4;
            blhpVar4.c = 57;
            blhpVar4.b |= 1;
            if (!fgriVar4.L()) {
                v5.U();
            }
            blhp blhpVar5 = (blhp) v5.b;
            blhpVar5.d = i8 - 1;
            blhpVar5.b |= 2;
            blhp blhpVar6 = (blhp) v5.Q();
            fgrc v6 = blhq.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            blhq blhqVar2 = (blhq) v6.b;
            blhpVar6.getClass();
            blhqVar2.d = blhpVar6;
            blhqVar2.c = 3;
            blfl.J(this, helpConfig6, v6);
        }
        if (bkwk.d(this)) {
            HelpConfig helpConfig7 = this.W;
            blfn blfnVar3 = this.X;
            fgrc v7 = blhrVar.v();
            if (!v7.b.L()) {
                v7.U();
            }
            fgri fgriVar5 = v7.b;
            blhr blhrVar6 = (blhr) fgriVar5;
            blhrVar6.i = 188;
            blhrVar6.b |= 256;
            if (!fgriVar5.L()) {
                v7.U();
            }
            blhr blhrVar7 = (blhr) v7.b;
            blhrVar7.j = 215;
            blhrVar7.b |= 1024;
            blfz.J(this, helpConfig7, blfnVar3, v7);
            HelpConfig helpConfig8 = this.W;
            if (bkzz.b(frgy.d())) {
                fgrc v8 = blhp.a.v();
                if (!v8.b.L()) {
                    v8.U();
                }
                fgri fgriVar6 = v8.b;
                blhp blhpVar7 = (blhp) fgriVar6;
                blhpVar7.c = 57;
                blhpVar7.b |= 1;
                if (!fgriVar6.L()) {
                    v8.U();
                }
                blhp blhpVar8 = (blhp) v8.b;
                blhpVar8.d = 91;
                blhpVar8.b |= 2;
                blhp blhpVar9 = (blhp) v8.Q();
                fgrc v9 = blhq.a.v();
                if (!v9.b.L()) {
                    v9.U();
                }
                blhq blhqVar3 = (blhq) v9.b;
                blhpVar9.getClass();
                blhqVar3.d = blhpVar9;
                blhqVar3.c = 3;
                blfl.J(this, helpConfig8, v9);
            }
        }
        setContentView(am() ? R.layout.gh_help_main_activity_boq_wiz : ah() ? R.layout.gh_help_main_activity_rapi_based : R.layout.gh_help_main_activity_gm3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.gh_help_toolbar);
        Drawable b = blag.b(toolbar.f(), this, blah.a(this, R.attr.ghf_greyIconColor));
        ((eluo) j.h()).x("Overflow icon size adjustments are not required for non-automotive device types.");
        toolbar.x(b);
        hJ(toolbar);
        bkug.b(this, hO(), false);
        ew supportFragmentManager = getSupportFragmentManager();
        String str = l;
        blau blauVar = (blau) supportFragmentManager.h(str);
        this.ad = blauVar;
        if (blauVar == null) {
            bp bpVar = new bp(supportFragmentManager);
            blau blauVar2 = new blau();
            this.ad = blauVar2;
            bpVar.u(R.id.gh_help_section, blauVar2, str);
            bpVar.b();
        }
        if (!ah() && !am()) {
            this.t = new blaz(this);
        }
        if (!aq() || !this.F) {
            A();
        }
        if (am()) {
            z();
        }
        this.u = new bljl(this);
        this.y = new bljo(this, this.W.g());
        this.q = (AppBarLayout) findViewById(R.id.gh_help_app_bar);
        this.r = findViewById(R.id.gh_help_section);
        this.s = findViewById(R.id.gh_help_content);
        this.L = (OpenSearchView) findViewById(R.id.gh_open_search_view);
        this.ad.c = this.s;
        frlu frluVar = frlu.a;
        if (bkzz.a(frluVar.lK().c()) && (materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar)) != null) {
            materialToolbar.s(R.string.common_navigate_up);
        }
        if (bkzz.a(frluVar.lK().d())) {
            this.q.setTouchscreenBlocksFocus(false);
            ((Toolbar) findViewById(R.id.gh_help_toolbar)).setTouchscreenBlocksFocus(false);
            this.L.g.setTouchscreenBlocksFocus(false);
        }
        if (ah() || am()) {
            this.S = (WebView) findViewById(R.id.gh_home_screen_webview);
            if (am()) {
                WebView webView = this.S;
                WebSettings f = blmy.f(this, webView);
                f.setSupportZoom(false);
                f.setBuiltInZoomControls(false);
                webView.setOnLongClickListener(new blmt());
                if (bkzz.a(frmj.a.lK().a())) {
                    webView.setVerticalScrollBarEnabled(false);
                }
                this.S.setBackgroundColor(blah.a(this, R.attr.gh_boqWizHomepageSurfaceColor));
            } else {
                blmy.h(this, this.S);
                this.S.setBackgroundColor(blah.a(this, R.attr.ghf_surfaceColor));
            }
        }
        if (ai()) {
            WebView webView2 = (WebView) this.L.findViewById(R.id.gh_search_webview);
            this.R = webView2;
            blmy.h(this, webView2);
            this.R.setBackgroundColor(blah.a(this, R.attr.ghf_surfaceColor));
        }
        if (auub.g()) {
            iwv.a(getWindow(), false);
            this.q.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: blcl
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ausn ausnVar3 = HelpChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            this.s.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: blcm
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ausn ausnVar3 = HelpChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
            this.L.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: blcn
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ausn ausnVar3 = HelpChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
        }
        String F = frdz.a.lK().F();
        if (F.hashCode() != ab) {
            Set set = aa;
            set.clear();
            Collections.addAll(set, blag.y(F));
            ab = F.hashCode();
        }
        this.al = !aa.contains(this.W.b);
        ArrayDeque arrayDeque = new ArrayDeque();
        this.an = arrayDeque;
        arrayDeque.push(fjvd.HELP_CONSOLE);
        bkuf.c(this.o, this, this, this.W);
        HelpConfig helpConfig9 = this.W;
        helpConfig9.aa = bkuq.b(this, helpConfig9);
        HelpConfig helpConfig10 = this.W;
        if (!ah() && !am()) {
            if (bkzz.b(frkk.c()) || helpConfig10.E()) {
                ((ViewStub) findViewById(R.id.gh_below_recs_search_box_view_stub)).inflate();
                findViewById(R.id.gh_below_search_box_divider).setVisibility(0);
            } else {
                ((ViewStub) findViewById(R.id.gh_top_search_box_view_stub)).inflate();
            }
        }
        OpenSearchView openSearchView = this.L;
        if (auub.g()) {
            openSearchView.s = true;
            openSearchView.h(true);
        }
        this.L.g.w(new View.OnClickListener() { // from class: blcy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpChimeraActivity.this.onBackPressed();
                bkwk.c(view);
            }
        });
        final EditText editText = this.L.k;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: blcz
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                EditText editText2 = editText;
                String trim = editText2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                    editText2.clearFocus();
                    bkwk.c(editText2);
                    helpChimeraActivity.u.a();
                    helpChimeraActivity.findViewById(R.id.gh_open_search_view_progress_bar).setVisibility(0);
                    helpChimeraActivity.K(trim);
                    helpChimeraActivity.T(trim);
                }
                return false;
            }
        });
        editText.addTextChangedListener(new bldd(this, editText));
        bkzz.a(frma.c());
        if (ah() || am()) {
            return;
        }
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.gh_search_box);
        if (bkwk.d(this) || bkzz.a(frkk.d())) {
            materialCardView.d(0.0f);
        }
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: blda
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                helpChimeraActivity.J();
                if (bkzz.b(frgy.d())) {
                    ausn ausnVar3 = blfl.a;
                    fgrc v10 = blhq.a.v();
                    fgrc v11 = blhp.a.v();
                    if (!v11.b.L()) {
                        v11.U();
                    }
                    blhp blhpVar10 = (blhp) v11.b;
                    blhpVar10.c = 4;
                    blhpVar10.b |= 1;
                    if (!v10.b.L()) {
                        v10.U();
                    }
                    blhq blhqVar4 = (blhq) v10.b;
                    blhp blhpVar11 = (blhp) v11.Q();
                    blhpVar11.getClass();
                    blhqVar4.d = blhpVar11;
                    blhqVar4.c = 3;
                    blfl.J(helpChimeraActivity, helpChimeraActivity.ic(), v10);
                }
                ausn ausnVar4 = blfz.a;
                fgrc v12 = blhr.a.v();
                if (!v12.b.L()) {
                    v12.U();
                }
                blhr blhrVar8 = (blhr) v12.b;
                blhrVar8.i = 129;
                blhrVar8.b |= 256;
                blfz.E(helpChimeraActivity, v12, aurt.a);
            }
        });
        bkzz.a(frma.c());
        if (bkzz.b(frgy.d())) {
            fgrc v10 = blhq.a.v();
            fgrc v11 = blhp.a.v();
            if (!v11.b.L()) {
                v11.U();
            }
            blhp blhpVar10 = (blhp) v11.b;
            blhpVar10.c = 3;
            blhpVar10.b |= 1;
            if (!v10.b.L()) {
                v10.U();
            }
            blhq blhqVar4 = (blhq) v10.b;
            blhp blhpVar11 = (blhp) v11.Q();
            blhpVar11.getClass();
            blhqVar4.d = blhpVar11;
            blhqVar4.c = 3;
            blfl.J(this, ic(), v10);
        }
        fgrc v12 = blhrVar.v();
        if (!v12.b.L()) {
            v12.U();
        }
        blhr blhrVar8 = (blhr) v12.b;
        blhrVar8.i = 161;
        blhrVar8.b |= 256;
        blfz.E(this, v12, aurtVar);
    }

    public final void E() {
        String str;
        this.ai = true;
        this.ag.b();
        if (!ah() && !am()) {
            this.t.a().b();
        }
        if (this.C && this.W.u()) {
            R();
        } else if (am() && this.C) {
            av(new Runnable() { // from class: blct
                @Override // java.lang.Runnable
                public final void run() {
                    boolean a = bkzz.a(frmm.c());
                    HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                    if (a && helpChimeraActivity.J) {
                        return;
                    }
                    helpChimeraActivity.runOnUiThread(new blcx(helpChimeraActivity));
                }
            });
        }
        if (ai() || ah()) {
            B();
        }
        if (ah()) {
            String k2 = this.W.k();
            if (TextUtils.isEmpty(k2)) {
                C();
                return;
            }
            this.p.c();
            try {
                str = (String) bllc.b(this).get();
            } catch (InterruptedException | ExecutionException e) {
                ((eluo) ((eluo) blki.e.i()).s(e)).x("unable to get js fingerprint");
                str = "";
            }
            String format = String.format(frfl.a.lK().i(), frdz.z(), k2);
            bkvi bkviVar = new bkvi();
            bkviVar.g = format;
            bkviVar.u = str;
            bkviVar.z = 2;
            bkviVar.q = false;
            bkviVar.y = 31;
            bkvj a = bkviVar.a();
            bcth bcthVar = new bcth();
            bcthVar.c();
            new blki(this, a, bkvd.j(bcthVar), ag(), false, true, Calendar.getInstance(), false, true).executeOnExecutor(this.o, new Void[0]);
        }
    }

    public final void F() {
        Integer num = this.Q;
        ausn ausnVar = blfz.a;
        fgrc v = blhr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        blhr blhrVar = (blhr) v.b;
        blhrVar.i = 54;
        blhrVar.b |= 256;
        if (bkzz.a(frne.c()) && num != null) {
            int intValue = num.intValue();
            if (!v.b.L()) {
                v.U();
            }
            blhr blhrVar2 = (blhr) v.b;
            blhrVar2.c |= 8192;
            blhrVar2.K = intValue;
        }
        blfz.E(this, v, aurt.a);
        if (bkzz.a(frmd.c())) {
            blfl.l(this, this.Q);
        } else {
            blfl.l(this, null);
        }
        U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e9  */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(defpackage.bkvj r18, final defpackage.bkvd r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.G(bkvj, bkvd, boolean):void");
    }

    public final void H(String str, String str2) {
        this.O = str;
        this.P = str2;
        if (!aq() && this.E) {
            runOnUiThread(new blcx(this));
        } else {
            this.aj = true;
            this.ah.b();
        }
    }

    final void I(String str) {
        blmy.l(this, Uri.parse(str), this.W, this.X);
    }

    public final void J() {
        this.L.k.setText("");
        this.L.m();
    }

    public final void K(String str) {
        as(str, true);
    }

    public final void L(final boolean z, final boolean z2) {
        au(new Runnable() { // from class: blcg
            @Override // java.lang.Runnable
            public final void run() {
                HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                String f = GoogleHelpChimeraService.f(helpChimeraActivity.W);
                helpChimeraActivity.M(f, GoogleHelpChimeraService.d(f), z, z2);
            }
        });
    }

    public final void M(final String str, final bkvh bkvhVar, boolean z, boolean z2) {
        final boolean z3;
        final boolean z4;
        if (z && (bkvhVar == null || bkvhVar.d)) {
            k().executeOnExecutor(this.n, new Void[0]);
            z3 = false;
        } else {
            z3 = z;
        }
        if (z2 && (bkvhVar == null || bkvhVar.e)) {
            V(true);
            r(new blde(this, true));
            z4 = false;
        } else {
            z4 = z2;
        }
        if (z3 || z4) {
            this.B = true;
            Observer observer = new Observer() { // from class: blcj
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    HelpChimeraActivity.this.M(str, bkvhVar, z3, z4);
                }
            };
            bkvhVar.a();
            bkvhVar.f.addObserver(observer);
            return;
        }
        if (this.W.w) {
            return;
        }
        GoogleHelpChimeraService.h(str);
        this.B = false;
    }

    public final void N() {
        blhr n = n(this);
        bcth bcthVar = new bcth(this.W.ag);
        bcthVar.c();
        long a = bcthVar.a();
        blfz.u(this, true != this.W.ah ? 5 : 4, a, fjvd.b(n.q), n.l, n.m, n.n);
        blfl.w(this, true != this.W.ah ? 46 : 45, a, fjvd.b(n.q), n.l, n.m, n.n);
    }

    public final void O() {
        int i = this.W.l;
        if (i == 1) {
            ap(37, fjva.CHAT);
        } else if (i == 2) {
            ap(42, fjva.CHAT);
        }
    }

    public final void P(boolean z) {
        blfz.v(this, 217, z ? 21 : 22);
        blfl.z(this, this.W, 102, true != z ? 3 : 2);
    }

    public final void Q() {
        blhr n = n(this);
        bcth bcthVar = new bcth(this.W.ag);
        bcthVar.c();
        long a = bcthVar.a();
        blfz.u(this, true != this.W.ah ? 3 : 2, a, fjvd.b(n.q), n.l, n.m, n.n);
        blfl.w(this, true != this.W.ah ? 44 : 43, a, fjvd.b(n.q), n.l, n.m, n.n);
    }

    final void R() {
        String str;
        boolean ag = ag();
        ausn ausnVar = blki.e;
        HelpConfig helpConfig = this.W;
        if (helpConfig.u()) {
            fjvw fjvwVar = helpConfig.j.j;
            if (fjvwVar == null) {
                fjvwVar = fjvw.a;
            }
            if (fjvwVar.b.isEmpty()) {
                fjvw fjvwVar2 = helpConfig.j.j;
                if (fjvwVar2 == null) {
                    fjvwVar2 = fjvw.a;
                }
                str = fjvwVar2.c;
            } else {
                fjvw fjvwVar3 = helpConfig.j.j;
                String str2 = (fjvwVar3 == null ? fjvw.a : fjvwVar3).c;
                if (fjvwVar3 == null) {
                    fjvwVar3 = fjvw.a;
                }
                str = str2 + "#" + fjvwVar3.b;
            }
        } else {
            str = null;
        }
        if (str == null) {
            return;
        }
        bkvj j2 = bkvj.j(str, bkvq.a(), helpConfig);
        if (!helpConfig.y() || !TextUtils.equals(helpConfig.ac, j2.g)) {
            if (bkzz.b(frgy.d())) {
                blfl.s(this, 13, j2.g, "", -1);
            }
            blfz.s(this, 24, j2.g, -1, "", null);
        }
        boolean z = helpConfig.ah;
        new blki(this, j2, bkvd.g(24, 0, "", -1.0f, true, true != z ? 7 : 6, true != z ? 85 : 84, blki.g(helpConfig)), ag, false, true, Calendar.getInstance()).executeOnExecutor(this.o, new Void[0]);
    }

    public final void S() {
        edtp edtpVar;
        View findViewById = findViewById(R.id.gh_help_toolbar);
        if ((bkzz.a(frhw.d()) && findViewById == null) || (edtpVar = (edtp) findViewById.getLayoutParams()) == null) {
            return;
        }
        edtpVar.a = 0;
    }

    public final void T(String str) {
        new blkn(this.y, new bljc(str)).start();
    }

    public final void U() {
        Screenshot b;
        HelpConfig helpConfig = this.W;
        if (helpConfig.A != null && blag.x(helpConfig.b, frdz.a.lK().H())) {
            try {
                this.W.A.send();
                blfz.d(this, true, this.Q);
                if (bkzz.a(frmd.c())) {
                    blfl.d(this, true, this.Q);
                    return;
                } else {
                    blfl.c(this, true);
                    return;
                }
            } catch (Exception e) {
                ((eluo) ((eluo) j.j()).s(e)).x("Could not launch custom Feedback, falling back to default case.");
                blfz.d(this, false, this.Q);
                if (bkzz.a(frmd.c())) {
                    blfl.d(this, false, this.Q);
                } else {
                    blfl.c(this, false);
                }
            }
        }
        final ErrorReport errorReport = this.W.y;
        if (errorReport == null) {
            errorReport = new ErrorReport();
        }
        if (TextUtils.isEmpty(errorReport.a.packageName)) {
            String str = this.W.b;
            String installerPackageName = getPackageManager().getInstallerPackageName(this.W.b);
            errorReport.a.packageName = str;
            errorReport.a.type = 11;
            errorReport.a.installerPackageName = installerPackageName;
        }
        if (this.W.v()) {
            errorReport.B = this.W.d.name;
        }
        Bundle bundle = this.W.m;
        if (bundle != null && bundle.size() > 0) {
            errorReport.D = this.W.m;
        }
        errorReport.Y = this.W.z;
        if (TextUtils.isEmpty(errorReport.T)) {
            HelpConfig helpConfig2 = this.W;
            byte[] bArr = helpConfig2.o;
            if (bArr != null) {
                b = Screenshot.d(bArr, helpConfig2.p, helpConfig2.q);
            } else {
                Bitmap bitmap = helpConfig2.n;
                b = bitmap != null ? Screenshot.b(bitmap) : null;
            }
            if (b != null) {
                Screenshot.e(errorReport, b);
            }
        }
        if (bkwk.d(this)) {
            errorReport.an = true;
        }
        HelpConfig helpConfig3 = this.W;
        errorReport.ag = helpConfig3.e;
        errorReport.X = "GoogleHelp";
        errorReport.ao = true;
        final long j2 = helpConfig3.E ? helpConfig3.ag : -1L;
        aszs aszsVar = bcld.a;
        atad atadVar = new atad((Context) this, (int[][]) null);
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: bcms
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                bcsw bcswVar = (bcsw) obj;
                ErrorReport errorReport2 = ErrorReport.this;
                long j3 = j2;
                dhma dhmaVar = (dhma) obj2;
                try {
                    if (!"GoogleHelp".equals(errorReport2.X)) {
                        throw new IllegalStateException("This api only supports Google Help");
                    }
                    bcswVar.r(errorReport2, j3);
                    dhmaVar.b(null);
                } catch (RemoteException e2) {
                    Log.e("gF_FeedbackClient", "Failed to start feedback", e2);
                    dhmaVar.a(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        atfnVar.d = 6006;
        atadVar.ji(atfnVar.a());
    }

    public final void V(boolean z) {
        if (bkzz.a(frkq.c())) {
            this.K = Boolean.valueOf(z);
        }
    }

    final void W(fjvd fjvdVar, int i) {
        boolean z = i == 0;
        int ordinal = fjvdVar.ordinal();
        if (ordinal == 0) {
            if (ah() || am()) {
                return;
            }
            if (bkzz.a(frfl.j()) && this.t == null) {
                return;
            }
            this.t.c.setVisibility(i);
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            m().B(z);
        } else if (this.L.p() ^ z) {
            this.L.l(z);
        }
    }

    final void X() {
        this.V = 1;
        this.R.setVisibility(8);
        v();
        this.L.findViewById(R.id.gh_search_results_list).setVisibility(0);
        this.L.findViewById(R.id.gh_open_search_view_progress_bar).setVisibility(8);
    }

    public final void Y() {
        HelpConfig helpConfig;
        if (this.W.F()) {
            if (this.r.getVisibility() == 0) {
                return;
            }
            if (!bkzz.a(frlu.c())) {
                if (bkzz.b(frgy.d())) {
                    blfl.f(this, this.W);
                }
                blfz.f(this, this.W, this.X, null);
            }
            String str = this.W.ak;
            int i = blmq.b;
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (Objects.equals(parse.getScheme(), "https") || Objects.equals(parse.getScheme(), "http")) {
                    bkvj j2 = bkvj.j(this.W.ak, bkvq.a(), this.W);
                    if (bkzz.a(frlu.c())) {
                        if (bkzz.b(frgy.d())) {
                            HelpConfig helpConfig2 = this.W;
                            Integer num = j2 == null ? null : j2.z;
                            ausn ausnVar = blfl.a;
                            fgrc v = blhp.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fgri fgriVar = v.b;
                            blhp blhpVar = (blhp) fgriVar;
                            blhpVar.c = 9;
                            blhpVar.b = 1 | blhpVar.b;
                            String str2 = helpConfig2.ak;
                            if (str2 != null) {
                                if (!fgriVar.L()) {
                                    v.U();
                                }
                                blhp blhpVar2 = (blhp) v.b;
                                blhpVar2.b |= 32;
                                blhpVar2.h = str2;
                            }
                            if (num != null) {
                                int intValue = num.intValue();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                blhp blhpVar3 = (blhp) v.b;
                                blhpVar3.b |= 4096;
                                blhpVar3.n = intValue;
                            }
                            fgrc v2 = blhq.a.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            blhq blhqVar = (blhq) v2.b;
                            blhp blhpVar4 = (blhp) v.Q();
                            blhpVar4.getClass();
                            blhqVar.d = blhpVar4;
                            blhqVar.c = 3;
                            blfl.J(this, helpConfig2, v2);
                        }
                        blfz.f(this, this.W, this.X, (bkzz.a(frne.a.lK().a()) && j2 == null) ? null : j2.z);
                    }
                    if (j2 == null) {
                        I(this.W.ak);
                        finish();
                        return;
                    } else if (TextUtils.isEmpty(this.W.k()) && TextUtils.isEmpty(j2.w)) {
                        I(this.W.ak);
                        finish();
                        return;
                    } else {
                        if (TextUtils.isEmpty(this.W.k())) {
                            this.W.J = j2.w;
                        }
                        blki.k(this, j2, 29, 0);
                        this.r.setVisibility(0);
                        return;
                    }
                }
            }
            finish();
            if (bkzz.a(frlu.c())) {
                if (bkzz.b(frgy.d())) {
                    blfl.f(this, this.W);
                }
                blfz.f(this, this.W, this.X, null);
                return;
            }
            return;
        }
        if (this.W.H()) {
            if (!bkzz.a(frhq.a.lK().b())) {
                this.L.i(this.W.aj);
            } else if (this.r.getVisibility() != 0) {
                this.L.i(this.W.aj);
                T(this.W.aj);
            }
            if (ai()) {
                if (this.r.getVisibility() != 0) {
                    au(new Runnable() { // from class: blco
                        @Override // java.lang.Runnable
                        public final void run() {
                            HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                            helpChimeraActivity.K(helpChimeraActivity.W.aj);
                            if (!helpChimeraActivity.ah() && !helpChimeraActivity.am()) {
                                helpChimeraActivity.findViewById(R.id.gh_search_box).setVisibility(8);
                            }
                            helpChimeraActivity.S();
                            helpChimeraActivity.r.setVisibility(0);
                        }
                    });
                    return;
                }
                return;
            } else {
                if (!ah() && !am()) {
                    findViewById(R.id.gh_search_box).setVisibility(8);
                }
                S();
                aa();
                return;
            }
        }
        if (!this.W.I()) {
            HelpConfig helpConfig3 = this.W;
            if (bkzz.b(frff.k()) && helpConfig3.v() && this.W.G()) {
                au(new Runnable() { // from class: blcs
                    @Override // java.lang.Runnable
                    public final void run() {
                        ausn ausnVar2 = blfl.a;
                        boolean b = bkzz.b(frgy.d());
                        HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                        if (b) {
                            fgrc v3 = blhp.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            blhp blhpVar5 = (blhp) v3.b;
                            blhpVar5.c = 116;
                            blhpVar5.b |= 1;
                            blhp blhpVar6 = (blhp) v3.Q();
                            HelpConfig ic = helpChimeraActivity.ic();
                            fgrc v4 = blhq.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            blhq blhqVar2 = (blhq) v4.b;
                            blhpVar6.getClass();
                            blhqVar2.d = blhpVar6;
                            blhqVar2.c = 3;
                            blfl.J(helpChimeraActivity, ic, v4);
                        }
                        ausn ausnVar3 = blfz.a;
                        fgrc v5 = blhr.a.v();
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        blhr blhrVar = (blhr) v5.b;
                        blhrVar.i = 227;
                        blhrVar.b |= 256;
                        blfz.E(helpChimeraActivity, v5, aurt.a);
                        if (bkzz.b(frfr.c())) {
                            HelpConfig helpConfig4 = helpChimeraActivity.W;
                            blmy.o(helpChimeraActivity, helpConfig4, helpConfig4.ag);
                        } else {
                            blmy.n(helpChimeraActivity, helpChimeraActivity.W);
                        }
                        helpChimeraActivity.finish();
                    }
                });
                return;
            }
            if (aj()) {
                aa();
            } else {
                Z();
            }
            int i2 = blku.e;
            if (!bkzz.a(frll.c()) || (helpConfig = this.W) == null || helpConfig.d == null) {
                return;
            }
            fgrc i3 = blku.i(1);
            fgrc v3 = fhbb.a.v();
            String string = getString(R.string.common_list_apps_menu_help);
            if (!v3.b.L()) {
                v3.U();
            }
            fhbb fhbbVar = (fhbb) v3.b;
            string.getClass();
            fhbbVar.b = 1 | fhbbVar.b;
            fhbbVar.c = string;
            if (!i3.b.L()) {
                i3.U();
            }
            fhaz fhazVar = (fhaz) i3.b;
            fhbb fhbbVar2 = (fhbb) v3.Q();
            fhaz fhazVar2 = fhaz.a;
            fhbbVar2.getClass();
            fhazVar.d = fhbbVar2;
            fhazVar.c = 2;
            new blku((fhaz) i3.Q(), this).executeOnExecutor(this.n, new Void[0]);
            return;
        }
        au(new Runnable() { // from class: blcr
            @Override // java.lang.Runnable
            public final void run() {
                HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                if (helpChimeraActivity.r.getVisibility() == 0) {
                    return;
                }
                if (TextUtils.isEmpty(helpChimeraActivity.W.m())) {
                    if (helpChimeraActivity.aj()) {
                        helpChimeraActivity.aa();
                        return;
                    } else {
                        helpChimeraActivity.Z();
                        return;
                    }
                }
                HelpConfig helpConfig4 = helpChimeraActivity.W;
                fgrc v4 = fjvu.a.v();
                fgrc v5 = fjvx.a.v();
                String k2 = helpChimeraActivity.W.k();
                if (!v5.b.L()) {
                    v5.U();
                }
                fjvx fjvxVar = (fjvx) v5.b;
                k2.getClass();
                fjvxVar.b |= 4;
                fjvxVar.c = k2;
                fjvx fjvxVar2 = (fjvx) v5.Q();
                if (!v4.b.L()) {
                    v4.U();
                }
                fjvu fjvuVar = (fjvu) v4.b;
                fjvxVar2.getClass();
                fjvuVar.i = fjvxVar2;
                fjvuVar.b |= 4096;
                helpConfig4.O((fjvu) v4.Q());
                bkvu.a(helpChimeraActivity);
                helpChimeraActivity.r.setVisibility(0);
            }
        });
        HelpConfig helpConfig4 = this.W;
        blfn blfnVar = this.X;
        ausn ausnVar2 = blfz.a;
        blhr blhrVar = blhr.a;
        fgrc v4 = blhrVar.v();
        if (!v4.b.L()) {
            v4.U();
        }
        blhr blhrVar2 = (blhr) v4.b;
        blhrVar2.i = 181;
        blhrVar2.b |= 256;
        String m = helpConfig4.m();
        if (!v4.b.L()) {
            v4.U();
        }
        blhr blhrVar3 = (blhr) v4.b;
        blhrVar3.b |= 8192;
        blhrVar3.m = m;
        blfz.J(this, helpConfig4, blfnVar, v4);
        HelpConfig helpConfig5 = this.W;
        ausn ausnVar3 = blfl.a;
        if (bkzz.b(frgy.d())) {
            fgrc v5 = blhp.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            blhp blhpVar5 = (blhp) v5.b;
            blhpVar5.c = 37;
            blhpVar5.b |= 1;
            String m2 = helpConfig5.m();
            if (!v5.b.L()) {
                v5.U();
            }
            blhp blhpVar6 = (blhp) v5.b;
            blhpVar6.b |= 32;
            blhpVar6.h = m2;
            blhp blhpVar7 = (blhp) v5.Q();
            fgrc v6 = blhq.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            blhq blhqVar2 = (blhq) v6.b;
            blhpVar7.getClass();
            blhqVar2.d = blhpVar7;
            blhqVar2.c = 3;
            blfl.J(this, helpConfig5, v6);
        }
        blfa.a(this, auio.GOOGLEHELP_COMMUNITY_SMART_JOURNEY_SJ_OPENED_TO_SMART_JOURNEY);
        if (TextUtils.isEmpty(this.W.al)) {
            blfz.x(this, this.W, this.X, 206);
            blfl.D(this, this.W, 23);
            return;
        }
        if (!this.W.C()) {
            blfz.x(this, this.W, this.X, 207);
            blfl.D(this, this.W, 24);
            return;
        }
        HelpConfig helpConfig6 = this.W;
        blfn blfnVar2 = this.X;
        int i4 = helpConfig6.am;
        int i5 = 4;
        fjva fjvaVar = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? fjva.UNKNOWN_CONTACT_MODE : fjva.PHONE : fjva.EMAIL : fjva.C2C : fjva.CHAT;
        fgrc v7 = blhrVar.v();
        if (!v7.b.L()) {
            v7.U();
        }
        blhr blhrVar4 = (blhr) v7.b;
        blhrVar4.i = 187;
        blhrVar4.b |= 256;
        String m3 = helpConfig6.m();
        if (!v7.b.L()) {
            v7.U();
        }
        fgri fgriVar2 = v7.b;
        blhr blhrVar5 = (blhr) fgriVar2;
        blhrVar5.b |= 8192;
        blhrVar5.m = m3;
        if (!fgriVar2.L()) {
            v7.U();
        }
        fgri fgriVar3 = v7.b;
        blhr blhrVar6 = (blhr) fgriVar3;
        blhrVar6.j = 207;
        blhrVar6.b |= 1024;
        if (fjvaVar != fjva.UNKNOWN_CONTACT_MODE) {
            if (!fgriVar3.L()) {
                v7.U();
            }
            blhr blhrVar7 = (blhr) v7.b;
            blhrVar7.o = fjvaVar.l;
            blhrVar7.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        }
        blfz.J(this, helpConfig6, blfnVar2, v7);
        HelpConfig helpConfig7 = this.W;
        int i6 = helpConfig7.am;
        if (i6 == 1) {
            i5 = 2;
        } else if (i6 != 2) {
            i5 = i6 != 3 ? i6 != 4 ? 1 : 3 : 5;
        }
        if (bkzz.b(frgy.d())) {
            fgrc v8 = blhp.a.v();
            if (!v8.b.L()) {
                v8.U();
            }
            fgri fgriVar4 = v8.b;
            blhp blhpVar8 = (blhp) fgriVar4;
            blhpVar8.c = 45;
            blhpVar8.b |= 1;
            if (!fgriVar4.L()) {
                v8.U();
            }
            blhp blhpVar9 = (blhp) v8.b;
            blhpVar9.d = 24;
            blhpVar9.b |= 2;
            String m4 = helpConfig7.m();
            if (!v8.b.L()) {
                v8.U();
            }
            fgri fgriVar5 = v8.b;
            blhp blhpVar10 = (blhp) fgriVar5;
            blhpVar10.b |= 32;
            blhpVar10.h = m4;
            if (i5 != 1) {
                if (!fgriVar5.L()) {
                    v8.U();
                }
                blhp blhpVar11 = (blhp) v8.b;
                blhpVar11.j = i5 - 1;
                blhpVar11.b |= 256;
            }
            fgrc v9 = blhq.a.v();
            if (!v9.b.L()) {
                v9.U();
            }
            blhq blhqVar3 = (blhq) v9.b;
            blhp blhpVar12 = (blhp) v8.Q();
            blhpVar12.getClass();
            blhqVar3.d = blhpVar12;
            blhqVar3.c = 3;
            blfl.J(this, helpConfig7, v9);
        }
    }

    public final void Z() {
        if (this.r.getVisibility() == 0) {
            return;
        }
        if (al()) {
            k().executeOnExecutor(this.n, new Void[0]);
        }
        V(false);
        if (ak() && auts.b(this)) {
            r(new blde(this, false));
        } else {
            ad(false);
        }
        this.r.setVisibility(0);
    }

    public final void aa() {
        boolean al = al();
        boolean ak = ak();
        if (al || ak) {
            L(al, ak);
        }
        if (this.r.getVisibility() == 0) {
            return;
        }
        if (!ak) {
            V(true);
            ad(true);
        }
        this.r.setVisibility(0);
    }

    public final void ab(bkum bkumVar) {
        blau blauVar = this.ad;
        blauVar.d = -1L;
        blauVar.ag = false;
        blauVar.ai = false;
        Handler handler = blauVar.ak;
        handler.removeCallbacks(blauVar.am);
        blauVar.aj = bkumVar;
        if (blauVar.ah) {
            return;
        }
        handler.postDelayed(blauVar.al, frdz.a.lK().z());
        blauVar.ah = true;
    }

    @Override // defpackage.blmv
    public final void ac(Intent intent, ValueCallback valueCallback) {
        if (bkzz.a(frja.c())) {
            this.m = valueCallback;
            startActivityForResult(intent, 8242);
        }
    }

    public final void ad(boolean z) {
        if (getMainLooper().getThread() != Thread.currentThread()) {
            this.ac.post(new bldf(this, z));
            return;
        }
        if (this.W.u() && this.ai) {
            R();
            if (bkzz.a(frke.c())) {
                ao();
                return;
            }
            return;
        }
        if (am() && this.ai) {
            av(new Runnable() { // from class: blci
                @Override // java.lang.Runnable
                public final void run() {
                    boolean a = bkzz.a(frmm.c());
                    HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                    if (a && helpChimeraActivity.J) {
                        return;
                    }
                    helpChimeraActivity.runOnUiThread(new blcx(helpChimeraActivity));
                }
            });
        }
        supportInvalidateOptionsMenu();
        if (this.D && !ah() && !am()) {
            this.t.k();
        }
        this.W.s();
        if (this.D && ae() && !ah() && !am()) {
            w();
            if (this.W.z()) {
                if (z) {
                    Q();
                } else {
                    N();
                }
            }
        }
        ao();
    }

    public final boolean ae() {
        if (bkzz.a(frkq.c())) {
            return this.H;
        }
        return true;
    }

    public final boolean af() {
        HelpConfig helpConfig = this.W;
        return (helpConfig == null || !helpConfig.G || ah() || am()) ? false : true;
    }

    public final boolean ag() {
        return this.ad.ai;
    }

    public final boolean ah() {
        boolean z = false;
        if (frfl.n() && bkzz.c(this.W.g(), frfl.m(), frfl.h(), frfl.i())) {
            z = true;
        }
        return bkzz.b(z);
    }

    public final boolean ai() {
        return frfl.n() && bkzz.c(this.W.g(), true, frfl.e(), frfl.f());
    }

    public final boolean aj() {
        bkwg bkwgVar;
        if (!auts.b(this)) {
            return false;
        }
        HelpConfig helpConfig = this.W;
        return !helpConfig.ab || ((bkwgVar = this.ae) != null && bkwgVar.d) || helpConfig.E();
    }

    final boolean ak() {
        return (this.W.H() || this.C) ? false : true;
    }

    final boolean al() {
        return (this.D || ah() || am()) ? false : true;
    }

    public final boolean am() {
        if (!bkzz.b(frfl.n() && bkzz.c(this.W.g(), frfl.l(), frfl.c(), frfl.d()))) {
            return false;
        }
        boolean z = aq() ? !this.F : true;
        return bkzz.a(frfl.j()) ? z && auts.b(this) : z;
    }

    final boolean an(String str) {
        return bkus.f(this, this.W, str);
    }

    public final void ao() {
        this.C = true;
        if (bkzz.a(frke.c())) {
            this.A.b();
        }
    }

    public final void ap(int i, fjva fjvaVar) {
        blfz.q(this, i, fjvaVar, -1);
    }

    @Override // defpackage.bkud
    public final void b(bkuf bkufVar) {
        if (this.af == null) {
            return;
        }
        this.z = bkufVar;
        bkwg bkwgVar = new bkwg(this, this.z);
        this.ae = bkwgVar;
        bkuf bkufVar2 = bkwgVar.c;
        String j2 = bkufVar2.j("ongoing_session_context", null);
        HelpConfig helpConfig = bkwgVar.b;
        bkwgVar.d = !TextUtils.equals(helpConfig.c, j2);
        if (bkwg.c(helpConfig, bkufVar2)) {
            bkwg.a(helpConfig, bkufVar2);
            HelpChimeraActivity helpChimeraActivity = bkwgVar.a;
            ausn ausnVar = blfz.a;
            fgrc v = blhr.a.v();
            if (!v.b.L()) {
                v.U();
            }
            blhr blhrVar = (blhr) v.b;
            blhrVar.i = 48;
            blhrVar.b |= 256;
            blfz.E(helpChimeraActivity, v, aurt.a);
            ausn ausnVar2 = blfl.a;
            if (bkzz.a(frgy.d())) {
                fgrc v2 = blhp.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                blhp blhpVar = (blhp) v2.b;
                blhpVar.c = 35;
                blhpVar.b |= 1;
                blhp blhpVar2 = (blhp) v2.Q();
                HelpConfig ic = helpChimeraActivity.ic();
                fgrc v3 = blhq.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                blhq blhqVar = (blhq) v3.b;
                blhpVar2.getClass();
                blhqVar.d = blhpVar2;
                blhqVar.c = 3;
                blfl.J(helpChimeraActivity, ic, v3);
            }
        }
        bkwgVar.b();
        this.af.b();
        this.af = null;
    }

    @Override // defpackage.bkwh
    public final void c(bkum bkumVar) {
        List list = this.N;
        synchronized (list) {
            list.remove(bkumVar);
        }
    }

    @Override // defpackage.bkvc
    public final bkwf d() {
        return this.y;
    }

    @Override // defpackage.bkvc
    public final bkzw e() {
        return this.x;
    }

    @Override // defpackage.bkwh
    public final void f(bkum bkumVar) {
        List list = this.N;
        synchronized (list) {
            list.add(bkumVar);
        }
    }

    public final AsyncTask k() {
        return new blij(this, this.W.c, this.t);
    }

    public final bkvd l() {
        return m().y();
    }

    public final blbf m() {
        if (aq() && this.G) {
            bp bpVar = new bp(getSupportFragmentManager());
            blbf blbfVar = new blbf();
            this.v = blbfVar;
            bpVar.z(R.id.gh_help_content, blbfVar, k);
            bpVar.b();
            getSupportFragmentManager().an();
            this.G = false;
        } else if (this.v == null) {
            ew supportFragmentManager = getSupportFragmentManager();
            String str = k;
            blbf blbfVar2 = (blbf) supportFragmentManager.h(str);
            if (blbfVar2 != null) {
                this.v = blbfVar2;
            } else {
                bp bpVar2 = new bp(getSupportFragmentManager());
                blbf blbfVar3 = new blbf();
                this.v = blbfVar3;
                bpVar2.z(R.id.gh_help_content, blbfVar3, str);
                bpVar2.b();
                getSupportFragmentManager().an();
            }
        }
        return this.v;
    }

    public final fjvd o() {
        return (fjvd) this.an.peek();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (bkzz.a(frja.c()) && i == 8242) {
            ValueCallback valueCallback = this.m;
            if (valueCallback != null) {
                if (i2 == -1) {
                    Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(-1, intent);
                    if (bkzz.a(frmv.c())) {
                        if (parseResult != null) {
                            for (Uri uri : parseResult) {
                                if (TextUtils.isEmpty(uri.getAuthority()) || !uri.getAuthority().contains("@")) {
                                }
                            }
                        }
                        parseResult = null;
                        break;
                    }
                    valueCallback.onReceiveValue(parseResult);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }
            this.m = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r11.W.H() != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.onBackPressed():void");
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.W.P) {
            int i = edxt.a;
        }
    }

    @Override // defpackage.bldl, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.Q = bkzz.a(frmd.c()) ? blag.g() : null;
        super.onCreate(bundle);
        if ("android.intent.action.SEARCH".equals(getIntent().getAction())) {
            ar("GoogleHelp: unsupported: activity started with search intent.");
            return;
        }
        String q = aura.q(this);
        if (!TextUtils.isEmpty(q)) {
            try {
                aura.B(this);
            } catch (SecurityException e) {
                ar("SecurityException " + e.getMessage() + " in calling package: " + q);
                return;
            }
        }
        if (this.W == null) {
            ((eluo) j.i()).x("No HelpConfig provided!");
            setResult(0);
            finish();
            return;
        }
        if (bkzz.a(frkw.c())) {
            bkvq.d(this.W.Q);
        }
        if (af()) {
            bkus.d(this, this.W);
        }
        D();
        blbq.b(this);
        bkzy.a(this.n, this);
        new bldi(this, this).start();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        ThemeSettings themeSettings = this.W.z;
        int i = 1;
        menuInflater.inflate((themeSettings.b == 0 || themeSettings.a == 1) ? R.menu.gh_main_menu_dark : R.menu.gh_main_menu_light, menu);
        if (bkzz.a(frjy.c())) {
            blag.r(menu.findItem(R.id.gh_menu_close_article), this, blah.a(this, R.attr.ghf_greyIconColor));
            menu.findItem(R.id.gh_menu_close_article).setTitle(getString(R.string.gh_menu_close_article, new Object[]{this.W.ai}));
        }
        if (bkzz.a(frkb.a.lK().a())) {
            menu.findItem(R.id.gh_menu_share_article).setShowAsAction(0);
        } else if (ax()) {
            blag.r(menu.findItem(R.id.gh_menu_share_article), this, blah.a(this, R.attr.ghf_greyIconColor));
        }
        this.am = new SparseArray(this.W.t.size());
        for (OverflowMenuItem overflowMenuItem : this.W.t) {
            menu.add(0, i, 0, overflowMenuItem.b);
            this.am.put(i, overflowMenuItem);
            i++;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.bldl, defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        bkty bktyVar;
        bkuc bkucVar;
        boolean z = false;
        t(false);
        if (bkzz.a(frkt.d()) && (bktyVar = this.w) != null && (bkucVar = bktyVar.d) != null) {
            bkucVar.a();
        }
        HelpConfig helpConfig = this.W;
        if (helpConfig != null) {
            ErrorReport errorReport = helpConfig.y;
            if (errorReport != null) {
                String[] strArr = errorReport.V;
                if (strArr != null && strArr.length > 0) {
                    z = true;
                }
                if (z || !TextUtils.isEmpty(errorReport.T)) {
                    new bldg(errorReport, this, z).start();
                }
            }
            int i = this.Y;
            if (i != 1) {
                blhr n = n(this);
                fjvd b = fjvd.b(n.q);
                int i2 = n.n;
                String str = n.l;
                String str2 = n.m;
                Integer p = p();
                ausn ausnVar = blfz.a;
                fgrc v = blhr.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                blhr blhrVar = (blhr) fgriVar;
                blhrVar.i = 1;
                blhrVar.b |= 256;
                if (i != 0) {
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    blhr blhrVar2 = (blhr) v.b;
                    blhrVar2.j = i - 1;
                    blhrVar2.b |= 1024;
                }
                blfz.F(this, v, aurt.a, b, i2, str, str2, p);
                int i3 = this.Z;
                blhr n2 = n(this);
                fjvd b2 = fjvd.b(n2.q);
                int i4 = n2.n;
                String str3 = n2.l;
                String str4 = n2.m;
                Integer p2 = p();
                ausn ausnVar2 = blfl.a;
                if (bkzz.a(frgy.d())) {
                    fgrc v2 = blhp.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fgri fgriVar2 = v2.b;
                    blhp blhpVar = (blhp) fgriVar2;
                    blhpVar.c = 33;
                    blhpVar.b = 1 | blhpVar.b;
                    if (i3 != 0) {
                        if (!fgriVar2.L()) {
                            v2.U();
                        }
                        blhp blhpVar2 = (blhp) v2.b;
                        blhpVar2.d = i3 - 1;
                        blhpVar2.b |= 2;
                    }
                    if (bkzz.a(frmd.c()) && p2 != null) {
                        int intValue = p2.intValue();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        blhp blhpVar3 = (blhp) v2.b;
                        blhpVar3.b |= 4096;
                        blhpVar3.n = intValue;
                    }
                    blfl.K(this, v2, b2, i4, str3, str4, null);
                }
            }
            if (!this.ak) {
                GoogleHelpChimeraService.h(GoogleHelpChimeraService.f(this.W));
            }
        }
        bkzw bkzwVar = this.x;
        if (bkzwVar != null) {
            bkzwVar.close();
        }
        bkwf bkwfVar = this.y;
        if (bkwfVar != null) {
            bkwfVar.close();
        }
        super.onDestroy();
    }

    @Override // defpackage.bldl, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri data;
        int itemId = menuItem.getItemId();
        Activity activity = null;
        if (itemId == R.id.gh_menu_share_article) {
            bkvd l2 = l();
            if (l2 == null) {
                ((eluo) j.i()).x("Can't share Help article. Help element is null.");
            } else {
                bkvj bkvjVar = l2.a;
                if (bkvjVar == null) {
                    ((eluo) j.i()).x("Can't share Help article. Leaf content is null.");
                } else {
                    Context containerActivity = getContainerActivity();
                    itr.h(containerActivity);
                    Intent action = new Intent().setAction("android.intent.action.SEND");
                    action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", containerActivity.getPackageName());
                    action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", containerActivity.getPackageName());
                    action.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
                    while (true) {
                        if (!(containerActivity instanceof ContextWrapper)) {
                            break;
                        }
                        if (containerActivity instanceof Activity) {
                            activity = (Activity) containerActivity;
                            break;
                        }
                        containerActivity = ((ContextWrapper) containerActivity).getBaseContext();
                    }
                    if (activity != null) {
                        ComponentName componentName = activity.getComponentName();
                        action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                        action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
                    }
                    imz.c(action);
                    String str = bkvjVar.g;
                    imz.b(str, action);
                    imz.a(bkvjVar.f, action);
                    imz.d(action);
                    if (aura.ad(this, action)) {
                        startActivity(Intent.createChooser(action, getString(R.string.gh_menu_share_article)));
                        Integer num = bkvjVar.z;
                        ausn ausnVar = blfz.a;
                        fgrc v = blhr.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        blhr blhrVar = (blhr) fgriVar;
                        blhrVar.i = 168;
                        blhrVar.b |= 256;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        blhr blhrVar2 = (blhr) v.b;
                        str.getClass();
                        blhrVar2.b |= 8192;
                        blhrVar2.m = str;
                        if (bkzz.a(frne.c()) && num != null) {
                            int intValue = num.intValue();
                            if (!v.b.L()) {
                                v.U();
                            }
                            blhr blhrVar3 = (blhr) v.b;
                            blhrVar3.c |= 8192;
                            blhrVar3.K = intValue;
                        }
                        blfz.E(this, v, aurt.a);
                        Integer num2 = bkvjVar.z;
                        ausn ausnVar2 = blfl.a;
                        if (bkzz.b(frgy.d())) {
                            fgrc v2 = blhp.a.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fgri fgriVar2 = v2.b;
                            blhp blhpVar = (blhp) fgriVar2;
                            blhpVar.c = 50;
                            blhpVar.b = 1 | blhpVar.b;
                            if (!fgriVar2.L()) {
                                v2.U();
                            }
                            blhp blhpVar2 = (blhp) v2.b;
                            str.getClass();
                            blhpVar2.b |= 32;
                            blhpVar2.h = str;
                            if (num2 != null) {
                                int intValue2 = num2.intValue();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                blhp blhpVar3 = (blhp) v2.b;
                                blhpVar3.b |= 4096;
                                blhpVar3.n = intValue2;
                            }
                            HelpConfig ic = ic();
                            fgrc v3 = blhq.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            blhq blhqVar = (blhq) v3.b;
                            blhp blhpVar4 = (blhp) v2.Q();
                            blhpVar4.getClass();
                            blhqVar.d = blhpVar4;
                            blhqVar.c = 3;
                            blfl.J(this, ic, v3);
                        }
                    }
                }
            }
        } else {
            if (itemId == R.id.gh_menu_close_article) {
                this.Z = 10;
                this.Y = 24;
                finish();
                return true;
            }
            if (itemId == R.id.gh_menu_feedback) {
                U();
                return true;
            }
            if (itemId == R.id.gh_menu_play_store) {
                aw(this.W.b);
                return true;
            }
            if (itemId == R.id.gh_menu_clear_history) {
                bkwg bkwgVar = this.ae;
                if (bkwgVar != null) {
                    bkwgVar.b();
                    this.ae = null;
                }
                new blkf(this).start();
                HelpConfig helpConfig = this.W;
                bkuf bkufVar = this.z;
                bkup g = new bkur(this, helpConfig).g();
                g.f("name");
                g.f("display_country");
                g.f("phone_number");
                g.f("locale");
                g.a();
                if (bkufVar != null) {
                    bkufVar.k("escalation_options");
                }
                if (!ah() && !am()) {
                    blaz blazVar = this.t;
                    PopularArticlesContainer a = blazVar.a();
                    List list = a.b;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((bkvj) it.next()).A();
                        }
                    }
                    bkvj bkvjVar2 = a.c;
                    if (bkvjVar2 != null) {
                        bkvjVar2.s = false;
                        bkvjVar2.t = false;
                        bkvjVar2.n = "";
                    }
                    blbm.b(blazVar.a, blazVar.b);
                }
                bljq bljqVar = this.u.d;
                if (bljqVar.a != null) {
                    for (int i = 0; i < bljqVar.a.size(); i++) {
                        ((bkvj) bljqVar.a.get(i)).A();
                    }
                }
                if (bliv.c(this.W)) {
                    new bkvb().b();
                }
                Toast.makeText(this, getString(R.string.gh_clear_history_announcement), 1).show();
                return true;
            }
            if (itemId == R.id.gh_menu_version_info) {
                bldm bldmVar = new bldm();
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.v(bldmVar, "version_dialog");
                bpVar.b();
                return true;
            }
            if (bkzz.a(frjy.c()) && itemId == 16908332) {
                if (o() == fjvd.HELP_ANSWER_FRAGMENT) {
                    onBackPressed();
                    return true;
                }
                itemId = 16908332;
            }
            OverflowMenuItem overflowMenuItem = (OverflowMenuItem) this.am.get(itemId);
            if (overflowMenuItem != null) {
                HelpConfig helpConfig2 = this.W;
                Intent intent = overflowMenuItem.c;
                int i2 = blmy.a;
                if (aura.ad(this, intent)) {
                    startActivity(intent);
                } else if (intent.getAction().equals("android.intent.action.VIEW") && (data = intent.getData()) != null && "https".equals(data.getScheme())) {
                    blmy.q(this, new Intent(intent), helpConfig2);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if ((r0.b & 4) != 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPrepareOptionsMenu(android.view.Menu r10) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onRestart() {
        super.onRestart();
        if (bkzz.a(frkw.c())) {
            bkvq.d(this.W.Q);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        ArrayList arrayList = new ArrayList(this.N);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bkum bkumVar = (bkum) arrayList.get(i);
            bkumVar.c = false;
            Object obj = bkumVar.d;
            if (obj != null) {
                bkumVar.d(obj);
                bkumVar.d = null;
            }
        }
    }

    @Override // defpackage.bldl, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        List list = this.N;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bkum) list.get(i)).c = true;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        super.onStart();
        if (af()) {
            Account account = this.W.d;
            int size = bkus.c(this).size();
            if (size == 0) {
                if (account != null) {
                    an("");
                    at();
                    return;
                }
                final blaz blazVar = this.t;
                if (blazVar.e == null) {
                    HelpChimeraActivity helpChimeraActivity = blazVar.a;
                    blazVar.e = ((ViewStub) helpChimeraActivity.findViewById(R.id.gh_sign_in_banner_view_stub)).inflate();
                    blazVar.e.findViewById(R.id.gh_sign_in_button).setOnClickListener(new View.OnClickListener() { // from class: blaw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                            intent.putExtra("account_types", new String[]{"com.google"});
                            HelpChimeraActivity helpChimeraActivity2 = blaz.this.a;
                            helpChimeraActivity2.startActivity(intent);
                            ausn ausnVar = blfz.a;
                            fgrc v = blhr.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            blhr blhrVar = (blhr) v.b;
                            blhrVar.i = 145;
                            blhrVar.b |= 256;
                            blfz.E(helpChimeraActivity2, v, aurt.a);
                            ausn ausnVar2 = blfl.a;
                            if (bkzz.b(frgy.d())) {
                                fgrc v2 = blhp.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                blhp blhpVar = (blhp) v2.b;
                                blhpVar.c = 52;
                                blhpVar.b |= 1;
                                blhp blhpVar2 = (blhp) v2.Q();
                                HelpConfig ic = helpChimeraActivity2.ic();
                                fgrc v3 = blhq.a.v();
                                if (!v3.b.L()) {
                                    v3.U();
                                }
                                blhq blhqVar = (blhq) v3.b;
                                blhpVar2.getClass();
                                blhqVar.d = blhpVar2;
                                blhqVar.c = 3;
                                blfl.J(helpChimeraActivity2, ic, v3);
                            }
                        }
                    });
                    ausn ausnVar = blfz.a;
                    fgrc v = blhr.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    blhr blhrVar = (blhr) v.b;
                    blhrVar.i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
                    blhrVar.b |= 256;
                    blfz.E(helpChimeraActivity, v, aurt.a);
                    ausn ausnVar2 = blfl.a;
                    if (bkzz.b(frgy.d())) {
                        fgrc v2 = blhp.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        blhp blhpVar = (blhp) v2.b;
                        blhpVar.c = 51;
                        blhpVar.b = 1 | blhpVar.b;
                        blhp blhpVar2 = (blhp) v2.Q();
                        HelpConfig ic = helpChimeraActivity.ic();
                        fgrc v3 = blhq.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        blhq blhqVar = (blhq) v3.b;
                        blhpVar2.getClass();
                        blhqVar.d = blhpVar2;
                        blhqVar.c = 3;
                        blfl.J(helpChimeraActivity, ic, v3);
                    }
                }
            } else {
                if (account == null) {
                    bkus.d(this, this.W);
                    at();
                    return;
                }
                if (size > 1) {
                    blaz blazVar2 = this.t;
                    if (blazVar2.d == null) {
                        blazVar2.d = (AccountPickerContainer) ((ViewStub) blazVar2.a.findViewById(R.id.gh_account_picker_view_stub)).inflate();
                    }
                    AccountPickerContainer accountPickerContainer = blazVar2.d;
                    HelpChimeraActivity helpChimeraActivity2 = blazVar2.a;
                    ((TextView) accountPickerContainer.findViewById(R.id.gh_account_picker_icon_and_label)).setCompoundDrawablesRelativeWithIntrinsicBounds(blag.b(accountPickerContainer.getContext().getDrawable(2131232972), accountPickerContainer.getContext(), blah.a(accountPickerContainer.getContext(), R.attr.gh_primaryBlueColor)), (Drawable) null, (Drawable) null, (Drawable) null);
                    Spinner spinner = (Spinner) accountPickerContainer.findViewById(R.id.gh_account_picker_spinner);
                    List b = bkus.b(accountPickerContainer.getContext());
                    ArrayAdapter arrayAdapter = new ArrayAdapter(helpChimeraActivity2, true != bkzz.a(friu.c()) ? R.layout.gh_help_account_picker_selected_line_item_deprecated : R.layout.gh_help_account_picker_selected_line_item, (String[]) b.toArray(new String[b.size()]));
                    arrayAdapter.setDropDownViewResource(true != bkzz.a(friu.c()) ? R.layout.gh_help_account_picker_dropdown_line_item_deprecated : R.layout.gh_help_account_picker_dropdown_line_item);
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                    if (b.size() < 2) {
                        spinner.setEnabled(false);
                        spinner.setBackgroundColor(accountPickerContainer.getDrawingCacheBackgroundColor());
                    } else {
                        spinner.setOnItemSelectedListener(new blaq(helpChimeraActivity2, spinner));
                    }
                    int a = bkus.a(accountPickerContainer.getContext(), helpChimeraActivity2.W);
                    if (a >= 0) {
                        spinner.setSelection(a);
                    }
                } else {
                    AccountPickerContainer accountPickerContainer2 = this.t.d;
                    if (accountPickerContainer2 != null) {
                        accountPickerContainer2.setVisibility(8);
                    }
                }
            }
        }
        Y();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        super.onStop();
        bkwg bkwgVar = this.ae;
        if (bkwgVar != null) {
            bkuf bkufVar = bkwgVar.c;
            long currentTimeMillis = System.currentTimeMillis();
            bkup g = bkufVar.g();
            g.d("ongoing_session_last_stopped_ms", currentTimeMillis);
            HelpConfig helpConfig = bkwgVar.b;
            g.e("ongoing_session_id", helpConfig.e);
            String str = helpConfig.c;
            if (str != null) {
                g.e("ongoing_session_context", str);
            }
            HelpChimeraActivity helpChimeraActivity = bkwgVar.a;
            if (helpChimeraActivity.o() == fjvd.HELP_ANSWER_FRAGMENT) {
                bkvd l2 = helpChimeraActivity.l();
                if (l2 != null && !l2.b() && !l2.d() && l2.a != null && !helpConfig.F()) {
                    g.e("ongoing_session_browse_url", l2.a.g);
                    int i = l2.h;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    g.c("ongoing_session_user_action_type", i2);
                    g.c("ongoing_session_click_rank", l2.b);
                    g.a.putFloat(g.b.b("ongoing_session_scroll_pos_y"), helpChimeraActivity.m().x());
                    if (!TextUtils.isEmpty(l2.c)) {
                        g.e("ongoing_session_query", l2.c);
                    }
                }
            } else {
                helpConfig.ac = "";
                helpConfig.ao = 1;
                helpConfig.ad = -1;
                helpConfig.af = -1.0f;
                helpConfig.ae = "";
            }
            g.a();
        }
    }

    public final Integer p() {
        bkvj bkvjVar;
        if (bkzz.a(frmd.c()) && o() != fjvd.HELP_ANSWER_FRAGMENT) {
            return this.Q;
        }
        if (o() != fjvd.HELP_ANSWER_FRAGMENT || l() == null || (bkvjVar = l().a) == null) {
            return null;
        }
        return bkvjVar.z;
    }

    final String q(bkvj bkvjVar, bkvd bkvdVar) {
        String str = bkvdVar.a.y;
        String str2 = bkvjVar.y;
        if (!TextUtils.equals(str2, str)) {
            eqgo eqgoVar = this.o;
            eqgoVar.execute(new blkx(this, eqgoVar, str2));
            return "";
        }
        try {
            return (String) bllc.a(this).get();
        } catch (InterruptedException | ExecutionException e) {
            ((eluo) ((eluo) j.i()).s(e)).x("unable to get global js to inject.");
            return "";
        }
    }

    public final void r(final bkud bkudVar) {
        bkuf bkufVar = this.z;
        if (bkufVar != null) {
            bkudVar.b(bkufVar);
            return;
        }
        bkvf bkvfVar = this.af;
        if (bkvfVar != null) {
            bkvfVar.addObserver(new Observer() { // from class: blcp
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bkudVar.b(HelpChimeraActivity.this.z);
                }
            });
        }
    }

    public final void s(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:".concat(String.valueOf(str))));
        startActivity(intent);
    }

    public final void t(boolean z) {
        bkum.b(z, this.N);
    }

    public final void u(String str) {
        if (an(str)) {
            if (bkzz.a(frmp.a.lK().a())) {
                ausn ausnVar = blfz.a;
                fgrc v = blhr.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                blhr blhrVar = (blhr) fgriVar;
                blhrVar.i = 113;
                blhrVar.b |= 256;
                if (!fgriVar.L()) {
                    v.U();
                }
                blhr blhrVar2 = (blhr) v.b;
                blhrVar2.j = 162;
                blhrVar2.b |= 1024;
                blfz.E(this, v, aurt.a);
                ausn ausnVar2 = blfl.a;
                if (bkzz.b(frgy.d())) {
                    fgrc v2 = blhp.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fgri fgriVar2 = v2.b;
                    blhp blhpVar = (blhp) fgriVar2;
                    blhpVar.c = 46;
                    blhpVar.b |= 1;
                    if (!fgriVar2.L()) {
                        v2.U();
                    }
                    blhp blhpVar2 = (blhp) v2.b;
                    blhpVar2.d = 25;
                    blhpVar2.b |= 2;
                    blhp blhpVar3 = (blhp) v2.Q();
                    HelpConfig ic = ic();
                    fgrc v3 = blhq.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    blhq blhqVar = (blhq) v3.b;
                    blhpVar3.getClass();
                    blhqVar.d = blhpVar3;
                    blhqVar.c = 3;
                    blfl.J(this, ic, v3);
                }
            } else {
                for (Account account : bkus.c(this)) {
                    if (str.equals(account.name)) {
                        ausn ausnVar3 = blfz.a;
                        fgrc v4 = blhr.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fgri fgriVar3 = v4.b;
                        blhr blhrVar3 = (blhr) fgriVar3;
                        blhrVar3.i = 113;
                        blhrVar3.b |= 256;
                        if (account != null) {
                            if (!fgriVar3.L()) {
                                v4.U();
                            }
                            blhr blhrVar4 = (blhr) v4.b;
                            blhrVar4.j = 162;
                            blhrVar4.b |= 1024;
                            String d = bctg.d(account);
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            blhr blhrVar5 = (blhr) v4.b;
                            d.getClass();
                            blhrVar5.b |= 4;
                            blhrVar5.e = d;
                        } else {
                            if (!fgriVar3.L()) {
                                v4.U();
                            }
                            blhr blhrVar6 = (blhr) v4.b;
                            blhrVar6.j = 163;
                            blhrVar6.b |= 1024;
                        }
                        blfz.E(this, v4, aurt.a);
                        ausn ausnVar4 = blfl.a;
                        if (bkzz.b(frgy.d())) {
                            fgrc v5 = blhp.a.v();
                            if (!v5.b.L()) {
                                v5.U();
                            }
                            fgri fgriVar4 = v5.b;
                            blhp blhpVar4 = (blhp) fgriVar4;
                            blhpVar4.c = 46;
                            blhpVar4.b |= 1;
                            if (account != null) {
                                if (!fgriVar4.L()) {
                                    v5.U();
                                }
                                blhp blhpVar5 = (blhp) v5.b;
                                blhpVar5.d = 25;
                                blhpVar5.b |= 2;
                                String d2 = bctg.d(account);
                                if (!v5.b.L()) {
                                    v5.U();
                                }
                                blhp blhpVar6 = (blhp) v5.b;
                                d2.getClass();
                                blhpVar6.b |= 2048;
                                blhpVar6.m = d2;
                            } else {
                                if (!fgriVar4.L()) {
                                    v5.U();
                                }
                                blhp blhpVar7 = (blhp) v5.b;
                                blhpVar7.d = 26;
                                blhpVar7.b |= 2;
                            }
                            HelpConfig ic2 = ic();
                            fgrc v6 = blhq.a.v();
                            if (!v6.b.L()) {
                                v6.U();
                            }
                            blhq blhqVar2 = (blhq) v6.b;
                            blhp blhpVar8 = (blhp) v5.Q();
                            blhpVar8.getClass();
                            blhqVar2.d = blhpVar8;
                            blhqVar2.c = 3;
                            blfl.J(this, ic2, v6);
                        }
                    }
                }
            }
            at();
        }
    }

    public final void v() {
        this.R.loadUrl("about:blank");
    }

    public final void w() {
        blau blauVar = this.ad;
        blauVar.ah = false;
        blauVar.ai = true;
        Handler handler = blauVar.ak;
        handler.removeCallbacks(blauVar.al);
        blauVar.aj = null;
        long currentTimeMillis = System.currentTimeMillis() - blauVar.d;
        long A = (int) frdz.a.lK().A();
        if (currentTimeMillis >= A || blauVar.d == -1) {
            blauVar.x();
        } else {
            if (blauVar.ag) {
                return;
            }
            handler.postDelayed(blauVar.am, A - currentTimeMillis);
            blauVar.ag = true;
        }
    }

    public final void x(fjvd fjvdVar) {
        int ordinal = ((fjvd) this.an.peek()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 || fjvdVar != fjvd.HELP_ANSWER_FRAGMENT) {
                return;
            }
        } else if (fjvdVar != fjvd.HELP_SUB_CONSOLE && fjvdVar != fjvd.HELP_ANSWER_FRAGMENT) {
            return;
        }
        W((fjvd) this.an.peek(), 8);
        this.an.push(fjvdVar);
        W(fjvdVar, 0);
    }

    public final void y(blik blikVar, CharSequence charSequence, bcth bcthVar) {
        HelpConfig helpConfig;
        HelpConfig helpConfig2;
        bljl bljlVar = this.u;
        HelpChimeraActivity helpChimeraActivity = bljlVar.a;
        List<bkvj> g = blikVar.g(helpChimeraActivity, bljlVar.b);
        RecyclerView recyclerView = bljlVar.c;
        bljq bljqVar = bljlVar.d;
        recyclerView.ah(bljqVar);
        bljqVar.D(charSequence.toString(), g);
        String d = blikVar.d();
        String charSequence2 = charSequence.toString();
        if (bkzz.b(frgy.d())) {
            blfl.m(helpChimeraActivity, d);
        }
        blfz.z(helpChimeraActivity, 15, g, d, charSequence2);
        blfa.a(helpChimeraActivity, auio.GOOGLEHELP_SEARCH_SHOWN_SEARCH_RESULTS);
        int i = blku.e;
        if (bkzz.a(frll.c()) && (helpConfig2 = helpChimeraActivity.W) != null && helpConfig2.d != null) {
            fgrc i2 = blku.i(11);
            fgrc v = fhbb.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fhbb fhbbVar = (fhbb) v.b;
            charSequence2.getClass();
            fhbbVar.b |= 1;
            fhbbVar.c = charSequence2;
            if (!i2.b.L()) {
                i2.U();
            }
            fhaz fhazVar = (fhaz) i2.b;
            fhbb fhbbVar2 = (fhbb) v.Q();
            fhaz fhazVar2 = fhaz.a;
            fhbbVar2.getClass();
            fhazVar.d = fhbbVar2;
            fhazVar.c = 2;
            new blku((fhaz) i2.Q(), helpChimeraActivity).executeOnExecutor(helpChimeraActivity.n, new Void[0]);
        }
        if (bkzz.a(frll.c()) && (helpConfig = helpChimeraActivity.W) != null && helpConfig.d != null) {
            fgrc i3 = blku.i(11);
            fgrc v2 = fhbf.a.v();
            for (bkvj bkvjVar : g) {
                fgrc v3 = fhbd.a.v();
                String str = bkvjVar.f;
                if (!v3.b.L()) {
                    v3.U();
                }
                fgri fgriVar = v3.b;
                fhbd fhbdVar = (fhbd) fgriVar;
                str.getClass();
                fhbdVar.b |= 2;
                fhbdVar.d = str;
                String str2 = bkvjVar.g;
                if (!fgriVar.L()) {
                    v3.U();
                }
                fhbd fhbdVar2 = (fhbd) v3.b;
                str2.getClass();
                fhbdVar2.b |= 1;
                fhbdVar2.c = str2;
                String v4 = bkvjVar.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                fhbd fhbdVar3 = (fhbd) v3.b;
                v4.getClass();
                fhbdVar3.b |= 4;
                fhbdVar3.e = v4;
                fhbd fhbdVar4 = (fhbd) v3.Q();
                if (!v2.b.L()) {
                    v2.U();
                }
                fhbf fhbfVar = (fhbf) v2.b;
                fhbdVar4.getClass();
                fgsa fgsaVar = fhbfVar.b;
                if (!fgsaVar.c()) {
                    fhbfVar.b = fgri.E(fgsaVar);
                }
                fhbfVar.b.add(fhbdVar4);
            }
            if (!i3.b.L()) {
                i3.U();
            }
            fhaz fhazVar3 = (fhaz) i3.b;
            fhbf fhbfVar2 = (fhbf) v2.Q();
            fhaz fhazVar4 = fhaz.a;
            fhbfVar2.getClass();
            fhazVar3.d = fhbfVar2;
            fhazVar3.c = 7;
            new blku((fhaz) i3.Q(), helpChimeraActivity).executeOnExecutor(helpChimeraActivity.n, new Void[0]);
        }
        x(fjvd.HELP_SUB_CONSOLE);
        this.s.setVisibility(0);
        w();
        blhr n = n(this);
        long a = bcthVar.a();
        blfz.u(this, 10, a, fjvd.b(n.q), n.l, n.m, n.n);
        blfl.w(this, 42, a, fjvd.b(n.q), n.l, n.m, n.n);
    }

    public final void z() {
        this.p.c();
        eqgo eqgoVar = this.o;
        new blkg(this, eqgoVar).executeOnExecutor(eqgoVar, new Void[0]);
    }

    @Override // defpackage.bldl, defpackage.bkvc
    public final Context a() {
        return this;
    }
}
