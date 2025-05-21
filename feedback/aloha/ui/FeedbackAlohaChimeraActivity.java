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
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.feedback.aloha.ui.FeedbackAlohaChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import defpackage.abv;
import defpackage.arts;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asiu;
import defpackage.asot;
import defpackage.bagv;
import defpackage.bajp;
import defpackage.bajq;
import defpackage.bajx;
import defpackage.bajz;
import defpackage.baka;
import defpackage.bakg;
import defpackage.bakp;
import defpackage.bale;
import defpackage.balk;
import defpackage.balz;
import defpackage.bama;
import defpackage.bamh;
import defpackage.bamn;
import defpackage.bamw;
import defpackage.bamx;
import defpackage.bamy;
import defpackage.bamz;
import defpackage.bana;
import defpackage.banb;
import defpackage.banc;
import defpackage.banf;
import defpackage.bang;
import defpackage.banh;
import defpackage.bani;
import defpackage.banj;
import defpackage.banl;
import defpackage.banm;
import defpackage.bann;
import defpackage.bano;
import defpackage.bans;
import defpackage.banw;
import defpackage.banx;
import defpackage.baoa;
import defpackage.baod;
import defpackage.baog;
import defpackage.baok;
import defpackage.baoo;
import defpackage.baox;
import defpackage.baoy;
import defpackage.baoz;
import defpackage.bapf;
import defpackage.bapg;
import defpackage.bapk;
import defpackage.bipr;
import defpackage.bivj;
import defpackage.bivo;
import defpackage.dvyt;
import defpackage.dvyx;
import defpackage.eiig;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.epmm;
import defpackage.epnk;
import defpackage.fjtg;
import defpackage.fnnl;
import defpackage.fnps;
import defpackage.fnro;
import defpackage.fntb;
import defpackage.fnte;
import defpackage.fnth;
import defpackage.fnux;
import defpackage.fnvs;
import defpackage.fwac;
import defpackage.imw;
import defpackage.qet;
import defpackage.rbj;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FeedbackAlohaChimeraActivity extends qet implements balz, baka, bagv, bajq, banc, bamy {
    public static final asot j = asot.b("gf_FeedbackAlohaActivity", asej.FEEDBACK);
    public static HelpConfig k;
    private static rbj m;
    public bapf l;
    private String n;
    private View o;
    private ServiceConnection p;
    private banb q;
    private bano r;
    private KeyguardManager s;
    private abv t;

    private final int Q() {
        return imw.f(getColor(R.color.gm3_ref_palette_black), 102);
    }

    private final int R() {
        return getColor(android.R.color.transparent);
    }

    private final bajp W(Intent intent, ErrorReport errorReport) {
        Screenshot screenshot = null;
        Long valueOf = intent.hasExtra("ASYNC_PSD_START_TICK_NANOS") ? Long.valueOf(intent.getLongExtra("ASYNC_PSD_START_TICK_NANOS", -1L)) : null;
        final bamw ab = ab();
        Parcelable parcelableExtra = intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA");
        if (bajx.e(errorReport)) {
            try {
                errorReport.a.processName = ab.b.getPackageManager().getApplicationInfo(errorReport.a.packageName, 0).processName;
                bamx bamxVar = ab.c;
                bivo bivoVar = new bivo() { // from class: bamv
                    @Override // defpackage.bivo
                    public final void G(Parcelable parcelable) {
                        bajp bajpVar = bamw.this.d.b;
                        if (bajpVar == null) {
                            ((ejhf) ((ejhf) bamw.a.j()).ah((char) 3651)).x("Session is null, not updating screenshot.");
                        } else {
                            bajpVar.s((Screenshot) parcelable);
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
                        Screenshot.a(bamxVar.a.getFilesDir(), str, screenshot, false, bivoVar);
                    } else if (!TextUtils.isEmpty(errorReport.u)) {
                        screenshot = Screenshot.c(errorReport.u, errorReport.x, errorReport.w);
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((ejhf) ((ejhf) ((ejhf) bamw.a.i()).s(e)).ah((char) 3650)).x("Process name couldn't be extracted");
                return null;
            }
        }
        bajp bajpVar = new bajp(this, errorReport, screenshot, valueOf);
        ab.d.b = bajpVar;
        return bajpVar;
    }

    private final void Y(int i, int i2, int i3) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(i3);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bane
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FeedbackAlohaChimeraActivity.this.getWindow().getDecorView().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofObject.start();
    }

    private final void Z() {
        banf banfVar = new banf(this);
        KeyguardManager keyguardManager = this.s;
        if (keyguardManager != null) {
            keyguardManager.requestDismissKeyguard(getContainerActivity(), banfVar);
        }
    }

    private final boolean aa() {
        return getPackageManager().hasSystemFeature("android.software.communal_mode");
    }

    private static final bamw ab() {
        baoz baozVar = baoy.a().a;
        if (baozVar.c == null) {
            baozVar.c = new bamw(baozVar.a, baozVar.a(), baozVar.b());
        }
        bamw bamwVar = baozVar.c;
        eiig.x(bamwVar);
        return bamwVar;
    }

    private static final bamz ac() {
        return baoy.a().a.b();
    }

    private static final bajp ae() {
        return ac().b;
    }

    private static final ErrorReport af() {
        if (ae() == null) {
            return null;
        }
        bajp ae = ae();
        eiig.x(ae);
        return ae.b();
    }

    private final void ag(int i) {
        baoo.j(this, af(), i, 0, 0);
    }

    @Override // defpackage.bajq
    public final String A() {
        return "";
    }

    @Override // defpackage.bajq
    public final String B() {
        return this.n;
    }

    @Override // defpackage.banc
    public final void C(epnk epnkVar) {
        O(getIntent(), epnkVar);
    }

    @Override // defpackage.banc
    public final boolean D() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    @Override // defpackage.bajq
    public final void F(Screenshot screenshot, ErrorReport errorReport) {
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        banb banbVar = this.q;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        final banw banwVar = new banw(screenshot, errorReport, rect, Pair.create(Integer.valueOf(point.x), Integer.valueOf(point.y)));
        bann bannVar = (bann) banbVar;
        final banx banxVar = bannVar.d;
        baod baodVar = banxVar.c;
        ensj.t(baodVar.a.submit(new Callable() { // from class: banv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                int i2;
                banw banwVar2 = banwVar;
                Screenshot screenshot2 = banwVar2.a;
                if (screenshot2 == null || TextUtils.isEmpty(screenshot2.d)) {
                    return null;
                }
                ErrorReport errorReport2 = banwVar2.b;
                if (errorReport2.v == null) {
                    i = screenshot2.b;
                    i2 = screenshot2.c;
                } else {
                    i = errorReport2.x;
                    i2 = errorReport2.w;
                }
                banx banxVar2 = banx.this;
                Pair a = bajx.a(banxVar2.a.getResources(), banwVar2.c, i, i2, true);
                boolean d = bajx.d(banwVar2.d, screenshot2);
                bamz bamzVar = banxVar2.b;
                bamzVar.h = d;
                byte[] bArr = errorReport2.v;
                if (bArr == null) {
                    bArr = Base64.decode(screenshot2.d, 0);
                }
                if (!bamx.a(d)) {
                    bamzVar.c = Screenshot.f(bArr, d);
                    return null;
                }
                if (bamzVar.c()) {
                    return null;
                }
                bamzVar.c = Bitmap.createScaledBitmap(Screenshot.f(bArr, false), ((Integer) a.first).intValue(), ((Integer) a.second).intValue(), true);
                return null;
            }
        }), new banl(), bannVar.f.b);
    }

    @Override // defpackage.banc
    public final void G(int i) {
        baoo.j(this, af(), fwac.p, 0, i);
    }

    @Override // defpackage.banc
    public final void H(int i, int i2, int i3) {
        baog baogVar = new baog();
        baogVar.a = af();
        baogVar.b(fwac.p);
        baogVar.m = i;
        baogVar.h = Integer.valueOf(i2);
        baogVar.i = Integer.valueOf(i3);
        baoo.b(this, baogVar.a());
    }

    public final FrameLayout I() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.feedback_content);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // defpackage.balz
    public final void J(bakp bakpVar) {
        if (ae() != null) {
            bajp ae = ae();
            eiig.x(ae);
            ae.i(bakpVar);
        }
    }

    @Override // defpackage.baka
    public final void K(bajz bajzVar, ErrorReport errorReport, balk balkVar) {
        bano banoVar = this.r;
        if (banoVar != null) {
            banoVar.dismiss();
        }
        if (ae() == null) {
            return;
        }
        if (bajzVar != null) {
            bajp ae = ae();
            eiig.x(ae);
            ae.a().h(epmm.CLIENT_REFERENCE_IS_JUNK, true != bajzVar.c ? "false" : "true");
        }
        bajp ae2 = ae();
        eiig.x(ae2);
        ae2.m(epmm.CLIENT_REFERENCE_JUNK_ASYNC);
    }

    final ErrorReport M(Intent intent) {
        ErrorReport errorReport = new ErrorReport();
        if (intent.hasExtra("android.intent.extra.BUG_REPORT")) {
            ApplicationErrorReport applicationErrorReport = (ApplicationErrorReport) intent.getParcelableExtra("android.intent.extra.BUG_REPORT");
            eiig.x(applicationErrorReport);
            errorReport.a = applicationErrorReport;
        }
        if (intent.hasExtra("com.android.feedback.SAFEPARCELABLE_REPORT")) {
            errorReport = (ErrorReport) intent.getParcelableExtra("com.android.feedback.SAFEPARCELABLE_REPORT");
            eiig.x(errorReport);
            if (!TextUtils.isEmpty(errorReport.B)) {
                this.n = errorReport.B;
                if (!errorReport.E) {
                    errorReport.B = "";
                }
            }
        }
        bama.i = errorReport.Z;
        if (TextUtils.isEmpty(errorReport.ag)) {
            errorReport.ag = bapk.c();
        }
        return errorReport;
    }

    public final void O(Intent intent, epnk epnkVar) {
        bajp ae = ae();
        if (ae == null) {
            return;
        }
        View view = this.o;
        if (view != null && view.getId() == R.id.aloha_dynamic_ui && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        ErrorReport M = M(intent);
        banb banbVar = this.q;
        String str = M.a.packageName;
        String str2 = M.P;
        String str3 = M.ap;
        bann bannVar = (bann) banbVar;
        bamh bamhVar = bannVar.c;
        arts artsVar = bannVar.h;
        final fjtg d = bamn.d(str, str2, str3);
        final bamn bamnVar = (bamn) bamhVar;
        ensj.t(enps.g(bamnVar.c.a(d, artsVar), new enqc() { // from class: baml
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                eiid eiidVar = (eiid) obj;
                if (!eiidVar.h()) {
                    return ensj.i(false);
                }
                fjtg fjtgVar = d;
                bamn bamnVar2 = bamn.this;
                bamnVar2.c(fjtgVar, (fjtc) eiidVar.c());
                Map map = bamnVar2.e;
                fjtd fjtdVar = (fjtd) fjte.a.v();
                for (Map.Entry entry : map.entrySet()) {
                    if (baow.b((fjth) entry.getValue())) {
                        if (fnpm.c() && (((fjth) entry.getValue()).b & 2) != 0) {
                            fjtc fjtcVar = ((fjth) entry.getValue()).d;
                            if (fjtcVar == null) {
                                fjtcVar = fjtc.a;
                            }
                            if ((fjtcVar.b & 1) != 0) {
                                fjtc fjtcVar2 = ((fjth) entry.getValue()).d;
                                if (fjtcVar2 == null) {
                                    fjtcVar2 = fjtc.a;
                                }
                                epnk epnkVar2 = fjtcVar2.c;
                                if (epnkVar2 == null) {
                                    epnkVar2 = epnk.a;
                                }
                                if ((epnkVar2.b & 8) != 0) {
                                    fjtc fjtcVar3 = ((fjth) entry.getValue()).d;
                                    if (fjtcVar3 == null) {
                                        fjtcVar3 = fjtc.a;
                                    }
                                    epnk epnkVar3 = fjtcVar3.c;
                                    if (epnkVar3 == null) {
                                        epnkVar3 = epnk.a;
                                    }
                                    if (epnkVar3.g) {
                                    }
                                }
                            }
                        }
                        fecj v = fjtf.a.v();
                        fjtg fjtgVar2 = (fjtg) entry.getKey();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fjtf fjtfVar = (fjtf) v.b;
                        fjtgVar2.getClass();
                        fjtfVar.c = fjtgVar2;
                        fjtfVar.b |= 1;
                        fjth fjthVar = (fjth) entry.getValue();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fjtf fjtfVar2 = (fjtf) v.b;
                        fjthVar.getClass();
                        fjtfVar2.d = fjthVar;
                        fjtfVar2.b |= 2;
                        fjtdVar.a(v);
                    }
                }
                bamq bamqVar = bamnVar2.g;
                enss i = ensj.i((fjte) fjtdVar.Q());
                final bags bagsVar = bamqVar.a;
                Objects.requireNonNull(bagsVar);
                return enps.f(enps.g(i, new enqc() { // from class: bamo
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        return bags.this.b((fjte) obj2);
                    }
                }, bamqVar.b.a), new eiho() { // from class: bami
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        asot asotVar = bamn.a;
                        return true;
                    }
                }, bamnVar2.d.a);
            }
        }, bamnVar.d.a), new banm(), bannVar.f.b);
        if (fntb.c()) {
            eitj i = eitj.i(epnkVar.f);
            bajp ae2 = ae();
            if (ae2 == null) {
                ((ejhf) ((ejhf) j.j()).ah((char) 3665)).x("Session is null, not setting allowed PSD List.");
            } else {
                ae2.o(i);
            }
        }
        m = rbj.a(epnkVar, this, ae.a());
        View c = rbj.c();
        this.o = c;
        c.setId(R.id.aloha_dynamic_ui);
        if (fnro.c()) {
            c.setElevation(2.0f);
        }
        FrameLayout I = I();
        I.addView(c, new FrameLayout.LayoutParams(-1, -1));
        fnux.a.a().a();
        setContentView(I);
        baok.a(this, aseu.FEEDBACK_ALOHA_LAUNCHED);
        if (fnvs.c()) {
            baok.a(this, aseu.FEEDBACK_ACTIVITY);
        }
    }

    public final void P(int i, ErrorReport errorReport) {
        baoo.g(this, errorReport, i, TextUtils.isEmpty(this.n) ? null : new Account(this.n, "com.google"), null, null);
    }

    @Override // defpackage.bajq
    public final boolean S() {
        return false;
    }

    @Override // defpackage.bajq
    public final boolean T() {
        return false;
    }

    @Override // defpackage.bajq
    public final boolean U() {
        return false;
    }

    @Override // defpackage.bajq
    public final boolean V() {
        return false;
    }

    @Override // defpackage.bajq
    public final boolean X() {
        return true;
    }

    @Override // defpackage.bagv
    public final Activity a() {
        return getContainerActivity();
    }

    @Override // defpackage.baka
    public final void ad(balk balkVar) {
        bano banoVar = new bano();
        this.r = banoVar;
        banoVar.show(getSupportFragmentManager(), "progress_dialog");
    }

    @Override // defpackage.bagv
    public final void d() {
        getWindow().getDecorView().setBackgroundColor(Q());
    }

    @Override // defpackage.bagv
    public final void e() {
        bajp ae = ae();
        if (ae == null || ae.l.c) {
            return;
        }
        af();
    }

    @Override // defpackage.bagv
    public final void f(final ErrorReport errorReport, boolean z) {
        final baoa baoaVar = new baoa(this, baoy.a().a.d(), ac());
        bamz bamzVar = baoaVar.b;
        baod baodVar = baoaVar.a;
        final bajp bajpVar = bamzVar.b;
        baodVar.a.execute(new Runnable() { // from class: banz
            @Override // java.lang.Runnable
            public final void run() {
                ErrorReport errorReport2;
                bajp bajpVar2 = bajpVar;
                if (bajpVar2 != null) {
                    bajpVar2.r();
                    errorReport2 = bajpVar2.b();
                } else {
                    errorReport2 = errorReport;
                }
                baoa baoaVar2 = baoa.this;
                if (bajpVar2 == null || !bajpVar2.u()) {
                    baoaVar2.a(errorReport2);
                } else {
                    baoaVar2.b(bajpVar2);
                }
            }
        });
    }

    @Override // defpackage.bagv
    public final void g(String str, ErrorReport errorReport) {
        if (!fnps.c() || !str.equals(fnnl.n())) {
            bale.c(getContainerActivity(), str, errorReport);
            return;
        }
        try {
            dvyx.b(this, this.t, errorReport != null ? errorReport.B : "");
        } catch (dvyt unused) {
            bale.c(getContainerActivity(), fnnl.n(), errorReport);
        }
    }

    @Override // defpackage.bagv
    public final void h(String str) {
        bapf bapfVar = this.l;
        if (bapfVar == null) {
            return;
        }
        try {
            bapg d = bapfVar.d();
            if (d != null) {
                Parcel fr = d.fr();
                fr.writeString(str);
                d.fu(2, fr);
            }
        } catch (RemoteException e) {
            ((ejhf) ((ejhf) ((ejhf) j.i()).s(e)).ah((char) 3661)).x("Unable to notify callback");
        }
    }

    @Override // defpackage.bagv
    public final void i() {
        startActivity(new Intent().setClassName(this, "com.google.android.gms.feedback.PreviewActivity"));
    }

    @Override // defpackage.bagv
    public final void j() {
        ErrorReport af = af();
        if (af == null) {
            return;
        }
        baoy.a().a.a();
        boolean a = bamx.a(ac().h);
        Intent intent = new Intent();
        if (a) {
            intent.setClassName(this, "com.google.android.gms.feedback.AnnotateScreenshotActivity");
            ThemeSettings themeSettings = af.Y;
            if (themeSettings != null && themeSettings.b != 0) {
                intent.putExtra("EXTRA_ACTION_BAR_COLOR_RES_ID", bipr.a(themeSettings));
            }
        } else {
            intent.setClassName(this, "com.google.android.gms.feedback.PreviewScreenshotActivity");
        }
        startActivity(intent);
    }

    @Override // defpackage.bagv
    public final void k() {
        startActivity(bale.a(this));
    }

    @Override // defpackage.bagv
    public final void l() {
        startActivity(bale.b(this));
    }

    @Override // defpackage.bagv
    public final void m(Integer num, Integer num2, eitj eitjVar) {
        rbj.d(num, num2, eitjVar);
    }

    @Override // defpackage.bagv, defpackage.bajq
    public final void n(Runnable runnable) {
        runOnUiThread(runnable);
    }

    @Override // defpackage.bagv
    public final void o() {
        getWindow().getDecorView().setBackgroundColor(R());
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02b8  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.aloha.ui.FeedbackAlohaChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        bapf bapfVar = this.l;
        if (bapfVar != null) {
            try {
                bapg d = bapfVar.d();
                if (d != null) {
                    d.fu(3, d.fr());
                }
            } catch (RemoteException e) {
                ((ejhf) ((ejhf) ((ejhf) j.i()).s(e)).ah((char) 3662)).x("Unable to notify callback");
            }
        }
        bama.d(null);
        ac().f.remove(this);
        ((bann) this.q).b = null;
        if (!fnte.c()) {
            ac().b();
        } else if (isFinishing()) {
            ac().b();
        }
        if (this.l != null) {
            asiu.a().b(this, this.p);
        }
        super.onDestroy();
    }

    @Override // defpackage.qet, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        bajp ae = ae();
        if (ae == null || ae.w() || m == null) {
            p();
            return true;
        }
        rbj.b();
        return true;
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        bann bannVar;
        banc a;
        if (intent.getBooleanExtra("com.android.feedback.DISMISS_SELF_EXTRA", false)) {
            p();
            return;
        }
        if (ae() != null && intent != null) {
            ErrorReport M = M(intent);
            bajp ae = ae();
            eiig.x(ae);
            ErrorReport b = ae.b();
            if (b != null && !TextUtils.isEmpty(M.R) && !TextUtils.isEmpty(b.R) && TextUtils.equals(M.R, b.R)) {
                return;
            }
        }
        setIntent(intent);
        bakg.a();
        ac().b();
        ErrorReport M2 = M(intent);
        super.onNewIntent(intent);
        if (Build.VERSION.SDK_INT >= 26 && aa() && fnth.d()) {
            if (this.s == null) {
                this.s = (KeyguardManager) getSystemService("keyguard");
            }
            KeyguardManager keyguardManager = this.s;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                Z();
                return;
            }
        }
        bajp W = W(intent, M2);
        if (W == null) {
            finish();
            return;
        }
        W.n();
        ac().e = this.n;
        if (M2.E || (a = (bannVar = (bann) this.q).a()) == null) {
            return;
        }
        bamh bamhVar = bannVar.c;
        String str = bannVar.g.a.packageName;
        ErrorReport errorReport = bannVar.g;
        epnk b2 = ((bamn) bamhVar).b(bamn.d(str, errorReport.P, errorReport.ap));
        if (b2 == null) {
            try {
                b2 = ((bamn) bamhVar).b.a();
            } catch (InterruptedException e) {
                ((ejhf) ((ejhf) ((ejhf) bamn.a.h()).s(e)).ah((char) 3645)).x("Unable to fetch app bundled ui tree.");
                b2 = null;
            }
        }
        if (b2 == null) {
            a.r();
        } else {
            bannVar.b();
            a.C(b2);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (fnte.c()) {
            return;
        }
        bakg.a();
        if (ae() != null) {
            bajp ae = ae();
            eiig.x(ae);
            ae.j(bundle);
            return;
        }
        bamw ab = ab();
        bajp bajpVar = new bajp(this, bundle);
        ab.d.b = bajpVar;
        ac().b = bajpVar;
        bajp ae2 = ae();
        eiig.x(ae2);
        ae2.n();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (fnte.c() || ae() == null) {
            return;
        }
        bajp ae = ae();
        eiig.x(ae);
        ae.k(bundle);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        if (ae() != null) {
            bajp ae = ae();
            eiig.x(ae);
            ae.l();
        }
    }

    @Override // defpackage.bagv
    public final void p() {
        if (ae() != null) {
            bajp ae = ae();
            eiig.x(ae);
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
        loadAnimation.setAnimationListener(new banj(this, view));
        Y(Q(), R(), 500);
    }

    @Override // defpackage.bamy
    public final void q() {
        if (m != null) {
            rbj.e();
        }
    }

    @Override // defpackage.banc
    public final void r() {
        finish();
    }

    @Override // defpackage.banc
    public final void s() {
        ((FrameLayout) findViewById(R.id.feedback_content)).removeAllViews();
    }

    @Override // defpackage.banc
    public final void t() {
        ag(fwac.b);
    }

    @Override // defpackage.banc
    public final void u() {
        ag(fwac.q);
    }

    @Override // defpackage.banc
    public final void w() {
        ag(fwac.o);
    }

    @Override // defpackage.banc
    public final void x() {
        getWindow().getDecorView().setBackgroundColor(R());
        Y(R(), Q(), 300);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.feedback_content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        bana banaVar = new bana(frameLayout.getContext());
        banaVar.setLayoutParams(layoutParams);
        frameLayout.addView(banaVar);
        banaVar.getViewTreeObserver().addOnPreDrawListener(new bang(banaVar));
    }

    @Override // defpackage.banc
    public final void y(epnk epnkVar) {
        String str;
        String b;
        Intent intent = getIntent();
        ErrorReport M = M(intent);
        if (D() && (b = baox.b((str = M.a.packageName), fnnl.o())) != null) {
            try {
            } catch (PackageManager.NameNotFoundException e) {
                ((ejhf) ((ejhf) ((ejhf) j.i()).s(e)).ah((char) 3664)).x("Unable to compare versions");
            }
            if (baox.a(getPackageManager().getPackageInfo(str, 0).versionName, b) <= 0) {
                P(119, M);
                banh banhVar = new banh(this, M(intent), intent, epnkVar);
                bans bansVar = new bans();
                bansVar.ag = banhVar;
                bansVar.show(getSupportFragmentManager(), "UpgradeDialog");
                bivj.a(z(), this);
            }
        }
        P(8, M);
        boolean isEmpty = TextUtils.isEmpty(intent.getStringExtra("com.android.feedback.SAFEPARCELABLE_SESSION_ID"));
        this.p = new bani(this, !isEmpty, intent, epnkVar);
        asiu.a().d(this, new Intent().setClassName(this, "com.google.android.gms.feedback.FeedbackAsyncService"), this.p, 1);
        if (isEmpty) {
            O(intent, epnkVar);
        }
        bivj.a(z(), this);
    }

    @Override // defpackage.baka
    public final ensv z() {
        return baoy.a().a.d().a;
    }

    @Override // defpackage.bajq
    public final void E() {
    }

    @Override // defpackage.baka, defpackage.bajq
    public final Context b() {
        return this;
    }

    @Override // defpackage.bagv
    public final baka c() {
        return this;
    }

    @Override // defpackage.bajq
    public final bagv v() {
        return this;
    }

    @Override // defpackage.bajq
    public final void L(ErrorReport errorReport) {
    }

    @Override // defpackage.bajq
    public final void N(boolean z) {
    }
}
