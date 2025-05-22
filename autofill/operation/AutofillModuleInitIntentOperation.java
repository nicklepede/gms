package com.google.android.gms.autofill.operation;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.autofill.operation.AutofillModuleInitIntentOperation;
import defpackage.aglh;
import defpackage.agli;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.agso;
import defpackage.agvt;
import defpackage.ahfx;
import defpackage.ahjp;
import defpackage.ahkb;
import defpackage.ahkc;
import defpackage.aihn;
import defpackage.ajga;
import defpackage.ajgm;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aupz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.caqj;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.drvx;
import defpackage.dryt;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvw;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.fnvd;
import defpackage.fnvl;
import defpackage.fnvr;
import defpackage.fnxs;
import defpackage.fnzk;
import defpackage.foak;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AutofillModuleInitIntentOperation extends apzs {
    public static final ausn a = ausn.b("AutofillModuleInitIntentOperation", auid.AUTOFILL);
    static final String[] b = {"com.google.android.gms.autofill.service.AutofillService", "com.google.android.gms.autofill.ui.AutofillActivity", "com.google.android.gms.autofill.ui.AutofillDialogActivity", "com.google.android.gms.autofill.ui.AutofillSettingsActivity", "com.google.android.gms.autofill.ui.AutofillManagePasswordsActivity", "com.google.android.gms.autofill.ui.settings.AutofillModernSettingsActivity", "com.google.android.gms.autofill.ui.AutofillTransparentActivity"};

    static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void f(String str, boolean z) {
        aura.H(getBaseContext(), str, z);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ((eluo) ((eluo) a.h()).ai((char) 1013)).z("AutofillModuleInitIntentOperation onInitRuntimeState(%s)", i);
        fnvd.A();
        boolean e = e();
        String[] strArr = b;
        int length = strArr.length;
        for (int i2 = 0; i2 < 7; i2++) {
            f(strArr[i2], e);
        }
        f("com.google.android.gms.autofill.ui.AutofillSettingsPrivacyHubActivity", e);
        if (e) {
            agsm a2 = agsl.a(this);
            agso agsoVar = (agso) a2;
            agli agliVar = (agli) agsoVar.ad.a();
            if (agliVar.e.compareAndSet(false, true)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addDataScheme("package");
                ind.b(agliVar.a, agliVar.b, intentFilter, 2);
                new caqj(Looper.getMainLooper()).post(new aglh(agliVar.c, agliVar.d));
            }
            if (fnzk.m() || fnxs.e() || foak.c()) {
                ahkc.a(a2);
                if (fnzk.k() && fnvd.m()) {
                    ekvi ekviVar = (ekvi) agsoVar.at.a();
                    if (ekviVar.h()) {
                        ((ahfx) ekviVar.c()).b(true);
                    } else {
                        String i3 = fnzk.i();
                        final ekvi ekviVar2 = (ekvi) agsoVar.ar.a();
                        final ekvi ekviVar3 = (ekvi) agsoVar.as.a();
                        final aupz aupzVar = new aupz(Integer.MAX_VALUE, 9);
                        if (ekviVar3.h() && ekviVar2.h()) {
                            drvx drvxVar = (drvx) ekviVar2.c();
                            ektg ektgVar = ektg.a;
                            eqdl.f(eqcq.g(eqgb.h(drvxVar.h(new dryt(i3, ektgVar, ektgVar))), Exception.class, new eqdv() { // from class: ahjy
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj) {
                                    Exception exc = (Exception) obj;
                                    ausn ausnVar = AutofillModuleInitIntentOperation.a;
                                    final eqgl a3 = ((drtj) ekvi.this.c()).a((drvx) ekviVar2.c());
                                    a3.hD(new Runnable() { // from class: ahka
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ausn ausnVar2 = AutofillModuleInitIntentOperation.a;
                                            try {
                                                eqgc.r(eqgl.this);
                                                ((eluo) ((eluo) AutofillModuleInitIntentOperation.a.h()).ai(1010)).x("MDD refresh for AwG Server Predictions has been completed");
                                            } catch (Exception e2) {
                                                ((eluo) ((eluo) ((eluo) AutofillModuleInitIntentOperation.a.j()).s(e2)).ai((char) 1011)).x("MDD refresh for AwG Server Predictions has failed");
                                            }
                                        }
                                    }, aupzVar);
                                    throw exc;
                                }
                            }, aupzVar), new ekut() { // from class: ahjz
                                @Override // defpackage.ekut
                                public final Object apply(Object obj) {
                                    ausn ausnVar = AutofillModuleInitIntentOperation.a;
                                    return null;
                                }
                            }, aupzVar);
                        }
                    }
                }
            }
            a2.b().a();
            ekvi p = a2.p();
            if (fnvd.s() && ajgm.a(a2.h())) {
                ((ahjp) ((ekvw) p).a).c();
            } else {
                ((ahjp) ((ekvw) p).a).d();
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (fnvl.d()) {
                String string = Settings.Secure.getString(getContentResolver(), "autofill_service");
                if (string != null && string.equals("com.google.android.gms/com.google.android.gms.autofill.service.AutofillService")) {
                    ajga.f();
                    ajga.b(this);
                } else if (ajga.c(this)) {
                    ajga.a(this);
                    ajga.e();
                }
                getContentResolver().registerContentObserver(Settings.Secure.getUriFor("autofill_service"), false, new ahkb(this, new caqj(getMainLooper()), this));
            } else if (ajga.c(this)) {
                ajga.e();
                ajga.a(this);
            }
        }
        if (fnvr.a.lK().e()) {
            casd c = agvt.c(((agso) agsl.a(this)).a);
            if (!fnvr.c()) {
                c.d("GpmMigrationTaskTag", GpmBiometricsValueMigrationTaskBoundService.class.getName());
                return;
            }
            catg catgVar = new catg();
            catgVar.w(GpmBiometricsValueMigrationTaskBoundService.class.getName());
            catgVar.q("GpmMigrationTaskTag");
            catgVar.a = catn.j;
            catgVar.l(false);
            c.f(catgVar.b());
        }
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        fnvd.A();
        if (e()) {
            aihn j = agsl.a(this).j();
            ektg ektgVar = ektg.a;
            j.at(ektgVar);
            j.as(ektgVar);
            j.ac(false);
        }
    }
}
