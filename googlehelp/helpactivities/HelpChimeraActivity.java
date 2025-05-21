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
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.asng;
import defpackage.asnz;
import defpackage.asot;
import defpackage.aspy;
import defpackage.asqh;
import defpackage.bahh;
import defpackage.bapk;
import defpackage.bapl;
import defpackage.bipj;
import defpackage.bipl;
import defpackage.bipn;
import defpackage.bipo;
import defpackage.bipq;
import defpackage.bipr;
import defpackage.bipx;
import defpackage.biqa;
import defpackage.biqb;
import defpackage.biqc;
import defpackage.biqd;
import defpackage.biqm;
import defpackage.biqn;
import defpackage.biqo;
import defpackage.biqq;
import defpackage.biqs;
import defpackage.biqt;
import defpackage.biqu;
import defpackage.birb;
import defpackage.birq;
import defpackage.birr;
import defpackage.birs;
import defpackage.birv;
import defpackage.bisb;
import defpackage.bivh;
import defpackage.bivj;
import defpackage.bivk;
import defpackage.bivr;
import defpackage.bivs;
import defpackage.biwb;
import defpackage.biwf;
import defpackage.biwk;
import defpackage.biwq;
import defpackage.biwx;
import defpackage.bixb;
import defpackage.biyi;
import defpackage.biyn;
import defpackage.biyo;
import defpackage.biyp;
import defpackage.biyq;
import defpackage.biyr;
import defpackage.biys;
import defpackage.biyt;
import defpackage.biyw;
import defpackage.biyx;
import defpackage.bjal;
import defpackage.bjaw;
import defpackage.bjay;
import defpackage.bjbk;
import defpackage.bjda;
import defpackage.bjdb;
import defpackage.bjdc;
import defpackage.bjdr;
import defpackage.bjdu;
import defpackage.bjdv;
import defpackage.bjdy;
import defpackage.bjeg;
import defpackage.bjen;
import defpackage.bjeu;
import defpackage.bjew;
import defpackage.bjez;
import defpackage.bjfb;
import defpackage.bjfq;
import defpackage.bjfr;
import defpackage.bjfs;
import defpackage.bjft;
import defpackage.bjfx;
import defpackage.bjfy;
import defpackage.bjgf;
import defpackage.bjgi;
import defpackage.bjgn;
import defpackage.bjhx;
import defpackage.bjib;
import defpackage.bjie;
import defpackage.bjig;
import defpackage.bjij;
import defpackage.bp;
import defpackage.bsa;
import defpackage.byhr;
import defpackage.cwwi;
import defpackage.ebhc;
import defpackage.eble;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.femg;
import defpackage.femi;
import defpackage.femj;
import defpackage.femk;
import defpackage.femm;
import defpackage.fhfd;
import defpackage.fhfg;
import defpackage.fhfz;
import defpackage.folg;
import defpackage.fomm;
import defpackage.foms;
import defpackage.font;
import defpackage.foof;
import defpackage.foox;
import defpackage.fopd;
import defpackage.foqb;
import defpackage.foqh;
import defpackage.foqk;
import defpackage.forf;
import defpackage.fori;
import defpackage.forl;
import defpackage.forr;
import defpackage.forx;
import defpackage.fosa;
import defpackage.fosd;
import defpackage.foss;
import defpackage.fosv;
import defpackage.fotb;
import defpackage.foth;
import defpackage.fotk;
import defpackage.fotq;
import defpackage.fotw;
import defpackage.fouc;
import defpackage.foul;
import defpackage.ilj;
import defpackage.isb;
import defpackage.ivf;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HelpChimeraActivity extends biyw implements bipo, birs, biqn, bjig {
    private static int ab;
    public OpenSearchView L;
    public bjeu M;
    public String O;
    public String P;
    public Integer Q;
    public WebView R;
    public WebView S;
    public bjhx T;
    public View U;
    int V;
    private biwf ad;
    private birr ae;
    private boolean al;
    private SparseArray am;
    private Deque an;
    public AppBarLayout q;
    public View r;
    public View s;
    public biwk t;
    public bjew u;
    biwq v;
    public bipj w;
    public bivh x;
    public birq y;
    public bipq z;
    public static final asot j = asot.b("gH_HelpActivity", asej.GOOGLE_HELP);
    public static final String k = "gH_HelpActivity-".concat(String.valueOf(biwq.class.getSimpleName()));
    public static final String l = "gH_HelpActivity-".concat(String.valueOf(biwf.class.getSimpleName()));
    private static final Set aa = new bsa();
    ValueCallback m = null;
    public final ensv n = new asmf(Integer.MAX_VALUE, 10);
    public final ensv o = new asmf(Integer.MAX_VALUE, 9);
    public final bapl p = new bapl();
    private final Handler ac = new byhr(Looper.getMainLooper());
    private biqq af = new biqq();
    private final biqq ag = new biqq();
    public final biqq A = new biqq();
    private final biqq ah = new biqq();
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
        new bsa();
        this.V = 1;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
    }

    public static final boolean aq() {
        return bivk.a(foms.a.a().r());
    }

    private final void ar(String str) {
        ((ejhf) j.i()).B("%s", str);
        setResult(0);
        finish();
    }

    private final void as(String str, boolean z) {
        HelpConfig helpConfig;
        String str2;
        t(true);
        bjeu bjeuVar = this.M;
        if (bjeuVar != null) {
            bjeuVar.f();
        }
        if (ai() && z && !TextUtils.isEmpty(this.W.k())) {
            this.p.c();
            HelpConfig helpConfig2 = this.W;
            if (helpConfig2 != null && !TextUtils.isEmpty(helpConfig2.k())) {
                try {
                    str2 = (String) bjgn.b(this).get();
                } catch (InterruptedException | ExecutionException e) {
                    ((ejhf) ((ejhf) bjft.e.i()).s(e)).x("unable to get js fingerprint");
                    str2 = "";
                }
                String format = String.format(folg.y(), folg.z(), this.W.k(), Uri.encode(str));
                biqt biqtVar = new biqt();
                biqtVar.g = format;
                biqtVar.u = str2;
                biqtVar.z = 2;
                biqtVar.q = false;
                biqu a = biqtVar.a();
                bapl baplVar = new bapl();
                baplVar.c();
                new bjft(this, a, biqo.h(1, -1, "", -1.0f, 1, 1, baplVar, 3), ag(), false, true, Calendar.getInstance(), true, false).executeOnExecutor(this.o, new Void[0]);
            }
        } else {
            new bjdr(this, new biys(this), str).executeOnExecutor(this.o, new Void[0]);
        }
        if (bivk.a(foss.a.a().b())) {
            bjbk.v(this, 131, 1);
            bjaw.z(this, this.W, 84, 1);
        }
        bjal.a(this, aseu.GOOGLEHELP_SEARCH_SEARCH_QUERY_SUBMITTED);
        int i = bjgf.e;
        if (!bivk.a(foss.c()) || (helpConfig = this.W) == null || helpConfig.d == null) {
            return;
        }
        fecj i2 = bjgf.i(11);
        fecj v = femj.a.v();
        if (!v.b.L()) {
            v.U();
        }
        femj femjVar = (femj) v.b;
        str.getClass();
        femjVar.b |= 1;
        femjVar.c = str;
        if (!i2.b.L()) {
            i2.U();
        }
        femg femgVar = (femg) i2.b;
        femj femjVar2 = (femj) v.Q();
        femg femgVar2 = femg.a;
        femjVar2.getClass();
        femgVar.d = femjVar2;
        femgVar.c = 3;
        new bjgf((femg) i2.Q(), this).executeOnExecutor(this.n, new Void[0]);
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
            this.ag.addObserver(new Observer() { // from class: bixs
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    asot asotVar = HelpChimeraActivity.j;
                    runnable.run();
                }
            });
        }
    }

    private final void av(final Runnable runnable) {
        if (this.aj) {
            runnable.run();
        } else {
            this.ah.addObserver(new Observer() { // from class: biyb
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    asot asotVar = HelpChimeraActivity.j;
                    runnable.run();
                }
            });
        }
    }

    private final void aw(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(folg.w() + str));
            intent.addFlags(268435456);
            intent.addFlags(32768);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(String.valueOf(folg.a.a().W()).concat(String.valueOf(str))));
            try {
                startActivity(intent2);
            } catch (ActivityNotFoundException e) {
                ((ejhf) ((ejhf) j.j()).s(e)).x("Can't view GmsCore in Play Store");
            }
        }
    }

    private final boolean ax() {
        String str = this.W.b;
        boolean c = font.a.a().c();
        font fontVar = font.a;
        return bivk.c(str, c, fontVar.a().b(), fontVar.a().a());
    }

    public static bjdc n(HelpChimeraActivity helpChimeraActivity) {
        fecj v = bjdc.a.v();
        int i = helpChimeraActivity.o().e;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        bjdc bjdcVar = (bjdc) fecpVar;
        bjdcVar.b |= 2097152;
        bjdcVar.q = i;
        if (!fecpVar.L()) {
            v.U();
        }
        bjdc bjdcVar2 = (bjdc) v.b;
        bjdcVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bjdcVar2.n = -1;
        if (bjdcVar2.q != 2 || helpChimeraActivity.l() == null) {
            return (bjdc) v.Q();
        }
        biqo l2 = helpChimeraActivity.l();
        int i2 = l2.b;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        bjdc bjdcVar3 = (bjdc) fecpVar2;
        bjdcVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bjdcVar3.n = i2;
        String str = l2.c;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        bjdc bjdcVar4 = (bjdc) fecpVar3;
        str.getClass();
        bjdcVar4.b |= 4096;
        bjdcVar4.l = str;
        biqu biquVar = l2.a;
        if (biquVar != null) {
            if (!fecpVar3.L()) {
                v.U();
            }
            bjdc bjdcVar5 = (bjdc) v.b;
            String str2 = biquVar.g;
            str2.getClass();
            bjdcVar5.b |= 8192;
            bjdcVar5.m = str2;
        }
        return (bjdc) v.Q();
    }

    public final void A() {
        new bjfs(this).executeOnExecutor(this.o, new Void[0]);
    }

    public final void B() {
        ensv ensvVar = this.o;
        ensvVar.execute(new bjgi(this, ensvVar));
    }

    final void C() {
        this.S.setVisibility(8);
        if (this.U == null) {
            this.U = ((ViewStub) findViewById(R.id.gh_request_error_stub)).inflate();
        }
        this.U.setVisibility(0);
        birv.b(this.U, R.string.common_something_went_wrong, new View.OnClickListener() { // from class: biyh
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
        this.x = new bivh(this);
        if (bivk.a(fosv.c())) {
            aqxd aqxdVar = cwwi.a;
            aqxo aqxoVar = new aqxo((Context) this, (short[]) null);
            int i = bjfx.e;
            if (!this.W.v()) {
                new bjfx(this, aqxoVar).executeOnExecutor(this.n, new Void[0]);
            }
        }
        biqs c = GoogleHelpChimeraService.c(this.W);
        if (c == null || c.c) {
            if (!ah() && !am()) {
                if (bivk.a(foqk.a.a().a())) {
                    HelpConfig helpConfig = this.W;
                    bjdy.a(helpConfig.aj, this.o, this, helpConfig, this.x, this.X);
                } else {
                    bjdy.a(null, this.o, this, this.W, this.x, this.X);
                }
            }
            if (!aq() || !this.F) {
                bisb.a(this.o, new biyn(this), this.W, this.X);
            }
            GoogleHelpChimeraService.i(this.W, true);
        }
        if (bivk.a(forx.c()) && !ah() && !am()) {
            ensv ensvVar = this.o;
            new bipl(this, ensvVar).executeOnExecutor(ensvVar, new Void[0]);
        }
        bivs.c(this, this.W, R.style.gh_NoActionBarLightActivityStyleMaterial3, R.style.gh_NoActionBarDarkActivityStyleMaterial3, R.style.gh_NoActionBarDayNightActivityStyleMaterial3);
        HelpConfig helpConfig2 = this.W;
        if (helpConfig2.P) {
            ThemeSettings themeSettings = helpConfig2.z;
            int i2 = eble.a;
        }
        HelpConfig helpConfig3 = this.W;
        bjay bjayVar = this.X;
        asot asotVar = bjbk.a;
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
        bjdc bjdcVar = bjdc.a;
        fecj v = bjdcVar.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        bjdc bjdcVar2 = (bjdc) fecpVar;
        bjdcVar2.i = 182;
        bjdcVar2.b |= 256;
        if (!fecpVar.L()) {
            v.U();
        }
        bjdc bjdcVar3 = (bjdc) v.b;
        bjdcVar3.j = i3 - 1;
        bjdcVar3.b |= 1024;
        asnz asnzVar = asnz.a;
        bjbk.J(this, helpConfig3, bjayVar, v);
        HelpConfig helpConfig4 = this.W;
        asot asotVar2 = bjaw.a;
        if (bivk.b(foof.d())) {
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
            fecj v2 = bjda.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            bjda bjdaVar = (bjda) fecpVar2;
            bjdaVar.c = 53;
            bjdaVar.b |= 1;
            if (!fecpVar2.L()) {
                v2.U();
            }
            bjda bjdaVar2 = (bjda) v2.b;
            bjdaVar2.d = i5 - 1;
            bjdaVar2.b |= 2;
            bjda bjdaVar3 = (bjda) v2.Q();
            fecj v3 = bjdb.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            bjdb bjdbVar = (bjdb) v3.b;
            bjdaVar3.getClass();
            bjdbVar.d = bjdaVar3;
            bjdbVar.c = 3;
            bjaw.J(this, helpConfig4, v3);
        }
        HelpConfig helpConfig5 = this.W;
        bjay bjayVar2 = this.X;
        int i7 = true != birv.e(this) ? 193 : AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
        fecj v4 = bjdcVar.v();
        if (!v4.b.L()) {
            v4.U();
        }
        fecp fecpVar3 = v4.b;
        bjdc bjdcVar4 = (bjdc) fecpVar3;
        bjdcVar4.i = 188;
        bjdcVar4.b |= 256;
        if (!fecpVar3.L()) {
            v4.U();
        }
        bjdc bjdcVar5 = (bjdc) v4.b;
        bjdcVar5.j = i7 - 1;
        bjdcVar5.b |= 1024;
        bjbk.J(this, helpConfig5, bjayVar2, v4);
        HelpConfig helpConfig6 = this.W;
        boolean e = birv.e(this);
        if (bivk.b(foof.d())) {
            int i8 = true != e ? 29 : 28;
            fecj v5 = bjda.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            fecp fecpVar4 = v5.b;
            bjda bjdaVar4 = (bjda) fecpVar4;
            bjdaVar4.c = 57;
            bjdaVar4.b |= 1;
            if (!fecpVar4.L()) {
                v5.U();
            }
            bjda bjdaVar5 = (bjda) v5.b;
            bjdaVar5.d = i8 - 1;
            bjdaVar5.b |= 2;
            bjda bjdaVar6 = (bjda) v5.Q();
            fecj v6 = bjdb.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            bjdb bjdbVar2 = (bjdb) v6.b;
            bjdaVar6.getClass();
            bjdbVar2.d = bjdaVar6;
            bjdbVar2.c = 3;
            bjaw.J(this, helpConfig6, v6);
        }
        if (birv.d(this)) {
            HelpConfig helpConfig7 = this.W;
            bjay bjayVar3 = this.X;
            fecj v7 = bjdcVar.v();
            if (!v7.b.L()) {
                v7.U();
            }
            fecp fecpVar5 = v7.b;
            bjdc bjdcVar6 = (bjdc) fecpVar5;
            bjdcVar6.i = 188;
            bjdcVar6.b |= 256;
            if (!fecpVar5.L()) {
                v7.U();
            }
            bjdc bjdcVar7 = (bjdc) v7.b;
            bjdcVar7.j = 215;
            bjdcVar7.b |= 1024;
            bjbk.J(this, helpConfig7, bjayVar3, v7);
            HelpConfig helpConfig8 = this.W;
            if (bivk.b(foof.d())) {
                fecj v8 = bjda.a.v();
                if (!v8.b.L()) {
                    v8.U();
                }
                fecp fecpVar6 = v8.b;
                bjda bjdaVar7 = (bjda) fecpVar6;
                bjdaVar7.c = 57;
                bjdaVar7.b |= 1;
                if (!fecpVar6.L()) {
                    v8.U();
                }
                bjda bjdaVar8 = (bjda) v8.b;
                bjdaVar8.d = 91;
                bjdaVar8.b |= 2;
                bjda bjdaVar9 = (bjda) v8.Q();
                fecj v9 = bjdb.a.v();
                if (!v9.b.L()) {
                    v9.U();
                }
                bjdb bjdbVar3 = (bjdb) v9.b;
                bjdaVar9.getClass();
                bjdbVar3.d = bjdaVar9;
                bjdbVar3.c = 3;
                bjaw.J(this, helpConfig8, v9);
            }
        }
        setContentView(am() ? R.layout.gh_help_main_activity_boq_wiz : ah() ? R.layout.gh_help_main_activity_rapi_based : R.layout.gh_help_main_activity_gm3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.gh_help_toolbar);
        Drawable b = bivr.b(toolbar.f(), this, bivs.a(this, R.attr.ghf_greyIconColor));
        ((ejhf) j.h()).x("Overflow icon size adjustments are not required for non-automotive device types.");
        toolbar.x(b);
        ht(toolbar);
        bipr.b(this, hy(), false);
        ew supportFragmentManager = getSupportFragmentManager();
        String str = l;
        biwf biwfVar = (biwf) supportFragmentManager.h(str);
        this.ad = biwfVar;
        if (biwfVar == null) {
            bp bpVar = new bp(supportFragmentManager);
            biwf biwfVar2 = new biwf();
            this.ad = biwfVar2;
            bpVar.u(R.id.gh_help_section, biwfVar2, str);
            bpVar.b();
        }
        if (!ah() && !am()) {
            this.t = new biwk(this);
        }
        if (!aq() || !this.F) {
            A();
        }
        if (am()) {
            z();
        }
        this.u = new bjew(this);
        this.y = new bjez(this, this.W.g());
        this.q = (AppBarLayout) findViewById(R.id.gh_help_app_bar);
        this.r = findViewById(R.id.gh_help_section);
        this.s = findViewById(R.id.gh_help_content);
        this.L = (OpenSearchView) findViewById(R.id.gh_open_search_view);
        this.ad.c = this.s;
        if (bivk.a(fotb.a.a().c()) && (materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar)) != null) {
            materialToolbar.s(R.string.common_navigate_up);
        }
        if (bivk.a(fotb.a.a().d())) {
            this.q.setTouchscreenBlocksFocus(false);
            ((Toolbar) findViewById(R.id.gh_help_toolbar)).setTouchscreenBlocksFocus(false);
            this.L.g.setTouchscreenBlocksFocus(false);
        }
        if (ah() || am()) {
            this.S = (WebView) findViewById(R.id.gh_home_screen_webview);
            if (am()) {
                WebView webView = this.S;
                WebSettings f = bjij.f(this, webView);
                f.setSupportZoom(false);
                f.setBuiltInZoomControls(false);
                webView.setOnLongClickListener(new bjie());
                if (bivk.a(fotq.a.a().a())) {
                    webView.setVerticalScrollBarEnabled(false);
                }
                this.S.setBackgroundColor(bivs.a(this, R.attr.gh_boqWizHomepageSurfaceColor));
            } else {
                bjij.h(this, this.S);
                this.S.setBackgroundColor(bivs.a(this, R.attr.ghf_surfaceColor));
            }
        }
        if (ai()) {
            WebView webView2 = (WebView) this.L.findViewById(R.id.gh_search_webview);
            this.R = webView2;
            bjij.h(this, webView2);
            this.R.setBackgroundColor(bivs.a(this, R.attr.ghf_surfaceColor));
        }
        if (asqh.g()) {
            ivf.a(getWindow(), false);
            this.q.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bixw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    asot asotVar3 = HelpChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            this.s.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bixx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    asot asotVar3 = HelpChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
            this.L.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bixy
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    asot asotVar3 = HelpChimeraActivity.j;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
        }
        String F = folg.a.a().F();
        if (F.hashCode() != ab) {
            Set set = aa;
            set.clear();
            Collections.addAll(set, bivr.y(F));
            ab = F.hashCode();
        }
        this.al = !aa.contains(this.W.b);
        ArrayDeque arrayDeque = new ArrayDeque();
        this.an = arrayDeque;
        arrayDeque.push(fhfg.HELP_CONSOLE);
        bipq.c(this.o, this, this, this.W);
        HelpConfig helpConfig9 = this.W;
        helpConfig9.aa = biqb.b(this, helpConfig9);
        HelpConfig helpConfig10 = this.W;
        if (!ah() && !am()) {
            if (bivk.b(forr.c()) || helpConfig10.E()) {
                ((ViewStub) findViewById(R.id.gh_below_recs_search_box_view_stub)).inflate();
                findViewById(R.id.gh_below_search_box_divider).setVisibility(0);
            } else {
                ((ViewStub) findViewById(R.id.gh_top_search_box_view_stub)).inflate();
            }
        }
        OpenSearchView openSearchView = this.L;
        if (asqh.g()) {
            openSearchView.s = true;
            openSearchView.h(true);
        }
        this.L.g.w(new View.OnClickListener() { // from class: biyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpChimeraActivity.this.onBackPressed();
                birv.c(view);
            }
        });
        final EditText editText = this.L.k;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: biyk
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                EditText editText2 = editText;
                String trim = editText2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                    editText2.clearFocus();
                    birv.c(editText2);
                    helpChimeraActivity.u.a();
                    helpChimeraActivity.findViewById(R.id.gh_open_search_view_progress_bar).setVisibility(0);
                    helpChimeraActivity.K(trim);
                    helpChimeraActivity.T(trim);
                }
                return false;
            }
        });
        editText.addTextChangedListener(new biyo(this, editText));
        bivk.a(foth.c());
        if (ah() || am()) {
            return;
        }
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.gh_search_box);
        if (birv.d(this) || bivk.a(forr.d())) {
            materialCardView.d(0.0f);
        }
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: biyl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                helpChimeraActivity.J();
                if (bivk.b(foof.d())) {
                    asot asotVar3 = bjaw.a;
                    fecj v10 = bjdb.a.v();
                    fecj v11 = bjda.a.v();
                    if (!v11.b.L()) {
                        v11.U();
                    }
                    bjda bjdaVar10 = (bjda) v11.b;
                    bjdaVar10.c = 4;
                    bjdaVar10.b |= 1;
                    if (!v10.b.L()) {
                        v10.U();
                    }
                    bjdb bjdbVar4 = (bjdb) v10.b;
                    bjda bjdaVar11 = (bjda) v11.Q();
                    bjdaVar11.getClass();
                    bjdbVar4.d = bjdaVar11;
                    bjdbVar4.c = 3;
                    bjaw.J(helpChimeraActivity, helpChimeraActivity.hM(), v10);
                }
                asot asotVar4 = bjbk.a;
                fecj v12 = bjdc.a.v();
                if (!v12.b.L()) {
                    v12.U();
                }
                bjdc bjdcVar8 = (bjdc) v12.b;
                bjdcVar8.i = 129;
                bjdcVar8.b |= 256;
                bjbk.E(helpChimeraActivity, v12, asnz.a);
            }
        });
        bivk.a(foth.c());
        if (bivk.b(foof.d())) {
            fecj v10 = bjdb.a.v();
            fecj v11 = bjda.a.v();
            if (!v11.b.L()) {
                v11.U();
            }
            bjda bjdaVar10 = (bjda) v11.b;
            bjdaVar10.c = 3;
            bjdaVar10.b |= 1;
            if (!v10.b.L()) {
                v10.U();
            }
            bjdb bjdbVar4 = (bjdb) v10.b;
            bjda bjdaVar11 = (bjda) v11.Q();
            bjdaVar11.getClass();
            bjdbVar4.d = bjdaVar11;
            bjdbVar4.c = 3;
            bjaw.J(this, hM(), v10);
        }
        fecj v12 = bjdcVar.v();
        if (!v12.b.L()) {
            v12.U();
        }
        bjdc bjdcVar8 = (bjdc) v12.b;
        bjdcVar8.i = 161;
        bjdcVar8.b |= 256;
        bjbk.E(this, v12, asnzVar);
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
            av(new Runnable() { // from class: biye
                @Override // java.lang.Runnable
                public final void run() {
                    boolean a = bivk.a(fott.c());
                    HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                    if (a && helpChimeraActivity.J) {
                        return;
                    }
                    helpChimeraActivity.runOnUiThread(new biyi(helpChimeraActivity));
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
                str = (String) bjgn.b(this).get();
            } catch (InterruptedException | ExecutionException e) {
                ((ejhf) ((ejhf) bjft.e.i()).s(e)).x("unable to get js fingerprint");
                str = "";
            }
            String format = String.format(foms.a.a().i(), folg.z(), k2);
            biqt biqtVar = new biqt();
            biqtVar.g = format;
            biqtVar.u = str;
            biqtVar.z = 2;
            biqtVar.q = false;
            biqtVar.y = 31;
            biqu a = biqtVar.a();
            bapl baplVar = new bapl();
            baplVar.c();
            new bjft(this, a, biqo.j(baplVar), ag(), false, true, Calendar.getInstance(), false, true).executeOnExecutor(this.o, new Void[0]);
        }
    }

    public final void F() {
        Integer num = this.Q;
        asot asotVar = bjbk.a;
        fecj v = bjdc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        bjdc bjdcVar = (bjdc) v.b;
        bjdcVar.i = 54;
        bjdcVar.b |= 256;
        if (bivk.a(foul.c()) && num != null) {
            int intValue = num.intValue();
            if (!v.b.L()) {
                v.U();
            }
            bjdc bjdcVar2 = (bjdc) v.b;
            bjdcVar2.c |= 8192;
            bjdcVar2.K = intValue;
        }
        bjbk.E(this, v, asnz.a);
        if (bivk.a(fotk.c())) {
            bjaw.l(this, this.Q);
        } else {
            bjaw.l(this, null);
        }
        U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f3  */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(defpackage.biqu r18, final defpackage.biqo r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.G(biqu, biqo, boolean):void");
    }

    public final void H(String str, String str2) {
        this.O = str;
        this.P = str2;
        if (!aq() && this.E) {
            runOnUiThread(new biyi(this));
        } else {
            this.aj = true;
            this.ah.b();
        }
    }

    final void I(String str) {
        bjij.l(this, Uri.parse(str), this.W, this.X);
    }

    public final void J() {
        this.L.k.setText("");
        this.L.m();
    }

    public final void K(String str) {
        as(str, true);
    }

    public final void L(final boolean z, final boolean z2) {
        au(new Runnable() { // from class: bixr
            @Override // java.lang.Runnable
            public final void run() {
                HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                String f = GoogleHelpChimeraService.f(helpChimeraActivity.W);
                helpChimeraActivity.M(f, GoogleHelpChimeraService.d(f), z, z2);
            }
        });
    }

    public final void M(final String str, final biqs biqsVar, boolean z, boolean z2) {
        final boolean z3;
        final boolean z4;
        if (z && (biqsVar == null || biqsVar.d)) {
            k().executeOnExecutor(this.n, new Void[0]);
            z3 = false;
        } else {
            z3 = z;
        }
        if (z2 && (biqsVar == null || biqsVar.e)) {
            V(true);
            r(new biyp(this, true));
            z4 = false;
        } else {
            z4 = z2;
        }
        if (z3 || z4) {
            this.B = true;
            Observer observer = new Observer() { // from class: bixu
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    HelpChimeraActivity.this.M(str, biqsVar, z3, z4);
                }
            };
            biqsVar.a();
            biqsVar.f.addObserver(observer);
            return;
        }
        if (this.W.w) {
            return;
        }
        GoogleHelpChimeraService.h(str);
        this.B = false;
    }

    public final void N() {
        bjdc n = n(this);
        bapl baplVar = new bapl(this.W.ag);
        baplVar.c();
        long a = baplVar.a();
        bjbk.u(this, true != this.W.ah ? 5 : 4, a, fhfg.b(n.q), n.l, n.m, n.n);
        bjaw.w(this, true != this.W.ah ? 46 : 45, a, fhfg.b(n.q), n.l, n.m, n.n);
    }

    public final void O() {
        int i = this.W.l;
        if (i == 1) {
            ap(37, fhfd.CHAT);
        } else if (i == 2) {
            ap(42, fhfd.CHAT);
        }
    }

    public final void P(boolean z) {
        bjbk.v(this, 217, z ? 21 : 22);
        bjaw.z(this, this.W, 102, true != z ? 3 : 2);
    }

    public final void Q() {
        bjdc n = n(this);
        bapl baplVar = new bapl(this.W.ag);
        baplVar.c();
        long a = baplVar.a();
        bjbk.u(this, true != this.W.ah ? 3 : 2, a, fhfg.b(n.q), n.l, n.m, n.n);
        bjaw.w(this, true != this.W.ah ? 44 : 43, a, fhfg.b(n.q), n.l, n.m, n.n);
    }

    final void R() {
        String str;
        boolean ag = ag();
        asot asotVar = bjft.e;
        HelpConfig helpConfig = this.W;
        if (helpConfig.u()) {
            fhfz fhfzVar = helpConfig.j.j;
            if (fhfzVar == null) {
                fhfzVar = fhfz.a;
            }
            if (fhfzVar.b.isEmpty()) {
                fhfz fhfzVar2 = helpConfig.j.j;
                if (fhfzVar2 == null) {
                    fhfzVar2 = fhfz.a;
                }
                str = fhfzVar2.c;
            } else {
                fhfz fhfzVar3 = helpConfig.j.j;
                String str2 = (fhfzVar3 == null ? fhfz.a : fhfzVar3).c;
                if (fhfzVar3 == null) {
                    fhfzVar3 = fhfz.a;
                }
                str = str2 + "#" + fhfzVar3.b;
            }
        } else {
            str = null;
        }
        if (str == null) {
            return;
        }
        biqu j2 = biqu.j(str, birb.a(), helpConfig);
        if (!helpConfig.y() || !TextUtils.equals(helpConfig.ac, j2.g)) {
            if (bivk.b(foof.d())) {
                bjaw.s(this, 13, j2.g, "", -1);
            }
            bjbk.s(this, 24, j2.g, -1, "", null);
        }
        boolean z = helpConfig.ah;
        new bjft(this, j2, biqo.g(24, 0, "", -1.0f, true, true != z ? 7 : 6, true != z ? 85 : 84, bjft.g(helpConfig)), ag, false, true, Calendar.getInstance()).executeOnExecutor(this.o, new Void[0]);
    }

    public final void S() {
        ebhc ebhcVar;
        View findViewById = findViewById(R.id.gh_help_toolbar);
        if ((bivk.a(fopd.d()) && findViewById == null) || (ebhcVar = (ebhc) findViewById.getLayoutParams()) == null) {
            return;
        }
        ebhcVar.a = 0;
    }

    public final void T(String str) {
        new bjfy(this.y, new bjen(str)).start();
    }

    public final void U() {
        Screenshot b;
        HelpConfig helpConfig = this.W;
        if (helpConfig.A != null && bivr.x(helpConfig.b, folg.a.a().H())) {
            try {
                this.W.A.send();
                bjbk.d(this, true, this.Q);
                if (bivk.a(fotk.c())) {
                    bjaw.d(this, true, this.Q);
                    return;
                } else {
                    bjaw.c(this, true);
                    return;
                }
            } catch (Exception e) {
                ((ejhf) ((ejhf) j.j()).s(e)).x("Could not launch custom Feedback, falling back to default case.");
                bjbk.d(this, false, this.Q);
                if (bivk.a(fotk.c())) {
                    bjaw.d(this, false, this.Q);
                } else {
                    bjaw.c(this, false);
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
        if (birv.d(this)) {
            errorReport.an = true;
        }
        HelpConfig helpConfig3 = this.W;
        errorReport.ag = helpConfig3.e;
        errorReport.X = "GoogleHelp";
        errorReport.ao = true;
        final long j2 = helpConfig3.E ? helpConfig3.ag : -1L;
        aqxd aqxdVar = bahh.a;
        aqxo aqxoVar = new aqxo((Context) this, (int[][]) null);
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: baiw
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                bapa bapaVar = (bapa) obj;
                ErrorReport errorReport2 = ErrorReport.this;
                long j3 = j2;
                dfau dfauVar = (dfau) obj2;
                try {
                    if (!"GoogleHelp".equals(errorReport2.X)) {
                        throw new IllegalStateException("This api only supports Google Help");
                    }
                    bapaVar.r(errorReport2, j3);
                    dfauVar.b(null);
                } catch (RemoteException e2) {
                    Log.e("gF_FeedbackClient", "Failed to start feedback", e2);
                    dfauVar.a(new RemoteException("Internall Error: Failed to start feedback"));
                }
            }
        };
        arcyVar.d = 6006;
        aqxoVar.iT(arcyVar.a());
    }

    public final void V(boolean z) {
        if (bivk.a(forx.c())) {
            this.K = Boolean.valueOf(z);
        }
    }

    final void W(fhfg fhfgVar, int i) {
        boolean z = i == 0;
        int ordinal = fhfgVar.ordinal();
        if (ordinal == 0) {
            if (ah() || am()) {
                return;
            }
            if (bivk.a(foms.j()) && this.t == null) {
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
            if (!bivk.a(fotb.c())) {
                if (bivk.b(foof.d())) {
                    bjaw.f(this, this.W);
                }
                bjbk.f(this, this.W, this.X, null);
            }
            String str = this.W.ak;
            int i = bjib.b;
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (Objects.equals(parse.getScheme(), "https") || Objects.equals(parse.getScheme(), "http")) {
                    biqu j2 = biqu.j(this.W.ak, birb.a(), this.W);
                    if (bivk.a(fotb.c())) {
                        if (bivk.b(foof.d())) {
                            HelpConfig helpConfig2 = this.W;
                            Integer num = j2 == null ? null : j2.z;
                            asot asotVar = bjaw.a;
                            fecj v = bjda.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fecp fecpVar = v.b;
                            bjda bjdaVar = (bjda) fecpVar;
                            bjdaVar.c = 9;
                            bjdaVar.b = 1 | bjdaVar.b;
                            String str2 = helpConfig2.ak;
                            if (str2 != null) {
                                if (!fecpVar.L()) {
                                    v.U();
                                }
                                bjda bjdaVar2 = (bjda) v.b;
                                bjdaVar2.b |= 32;
                                bjdaVar2.h = str2;
                            }
                            if (num != null) {
                                int intValue = num.intValue();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                bjda bjdaVar3 = (bjda) v.b;
                                bjdaVar3.b |= 4096;
                                bjdaVar3.n = intValue;
                            }
                            fecj v2 = bjdb.a.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            bjdb bjdbVar = (bjdb) v2.b;
                            bjda bjdaVar4 = (bjda) v.Q();
                            bjdaVar4.getClass();
                            bjdbVar.d = bjdaVar4;
                            bjdbVar.c = 3;
                            bjaw.J(this, helpConfig2, v2);
                        }
                        bjbk.f(this, this.W, this.X, (bivk.a(foul.a.a().a()) && j2 == null) ? null : j2.z);
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
                        bjft.k(this, j2, 29, 0);
                        this.r.setVisibility(0);
                        return;
                    }
                }
            }
            finish();
            if (bivk.a(fotb.c())) {
                if (bivk.b(foof.d())) {
                    bjaw.f(this, this.W);
                }
                bjbk.f(this, this.W, this.X, null);
                return;
            }
            return;
        }
        if (this.W.H()) {
            if (!bivk.a(foox.a.a().b())) {
                this.L.i(this.W.aj);
            } else if (this.r.getVisibility() != 0) {
                this.L.i(this.W.aj);
                T(this.W.aj);
            }
            if (ai()) {
                if (this.r.getVisibility() != 0) {
                    au(new Runnable() { // from class: bixz
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
            if (bivk.b(fomm.k()) && helpConfig3.v() && this.W.G()) {
                au(new Runnable() { // from class: biyd
                    @Override // java.lang.Runnable
                    public final void run() {
                        asot asotVar2 = bjaw.a;
                        boolean b = bivk.b(foof.d());
                        HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                        if (b) {
                            fecj v3 = bjda.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            bjda bjdaVar5 = (bjda) v3.b;
                            bjdaVar5.c = 116;
                            bjdaVar5.b |= 1;
                            bjda bjdaVar6 = (bjda) v3.Q();
                            HelpConfig hM = helpChimeraActivity.hM();
                            fecj v4 = bjdb.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            bjdb bjdbVar2 = (bjdb) v4.b;
                            bjdaVar6.getClass();
                            bjdbVar2.d = bjdaVar6;
                            bjdbVar2.c = 3;
                            bjaw.J(helpChimeraActivity, hM, v4);
                        }
                        asot asotVar3 = bjbk.a;
                        fecj v5 = bjdc.a.v();
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        bjdc bjdcVar = (bjdc) v5.b;
                        bjdcVar.i = 227;
                        bjdcVar.b |= 256;
                        bjbk.E(helpChimeraActivity, v5, asnz.a);
                        if (bivk.b(fomy.c())) {
                            HelpConfig helpConfig4 = helpChimeraActivity.W;
                            bjij.o(helpChimeraActivity, helpConfig4, helpConfig4.ag);
                        } else {
                            bjij.n(helpChimeraActivity, helpChimeraActivity.W);
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
            int i2 = bjgf.e;
            if (!bivk.a(foss.c()) || (helpConfig = this.W) == null || helpConfig.d == null) {
                return;
            }
            fecj i3 = bjgf.i(1);
            fecj v3 = femi.a.v();
            String string = getString(R.string.common_list_apps_menu_help);
            if (!v3.b.L()) {
                v3.U();
            }
            femi femiVar = (femi) v3.b;
            string.getClass();
            femiVar.b = 1 | femiVar.b;
            femiVar.c = string;
            if (!i3.b.L()) {
                i3.U();
            }
            femg femgVar = (femg) i3.b;
            femi femiVar2 = (femi) v3.Q();
            femg femgVar2 = femg.a;
            femiVar2.getClass();
            femgVar.d = femiVar2;
            femgVar.c = 2;
            new bjgf((femg) i3.Q(), this).executeOnExecutor(this.n, new Void[0]);
            return;
        }
        au(new Runnable() { // from class: biyc
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
                fecj v4 = fhfx.a.v();
                fecj v5 = fhga.a.v();
                String k2 = helpChimeraActivity.W.k();
                if (!v5.b.L()) {
                    v5.U();
                }
                fhga fhgaVar = (fhga) v5.b;
                k2.getClass();
                fhgaVar.b |= 4;
                fhgaVar.c = k2;
                fhga fhgaVar2 = (fhga) v5.Q();
                if (!v4.b.L()) {
                    v4.U();
                }
                fhfx fhfxVar = (fhfx) v4.b;
                fhgaVar2.getClass();
                fhfxVar.i = fhgaVar2;
                fhfxVar.b |= 4096;
                helpConfig4.O((fhfx) v4.Q());
                birf.a(helpChimeraActivity);
                helpChimeraActivity.r.setVisibility(0);
            }
        });
        HelpConfig helpConfig4 = this.W;
        bjay bjayVar = this.X;
        asot asotVar2 = bjbk.a;
        bjdc bjdcVar = bjdc.a;
        fecj v4 = bjdcVar.v();
        if (!v4.b.L()) {
            v4.U();
        }
        bjdc bjdcVar2 = (bjdc) v4.b;
        bjdcVar2.i = 181;
        bjdcVar2.b |= 256;
        String m = helpConfig4.m();
        if (!v4.b.L()) {
            v4.U();
        }
        bjdc bjdcVar3 = (bjdc) v4.b;
        bjdcVar3.b |= 8192;
        bjdcVar3.m = m;
        bjbk.J(this, helpConfig4, bjayVar, v4);
        HelpConfig helpConfig5 = this.W;
        asot asotVar3 = bjaw.a;
        if (bivk.b(foof.d())) {
            fecj v5 = bjda.a.v();
            if (!v5.b.L()) {
                v5.U();
            }
            bjda bjdaVar5 = (bjda) v5.b;
            bjdaVar5.c = 37;
            bjdaVar5.b |= 1;
            String m2 = helpConfig5.m();
            if (!v5.b.L()) {
                v5.U();
            }
            bjda bjdaVar6 = (bjda) v5.b;
            bjdaVar6.b |= 32;
            bjdaVar6.h = m2;
            bjda bjdaVar7 = (bjda) v5.Q();
            fecj v6 = bjdb.a.v();
            if (!v6.b.L()) {
                v6.U();
            }
            bjdb bjdbVar2 = (bjdb) v6.b;
            bjdaVar7.getClass();
            bjdbVar2.d = bjdaVar7;
            bjdbVar2.c = 3;
            bjaw.J(this, helpConfig5, v6);
        }
        bjal.a(this, aseu.GOOGLEHELP_COMMUNITY_SMART_JOURNEY_SJ_OPENED_TO_SMART_JOURNEY);
        if (TextUtils.isEmpty(this.W.al)) {
            bjbk.x(this, this.W, this.X, 206);
            bjaw.D(this, this.W, 23);
            return;
        }
        if (!this.W.C()) {
            bjbk.x(this, this.W, this.X, 207);
            bjaw.D(this, this.W, 24);
            return;
        }
        HelpConfig helpConfig6 = this.W;
        bjay bjayVar2 = this.X;
        int i4 = helpConfig6.am;
        int i5 = 4;
        fhfd fhfdVar = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? fhfd.UNKNOWN_CONTACT_MODE : fhfd.PHONE : fhfd.EMAIL : fhfd.C2C : fhfd.CHAT;
        fecj v7 = bjdcVar.v();
        if (!v7.b.L()) {
            v7.U();
        }
        bjdc bjdcVar4 = (bjdc) v7.b;
        bjdcVar4.i = 187;
        bjdcVar4.b |= 256;
        String m3 = helpConfig6.m();
        if (!v7.b.L()) {
            v7.U();
        }
        fecp fecpVar2 = v7.b;
        bjdc bjdcVar5 = (bjdc) fecpVar2;
        bjdcVar5.b |= 8192;
        bjdcVar5.m = m3;
        if (!fecpVar2.L()) {
            v7.U();
        }
        fecp fecpVar3 = v7.b;
        bjdc bjdcVar6 = (bjdc) fecpVar3;
        bjdcVar6.j = 207;
        bjdcVar6.b |= 1024;
        if (fhfdVar != fhfd.UNKNOWN_CONTACT_MODE) {
            if (!fecpVar3.L()) {
                v7.U();
            }
            bjdc bjdcVar7 = (bjdc) v7.b;
            bjdcVar7.o = fhfdVar.l;
            bjdcVar7.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        }
        bjbk.J(this, helpConfig6, bjayVar2, v7);
        HelpConfig helpConfig7 = this.W;
        int i6 = helpConfig7.am;
        if (i6 == 1) {
            i5 = 2;
        } else if (i6 != 2) {
            i5 = i6 != 3 ? i6 != 4 ? 1 : 3 : 5;
        }
        if (bivk.b(foof.d())) {
            fecj v8 = bjda.a.v();
            if (!v8.b.L()) {
                v8.U();
            }
            fecp fecpVar4 = v8.b;
            bjda bjdaVar8 = (bjda) fecpVar4;
            bjdaVar8.c = 45;
            bjdaVar8.b |= 1;
            if (!fecpVar4.L()) {
                v8.U();
            }
            bjda bjdaVar9 = (bjda) v8.b;
            bjdaVar9.d = 24;
            bjdaVar9.b |= 2;
            String m4 = helpConfig7.m();
            if (!v8.b.L()) {
                v8.U();
            }
            fecp fecpVar5 = v8.b;
            bjda bjdaVar10 = (bjda) fecpVar5;
            bjdaVar10.b |= 32;
            bjdaVar10.h = m4;
            if (i5 != 1) {
                if (!fecpVar5.L()) {
                    v8.U();
                }
                bjda bjdaVar11 = (bjda) v8.b;
                bjdaVar11.j = i5 - 1;
                bjdaVar11.b |= 256;
            }
            fecj v9 = bjdb.a.v();
            if (!v9.b.L()) {
                v9.U();
            }
            bjdb bjdbVar3 = (bjdb) v9.b;
            bjda bjdaVar12 = (bjda) v8.Q();
            bjdaVar12.getClass();
            bjdbVar3.d = bjdaVar12;
            bjdbVar3.c = 3;
            bjaw.J(this, helpConfig7, v9);
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
        if (ak() && aspy.b(this)) {
            r(new biyp(this, false));
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

    public final void ab(bipx bipxVar) {
        biwf biwfVar = this.ad;
        biwfVar.d = -1L;
        biwfVar.ag = false;
        biwfVar.ai = false;
        Handler handler = biwfVar.ak;
        handler.removeCallbacks(biwfVar.am);
        biwfVar.aj = bipxVar;
        if (biwfVar.ah) {
            return;
        }
        handler.postDelayed(biwfVar.al, folg.a.a().z());
        biwfVar.ah = true;
    }

    @Override // defpackage.bjig
    public final void ac(Intent intent, ValueCallback valueCallback) {
        if (bivk.a(foqh.c())) {
            this.m = valueCallback;
            startActivityForResult(intent, 8242);
        }
    }

    public final void ad(boolean z) {
        if (getMainLooper().getThread() != Thread.currentThread()) {
            this.ac.post(new biyq(this, z));
            return;
        }
        if (this.W.u() && this.ai) {
            R();
            if (bivk.a(forl.c())) {
                ao();
                return;
            }
            return;
        }
        if (am() && this.ai) {
            av(new Runnable() { // from class: bixt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean a = bivk.a(fott.c());
                    HelpChimeraActivity helpChimeraActivity = HelpChimeraActivity.this;
                    if (a && helpChimeraActivity.J) {
                        return;
                    }
                    helpChimeraActivity.runOnUiThread(new biyi(helpChimeraActivity));
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
        if (bivk.a(forx.c())) {
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
        if (foms.n() && bivk.c(this.W.g(), foms.m(), foms.h(), foms.i())) {
            z = true;
        }
        return bivk.b(z);
    }

    public final boolean ai() {
        return foms.n() && bivk.c(this.W.g(), true, foms.e(), foms.f());
    }

    public final boolean aj() {
        birr birrVar;
        if (!aspy.b(this)) {
            return false;
        }
        HelpConfig helpConfig = this.W;
        return !helpConfig.ab || ((birrVar = this.ae) != null && birrVar.d) || helpConfig.E();
    }

    final boolean ak() {
        return (this.W.H() || this.C) ? false : true;
    }

    final boolean al() {
        return (this.D || ah() || am()) ? false : true;
    }

    public final boolean am() {
        if (!bivk.b(foms.n() && bivk.c(this.W.g(), foms.l(), foms.c(), foms.d()))) {
            return false;
        }
        boolean z = aq() ? !this.F : true;
        return bivk.a(foms.j()) ? z && aspy.b(this) : z;
    }

    final boolean an(String str) {
        return biqd.f(this, this.W, str);
    }

    public final void ao() {
        this.C = true;
        if (bivk.a(forl.c())) {
            this.A.b();
        }
    }

    public final void ap(int i, fhfd fhfdVar) {
        bjbk.q(this, i, fhfdVar, -1);
    }

    @Override // defpackage.bipo
    public final void b(bipq bipqVar) {
        if (this.af == null) {
            return;
        }
        this.z = bipqVar;
        birr birrVar = new birr(this, this.z);
        this.ae = birrVar;
        bipq bipqVar2 = birrVar.c;
        String j2 = bipqVar2.j("ongoing_session_context", null);
        HelpConfig helpConfig = birrVar.b;
        birrVar.d = !TextUtils.equals(helpConfig.c, j2);
        if (birr.c(helpConfig, bipqVar2)) {
            birr.a(helpConfig, bipqVar2);
            HelpChimeraActivity helpChimeraActivity = birrVar.a;
            asot asotVar = bjbk.a;
            fecj v = bjdc.a.v();
            if (!v.b.L()) {
                v.U();
            }
            bjdc bjdcVar = (bjdc) v.b;
            bjdcVar.i = 48;
            bjdcVar.b |= 256;
            bjbk.E(helpChimeraActivity, v, asnz.a);
            asot asotVar2 = bjaw.a;
            if (bivk.a(foof.d())) {
                fecj v2 = bjda.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                bjda bjdaVar = (bjda) v2.b;
                bjdaVar.c = 35;
                bjdaVar.b |= 1;
                bjda bjdaVar2 = (bjda) v2.Q();
                HelpConfig hM = helpChimeraActivity.hM();
                fecj v3 = bjdb.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                bjdb bjdbVar = (bjdb) v3.b;
                bjdaVar2.getClass();
                bjdbVar.d = bjdaVar2;
                bjdbVar.c = 3;
                bjaw.J(helpChimeraActivity, hM, v3);
            }
        }
        birrVar.b();
        this.af.b();
        this.af = null;
    }

    @Override // defpackage.birs
    public final void c(bipx bipxVar) {
        List list = this.N;
        synchronized (list) {
            list.remove(bipxVar);
        }
    }

    @Override // defpackage.biqn
    public final birq d() {
        return this.y;
    }

    @Override // defpackage.biqn
    public final bivh e() {
        return this.x;
    }

    @Override // defpackage.birs
    public final void f(bipx bipxVar) {
        List list = this.N;
        synchronized (list) {
            list.add(bipxVar);
        }
    }

    public final AsyncTask k() {
        return new bjdu(this, this.W.c, this.t);
    }

    public final biqo l() {
        return m().y();
    }

    public final biwq m() {
        if (aq() && this.G) {
            bp bpVar = new bp(getSupportFragmentManager());
            biwq biwqVar = new biwq();
            this.v = biwqVar;
            bpVar.z(R.id.gh_help_content, biwqVar, k);
            bpVar.b();
            getSupportFragmentManager().an();
            this.G = false;
        } else if (this.v == null) {
            ew supportFragmentManager = getSupportFragmentManager();
            String str = k;
            biwq biwqVar2 = (biwq) supportFragmentManager.h(str);
            if (biwqVar2 != null) {
                this.v = biwqVar2;
            } else {
                bp bpVar2 = new bp(getSupportFragmentManager());
                biwq biwqVar3 = new biwq();
                this.v = biwqVar3;
                bpVar2.z(R.id.gh_help_content, biwqVar3, str);
                bpVar2.b();
                getSupportFragmentManager().an();
            }
        }
        return this.v;
    }

    public final fhfg o() {
        return (fhfg) this.an.peek();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (bivk.a(foqh.c()) && i == 8242) {
            ValueCallback valueCallback = this.m;
            if (valueCallback != null) {
                if (i2 == -1) {
                    Uri[] parseResult = WebChromeClient.FileChooserParams.parseResult(-1, intent);
                    if (bivk.a(fouc.c())) {
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
    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.qet, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.W.P) {
            int i = eble.a;
        }
    }

    @Override // defpackage.biyw, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.Q = bivk.a(fotk.c()) ? bivr.g() : null;
        super.onCreate(bundle);
        if ("android.intent.action.SEARCH".equals(getIntent().getAction())) {
            ar("GoogleHelp: unsupported: activity started with search intent.");
            return;
        }
        String q = asng.q(this);
        if (!TextUtils.isEmpty(q)) {
            try {
                asng.B(this);
            } catch (SecurityException e) {
                ar("SecurityException " + e.getMessage() + " in calling package: " + q);
                return;
            }
        }
        if (this.W == null) {
            ((ejhf) j.i()).x("No HelpConfig provided!");
            setResult(0);
            finish();
            return;
        }
        if (bivk.a(fosd.c())) {
            birb.d(this.W.Q);
        }
        if (af()) {
            biqd.d(this, this.W);
        }
        D();
        bixb.b(this);
        bivj.a(this.n, this);
        new biyt(this, this).start();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        ThemeSettings themeSettings = this.W.z;
        int i = 1;
        menuInflater.inflate((themeSettings.b == 0 || themeSettings.a == 1) ? R.menu.gh_main_menu_dark : R.menu.gh_main_menu_light, menu);
        if (bivk.a(forf.c())) {
            bivr.r(menu.findItem(R.id.gh_menu_close_article), this, bivs.a(this, R.attr.ghf_greyIconColor));
            menu.findItem(R.id.gh_menu_close_article).setTitle(getString(R.string.gh_menu_close_article, new Object[]{this.W.ai}));
        }
        if (bivk.a(fori.a.a().a())) {
            menu.findItem(R.id.gh_menu_share_article).setShowAsAction(0);
        } else if (ax()) {
            bivr.r(menu.findItem(R.id.gh_menu_share_article), this, bivs.a(this, R.attr.ghf_greyIconColor));
        }
        this.am = new SparseArray(this.W.t.size());
        for (OverflowMenuItem overflowMenuItem : this.W.t) {
            menu.add(0, i, 0, overflowMenuItem.b);
            this.am.put(i, overflowMenuItem);
            i++;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.biyw, defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        bipj bipjVar;
        bipn bipnVar;
        boolean z = false;
        t(false);
        if (bivk.a(fosa.d()) && (bipjVar = this.w) != null && (bipnVar = bipjVar.d) != null) {
            bipnVar.a();
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
                    new biyr(errorReport, this, z).start();
                }
            }
            int i = this.Y;
            if (i != 1) {
                bjdc n = n(this);
                fhfg b = fhfg.b(n.q);
                int i2 = n.n;
                String str = n.l;
                String str2 = n.m;
                Integer p = p();
                asot asotVar = bjbk.a;
                fecj v = bjdc.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                bjdc bjdcVar = (bjdc) fecpVar;
                bjdcVar.i = 1;
                bjdcVar.b |= 256;
                if (i != 0) {
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    bjdc bjdcVar2 = (bjdc) v.b;
                    bjdcVar2.j = i - 1;
                    bjdcVar2.b |= 1024;
                }
                bjbk.F(this, v, asnz.a, b, i2, str, str2, p);
                int i3 = this.Z;
                bjdc n2 = n(this);
                fhfg b2 = fhfg.b(n2.q);
                int i4 = n2.n;
                String str3 = n2.l;
                String str4 = n2.m;
                Integer p2 = p();
                asot asotVar2 = bjaw.a;
                if (bivk.a(foof.d())) {
                    fecj v2 = bjda.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fecp fecpVar2 = v2.b;
                    bjda bjdaVar = (bjda) fecpVar2;
                    bjdaVar.c = 33;
                    bjdaVar.b = 1 | bjdaVar.b;
                    if (i3 != 0) {
                        if (!fecpVar2.L()) {
                            v2.U();
                        }
                        bjda bjdaVar2 = (bjda) v2.b;
                        bjdaVar2.d = i3 - 1;
                        bjdaVar2.b |= 2;
                    }
                    if (bivk.a(fotk.c()) && p2 != null) {
                        int intValue = p2.intValue();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        bjda bjdaVar3 = (bjda) v2.b;
                        bjdaVar3.b |= 4096;
                        bjdaVar3.n = intValue;
                    }
                    bjaw.K(this, v2, b2, i4, str3, str4, null);
                }
            }
            if (!this.ak) {
                GoogleHelpChimeraService.h(GoogleHelpChimeraService.f(this.W));
            }
        }
        bivh bivhVar = this.x;
        if (bivhVar != null) {
            bivhVar.close();
        }
        birq birqVar = this.y;
        if (birqVar != null) {
            birqVar.close();
        }
        super.onDestroy();
    }

    @Override // defpackage.biyw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri data;
        int itemId = menuItem.getItemId();
        Activity activity = null;
        if (itemId == R.id.gh_menu_share_article) {
            biqo l2 = l();
            if (l2 == null) {
                ((ejhf) j.i()).x("Can't share Help article. Help element is null.");
            } else {
                biqu biquVar = l2.a;
                if (biquVar == null) {
                    ((ejhf) j.i()).x("Can't share Help article. Leaf content is null.");
                } else {
                    Context containerActivity = getContainerActivity();
                    isb.h(containerActivity);
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
                    ilj.c(action);
                    String str = biquVar.g;
                    ilj.b(str, action);
                    ilj.a(biquVar.f, action);
                    ilj.d(action);
                    if (asng.ad(this, action)) {
                        startActivity(Intent.createChooser(action, getString(R.string.gh_menu_share_article)));
                        Integer num = biquVar.z;
                        asot asotVar = bjbk.a;
                        fecj v = bjdc.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        bjdc bjdcVar = (bjdc) fecpVar;
                        bjdcVar.i = 168;
                        bjdcVar.b |= 256;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        bjdc bjdcVar2 = (bjdc) v.b;
                        str.getClass();
                        bjdcVar2.b |= 8192;
                        bjdcVar2.m = str;
                        if (bivk.a(foul.c()) && num != null) {
                            int intValue = num.intValue();
                            if (!v.b.L()) {
                                v.U();
                            }
                            bjdc bjdcVar3 = (bjdc) v.b;
                            bjdcVar3.c |= 8192;
                            bjdcVar3.K = intValue;
                        }
                        bjbk.E(this, v, asnz.a);
                        Integer num2 = biquVar.z;
                        asot asotVar2 = bjaw.a;
                        if (bivk.b(foof.d())) {
                            fecj v2 = bjda.a.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fecp fecpVar2 = v2.b;
                            bjda bjdaVar = (bjda) fecpVar2;
                            bjdaVar.c = 50;
                            bjdaVar.b = 1 | bjdaVar.b;
                            if (!fecpVar2.L()) {
                                v2.U();
                            }
                            bjda bjdaVar2 = (bjda) v2.b;
                            str.getClass();
                            bjdaVar2.b |= 32;
                            bjdaVar2.h = str;
                            if (num2 != null) {
                                int intValue2 = num2.intValue();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                bjda bjdaVar3 = (bjda) v2.b;
                                bjdaVar3.b |= 4096;
                                bjdaVar3.n = intValue2;
                            }
                            HelpConfig hM = hM();
                            fecj v3 = bjdb.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            bjdb bjdbVar = (bjdb) v3.b;
                            bjda bjdaVar4 = (bjda) v2.Q();
                            bjdaVar4.getClass();
                            bjdbVar.d = bjdaVar4;
                            bjdbVar.c = 3;
                            bjaw.J(this, hM, v3);
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
                birr birrVar = this.ae;
                if (birrVar != null) {
                    birrVar.b();
                    this.ae = null;
                }
                new bjfq(this).start();
                HelpConfig helpConfig = this.W;
                bipq bipqVar = this.z;
                biqa g = new biqc(this, helpConfig).g();
                g.f("name");
                g.f("display_country");
                g.f("phone_number");
                g.f("locale");
                g.a();
                if (bipqVar != null) {
                    bipqVar.k("escalation_options");
                }
                if (!ah() && !am()) {
                    biwk biwkVar = this.t;
                    PopularArticlesContainer a = biwkVar.a();
                    List list = a.b;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((biqu) it.next()).A();
                        }
                    }
                    biqu biquVar2 = a.c;
                    if (biquVar2 != null) {
                        biquVar2.s = false;
                        biquVar2.t = false;
                        biquVar2.n = "";
                    }
                    biwx.b(biwkVar.a, biwkVar.b);
                }
                bjfb bjfbVar = this.u.d;
                if (bjfbVar.a != null) {
                    for (int i = 0; i < bjfbVar.a.size(); i++) {
                        ((biqu) bjfbVar.a.get(i)).A();
                    }
                }
                if (bjeg.c(this.W)) {
                    new biqm().b();
                }
                Toast.makeText(this, getString(R.string.gh_clear_history_announcement), 1).show();
                return true;
            }
            if (itemId == R.id.gh_menu_version_info) {
                biyx biyxVar = new biyx();
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.v(biyxVar, "version_dialog");
                bpVar.b();
                return true;
            }
            if (bivk.a(forf.c()) && itemId == 16908332) {
                if (o() == fhfg.HELP_ANSWER_FRAGMENT) {
                    onBackPressed();
                    return true;
                }
                itemId = 16908332;
            }
            OverflowMenuItem overflowMenuItem = (OverflowMenuItem) this.am.get(itemId);
            if (overflowMenuItem != null) {
                HelpConfig helpConfig2 = this.W;
                Intent intent = overflowMenuItem.c;
                int i2 = bjij.a;
                if (asng.ad(this, intent)) {
                    startActivity(intent);
                } else if (intent.getAction().equals("android.intent.action.VIEW") && (data = intent.getData()) != null && "https".equals(data.getScheme())) {
                    bjij.q(this, new Intent(intent), helpConfig2);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if ((r0.b & 4) != 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onRestart() {
        super.onRestart();
        if (bivk.a(fosd.c())) {
            birb.d(this.W.Q);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        ArrayList arrayList = new ArrayList(this.N);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bipx bipxVar = (bipx) arrayList.get(i);
            bipxVar.c = false;
            Object obj = bipxVar.d;
            if (obj != null) {
                bipxVar.d(obj);
                bipxVar.d = null;
            }
        }
    }

    @Override // defpackage.biyw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        List list = this.N;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bipx) list.get(i)).c = true;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
        if (af()) {
            Account account = this.W.d;
            int size = biqd.c(this).size();
            if (size == 0) {
                if (account != null) {
                    an("");
                    at();
                    return;
                }
                final biwk biwkVar = this.t;
                if (biwkVar.e == null) {
                    HelpChimeraActivity helpChimeraActivity = biwkVar.a;
                    biwkVar.e = ((ViewStub) helpChimeraActivity.findViewById(R.id.gh_sign_in_banner_view_stub)).inflate();
                    biwkVar.e.findViewById(R.id.gh_sign_in_button).setOnClickListener(new View.OnClickListener() { // from class: biwh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                            intent.putExtra("account_types", new String[]{"com.google"});
                            HelpChimeraActivity helpChimeraActivity2 = biwk.this.a;
                            helpChimeraActivity2.startActivity(intent);
                            asot asotVar = bjbk.a;
                            fecj v = bjdc.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            bjdc bjdcVar = (bjdc) v.b;
                            bjdcVar.i = 145;
                            bjdcVar.b |= 256;
                            bjbk.E(helpChimeraActivity2, v, asnz.a);
                            asot asotVar2 = bjaw.a;
                            if (bivk.b(foof.d())) {
                                fecj v2 = bjda.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                bjda bjdaVar = (bjda) v2.b;
                                bjdaVar.c = 52;
                                bjdaVar.b |= 1;
                                bjda bjdaVar2 = (bjda) v2.Q();
                                HelpConfig hM = helpChimeraActivity2.hM();
                                fecj v3 = bjdb.a.v();
                                if (!v3.b.L()) {
                                    v3.U();
                                }
                                bjdb bjdbVar = (bjdb) v3.b;
                                bjdaVar2.getClass();
                                bjdbVar.d = bjdaVar2;
                                bjdbVar.c = 3;
                                bjaw.J(helpChimeraActivity2, hM, v3);
                            }
                        }
                    });
                    asot asotVar = bjbk.a;
                    fecj v = bjdc.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    bjdc bjdcVar = (bjdc) v.b;
                    bjdcVar.i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
                    bjdcVar.b |= 256;
                    bjbk.E(helpChimeraActivity, v, asnz.a);
                    asot asotVar2 = bjaw.a;
                    if (bivk.b(foof.d())) {
                        fecj v2 = bjda.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        bjda bjdaVar = (bjda) v2.b;
                        bjdaVar.c = 51;
                        bjdaVar.b = 1 | bjdaVar.b;
                        bjda bjdaVar2 = (bjda) v2.Q();
                        HelpConfig hM = helpChimeraActivity.hM();
                        fecj v3 = bjdb.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        bjdb bjdbVar = (bjdb) v3.b;
                        bjdaVar2.getClass();
                        bjdbVar.d = bjdaVar2;
                        bjdbVar.c = 3;
                        bjaw.J(helpChimeraActivity, hM, v3);
                    }
                }
            } else {
                if (account == null) {
                    biqd.d(this, this.W);
                    at();
                    return;
                }
                if (size > 1) {
                    biwk biwkVar2 = this.t;
                    if (biwkVar2.d == null) {
                        biwkVar2.d = (AccountPickerContainer) ((ViewStub) biwkVar2.a.findViewById(R.id.gh_account_picker_view_stub)).inflate();
                    }
                    AccountPickerContainer accountPickerContainer = biwkVar2.d;
                    HelpChimeraActivity helpChimeraActivity2 = biwkVar2.a;
                    ((TextView) accountPickerContainer.findViewById(R.id.gh_account_picker_icon_and_label)).setCompoundDrawablesRelativeWithIntrinsicBounds(bivr.b(accountPickerContainer.getContext().getDrawable(2131232908), accountPickerContainer.getContext(), bivs.a(accountPickerContainer.getContext(), R.attr.gh_primaryBlueColor)), (Drawable) null, (Drawable) null, (Drawable) null);
                    Spinner spinner = (Spinner) accountPickerContainer.findViewById(R.id.gh_account_picker_spinner);
                    List b = biqd.b(accountPickerContainer.getContext());
                    ArrayAdapter arrayAdapter = new ArrayAdapter(helpChimeraActivity2, true != bivk.a(foqb.c()) ? R.layout.gh_help_account_picker_selected_line_item_deprecated : R.layout.gh_help_account_picker_selected_line_item, (String[]) b.toArray(new String[b.size()]));
                    arrayAdapter.setDropDownViewResource(true != bivk.a(foqb.c()) ? R.layout.gh_help_account_picker_dropdown_line_item_deprecated : R.layout.gh_help_account_picker_dropdown_line_item);
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                    if (b.size() < 2) {
                        spinner.setEnabled(false);
                        spinner.setBackgroundColor(accountPickerContainer.getDrawingCacheBackgroundColor());
                    } else {
                        spinner.setOnItemSelectedListener(new biwb(helpChimeraActivity2, spinner));
                    }
                    int a = biqd.a(accountPickerContainer.getContext(), helpChimeraActivity2.W);
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

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        super.onStop();
        birr birrVar = this.ae;
        if (birrVar != null) {
            bipq bipqVar = birrVar.c;
            long currentTimeMillis = System.currentTimeMillis();
            biqa g = bipqVar.g();
            g.d("ongoing_session_last_stopped_ms", currentTimeMillis);
            HelpConfig helpConfig = birrVar.b;
            g.e("ongoing_session_id", helpConfig.e);
            String str = helpConfig.c;
            if (str != null) {
                g.e("ongoing_session_context", str);
            }
            HelpChimeraActivity helpChimeraActivity = birrVar.a;
            if (helpChimeraActivity.o() == fhfg.HELP_ANSWER_FRAGMENT) {
                biqo l2 = helpChimeraActivity.l();
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
        biqu biquVar;
        if (bivk.a(fotk.c()) && o() != fhfg.HELP_ANSWER_FRAGMENT) {
            return this.Q;
        }
        if (o() != fhfg.HELP_ANSWER_FRAGMENT || l() == null || (biquVar = l().a) == null) {
            return null;
        }
        return biquVar.z;
    }

    final String q(biqu biquVar, biqo biqoVar) {
        String str = biqoVar.a.y;
        String str2 = biquVar.y;
        if (!TextUtils.equals(str2, str)) {
            ensv ensvVar = this.o;
            ensvVar.execute(new bjgi(this, ensvVar, str2));
            return "";
        }
        try {
            return (String) bjgn.a(this).get();
        } catch (InterruptedException | ExecutionException e) {
            ((ejhf) ((ejhf) j.i()).s(e)).x("unable to get global js to inject.");
            return "";
        }
    }

    public final void r(final bipo bipoVar) {
        bipq bipqVar = this.z;
        if (bipqVar != null) {
            bipoVar.b(bipqVar);
            return;
        }
        biqq biqqVar = this.af;
        if (biqqVar != null) {
            biqqVar.addObserver(new Observer() { // from class: biya
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bipoVar.b(HelpChimeraActivity.this.z);
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
        bipx.b(z, this.N);
    }

    public final void u(String str) {
        if (an(str)) {
            if (bivk.a(fotw.a.a().a())) {
                asot asotVar = bjbk.a;
                fecj v = bjdc.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                bjdc bjdcVar = (bjdc) fecpVar;
                bjdcVar.i = 113;
                bjdcVar.b |= 256;
                if (!fecpVar.L()) {
                    v.U();
                }
                bjdc bjdcVar2 = (bjdc) v.b;
                bjdcVar2.j = 162;
                bjdcVar2.b |= 1024;
                bjbk.E(this, v, asnz.a);
                asot asotVar2 = bjaw.a;
                if (bivk.b(foof.d())) {
                    fecj v2 = bjda.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fecp fecpVar2 = v2.b;
                    bjda bjdaVar = (bjda) fecpVar2;
                    bjdaVar.c = 46;
                    bjdaVar.b |= 1;
                    if (!fecpVar2.L()) {
                        v2.U();
                    }
                    bjda bjdaVar2 = (bjda) v2.b;
                    bjdaVar2.d = 25;
                    bjdaVar2.b |= 2;
                    bjda bjdaVar3 = (bjda) v2.Q();
                    HelpConfig hM = hM();
                    fecj v3 = bjdb.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    bjdb bjdbVar = (bjdb) v3.b;
                    bjdaVar3.getClass();
                    bjdbVar.d = bjdaVar3;
                    bjdbVar.c = 3;
                    bjaw.J(this, hM, v3);
                }
            } else {
                for (Account account : biqd.c(this)) {
                    if (str.equals(account.name)) {
                        asot asotVar3 = bjbk.a;
                        fecj v4 = bjdc.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fecp fecpVar3 = v4.b;
                        bjdc bjdcVar3 = (bjdc) fecpVar3;
                        bjdcVar3.i = 113;
                        bjdcVar3.b |= 256;
                        if (account != null) {
                            if (!fecpVar3.L()) {
                                v4.U();
                            }
                            bjdc bjdcVar4 = (bjdc) v4.b;
                            bjdcVar4.j = 162;
                            bjdcVar4.b |= 1024;
                            String d = bapk.d(account);
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            bjdc bjdcVar5 = (bjdc) v4.b;
                            d.getClass();
                            bjdcVar5.b |= 4;
                            bjdcVar5.e = d;
                        } else {
                            if (!fecpVar3.L()) {
                                v4.U();
                            }
                            bjdc bjdcVar6 = (bjdc) v4.b;
                            bjdcVar6.j = 163;
                            bjdcVar6.b |= 1024;
                        }
                        bjbk.E(this, v4, asnz.a);
                        asot asotVar4 = bjaw.a;
                        if (bivk.b(foof.d())) {
                            fecj v5 = bjda.a.v();
                            if (!v5.b.L()) {
                                v5.U();
                            }
                            fecp fecpVar4 = v5.b;
                            bjda bjdaVar4 = (bjda) fecpVar4;
                            bjdaVar4.c = 46;
                            bjdaVar4.b |= 1;
                            if (account != null) {
                                if (!fecpVar4.L()) {
                                    v5.U();
                                }
                                bjda bjdaVar5 = (bjda) v5.b;
                                bjdaVar5.d = 25;
                                bjdaVar5.b |= 2;
                                String d2 = bapk.d(account);
                                if (!v5.b.L()) {
                                    v5.U();
                                }
                                bjda bjdaVar6 = (bjda) v5.b;
                                d2.getClass();
                                bjdaVar6.b |= 2048;
                                bjdaVar6.m = d2;
                            } else {
                                if (!fecpVar4.L()) {
                                    v5.U();
                                }
                                bjda bjdaVar7 = (bjda) v5.b;
                                bjdaVar7.d = 26;
                                bjdaVar7.b |= 2;
                            }
                            HelpConfig hM2 = hM();
                            fecj v6 = bjdb.a.v();
                            if (!v6.b.L()) {
                                v6.U();
                            }
                            bjdb bjdbVar2 = (bjdb) v6.b;
                            bjda bjdaVar8 = (bjda) v5.Q();
                            bjdaVar8.getClass();
                            bjdbVar2.d = bjdaVar8;
                            bjdbVar2.c = 3;
                            bjaw.J(this, hM2, v6);
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
        biwf biwfVar = this.ad;
        biwfVar.ah = false;
        biwfVar.ai = true;
        Handler handler = biwfVar.ak;
        handler.removeCallbacks(biwfVar.al);
        biwfVar.aj = null;
        long currentTimeMillis = System.currentTimeMillis() - biwfVar.d;
        long A = (int) folg.a.a().A();
        if (currentTimeMillis >= A || biwfVar.d == -1) {
            biwfVar.x();
        } else {
            if (biwfVar.ag) {
                return;
            }
            handler.postDelayed(biwfVar.am, A - currentTimeMillis);
            biwfVar.ag = true;
        }
    }

    public final void x(fhfg fhfgVar) {
        int ordinal = ((fhfg) this.an.peek()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 || fhfgVar != fhfg.HELP_ANSWER_FRAGMENT) {
                return;
            }
        } else if (fhfgVar != fhfg.HELP_SUB_CONSOLE && fhfgVar != fhfg.HELP_ANSWER_FRAGMENT) {
            return;
        }
        W((fhfg) this.an.peek(), 8);
        this.an.push(fhfgVar);
        W(fhfgVar, 0);
    }

    public final void y(bjdv bjdvVar, CharSequence charSequence, bapl baplVar) {
        HelpConfig helpConfig;
        HelpConfig helpConfig2;
        bjew bjewVar = this.u;
        HelpChimeraActivity helpChimeraActivity = bjewVar.a;
        List<biqu> g = bjdvVar.g(helpChimeraActivity, bjewVar.b);
        RecyclerView recyclerView = bjewVar.c;
        bjfb bjfbVar = bjewVar.d;
        recyclerView.ah(bjfbVar);
        bjfbVar.D(charSequence.toString(), g);
        String d = bjdvVar.d();
        String charSequence2 = charSequence.toString();
        if (bivk.b(foof.d())) {
            bjaw.m(helpChimeraActivity, d);
        }
        bjbk.z(helpChimeraActivity, 15, g, d, charSequence2);
        bjal.a(helpChimeraActivity, aseu.GOOGLEHELP_SEARCH_SHOWN_SEARCH_RESULTS);
        int i = bjgf.e;
        if (bivk.a(foss.c()) && (helpConfig2 = helpChimeraActivity.W) != null && helpConfig2.d != null) {
            fecj i2 = bjgf.i(11);
            fecj v = femi.a.v();
            if (!v.b.L()) {
                v.U();
            }
            femi femiVar = (femi) v.b;
            charSequence2.getClass();
            femiVar.b |= 1;
            femiVar.c = charSequence2;
            if (!i2.b.L()) {
                i2.U();
            }
            femg femgVar = (femg) i2.b;
            femi femiVar2 = (femi) v.Q();
            femg femgVar2 = femg.a;
            femiVar2.getClass();
            femgVar.d = femiVar2;
            femgVar.c = 2;
            new bjgf((femg) i2.Q(), helpChimeraActivity).executeOnExecutor(helpChimeraActivity.n, new Void[0]);
        }
        if (bivk.a(foss.c()) && (helpConfig = helpChimeraActivity.W) != null && helpConfig.d != null) {
            fecj i3 = bjgf.i(11);
            fecj v2 = femm.a.v();
            for (biqu biquVar : g) {
                fecj v3 = femk.a.v();
                String str = biquVar.f;
                if (!v3.b.L()) {
                    v3.U();
                }
                fecp fecpVar = v3.b;
                femk femkVar = (femk) fecpVar;
                str.getClass();
                femkVar.b |= 2;
                femkVar.d = str;
                String str2 = biquVar.g;
                if (!fecpVar.L()) {
                    v3.U();
                }
                femk femkVar2 = (femk) v3.b;
                str2.getClass();
                femkVar2.b |= 1;
                femkVar2.c = str2;
                String v4 = biquVar.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                femk femkVar3 = (femk) v3.b;
                v4.getClass();
                femkVar3.b |= 4;
                femkVar3.e = v4;
                femk femkVar4 = (femk) v3.Q();
                if (!v2.b.L()) {
                    v2.U();
                }
                femm femmVar = (femm) v2.b;
                femkVar4.getClass();
                fedh fedhVar = femmVar.b;
                if (!fedhVar.c()) {
                    femmVar.b = fecp.E(fedhVar);
                }
                femmVar.b.add(femkVar4);
            }
            if (!i3.b.L()) {
                i3.U();
            }
            femg femgVar3 = (femg) i3.b;
            femm femmVar2 = (femm) v2.Q();
            femg femgVar4 = femg.a;
            femmVar2.getClass();
            femgVar3.d = femmVar2;
            femgVar3.c = 7;
            new bjgf((femg) i3.Q(), helpChimeraActivity).executeOnExecutor(helpChimeraActivity.n, new Void[0]);
        }
        x(fhfg.HELP_SUB_CONSOLE);
        this.s.setVisibility(0);
        w();
        bjdc n = n(this);
        long a = baplVar.a();
        bjbk.u(this, 10, a, fhfg.b(n.q), n.l, n.m, n.n);
        bjaw.w(this, 42, a, fhfg.b(n.q), n.l, n.m, n.n);
    }

    public final void z() {
        this.p.c();
        ensv ensvVar = this.o;
        new bjfr(this, ensvVar).executeOnExecutor(ensvVar, new Void[0]);
    }

    @Override // defpackage.biyw, defpackage.biqn
    public final Context a() {
        return this;
    }
}
