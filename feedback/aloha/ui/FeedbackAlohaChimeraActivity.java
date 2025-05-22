package com.google.android.gms.feedback.aloha.ui;

import android.accounts.Account;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.feedback.aloha.ui.FeedbackAlohaChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.atwh;
import defpackage.auid;
import defpackage.auio;
import defpackage.aumo;
import defpackage.aury;
import defpackage.ausn;
import defpackage.bckm;
import defpackage.bcko;
import defpackage.bckq;
import defpackage.bckr;
import defpackage.bcnl;
import defpackage.bcnm;
import defpackage.bcnt;
import defpackage.bcnv;
import defpackage.bcnw;
import defpackage.bcoc;
import defpackage.bcol;
import defpackage.bcpa;
import defpackage.bcpg;
import defpackage.bcpv;
import defpackage.bcpw;
import defpackage.bcqd;
import defpackage.bcqj;
import defpackage.bcqm;
import defpackage.bcqp;
import defpackage.bcqs;
import defpackage.bcqt;
import defpackage.bcqu;
import defpackage.bcqv;
import defpackage.bcqw;
import defpackage.bcqx;
import defpackage.bcqy;
import defpackage.bcrb;
import defpackage.bcrc;
import defpackage.bcrd;
import defpackage.bcre;
import defpackage.bcrf;
import defpackage.bcrg;
import defpackage.bcrh;
import defpackage.bcri;
import defpackage.bcrj;
import defpackage.bcrk;
import defpackage.bcro;
import defpackage.bcrq;
import defpackage.bcrs;
import defpackage.bcrt;
import defpackage.bcrw;
import defpackage.bcrx;
import defpackage.bcrz;
import defpackage.bcsc;
import defpackage.bcse;
import defpackage.bcsg;
import defpackage.bcsk;
import defpackage.bcst;
import defpackage.bcsu;
import defpackage.bcsv;
import defpackage.bctb;
import defpackage.bctc;
import defpackage.bctg;
import defpackage.bkug;
import defpackage.bkzy;
import defpackage.blad;
import defpackage.blah;
import defpackage.dyku;
import defpackage.dyky;
import defpackage.edxt;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.esal;
import defpackage.esbj;
import defpackage.fmjd;
import defpackage.fqfu;
import defpackage.fqgk;
import defpackage.fqhm;
import defpackage.fqhv;
import defpackage.fqib;
import defpackage.fqjx;
import defpackage.fqlk;
import defpackage.fqln;
import defpackage.fqlq;
import defpackage.fqng;
import defpackage.fqnv;
import defpackage.fqob;
import defpackage.fywe;
import defpackage.ion;
import defpackage.rxx;
import defpackage.sun;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FeedbackAlohaChimeraActivity extends rxx implements bcpv, bcnw, bckr, bcnm, bcqy, bcqu {
    public static final ausn j = ausn.b("gf_FeedbackAlohaActivity", auid.FEEDBACK);
    public static HelpConfig k;
    private static sun m;
    public bctb l;
    private String n;
    private View o;
    private ServiceConnection p;
    private bcqx q;
    private bcrk r;
    private KeyguardManager s;
    private aca t;

    private final int Q() {
        return ion.f(getColor(R.color.gm3_ref_palette_black), 102);
    }

    private final int R() {
        return getColor(android.R.color.transparent);
    }

    private final bcnl W(Intent intent, ErrorReport errorReport) {
        Screenshot screenshot = null;
        Long valueOf = intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null;
        final bcqs ab = ab();
        Parcelable parcelableExtra = intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA");
        if (bcnt.e(errorReport)) {
            try {
                errorReport.a.processName = ab.b.getPackageManager().getApplicationInfo(errorReport.a.packageName, 0).processName;
                bcqt bcqtVar = ab.c;
                blad bladVar = new blad() { // from class: bcqr
                    @Override // defpackage.blad
                    public final void G(Parcelable parcelable) {
                        bcnl bcnlVar = bcqs.this.d.b;
                        if (bcnlVar == null) {
                            ((eluo) ((eluo) bcqs.a.j()).ai((char) 3657)).x("Session is null, not updating screenshot.");
                        } else {
                            bcnlVar.s((Screenshot) parcelable);
                        }
                    }
                };
                Bitmap bitmap = errorReport.af;
                String str = errorReport.T;
                if (bitmap != null) {
                    screenshot = Screenshot.b(bitmap);
                } else if (parcelableExtra != null) {
                    screenshot = (Screenshot) parcelableExtra;
                } else {
                    byte[] bArr = errorReport.v;
                    if (bArr != null) {
                        screenshot = Screenshot.d(bArr, errorReport.x, errorReport.w);
                    } else if (!TextUtils.isEmpty(str)) {
                        screenshot = new Screenshot();
                        Screenshot.a(bcqtVar.a.getFilesDir(), str, screenshot, false, bladVar);
                    } else if (!TextUtils.isEmpty(errorReport.u)) {
                        screenshot = Screenshot.c(errorReport.u, errorReport.x, errorReport.w);
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((eluo) ((eluo) ((eluo) bcqs.a.i()).s(e)).ai((char) 3656)).x("Process name couldn't be extracted");
                return null;
            }
        }
        bcnl bcnlVar = new bcnl(this, errorReport, screenshot, valueOf);
        ab.d.b = bcnlVar;
        return bcnlVar;
    }

    private final void Y(int i, int i2, int i3) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(i3);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bcra
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FeedbackAlohaChimeraActivity.this.getWindow().getDecorView().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    private final void Z() {
        bcrb bcrbVar = new bcrb(this);
        KeyguardManager keyguardManager = this.s;
        if (keyguardManager != null) {
            keyguardManager.requestDismissKeyguard(getContainerActivity(), bcrbVar);
        }
    }

    private final boolean aa() {
        return getPackageManager().hasSystemFeature("android.software.communal_mode");
    }

    private static final bcqs ab() {
        bcsv bcsvVar = bcsu.a().a;
        if (bcsvVar.c == null) {
            bcsvVar.c = new bcqs(bcsvVar.a, bcsvVar.a(), bcsvVar.b());
        }
        bcqs bcqsVar = bcsvVar.c;
        ekvl.y(bcqsVar);
        return bcqsVar;
    }

    private static final bcqv ac() {
        return bcsu.a().a.b();
    }

    private static final bcnl ae() {
        return ac().b;
    }

    private static final ErrorReport af() {
        if (ae() == null) {
            return null;
        }
        bcnl ae = ae();
        ekvl.y(ae);
        return ae.b();
    }

    private final void ag(int i) {
        bcsk.j(this, af(), i, 0, 0);
    }

    @Override // defpackage.bcnm
    public final String A() {
        return "";
    }

    @Override // defpackage.bcnm
    public final String B() {
        return this.n;
    }

    @Override // defpackage.bcqy
    public final void C(esbj esbjVar) {
        O(getIntent(), esbjVar);
    }

    @Override // defpackage.bcqy
    public final boolean D() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    @Override // defpackage.bcnm
    public final void F(Screenshot screenshot, ErrorReport errorReport) {
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        bcqx bcqxVar = this.q;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        final bcrs bcrsVar = new bcrs(screenshot, errorReport, rect, Pair.create(Integer.valueOf(point.x), Integer.valueOf(point.y)));
        bcrj bcrjVar = (bcrj) bcqxVar;
        final bcrt bcrtVar = bcrjVar.d;
        bcrz bcrzVar = bcrtVar.c;
        eqgc.t(bcrzVar.a.submit(new Callable() { // from class: bcrr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                int i2;
                bcrs bcrsVar2 = bcrsVar;
                Screenshot screenshot2 = bcrsVar2.a;
                if (screenshot2 == null || TextUtils.isEmpty(screenshot2.d)) {
                    return null;
                }
                ErrorReport errorReport2 = bcrsVar2.b;
                if (errorReport2.v == null) {
                    i = screenshot2.b;
                    i2 = screenshot2.c;
                } else {
                    i = errorReport2.x;
                    i2 = errorReport2.w;
                }
                bcrt bcrtVar2 = bcrt.this;
                Pair a = bcnt.a(bcrtVar2.a.getResources(), bcrsVar2.c, i, i2, true);
                boolean d = bcnt.d(bcrsVar2.d, screenshot2);
                bcqv bcqvVar = bcrtVar2.b;
                bcqvVar.h = d;
                byte[] bArr = errorReport2.v;
                if (bArr == null) {
                    bArr = Base64.decode(screenshot2.d, 0);
                }
                if (!bcqt.a(d)) {
                    bcqvVar.c = Screenshot.f(bArr, d);
                    return null;
                }
                if (bcqvVar.c()) {
                    return null;
                }
                bcqvVar.c = Bitmap.createScaledBitmap(Screenshot.f(bArr, false), ((Integer) a.first).intValue(), ((Integer) a.second).intValue(), true);
                return null;
            }
        }), new bcrh(), bcrjVar.f.b);
    }

    @Override // defpackage.bcqy
    public final void G(int i) {
        bcsk.j(this, af(), fywe.p, 0, i);
    }

    @Override // defpackage.bcqy
    public final void H(int i, int i2, int i3) {
        bcsc bcscVar = new bcsc();
        bcscVar.a = af();
        bcscVar.b(fywe.p);
        bcscVar.m = i;
        bcscVar.h = Integer.valueOf(i2);
        bcscVar.i = Integer.valueOf(i3);
        bcsk.b(this, bcscVar.a());
    }

    public final FrameLayout I() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.feedback_content);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.bcpv
    public final void J(bcol bcolVar) {
        if (ae() != null) {
            bcnl ae = ae();
            ekvl.y(ae);
            ae.i(bcolVar);
        }
    }

    @Override // defpackage.bcnw
    public final void K(bcnv bcnvVar, ErrorReport errorReport, bcpg bcpgVar) {
        bcrk bcrkVar = this.r;
        if (bcrkVar != null) {
            bcrkVar.dismiss();
        }
        if (ae() == null) {
            return;
        }
        if (bcnvVar != null) {
            bcnl ae = ae();
            ekvl.y(ae);
            ae.a().h(esal.CLIENT_REFERENCE_IS_JUNK, true != bcnvVar.c ? "false" : "true");
        }
        bcnl ae2 = ae();
        ekvl.y(ae2);
        ae2.m(esal.CLIENT_REFERENCE_JUNK_ASYNC);
    }

    final ErrorReport M(Intent intent) {
        ErrorReport errorReport = new ErrorReport();
        if (intent.hasExtra("android.intent.extra.BUG_REPORT")) {
            ApplicationErrorReport applicationErrorReport = (ApplicationErrorReport) intent.getParcelableExtra("android.intent.extra.BUG_REPORT");
            ekvl.y(applicationErrorReport);
            errorReport.a = applicationErrorReport;
        }
        if (intent.hasExtra("com.android.feedback.SAFEPARCELABLE_REPORT")) {
            errorReport = (ErrorReport) intent.getParcelableExtra("com.android.feedback.SAFEPARCELABLE_REPORT");
            ekvl.y(errorReport);
            if (!TextUtils.isEmpty(errorReport.B)) {
                this.n = errorReport.B;
                if (!errorReport.E) {
                    errorReport.B = "";
                }
            }
        }
        bcpw.i = errorReport.Z;
        if (TextUtils.isEmpty(errorReport.ag)) {
            errorReport.ag = bctg.c();
        }
        return errorReport;
    }

    public final void O(Intent intent, esbj esbjVar) {
        bcnl ae = ae();
        if (ae == null) {
            return;
        }
        View view = this.o;
        if (view != null && view.getId() == R.id.aloha_dynamic_ui && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        ErrorReport M = M(intent);
        bcqx bcqxVar = this.q;
        String str = M.a.packageName;
        String str2 = M.P;
        String str3 = M.ap;
        bcrj bcrjVar = (bcrj) bcqxVar;
        bcqd bcqdVar = bcrjVar.c;
        atwh atwhVar = bcrjVar.h;
        final fmjd d = bcqj.d(str, str2, str3);
        final bcqj bcqjVar = (bcqj) bcqdVar;
        eqgc.t(eqdl.g(bcqjVar.c.a(d, atwhVar), new eqdv() { // from class: bcqh
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                ekvi ekviVar = (ekvi) obj;
                if (!ekviVar.h()) {
                    return eqgc.i(false);
                }
                fmjd fmjdVar = d;
                bcqj bcqjVar2 = bcqj.this;
                bcqjVar2.c(fmjdVar, (fmiz) ekviVar.c());
                Map map = bcqjVar2.e;
                fmja fmjaVar = (fmja) fmjb.a.v();
                for (Map.Entry entry : map.entrySet()) {
                    if (bcss.b((fmje) entry.getValue())) {
                        if (fqhv.c() && (((fmje) entry.getValue()).b & 2) != 0) {
                            fmiz fmizVar = ((fmje) entry.getValue()).d;
                            if (fmizVar == null) {
                                fmizVar = fmiz.a;
                            }
                            if ((fmizVar.b & 1) != 0) {
                                fmiz fmizVar2 = ((fmje) entry.getValue()).d;
                                if (fmizVar2 == null) {
                                    fmizVar2 = fmiz.a;
                                }
                                esbj esbjVar2 = fmizVar2.c;
                                if (esbjVar2 == null) {
                                    esbjVar2 = esbj.a;
                                }
                                if ((esbjVar2.b & 8) != 0) {
                                    fmiz fmizVar3 = ((fmje) entry.getValue()).d;
                                    if (fmizVar3 == null) {
                                        fmizVar3 = fmiz.a;
                                    }
                                    esbj esbjVar3 = fmizVar3.c;
                                    if (esbjVar3 == null) {
                                        esbjVar3 = esbj.a;
                                    }
                                    if (esbjVar3.g) {
                                    }
                                }
                            }
                        }
                        fgrc v = fmjc.a.v();
                        fmjd fmjdVar2 = (fmjd) entry.getKey();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fmjc fmjcVar = (fmjc) v.b;
                        fmjdVar2.getClass();
                        fmjcVar.c = fmjdVar2;
                        fmjcVar.b |= 1;
                        fmje fmjeVar = (fmje) entry.getValue();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fmjc fmjcVar2 = (fmjc) v.b;
                        fmjeVar.getClass();
                        fmjcVar2.d = fmjeVar;
                        fmjcVar2.b |= 2;
                        fmjaVar.a(v);
                    }
                }
                bcqm bcqmVar = bcqjVar2.g;
                eqgl i = eqgc.i((fmjb) fmjaVar.Q());
                final bcko bckoVar = bcqmVar.a;
                Objects.requireNonNull(bckoVar);
                return eqdl.f(eqdl.g(i, new eqdv() { // from class: bcqk
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        return bcko.this.b((fmjb) obj2);
                    }
                }, bcqmVar.b.a), new ekut() { // from class: bcqe
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        ausn ausnVar = bcqj.a;
                        return true;
                    }
                }, bcqjVar2.d.a);
            }
        }, bcqjVar.d.a), new bcri(), bcrjVar.f.b);
        if (fqlk.c()) {
            elgo i = elgo.i(esbjVar.f);
            bcnl ae2 = ae();
            if (ae2 == null) {
                ((eluo) ((eluo) j.j()).ai((char) 3671)).x("Session is null, not setting allowed PSD List.");
            } else {
                ae2.o(i);
            }
        }
        m = sun.a(esbjVar, this, ae.a());
        View c = sun.c();
        this.o = c;
        c.setId(R.id.aloha_dynamic_ui);
        if (fqjx.c()) {
            c.setElevation(2.0f);
        }
        FrameLayout I = I();
        I.addView(c, new FrameLayout.LayoutParams(-1, -1));
        fqng.a.lK().a();
        setContentView(I);
        bcsg.a(this, auio.FEEDBACK_ALOHA_LAUNCHED);
        if (fqob.c()) {
            bcsg.a(this, auio.FEEDBACK_ACTIVITY);
        }
    }

    public final void P(int i, ErrorReport errorReport) {
        bcsk.g(this, errorReport, i, TextUtils.isEmpty(this.n) ? null : new Account(this.n, "com.google"), null, null);
    }

    @Override // defpackage.bcnm
    public final boolean S() {
        return false;
    }

    @Override // defpackage.bcnm
    public final boolean T() {
        return false;
    }

    @Override // defpackage.bcnm
    public final boolean U() {
        return false;
    }

    @Override // defpackage.bcnm
    public final boolean V() {
        return false;
    }

    @Override // defpackage.bcnm
    public final boolean X() {
        return true;
    }

    @Override // defpackage.bckr
    public final Activity a() {
        return getContainerActivity();
    }

    @Override // defpackage.bcnw
    public final void ad(bcpg bcpgVar) {
        bcrk bcrkVar = new bcrk();
        this.r = bcrkVar;
        bcrkVar.show(getSupportFragmentManager(), "progress_dialog");
    }

    @Override // defpackage.bckr
    public final void d() {
        getWindow().getDecorView().setBackgroundColor(Q());
    }

    @Override // defpackage.bckr
    public final void e() {
        bcnl ae = ae();
        if (ae == null || ae.l.c) {
            return;
        }
        af();
    }

    @Override // defpackage.bckr
    public final void f(final ErrorReport errorReport, boolean z) {
        final bcrw bcrwVar = new bcrw(this, bcsu.a().a.d(), ac());
        bcqv bcqvVar = bcrwVar.b;
        bcrz bcrzVar = bcrwVar.a;
        final bcnl bcnlVar = bcqvVar.b;
        bcrzVar.a.execute(new Runnable() { // from class: bcrv
            @Override // java.lang.Runnable
            public final void run() {
                ErrorReport errorReport2;
                bcnl bcnlVar2 = bcnlVar;
                if (bcnlVar2 != null) {
                    bcnlVar2.r();
                    errorReport2 = bcnlVar2.b();
                } else {
                    errorReport2 = errorReport;
                }
                bcrw bcrwVar2 = bcrw.this;
                if (bcnlVar2 == null || !bcnlVar2.u()) {
                    bcrwVar2.a(errorReport2);
                } else {
                    bcrwVar2.b(bcnlVar2);
                }
            }
        });
    }

    @Override // defpackage.bckr
    public final void g(String str, ErrorReport errorReport) {
        if (!fqib.c() || !str.equals(fqfu.n())) {
            bcpa.c(getContainerActivity(), str, errorReport);
            return;
        }
        try {
            dyky.b(this, this.t, errorReport != null ? errorReport.B : "");
        } catch (dyku unused) {
            bcpa.c(getContainerActivity(), fqfu.n(), errorReport);
        }
    }

    @Override // defpackage.bckr
    public final void h(String str) {
        bctb bctbVar = this.l;
        if (bctbVar == null) {
            return;
        }
        try {
            bctc d = bctbVar.d();
            if (d != null) {
                Parcel fE = d.fE();
                fE.writeString(str);
                d.fH(2, fE);
            }
        } catch (RemoteException e) {
            ((eluo) ((eluo) ((eluo) j.i()).s(e)).ai((char) 3667)).x("Unable to notify callback");
        }
    }

    @Override // defpackage.bckr
    public final void i() {
        startActivity(new Intent().setClassName(this, "com.google.android.gms.feedback.PreviewActivity"));
    }

    @Override // defpackage.bckr
    public final void j() {
        ErrorReport af = af();
        if (af == null) {
            return;
        }
        bcsu.a().a.a();
        boolean a = bcqt.a(ac().h);
        Intent intent = new Intent();
        if (a) {
            intent.setClassName(this, "com.google.android.gms.feedback.AnnotateScreenshotActivity");
            ThemeSettings themeSettings = af.Y;
            if (themeSettings != null && themeSettings.b != 0) {
                intent.putExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", bkug.a(themeSettings));
            }
        } else {
            intent.setClassName(this, "com.google.android.gms.feedback.PreviewScreenshotActivity");
        }
        startActivity(intent);
    }

    @Override // defpackage.bckr
    public final void k() {
        startActivity(bcpa.a(this));
    }

    @Override // defpackage.bckr
    public final void l() {
        startActivity(bcpa.b(this));
    }

    @Override // defpackage.bckr
    public final void m(Integer num, Integer num2, elgo elgoVar) {
        sun.d(num, num2, elgoVar);
    }

    @Override // defpackage.bckr, defpackage.bcnm
    public final void n(Runnable runnable) {
        runOnUiThread(runnable);
    }

    @Override // defpackage.bckr
    public final void o() {
        getWindow().getDecorView().setBackgroundColor(R());
    }

    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ?? r17;
        eqgl a;
        eqgl submit;
        Intent intent = getIntent();
        if (intent.getBooleanExtra("com.android.feedback.DISMISS_SELF_EXTRA", false)) {
            p();
            return;
        }
        super.onCreate(bundle);
        bcoc.a();
        ErrorReport M = M(intent);
        if (Build.VERSION.SDK_INT >= 26 && aa() && fqlq.d()) {
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
            this.s = keyguardManager;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                Z();
                return;
            }
        }
        if (fqln.c() && bundle != null && ae() == null) {
            finish();
            return;
        }
        if (!fqln.c() || ae() == null) {
            bcnl W = W(intent, M(intent));
            if (W == null) {
                finish();
                return;
            }
            W.n();
        } else {
            bcnl ae = ae();
            ekvl.y(ae);
            ae.h = this;
            bckq bckqVar = ae.i;
            if (bckqVar != null) {
                bckqVar.d = this;
            }
        }
        ac().e = this.n;
        getWindow().setSoftInputMode(16);
        getWindow().setFlags(JGCastService.FLAG_USE_TDLS, 0);
        getWindow().setStatusBarColor(R());
        fqln fqlnVar = fqln.a;
        if (!fqlnVar.lK().c() && ((!fqlnVar.lK().d() || !aury.m(this)) && Build.VERSION.SDK_INT != 26)) {
            setRequestedOrientation(1);
        }
        if (fqnv.c()) {
            blah.b(this, M, R.style.DynamicUI_Theme_Transparent_Light_GM3Expressive, R.style.DynamicUI_Theme_Transparent_Dark_GM3Expressive, R.style.DynamicUI_Theme_Transparent_GM3Expressive);
        } else {
            blah.b(this, M, R.style.DynamicUI_Theme_Transparent_Light, R.style.DynamicUI_Theme_Transparent_Dark, R.style.DynamicUI_Theme_Transparent);
        }
        if (fqgk.c()) {
            int i = edxt.a;
        }
        bcsk.d(this, M, TextUtils.isEmpty(this.n) ? null : new Account(this.n, "com.google"));
        if (M.E) {
            ((eluo) ((eluo) j.i()).ai((char) 3669)).x("Invalid request for feedback invocation. This action is not permitted");
            finish();
            return;
        }
        if (fqhm.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        setContentView(I());
        bcsv bcsvVar = bcsu.a().a;
        if (bcsvVar.b == null) {
            bcrx c = bcsvVar.c();
            Context context = bcsvVar.a;
            r17 = 0;
            bcqp bcqpVar = new bcqp(bckm.a(context), bcsvVar.c(), new bcse(context, bcsvVar.b(), bcsvVar.e()), bcsvVar.d());
            bcqm bcqmVar = new bcqm(new bcko(context), bcsvVar.d());
            if (bcsvVar.d == null) {
                bcsvVar.e();
                bcsvVar.d = new bcrq(bcsvVar.b(), bcsvVar.c(), bcsvVar.d());
            }
            bcrq bcrqVar = bcsvVar.d;
            ekvl.y(bcrqVar);
            bcsvVar.b = new bcqj(c, bcqpVar, bcqmVar, bcrqVar, bcsvVar.d());
        } else {
            r17 = 0;
        }
        bcqd bcqdVar = bcsvVar.b;
        ekvl.y(bcqdVar);
        Context context2 = bcsvVar.a;
        bcqv b = bcsvVar.b();
        bcsvVar.a();
        bcrj bcrjVar = new bcrj(this, bcqdVar, new bcrt(context2, b, bcsvVar.d()), bcsvVar.d(), bcsvVar.c());
        this.q = bcrjVar;
        atwh atwhVar = new atwh();
        atwhVar.d = getApplicationContext().getPackageName();
        atwhVar.e = getPackageName();
        atwhVar.a = getApplicationInfo().uid;
        bcrjVar.g = M;
        bcrjVar.h = atwhVar;
        bcrjVar.b();
        bcqy a2 = bcrjVar.a();
        if (a2 != null) {
            a2.x();
            a2.w();
        }
        bcqd bcqdVar2 = bcrjVar.c;
        String str = M.a.packageName;
        String str2 = M.P;
        String str3 = M.ap;
        fqhv fqhvVar = fqhv.a;
        if (fqhvVar.lK().c() && bcoc.f(str, fqhvVar.lK().a()) && !bcoc.d(str, fqhvVar.lK().b())) {
            final bcqj bcqjVar = (bcqj) bcqdVar2;
            final eqgl a3 = bcqjVar.a(str, str2, atwhVar, str3);
            final bcrq bcrqVar2 = bcqjVar.f;
            String str4 = bcrqVar2.b.e;
            final Account account = TextUtils.isEmpty(str4) ? null : new Account(str4, "com.google");
            if (account == null) {
                submit = eqgc.i(Boolean.valueOf((boolean) r17));
            } else {
                submit = bcrqVar2.c.a.submit(new Callable() { // from class: bcrp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i2;
                        long currentTimeMillis = System.currentTimeMillis();
                        HasCapabilitiesRequest hasCapabilitiesRequest = new HasCapabilitiesRequest(account, new String[]{eupc.a.a});
                        bcrq bcrqVar3 = bcrq.this;
                        Context context3 = bcrqVar3.a.a;
                        try {
                            String str5 = wjx.a;
                            i2 = wkg.c(context3, hasCapabilitiesRequest);
                        } catch (IOException | wjw e) {
                            ((eluo) ((eluo) ((eluo) bcsm.a.i()).s(e)).ai((char) 3690)).x("HasCapabilities task failed");
                            i2 = 3;
                        }
                        bcrx bcrxVar = bcrqVar3.a;
                        bcsc bcscVar = new bcsc();
                        bcscVar.a = bcrqVar3.b.a();
                        bcscVar.b(fywe.M);
                        bcscVar.j = Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis));
                        bcsk.b(bcrxVar.a, bcscVar.a());
                        return Boolean.valueOf(i2 == 2);
                    }
                });
            }
            ekut ekutVar = new ekut() { // from class: bcqf
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    bcqj bcqjVar2 = bcqj.this;
                    try {
                        if (!Boolean.TRUE.equals((Boolean) obj)) {
                            return bcqq.a;
                        }
                        bcrx bcrxVar = bcqjVar2.b;
                        esbj a4 = dowr.a(bcrxVar.a, R.raw.block_feedback_flow_minors_config_binarypb);
                        fgrc fgrcVar = (fgrc) a4.iQ(5, null);
                        fgrcVar.X(a4);
                        esbe esbeVar = ((esbj) fgrcVar.b).e;
                        if (esbeVar == null) {
                            esbeVar = esbe.a;
                        }
                        fgrc fgrcVar2 = (fgrc) esbeVar.iQ(5, null);
                        fgrcVar2.X(esbeVar);
                        esbd esbdVar = (esbd) fgrcVar2;
                        esbg a5 = esbdVar.a(0);
                        fgrc fgrcVar3 = (fgrc) a5.iQ(5, null);
                        fgrcVar3.X(a5);
                        esbf esbfVar = (esbf) fgrcVar3;
                        esat a6 = esbfVar.a(0);
                        fgrc fgrcVar4 = (fgrc) a6.iQ(5, null);
                        fgrcVar4.X(a6);
                        esaj esajVar = (esaj) fgrcVar4;
                        esat a7 = esajVar.a(0);
                        fgrc fgrcVar5 = (fgrc) a7.iQ(5, null);
                        fgrcVar5.X(a7);
                        esaj esajVar2 = (esaj) fgrcVar5;
                        String b2 = bcrxVar.b(R.string.close_button_label);
                        if (!esajVar2.b.L()) {
                            esajVar2.U();
                        }
                        esat esatVar = (esat) esajVar2.b;
                        esat esatVar2 = esat.a;
                        b2.getClass();
                        esatVar.b |= 256;
                        esatVar.m = b2;
                        esajVar.k(0, esajVar2);
                        esat a8 = esajVar.a(1);
                        fgrc fgrcVar6 = (fgrc) a8.iQ(5, null);
                        fgrcVar6.X(a8);
                        esaj esajVar3 = (esaj) fgrcVar6;
                        String b3 = bcrxVar.b(R.string.gf_title_block_feedback_minors);
                        if (!esajVar3.b.L()) {
                            esajVar3.U();
                        }
                        esat esatVar3 = (esat) esajVar3.b;
                        b3.getClass();
                        esatVar3.b |= 4;
                        esatVar3.f = b3;
                        esajVar.k(1, esajVar3);
                        esbfVar.k(0, esajVar);
                        esbdVar.k(0, esbfVar);
                        esbg a9 = esbdVar.a(1);
                        fgrc fgrcVar7 = (fgrc) a9.iQ(5, null);
                        fgrcVar7.X(a9);
                        esbf esbfVar2 = (esbf) fgrcVar7;
                        esat a10 = esbfVar2.a(0);
                        fgrc fgrcVar8 = (fgrc) a10.iQ(5, null);
                        fgrcVar8.X(a10);
                        esaj esajVar4 = (esaj) fgrcVar8;
                        String b4 = bcrxVar.b(R.string.gf_how_to_proceed);
                        if (!esajVar4.b.L()) {
                            esajVar4.U();
                        }
                        esat esatVar4 = (esat) esajVar4.b;
                        b4.getClass();
                        esatVar4.b |= 4;
                        esatVar4.f = b4;
                        esbfVar2.k(0, esajVar4);
                        esat a11 = esbfVar2.a(1);
                        fgrc fgrcVar9 = (fgrc) a11.iQ(5, null);
                        fgrcVar9.X(a11);
                        esaj esajVar5 = (esaj) fgrcVar9;
                        esat a12 = esajVar5.a(0);
                        fgrc fgrcVar10 = (fgrc) a12.iQ(5, null);
                        fgrcVar10.X(a12);
                        esaj esajVar6 = (esaj) fgrcVar10;
                        String b5 = bcrxVar.b(R.string.gf_snippet_heading_block_feedback_minors);
                        if (!esajVar6.b.L()) {
                            esajVar6.U();
                        }
                        esat esatVar5 = (esat) esajVar6.b;
                        b5.getClass();
                        esatVar5.b |= 4;
                        esatVar5.f = b5;
                        esajVar5.k(0, esajVar6);
                        esat a13 = esajVar5.a(1);
                        fgrc fgrcVar11 = (fgrc) a13.iQ(5, null);
                        fgrcVar11.X(a13);
                        esaj esajVar7 = (esaj) fgrcVar11;
                        String b6 = bcrxVar.b(R.string.gf_snippet_paragraph_block_feedback_minors);
                        if (!esajVar7.b.L()) {
                            esajVar7.U();
                        }
                        esat esatVar6 = (esat) esajVar7.b;
                        b6.getClass();
                        esatVar6.b |= 4;
                        esatVar6.f = b6;
                        esajVar5.k(1, esajVar7);
                        esbfVar2.k(1, esajVar5);
                        esat a14 = esbfVar2.a(2);
                        fgrc fgrcVar12 = (fgrc) a14.iQ(5, null);
                        fgrcVar12.X(a14);
                        esaj esajVar8 = (esaj) fgrcVar12;
                        String b7 = bcrxVar.b(R.string.close_button_label);
                        if (!esajVar8.b.L()) {
                            esajVar8.U();
                        }
                        esat esatVar7 = (esat) esajVar8.b;
                        b7.getClass();
                        esatVar7.b |= 4;
                        esatVar7.f = b7;
                        esbfVar2.k(2, esajVar8);
                        esbdVar.k(1, esbfVar2);
                        esbe esbeVar2 = (esbe) esbdVar.Q();
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        esbj esbjVar = (esbj) fgrcVar.b;
                        esbeVar2.getClass();
                        esbjVar.e = esbeVar2;
                        esbjVar.b |= 4;
                        return new bcqq((esbj) fgrcVar.Q(), 3);
                    } catch (InterruptedException e) {
                        ((eluo) ((eluo) ((eluo) bcqj.a.h()).s(e)).ai((char) 3653)).x("Unable to fetch minor tree.");
                        return bcqq.a;
                    }
                }
            };
            eqgo eqgoVar = bcqjVar.d.a;
            final eqgl f = eqdl.f(submit, ekutVar, eqgoVar);
            eqgl[] eqglVarArr = new eqgl[2];
            eqglVarArr[r17] = a3;
            eqglVarArr[1] = f;
            a = eqgc.b(eqglVarArr).a(new Callable() { // from class: bcqi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ausn ausnVar = bcqj.a;
                    bcqq bcqqVar = (bcqq) eqgc.r(eqgl.this);
                    return bcqqVar != bcqq.a ? bcqqVar : (bcqq) eqgc.r(a3);
                }
            }, eqgoVar);
        } else {
            a = ((bcqj) bcqdVar2).a(str, str2, atwhVar, str3);
        }
        eqgc.t(a, new bcrg(bcrjVar), bcrjVar.f.b);
        k = bcnt.b(M, this);
        bcpw.b(this);
        List list = ac().f;
        if (!list.contains(this)) {
            list.add(this);
        }
        this.t = registerForActivityResult(new acq(), new aby() { // from class: bcqz
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ausn ausnVar = FeedbackAlohaChimeraActivity.j;
            }
        });
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        bctb bctbVar = this.l;
        if (bctbVar != null) {
            try {
                bctc d = bctbVar.d();
                if (d != null) {
                    d.fH(3, d.fE());
                }
            } catch (RemoteException e) {
                ((eluo) ((eluo) ((eluo) j.i()).s(e)).ai((char) 3668)).x("Unable to notify callback");
            }
        }
        bcpw.d(null);
        ac().f.remove(this);
        ((bcrj) this.q).b = null;
        if (!fqln.c()) {
            ac().b();
        } else if (isFinishing()) {
            ac().b();
        }
        if (this.l != null) {
            aumo.a().b(this, this.p);
        }
        super.onDestroy();
    }

    @Override // defpackage.rxx, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        bcnl ae = ae();
        if (ae == null || ae.w() || m == null) {
            p();
            return true;
        }
        sun.b();
        return true;
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        bcrj bcrjVar;
        bcqy a;
        if (intent.getBooleanExtra("com.android.feedback.DISMISS_SELF_EXTRA", false)) {
            p();
            return;
        }
        if (ae() != null && intent != null) {
            ErrorReport M = M(intent);
            bcnl ae = ae();
            ekvl.y(ae);
            ErrorReport b = ae.b();
            if (b != null && !TextUtils.isEmpty(M.R) && !TextUtils.isEmpty(b.R) && TextUtils.equals(M.R, b.R)) {
                return;
            }
        }
        setIntent(intent);
        bcoc.a();
        ac().b();
        ErrorReport M2 = M(intent);
        super.onNewIntent(intent);
        if (Build.VERSION.SDK_INT >= 26 && aa() && fqlq.d()) {
            if (this.s == null) {
                this.s = (KeyguardManager) getSystemService("keyguard");
            }
            KeyguardManager keyguardManager = this.s;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                Z();
                return;
            }
        }
        bcnl W = W(intent, M2);
        if (W == null) {
            finish();
            return;
        }
        W.n();
        ac().e = this.n;
        if (M2.E || (a = (bcrjVar = (bcrj) this.q).a()) == null) {
            return;
        }
        bcqd bcqdVar = bcrjVar.c;
        String str = bcrjVar.g.a.packageName;
        ErrorReport errorReport = bcrjVar.g;
        esbj b2 = ((bcqj) bcqdVar).b(bcqj.d(str, errorReport.P, errorReport.ap));
        if (b2 == null) {
            try {
                b2 = ((bcqj) bcqdVar).b.a();
            } catch (InterruptedException e) {
                ((eluo) ((eluo) ((eluo) bcqj.a.h()).s(e)).ai((char) 3651)).x("Unable to fetch app bundled ui tree.");
                b2 = null;
            }
        }
        if (b2 == null) {
            a.r();
        } else {
            bcrjVar.b();
            a.C(b2);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (fqln.c()) {
            return;
        }
        bcoc.a();
        if (ae() != null) {
            bcnl ae = ae();
            ekvl.y(ae);
            ae.j(bundle);
            return;
        }
        bcqs ab = ab();
        bcnl bcnlVar = new bcnl(this, bundle);
        ab.d.b = bcnlVar;
        ac().b = bcnlVar;
        bcnl ae2 = ae();
        ekvl.y(ae2);
        ae2.n();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (fqln.c() || ae() == null) {
            return;
        }
        bcnl ae = ae();
        ekvl.y(ae);
        ae.k(bundle);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        if (ae() != null) {
            bcnl ae = ae();
            ekvl.y(ae);
            ae.l();
        }
    }

    @Override // defpackage.bckr
    public final void p() {
        if (ae() != null) {
            bcnl ae = ae();
            ekvl.y(ae);
            ae.l();
        }
        View view = this.o;
        if (view == null) {
            finish();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.dui_slide_down);
        loadAnimation.setInterpolator(this, android.R.interpolator.accelerate_decelerate);
        view.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new bcrf(this, view));
        Y(Q(), R(), 500);
    }

    @Override // defpackage.bcqu
    public final void q() {
        if (m != null) {
            sun.e();
        }
    }

    @Override // defpackage.bcqy
    public final void r() {
        finish();
    }

    @Override // defpackage.bcqy
    public final void s() {
        ((FrameLayout) findViewById(R.id.feedback_content)).removeAllViews();
    }

    @Override // defpackage.bcqy
    public final void t() {
        ag(fywe.b);
    }

    @Override // defpackage.bcqy
    public final void u() {
        ag(fywe.q);
    }

    @Override // defpackage.bcqy
    public final void w() {
        ag(fywe.o);
    }

    @Override // defpackage.bcqy
    public final void x() {
        getWindow().getDecorView().setBackgroundColor(R());
        Y(R(), Q(), 300);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.feedback_content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        bcqw bcqwVar = new bcqw(frameLayout.getContext());
        bcqwVar.setLayoutParams(layoutParams);
        frameLayout.addView(bcqwVar);
        bcqwVar.getViewTreeObserver().addOnPreDrawListener(new bcrc(bcqwVar));
    }

    @Override // defpackage.bcqy
    public final void y(esbj esbjVar) {
        String str;
        String b;
        Intent intent = getIntent();
        ErrorReport M = M(intent);
        if (D() && (b = bcst.b((str = M.a.packageName), fqfu.o())) != null) {
            try {
            } catch (PackageManager.NameNotFoundException e) {
                ((eluo) ((eluo) ((eluo) j.i()).s(e)).ai((char) 3670)).x("Unable to compare versions");
            }
            if (bcst.a(getPackageManager().getPackageInfo(str, 0).versionName, b) <= 0) {
                P(119, M);
                bcrd bcrdVar = new bcrd(this, M(intent), intent, esbjVar);
                bcro bcroVar = new bcro();
                bcroVar.ag = bcrdVar;
                bcroVar.show(getSupportFragmentManager(), "UpgradeDialog");
                bkzy.a(z(), this);
            }
        }
        P(8, M);
        boolean isEmpty = TextUtils.isEmpty(intent.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID"));
        this.p = new bcre(this, !isEmpty, intent, esbjVar);
        aumo.a().d(this, new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackAsyncService"), this.p, 1);
        if (isEmpty) {
            O(intent, esbjVar);
        }
        bkzy.a(z(), this);
    }

    @Override // defpackage.bcnw
    public final eqgo z() {
        return bcsu.a().a.d().a;
    }

    @Override // defpackage.bcnm
    public final void E() {
    }

    @Override // defpackage.bcnw, defpackage.bcnm
    public final Context b() {
        return this;
    }

    @Override // defpackage.bckr
    public final bcnw c() {
        return this;
    }

    @Override // defpackage.bcnm
    public final bckr v() {
        return this;
    }

    @Override // defpackage.bcnm
    public final void L(ErrorReport errorReport) {
    }

    @Override // defpackage.bcnm
    public final void N(boolean z) {
    }
}
