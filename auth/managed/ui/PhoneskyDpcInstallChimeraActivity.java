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
import defpackage.adql;
import defpackage.adqn;
import defpackage.adqu;
import defpackage.adqv;
import defpackage.adqy;
import defpackage.advw;
import defpackage.advx;
import defpackage.advy;
import defpackage.advz;
import defpackage.adwj;
import defpackage.adwk;
import defpackage.adwm;
import defpackage.adwq;
import defpackage.adxc;
import defpackage.adxl;
import defpackage.adxo;
import defpackage.adxp;
import defpackage.adxq;
import defpackage.adxr;
import defpackage.adyb;
import defpackage.adzu;
import defpackage.adzz;
import defpackage.aeab;
import defpackage.aeac;
import defpackage.aead;
import defpackage.aeag;
import defpackage.aeai;
import defpackage.aeak;
import defpackage.aeam;
import defpackage.aeao;
import defpackage.aeas;
import defpackage.aeau;
import defpackage.aeav;
import defpackage.aebb;
import defpackage.aebd;
import defpackage.atmr;
import defpackage.atmu;
import defpackage.atvb;
import defpackage.aura;
import defpackage.auwq;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.caqj;
import defpackage.dvtw;
import defpackage.efrl;
import defpackage.eftf;
import defpackage.eftg;
import defpackage.efvx;
import defpackage.efwn;
import defpackage.ekwo;
import defpackage.ekww;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elpg;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fgvn;
import defpackage.flml;
import defpackage.fnqv;
import defpackage.fnqw;
import defpackage.fnra;
import defpackage.fnrl;
import defpackage.fnro;
import defpackage.fnsi;
import defpackage.fnso;
import defpackage.fnsv;
import defpackage.fxrq;
import defpackage.fxws;
import defpackage.fxxm;
import defpackage.fyqe;
import defpackage.jvs;
import defpackage.jxp;
import defpackage.jxs;
import defpackage.jxw;
import defpackage.jzw;
import defpackage.jzx;
import defpackage.kaj;
import defpackage.orf;
import defpackage.ori;
import defpackage.ovv;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneskyDpcInstallChimeraActivity extends adyb implements jzw {
    public static final /* synthetic */ int p = 0;
    private static final Map r = elgx.q(3, new adwj(1, 5), 6, new adwj(1, 9), 7, new adwj(2, 9), 2, new adwj(2, 6), 4, new adwj(3, 7), 5, new adwj(4, 8));
    public adxl h;
    public adxr i;
    public aebd j;
    public String k;
    public atmu l;
    public flml m;
    public ori n;
    public bsxr o;

    public static Intent k(Context context, String str, boolean z, Bundle bundle) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity").putExtra("dpc_package_name", str).putExtra("hide_back_button", z).putExtras(bundle);
    }

    public static boolean q(Context context) {
        return new auwq(context).f("com.android.vending", 0).versionCode >= 80770000;
    }

    public static final aead v(Bundle bundle) {
        if (bundle != null) {
            return aeab.a;
        }
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Device policy management role holder updater aborting, because this device is below T.");
        return new aeac(0, new Intent().putExtra("intentionally_canceled", true));
    }

    private final void z() {
        atmu f = atmu.f(this, atmr.i(y()) ? fnrl.d() ? R.layout.phonesky_dpc_install_activity_glif_v2 : R.layout.phonesky_dpc_install_activity_glif : R.layout.phonesky_dpc_install_activity);
        this.l = f;
        atmr.e(f.a());
        this.l.g();
        this.l.d(false);
        if (getIntent().getBooleanExtra("hide_back_button", false)) {
            this.l.b(false);
            eftf.f(getWindow(), false);
        }
        setContentView(this.l.a());
        this.l.c(getText(R.string.auth_device_management_download_progress));
        this.l.j();
        if (fnrl.c() && (this.l.a() instanceof GlifLayout)) {
            GlifLayout glifLayout = (GlifLayout) this.l.a();
            adzz.a(glifLayout);
            glifLayout.F(R.string.loading_description_text);
        }
    }

    @Override // defpackage.jzw
    public final kaj a(int i, Bundle bundle) {
        return new adwq(this, this.k);
    }

    @Override // defpackage.jzw
    public final /* bridge */ /* synthetic */ void b(kaj kajVar, Object obj) {
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

    @Override // defpackage.atmc
    protected final void gJ(String str, boolean z) {
        atmr.g(this);
        if (fnrl.d()) {
            int i = efwn.a;
            if (efrl.w(this)) {
                setTheme(efwn.a(this));
            }
        }
    }

    @Override // defpackage.ryr, defpackage.juj
    public final jxs getDefaultViewModelProviderFactory() {
        return new jxp(getApplication());
    }

    public final Intent j() {
        if (!atvb.e(this, "auth_managed_dpmrh_fallback_to_aosp_on_role_holder_update_failed", false)) {
            return null;
        }
        Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Setting UPDATE_FAILURE_STRATEGY as AOSP provisioning.");
        return new Intent().putExtra("android.app.extra.ROLE_HOLDER_UPDATE_FAILURE_STRATEGY", 2);
    }

    public final void l(int i) {
        m(i, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (defpackage.aura.d(r17, "com.google.android.apps.work.clouddpc") > r17.h.k) goto L33;
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
        advz advwVar;
        advw advwVar2;
        if (!q(this) || TextUtils.isEmpty(this.k)) {
            consumer.u(aeag.g);
            l(2);
            return;
        }
        z();
        if (!fnra.e() || !this.k.equals("com.google.android.apps.work.clouddpc")) {
            if (!s(this.k)) {
                jzx.a(this).c(0, null, fnra.h() ? new adwk(this, consumer) : this);
                return;
            } else {
                consumer.u(aeag.d);
                l(-1);
                return;
            }
        }
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo("com.google.android.apps.work.clouddpc", 0);
            ArrayList arrayList = new ArrayList(aura.ac(this, "com.google.android.apps.work.clouddpc"));
            fnro fnroVar = fnro.a;
            arrayList.retainAll(fnroVar.lK().b().b);
            if (arrayList.isEmpty()) {
                advwVar = advx.a;
            } else {
                if (fnroVar.lK().e()) {
                    if (packageInfo.versionCode == getPackageManager().getPackageInfo("com.google.android.apps.work.clouddpc", 2097152).versionCode) {
                        advwVar2 = new advw(packageInfo.versionCode);
                        advwVar = advwVar2;
                    }
                }
                Duration c = fgvn.c(fnro.a.lK().a());
                if (Build.VERSION.SDK_INT < 26 || !Instant.now().minus(c).isBefore(Instant.ofEpochMilli(packageInfo.lastUpdateTime))) {
                    advwVar2 = new advw(packageInfo.versionCode);
                    advwVar = advwVar2;
                } else {
                    advwVar = advy.a;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            advwVar = new advw(0);
        }
        if (advwVar instanceof advw) {
            adxl adxlVar = this.h;
            adxlVar.k = ((advw) advwVar).a;
            aebb.b(adxlVar.j);
            jzx.a(this).c(0, null, fnra.h() ? new adwk(this, consumer) : this);
            return;
        }
        adzu.a(this).e(new aeau(aeav.a, advwVar.b, null, false));
        setResult(-1, null);
        finish();
        if (fnqw.f()) {
            efvx.e(getContainerActivity(), 6);
        }
        consumer.u(aeag.b);
    }

    public final void o() {
        elgo g;
        String d = atvb.d(this, "auth_managed_dpmrh_phonesky_update_conditions", "0,0");
        if (d == null) {
            g = elgo.m(0, 0);
        } else {
            int i = elgo.d;
            elgj elgjVar = new elgj();
            Iterator it = ekwo.g(",").i().n(d).iterator();
            while (it.hasNext()) {
                try {
                    elgjVar.i(Integer.valueOf(Integer.parseInt((String) it.next())));
                } catch (NumberFormatException unused) {
                    g = elgo.m(0, 0);
                }
            }
            g = elgjVar.g();
        }
        int i2 = ((elpg) g).c;
        if (i2 < 3) {
            Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Does not update Phonesky because conditions would not match");
        } else {
            int intValue = ((Integer) g.get(0)).intValue();
            int intValue2 = ((Integer) g.get(1)).intValue();
            int a = adwm.a(this);
            if (intValue >= 0 && a < intValue) {
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Does not update Phonesky because Phonesky version is smaller than lower bound.");
            } else if (intValue2 >= 0 && a >= intValue2) {
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Does not update Phonesky because Phonesky version is larger than upper bound.");
            } else if (elgo.i(g.subList(2, i2)).contains(Integer.valueOf(getIntent().getIntExtra("android.app.extra.PROVISIONING_TRIGGER", 0)))) {
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Update Phonesky");
                aebb.b(this.h.h);
                adzu.a(this).c(aeas.a(aeao.a, this.j));
                final adxl adxlVar = this.h;
                if (fnsv.g()) {
                    ovv.a(adqv.d, fxrq.a, new fxws() { // from class: adwt
                        @Override // defpackage.fxws
                        public final Object a(Object obj, Object obj2) {
                            final ovu ovuVar = (ovu) obj2;
                            adxl.this.e(new Consumer() { // from class: adwr
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void u(Object obj3) {
                                    aeag aeagVar = (aeag) obj3;
                                    ovu.this.a(new adqt("com.android.vending", aeagVar), new owk(aeagVar));
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return aeag.a;
                        }
                    });
                    return;
                } else {
                    adxlVar.e(new Consumer() { // from class: adwu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void u(Object obj) {
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
        aebb.b(this.h.i);
        adzu.a(this).c(aeas.a(aeak.a, this.j));
        this.h.b(this.k);
    }

    @Override // defpackage.adyb, defpackage.atmc, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (fnqv.e()) {
            ((dvtw) this.m.a()).a();
        }
        if (fnsi.c()) {
            new adqu().n(getContainerActivity(), this.f, getIntent());
        }
        this.h = (adxl) new jxw(this, new adxc(getApplication())).a(adxl.class);
        this.i = (adxr) new jxw(this, new adxp(getApplication())).a(adxr.class);
        ekww ekwwVar = bsxv.a;
        this.o = new bsxr();
        if (fnsv.d()) {
            this.j = aebd.a(this, getIntent());
        }
        fnqw fnqwVar = fnqw.a;
        if (fnqwVar.lK().k()) {
            final adxl adxlVar = this.h;
            adxlVar.d.ih(false);
            caqj caqjVar = adxlVar.c;
            caqjVar.removeCallbacksAndMessages(null);
            caqjVar.postDelayed(new Runnable() { // from class: adww
                @Override // java.lang.Runnable
                public final void run() {
                    adxl.this.d.ih(true);
                }
            }, TimeUnit.SECONDS.toMillis(fnqwVar.lK().a()));
            this.h.d.g(this, new jvs() { // from class: adwi
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                        Log.w("Auth", "Global timeout reached, finishing activity");
                        if (phoneskyDpcInstallChimeraActivity.u()) {
                            phoneskyDpcInstallChimeraActivity.n.c(adqm.d);
                        } else if (phoneskyDpcInstallChimeraActivity.t()) {
                            aebb.b(phoneskyDpcInstallChimeraActivity.h.g);
                            adzu.a(phoneskyDpcInstallChimeraActivity).c(aeas.a(aeaq.a, phoneskyDpcInstallChimeraActivity.j));
                            phoneskyDpcInstallChimeraActivity.i.e();
                        }
                        phoneskyDpcInstallChimeraActivity.m(true != fnqw.a.lK().i() ? 6 : 7, phoneskyDpcInstallChimeraActivity.j());
                    }
                }
            });
        }
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
        if (!p()) {
            this.k = getIntent().getStringExtra("dpc_package_name");
            if (fnsv.g()) {
                ovv.a(adqn.d, fxrq.a, new fxws() { // from class: adwa
                    @Override // defpackage.fxws
                    public final Object a(Object obj, Object obj2) {
                        final ovu ovuVar = (ovu) obj2;
                        final PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                        phoneskyDpcInstallChimeraActivity.n(new Consumer() { // from class: adwc
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void u(Object obj3) {
                                aeag aeagVar = (aeag) obj3;
                                ovuVar.a(new adqt(PhoneskyDpcInstallChimeraActivity.this.k, aeagVar), new owk(aeagVar));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return aeag.a;
                    }
                });
                return;
            } else {
                n(new Consumer() { // from class: adwb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj) {
                        int i = PhoneskyDpcInstallChimeraActivity.p;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        aebb.b(this.h.e);
        adzu.a(this).c(aeas.a(aeai.a, this.j));
        this.k = null;
        aead v = fnsv.g() ? (aead) ovv.a(adqy.d, fxrq.a, new fxws() { // from class: adwh
            @Override // defpackage.fxws
            public final Object a(Object obj, Object obj2) {
                adqz adqzVar;
                ovu ovuVar = (ovu) obj2;
                aead v2 = PhoneskyDpcInstallChimeraActivity.v(bundle);
                if (v2 instanceof aeab) {
                    adqzVar = new adqz(true, 0);
                } else {
                    if (!(v2 instanceof aeac)) {
                        throw new fxqx();
                    }
                    adqzVar = new adqz(false, ((aeac) v2).a);
                }
                ovuVar.a(adqzVar, new owk(v2));
                return v2;
            }
        }) : v(bundle);
        if (v instanceof aeac) {
            aeac aeacVar = (aeac) v;
            Intent intent = aeacVar.b;
            if (intent == null) {
                l(aeacVar.a);
                return;
            } else {
                m(aeacVar.a, intent);
                return;
            }
        }
        z();
        this.h.a.d.a.g(this, new jvs() { // from class: adwd
            @Override // defpackage.jvs
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
                        adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aean.a, num.intValue() == -7 ? 11 : num.intValue() == -1 ? 10 : num.intValue() == -2 ? 12 : num.intValue() == -3 ? 13 : 1, null, aebb.a(phoneskyDpcInstallChimeraActivity.h.h), phoneskyDpcInstallChimeraActivity.j));
                        aebb.b(phoneskyDpcInstallChimeraActivity.h.i);
                        adzu.a(phoneskyDpcInstallChimeraActivity).c(aeas.a(aeak.a, phoneskyDpcInstallChimeraActivity.j));
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
        this.h.b.e.a.g(this, new jvs() { // from class: adwe
            @Override // defpackage.jvs
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
                        adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aeaj.a, num.intValue() == -7 ? 15 : 16, null, aebb.a(phoneskyDpcInstallChimeraActivity.h.i), phoneskyDpcInstallChimeraActivity.j));
                        phoneskyDpcInstallChimeraActivity.m(3, phoneskyDpcInstallChimeraActivity.j());
                        break;
                    case -6:
                    case -5:
                    case -4:
                        phoneskyDpcInstallChimeraActivity.l.h();
                        phoneskyDpcInstallChimeraActivity.l.i();
                        break;
                    case -3:
                        adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aeaj.a, 17, null, aebb.a(phoneskyDpcInstallChimeraActivity.h.i), phoneskyDpcInstallChimeraActivity.j));
                        phoneskyDpcInstallChimeraActivity.m(2, phoneskyDpcInstallChimeraActivity.j());
                        break;
                    case -1:
                        if (!phoneskyDpcInstallChimeraActivity.p()) {
                            phoneskyDpcInstallChimeraActivity.l(-1);
                            break;
                        } else {
                            Duration a = aebb.a(phoneskyDpcInstallChimeraActivity.h.i);
                            if (!phoneskyDpcInstallChimeraActivity.s(phoneskyDpcInstallChimeraActivity.k) || !phoneskyDpcInstallChimeraActivity.r("android.app.action.ROLE_HOLDER_PROVISION_MANAGED_PROFILE") || !phoneskyDpcInstallChimeraActivity.r("android.app.action.ROLE_HOLDER_PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE") || !phoneskyDpcInstallChimeraActivity.r("android.app.action.ROLE_HOLDER_PROVISION_FINALIZATION")) {
                                Log.e("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] Device policy management role holder installed but is not valid.");
                                adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aeaj.a, 22, null, a, phoneskyDpcInstallChimeraActivity.j));
                                phoneskyDpcInstallChimeraActivity.m(2, phoneskyDpcInstallChimeraActivity.j());
                                break;
                            } else {
                                adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aeaj.a, 14, null, a, phoneskyDpcInstallChimeraActivity.j));
                                if (phoneskyDpcInstallChimeraActivity.o != null) {
                                    bsxr.a(auio.AUTH_MANAGED_DEVICE_POLICY_MANAGEMENT_ROLE_HOLDER_UPDATED);
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
            ori oriVar = this.n;
            adql adqlVar = adql.d;
            fxxm.f(adqlVar, "contract");
            fyqe.d(oriVar.a, new orf(oriVar, adqlVar, null)).hD(new Runnable() { // from class: adwf
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneskyDpcInstallChimeraActivity.this.o();
                }
            }, eqex.a);
            return;
        }
        if (!t()) {
            o();
            return;
        }
        this.i.d.g(this, new jvs() { // from class: adwg
            @Override // defpackage.jvs
            public final void a(Object obj) {
                adxq adxqVar = (adxq) obj;
                Log.i("Auth", "[AuthManaged, PhoneskyDpcInstallChimeraActivity] observed pauseState ".concat(String.valueOf(String.valueOf(adxqVar))));
                int ordinal = adxqVar.ordinal();
                PhoneskyDpcInstallChimeraActivity phoneskyDpcInstallChimeraActivity = PhoneskyDpcInstallChimeraActivity.this;
                if (ordinal == 1 || ordinal == 2) {
                    adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aeal.a, adxqVar == adxq.PAUSED ? 18 : 19, null, aebb.a(phoneskyDpcInstallChimeraActivity.h.f), phoneskyDpcInstallChimeraActivity.j));
                    phoneskyDpcInstallChimeraActivity.o();
                } else if (ordinal == 3 || ordinal == 4) {
                    adzu.a(phoneskyDpcInstallChimeraActivity).c(new aeas(aeap.a, adxqVar == adxq.RESUMED ? 20 : 21, null, aebb.a(phoneskyDpcInstallChimeraActivity.h.g), phoneskyDpcInstallChimeraActivity.j));
                }
            }
        });
        aebb.b(this.h.f);
        adzu.a(this).c(aeas.a(aeam.a, this.j));
        final adxr adxrVar = this.i;
        if (fnso.g()) {
            eqgc.t(adxrVar.c.a(), new adxo(adxrVar), eqex.a);
        } else if (adxrVar.d.ii() == adxq.PAUSED) {
            Log.i("Auth", "[AuthManaged, PauseAppUpdatesViewModel] Already in paused state");
        } else {
            adxrVar.a.post(new Runnable() { // from class: adxn
                @Override // java.lang.Runnable
                public final void run() {
                    adxr.this.b();
                }
            });
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (fnrl.d()) {
            Context baseContext = getBaseContext();
            int i = efwn.a;
            if (efrl.z(baseContext)) {
                efvx.e(getContainerActivity(), 3);
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
        if (fnso.e() && p()) {
            return !fnso.f() || eftg.d(this);
        }
        return false;
    }

    public final boolean u() {
        return fnra.a.lK().e() && p();
    }

    @Override // defpackage.jzw
    public final void c(kaj kajVar) {
    }
}
