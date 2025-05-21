package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.a;
import defpackage.abql;
import defpackage.abqn;
import defpackage.abqu;
import defpackage.abqv;
import defpackage.abqy;
import defpackage.abvw;
import defpackage.abvx;
import defpackage.abvy;
import defpackage.abvz;
import defpackage.abwj;
import defpackage.abwk;
import defpackage.abwm;
import defpackage.abwq;
import defpackage.abxc;
import defpackage.abxl;
import defpackage.abxo;
import defpackage.abxp;
import defpackage.abxq;
import defpackage.abxr;
import defpackage.abyb;
import defpackage.abzu;
import defpackage.abzz;
import defpackage.acab;
import defpackage.acac;
import defpackage.acad;
import defpackage.acag;
import defpackage.acai;
import defpackage.acak;
import defpackage.acam;
import defpackage.acao;
import defpackage.acas;
import defpackage.acau;
import defpackage.acav;
import defpackage.acbb;
import defpackage.acbd;
import defpackage.arkc;
import defpackage.arkf;
import defpackage.arsm;
import defpackage.asng;
import defpackage.assw;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byhr;
import defpackage.dtjk;
import defpackage.edeq;
import defpackage.edgk;
import defpackage.edgl;
import defpackage.edjc;
import defpackage.edjs;
import defpackage.eijj;
import defpackage.eijr;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eits;
import defpackage.ejcb;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fegu;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.fkzo;
import defpackage.fkzs;
import defpackage.flad;
import defpackage.flag;
import defpackage.flba;
import defpackage.flbg;
import defpackage.flbn;
import defpackage.fuvs;
import defpackage.fuyy;
import defpackage.fvau;
import defpackage.fvbo;
import defpackage.fvie;
import defpackage.fvug;
import defpackage.jpd;
import defpackage.jra;
import defpackage.jrd;
import defpackage.jrh;
import defpackage.jth;
import defpackage.jti;
import defpackage.jtu;
import defpackage.myu;
import defpackage.myx;
import defpackage.ndh;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneskyDpcInstallChimeraActivity extends abyb implements jth {
    public static final /* synthetic */ int p = 0;
    private static final Map r = eits.q(3, new abwj(1, 5), 6, new abwj(1, 9), 7, new abwj(2, 9), 2, new abwj(2, 6), 4, new abwj(3, 7), 5, new abwj(4, 8));
    public abxl h;
    public abxr i;
    public acbd j;
    public String k;
    public arkf l;
    public fiwo m;
    public myx n;
    public bqqa o;

    public static Intent k(Context context, String str, boolean z, Bundle bundle) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity").putExtra("dpc_package_name", str).putExtra("hide_back_button", z).putExtras(bundle);
    }

    public static boolean q(Context context) {
        return new assw(context).f("com.android.vending", 0).versionCode >= 80770000;
    }

    public static final acad v(Bundle bundle) {
        if (bundle != null) {
            return acab.a;
        }
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Device policy management role holder updater aborting, because this device is below T.");
        return new acac(0, new Intent().putExtra("intentionally_canceled", true));
    }

    private final void z() {
        arkf f = arkf.f(this, arkc.i(y()) ? flad.e() ? R.layout.phonesky_dpc_install_activity_glif_v2 : R.layout.phonesky_dpc_install_activity_glif : R.layout.phonesky_dpc_install_activity);
        this.l = f;
        arkc.e(f.a());
        this.l.g();
        this.l.d(false);
        if (getIntent().getBooleanExtra("hide_back_button", false)) {
            this.l.b(false);
            edgk.f(getWindow(), false);
        }
        setContentView(this.l.a());
        this.l.c(getText(R.string.auth_device_management_download_progress));
        this.l.j();
        if (flad.d() && (this.l.a() instanceof GlifLayout)) {
            GlifLayout glifLayout = (GlifLayout) this.l.a();
            abzz.a(glifLayout);
            glifLayout.F(R.string.loading_description_text);
        }
    }

    @Override // defpackage.jth
    public final jtu a(int i, Bundle bundle) {
        return new abwq(this, this.k);
    }

    @Override // defpackage.jth
    public final /* bridge */ /* synthetic */ void b(jtu jtuVar, Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() < 0) {
            switch (num.intValue()) {
                case -6:
                case -5:
                case -4:
                    this.l.h();
                    this.l.i();
                    break;
                case -3:
                    l(2);
                    break;
                case -2:
                    l(3);
                    break;
                case -1:
                    l(-1);
                    break;
                default:
                    Log.e("Auth", String.format(Locale.US, a.f(num, "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Unknown result ", " received from the loader!"), new Object[0]));
                    break;
            }
        }
    }

    @Override // defpackage.qfn, defpackage.jnu
    public final jrd getDefaultViewModelProviderFactory() {
        return new jra(getApplication());
    }

    @Override // defpackage.arjn
    protected final void gu(String str, boolean z) {
        if (flad.c()) {
            arkc.g(this);
        } else {
            arkc.f(this, str);
        }
        if (flad.e()) {
            int i = edjs.a;
            if (edeq.w(this)) {
                setTheme(edjs.a(this));
            }
        }
    }

    public final Intent j() {
        if (!arsm.e(this, "auth_managed_dpmrh_fallback_to_aosp_on_role_holder_update_failed", false)) {
            return null;
        }
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Setting UPDATE_FAILURE_STRATEGY as AOSP provisioning.");
        return new Intent().putExtra("android.app.extra.ROLE_HOLDER_UPDATE_FAILURE_STRATEGY", 2);
    }

    public final void l(int i) {
        m(i, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (defpackage.asng.d(r17, "com.google.android.apps.work.clouddpc") > r17.h.k) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r18, android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity.m(int, android.content.Intent):void");
    }

    public final void n(Consumer consumer) {
        abvz abvwVar;
        abvw abvwVar2;
        if (!q(this) || TextUtils.isEmpty(this.k)) {
            consumer.q(acag.g);
            l(2);
            return;
        }
        z();
        if (!fkzs.e() || !this.k.equals("com.google.android.apps.work.clouddpc")) {
            if (!s(this.k)) {
                jti.a(this).c(0, null, fkzs.h() ? new abwk(this, consumer) : this);
                return;
            } else {
                consumer.q(acag.d);
                l(-1);
                return;
            }
        }
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo("com.google.android.apps.work.clouddpc", 0);
            ArrayList arrayList = new ArrayList(asng.ac(this, "com.google.android.apps.work.clouddpc"));
            arrayList.retainAll(flag.a.a().b().b);
            if (arrayList.isEmpty()) {
                abvwVar = abvx.a;
            } else {
                if (flag.a.a().e()) {
                    if (packageInfo.versionCode == getPackageManager().getPackageInfo("com.google.android.apps.work.clouddpc", 2097152).versionCode) {
                        abvwVar2 = new abvw(packageInfo.versionCode);
                        abvwVar = abvwVar2;
                    }
                }
                Duration c = fegu.c(flag.a.a().a());
                if (Build.VERSION.SDK_INT < 26 || !Instant.now().minus(c).isBefore(Instant.ofEpochMilli(packageInfo.lastUpdateTime))) {
                    abvwVar2 = new abvw(packageInfo.versionCode);
                    abvwVar = abvwVar2;
                } else {
                    abvwVar = abvy.a;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            abvwVar = new abvw(0);
        }
        if (abvwVar instanceof abvw) {
            abxl abxlVar = this.h;
            abxlVar.k = ((abvw) abvwVar).a;
            acbb.b(abxlVar.j);
            jti.a(this).c(0, null, fkzs.h() ? new abwk(this, consumer) : this);
            return;
        }
        abzu.a(this).e(new acau(acav.a, abvwVar.b, null, false));
        setResult(-1, null);
        finish();
        if (fkzo.f()) {
            edjc.e(getContainerActivity(), 6);
        }
        consumer.q(acag.b);
    }

    public final void o() {
        eitj g;
        String d = arsm.d(this, "auth_managed_dpmrh_phonesky_update_conditions", "0,0");
        if (d == null) {
            g = eitj.m(0, 0);
        } else {
            int i = eitj.d;
            eite eiteVar = new eite();
            Iterator it = eijj.g(",").i().n(d).iterator();
            while (it.hasNext()) {
                try {
                    eiteVar.i(Integer.valueOf(Integer.parseInt((String) it.next())));
                } catch (NumberFormatException unused) {
                    g = eitj.m(0, 0);
                }
            }
            g = eiteVar.g();
        }
        int i2 = ((ejcb) g).c;
        if (i2 < 3) {
            Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Does not update Phonesky because conditions would not match");
        } else {
            int intValue = ((Integer) g.get(0)).intValue();
            int intValue2 = ((Integer) g.get(1)).intValue();
            int a = abwm.a(this);
            if (intValue >= 0 && a < intValue) {
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Does not update Phonesky because Phonesky version is smaller than lower bound.");
            } else if (intValue2 >= 0 && a >= intValue2) {
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Does not update Phonesky because Phonesky version is larger than upper bound.");
            } else if (eitj.i(g.subList(2, i2)).contains(Integer.valueOf(getIntent().getIntExtra("android.app.extra.PROVISIONING_TRIGGER", 0)))) {
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Update Phonesky");
                acbb.b(this.h.h);
                abzu.a(this).c(acas.a(acao.a, this.j));
                final abxl abxlVar = this.h;
                if (flbn.g()) {
                    ndh.a(abqv.d, fuvs.a, new fvau() { // from class: abwt
                        @Override // defpackage.fvau
                        public final Object a(Object obj, Object obj2) {
                            final ndg ndgVar = (ndg) obj2;
                            abxl.this.e(new Consumer() { // from class: abwr
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void q(Object obj3) {
                                    acag acagVar = (acag) obj3;
                                    ndg.this.a(new abqt("com.android.vending", acagVar), new ndk(acagVar));
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return acag.a;
                        }
                    });
                    return;
                } else {
                    abxlVar.e(new Consumer() { // from class: abwu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return;
                }
            }
        }
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Update DPMRH");
        acbb.b(this.h.i);
        abzu.a(this).c(acas.a(acak.a, this.j));
        this.h.b(this.k);
    }

    @Override // defpackage.abyb, defpackage.arjn, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(final Bundle bundle) {
        enss b;
        super.onCreate(bundle);
        if (fkzn.e()) {
            ((dtjk) this.m.a()).a();
        }
        if (flba.c()) {
            new abqu().n(getContainerActivity(), this.f, getIntent());
        }
        this.h = (abxl) new jrh(this, new abxc(getApplication())).a(abxl.class);
        this.i = (abxr) new jrh(this, new abxp(getApplication())).a(abxr.class);
        eijr eijrVar = bqqe.a;
        this.o = new bqqa();
        if (flbn.d()) {
            this.j = acbd.a(this, getIntent());
        }
        fkzo fkzoVar = fkzo.a;
        if (fkzoVar.a().k()) {
            final abxl abxlVar = this.h;
            abxlVar.d.hS(false);
            byhr byhrVar = abxlVar.c;
            byhrVar.removeCallbacksAndMessages(null);
            byhrVar.postDelayed(new Runnable() { // from class: abww
                @Override // java.lang.Runnable
                public final void run() {
                    abxl.this.d.hS(true);
                }
            }, TimeUnit.SECONDS.toMillis(fkzoVar.a().a()));
            this.h.d.g(this, new jpd() { // from class: abwi
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                        Log.w("Auth", "Global timeout reached, finishing activity");
                        if (phoneskyDpcInstallChimeraActivity.u()) {
                            phoneskyDpcInstallChimeraActivity.n.c(abqm.d);
                        } else if (phoneskyDpcInstallChimeraActivity.t()) {
                            acbb.b(phoneskyDpcInstallChimeraActivity.h.g);
                            abzu.a(phoneskyDpcInstallChimeraActivity).c(acas.a(acaq.a, phoneskyDpcInstallChimeraActivity.j));
                            phoneskyDpcInstallChimeraActivity.i.e();
                        }
                        phoneskyDpcInstallChimeraActivity.m(true != fkzo.a.a().i() ? 6 : 7, phoneskyDpcInstallChimeraActivity.j());
                    }
                }
            });
        }
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
        if (!p()) {
            this.k = getIntent().getStringExtra("dpc_package_name");
            if (flbn.g()) {
                ndh.a(abqn.d, fuvs.a, new fvau() { // from class: abwa
                    @Override // defpackage.fvau
                    public final Object a(Object obj, Object obj2) {
                        final ndg ndgVar = (ndg) obj2;
                        final PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                        phoneskyDpcInstallChimeraActivity.n(new Consumer() { // from class: abwc
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void q(Object obj3) {
                                acag acagVar = (acag) obj3;
                                ndgVar.a(new abqt(PhoneskyDpcInstallChimeraActivity.this.k, acagVar), new ndk(acagVar));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return acag.a;
                    }
                });
                return;
            } else {
                n(new Consumer() { // from class: abwb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        int i = PhoneskyDpcInstallChimeraActivity.p;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        acbb.b(this.h.e);
        abzu.a(this).c(acas.a(acai.a, this.j));
        this.k = null;
        acad v = flbn.g() ? (acad) ndh.a(abqy.d, fuvs.a, new fvau() { // from class: abwh
            @Override // defpackage.fvau
            public final Object a(Object obj, Object obj2) {
                abqz abqzVar;
                ndg ndgVar = (ndg) obj2;
                acad v2 = PhoneskyDpcInstallChimeraActivity.v(bundle);
                if (v2 instanceof acab) {
                    abqzVar = new abqz(true, 0);
                } else {
                    if (!(v2 instanceof acac)) {
                        throw new fuuz();
                    }
                    abqzVar = new abqz(false, ((acac) v2).a);
                }
                ndgVar.a(abqzVar, new ndk(v2));
                return v2;
            }
        }) : v(bundle);
        if (v instanceof acac) {
            acac acacVar = (acac) v;
            Intent intent = acacVar.b;
            if (intent == null) {
                l(acacVar.a);
                return;
            } else {
                m(acacVar.a, intent);
                return;
            }
        }
        z();
        this.h.a.d.a.g(this, new jpd() { // from class: abwd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                if (intValue >= 0) {
                    phoneskyDpcInstallChimeraActivity.l.e(num.intValue());
                }
                switch (num.intValue()) {
                    case -7:
                    case -3:
                    case -2:
                    case -1:
                        abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acan.a, num.intValue() == -7 ? 11 : num.intValue() == -1 ? 10 : num.intValue() == -2 ? 12 : num.intValue() == -3 ? 13 : 1, null, acbb.a(phoneskyDpcInstallChimeraActivity.h.h), phoneskyDpcInstallChimeraActivity.j));
                        acbb.b(phoneskyDpcInstallChimeraActivity.h.i);
                        abzu.a(phoneskyDpcInstallChimeraActivity).c(acas.a(acak.a, phoneskyDpcInstallChimeraActivity.j));
                        phoneskyDpcInstallChimeraActivity.h.b(phoneskyDpcInstallChimeraActivity.k);
                        break;
                    case -6:
                    case -5:
                    case -4:
                        phoneskyDpcInstallChimeraActivity.l.h();
                        phoneskyDpcInstallChimeraActivity.l.i();
                        break;
                    default:
                        Log.e("Auth", String.format(Locale.US, a.f(num, "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Unknown result ", " received from the phonsekyDownloadStatus!"), new Object[0]));
                        break;
                }
            }
        });
        this.h.b.e.a.g(this, new jpd() { // from class: abwe
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                if (intValue >= 0) {
                    phoneskyDpcInstallChimeraActivity.l.e(num.intValue());
                }
                Objects.toString(num);
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] observed package download status=".concat(String.valueOf(num)));
                switch (num.intValue()) {
                    case -7:
                    case -2:
                        abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acaj.a, num.intValue() == -7 ? 15 : 16, null, acbb.a(phoneskyDpcInstallChimeraActivity.h.i), phoneskyDpcInstallChimeraActivity.j));
                        phoneskyDpcInstallChimeraActivity.m(3, phoneskyDpcInstallChimeraActivity.j());
                        break;
                    case -6:
                    case -5:
                    case -4:
                        phoneskyDpcInstallChimeraActivity.l.h();
                        phoneskyDpcInstallChimeraActivity.l.i();
                        break;
                    case -3:
                        abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acaj.a, 17, null, acbb.a(phoneskyDpcInstallChimeraActivity.h.i), phoneskyDpcInstallChimeraActivity.j));
                        phoneskyDpcInstallChimeraActivity.m(2, phoneskyDpcInstallChimeraActivity.j());
                        break;
                    case -1:
                        if (!phoneskyDpcInstallChimeraActivity.p()) {
                            phoneskyDpcInstallChimeraActivity.l(-1);
                            break;
                        } else {
                            Duration a = acbb.a(phoneskyDpcInstallChimeraActivity.h.i);
                            if (!phoneskyDpcInstallChimeraActivity.s(phoneskyDpcInstallChimeraActivity.k) || !phoneskyDpcInstallChimeraActivity.r("android.app.action.ROLE_HOLDER_PROVISION_MANAGED_PROFILE") || !phoneskyDpcInstallChimeraActivity.r("android.app.action.ROLE_HOLDER_PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE") || !phoneskyDpcInstallChimeraActivity.r("android.app.action.ROLE_HOLDER_PROVISION_FINALIZATION")) {
                                Log.e("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Device policy management role holder installed but is not valid.");
                                abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acaj.a, 22, null, a, phoneskyDpcInstallChimeraActivity.j));
                                phoneskyDpcInstallChimeraActivity.m(2, phoneskyDpcInstallChimeraActivity.j());
                                break;
                            } else {
                                abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acaj.a, 14, null, a, phoneskyDpcInstallChimeraActivity.j));
                                if (phoneskyDpcInstallChimeraActivity.o != null) {
                                    bqqa.a(aseu.AUTH_MANAGED_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER_UPDATED);
                                }
                                phoneskyDpcInstallChimeraActivity.l(-1);
                                break;
                            }
                        }
                    default:
                        Log.e("Auth", String.format(Locale.US, a.f(num, "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Unknown result ", " received from the packageDownloadStatus!"), new Object[0]));
                        break;
                }
            }
        });
        if (u()) {
            myx myxVar = this.n;
            abql abqlVar = abql.d;
            fvbo.f(abqlVar, "contract");
            b = fvug.b(myxVar.a, fuyy.a, fvie.a, new myu(myxVar, abqlVar, null));
            b.hn(new Runnable() { // from class: abwf
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneskyDpcInstallChimeraActivity.this.o();
                }
            }, enre.a);
            return;
        }
        if (!t()) {
            o();
            return;
        }
        this.i.d.g(this, new jpd() { // from class: abwg
            @Override // defpackage.jpd
            public final void a(Object obj) {
                abxq abxqVar = (abxq) obj;
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] observed pauseState ".concat(String.valueOf(String.valueOf(abxqVar))));
                int ordinal = abxqVar.ordinal();
                PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                if (ordinal == 1 || ordinal == 2) {
                    abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acal.a, abxqVar == abxq.PAUSED ? 18 : 19, null, acbb.a(phoneskyDpcInstallChimeraActivity.h.f), phoneskyDpcInstallChimeraActivity.j));
                    phoneskyDpcInstallChimeraActivity.o();
                } else if (ordinal == 3 || ordinal == 4) {
                    abzu.a(phoneskyDpcInstallChimeraActivity).c(new acas(acap.a, abxqVar == abxq.RESUMED ? 20 : 21, null, acbb.a(phoneskyDpcInstallChimeraActivity.h.g), phoneskyDpcInstallChimeraActivity.j));
                }
            }
        });
        acbb.b(this.h.f);
        abzu.a(this).c(acas.a(acam.a, this.j));
        final abxr abxrVar = this.i;
        if (flbg.g()) {
            ensj.t(abxrVar.c.a(), new abxo(abxrVar), enre.a);
        } else if (abxrVar.d.hT() == abxq.PAUSED) {
            Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Already in paused state");
        } else {
            abxrVar.a.post(new Runnable() { // from class: abxn
                @Override // java.lang.Runnable
                public final void run() {
                    abxr.this.b();
                }
            });
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (flad.e()) {
            Context baseContext = getBaseContext();
            int i = edjs.a;
            if (edeq.z(baseContext)) {
                edjc.e(getContainerActivity(), 3);
            }
        }
    }

    public final boolean p() {
        return "android.app.action.UPDATE_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER".equals(getIntent().getAction());
    }

    public final boolean r(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(this.k);
        boolean z = intent.resolveActivity(getPackageManager()) != null;
        if (!z) {
            Log.i("Auth", "Required intent " + str + " not handled by " + this.k + ", assuming it's a stub.");
        }
        return z;
    }

    public final boolean s(String str) {
        Iterator<PackageInfo> it = getPackageManager().getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().packageName)) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        if (flbg.e() && p()) {
            return !flbg.f() || edgl.d(this);
        }
        return false;
    }

    public final boolean u() {
        return fkzs.a.a().e() && p();
    }

    @Override // defpackage.jth
    public final void c(jtu jtuVar) {
    }
}
