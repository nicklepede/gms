package com.google.android.gms.autofill.operation;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.autofill.operation.AutofillModuleInitIntentOperation;
import defpackage.aekv;
import defpackage.aekw;
import defpackage.aery;
import defpackage.aerz;
import defpackage.aesb;
import defpackage.aevg;
import defpackage.affl;
import defpackage.afjd;
import defpackage.afjp;
import defpackage.afjq;
import defpackage.aggx;
import defpackage.ahfk;
import defpackage.ahfw;
import defpackage.anya;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asng;
import defpackage.asot;
import defpackage.byhr;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.dplo;
import defpackage.dpok;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiir;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.fldt;
import defpackage.fleb;
import defpackage.fleh;
import defpackage.flgf;
import defpackage.flhx;
import defpackage.flix;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AutofillModuleInitIntentOperation extends anya {
    public static final asot a = asot.b("AutofillModuleInitIntentOperation", asej.AUTOFILL);
    static final String[] b = {"com.google.android.gms.autofill.service.AutofillService", "com.google.android.gms.autofill.ui.AutofillActivity", "com.google.android.gms.autofill.ui.AutofillDialogActivity", "com.google.android.gms.autofill.ui.AutofillSettingsActivity", "com.google.android.gms.autofill.ui.AutofillManagePasswordsActivity", "com.google.android.gms.autofill.ui.settings.AutofillModernSettingsActivity", "com.google.android.gms.autofill.ui.AutofillTransparentActivity"};

    static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final void f(String str, boolean z) {
        asng.H(getBaseContext(), str, z);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        ((ejhf) ((ejhf) a.h()).ah((char) 1019)).z("AutofillModuleInitIntentOperation onInitRuntimeState(%s)", i);
        fldt.A();
        boolean e = e();
        String[] strArr = b;
        int length = strArr.length;
        for (int i2 = 0; i2 < 7; i2++) {
            f(strArr[i2], e);
        }
        f("com.google.android.gms.autofill.ui.AutofillSettingsPrivacyHubActivity", e);
        if (e) {
            aerz a2 = aery.a(this);
            aesb aesbVar = (aesb) a2;
            aekw aekwVar = (aekw) aesbVar.ad.a();
            if (aekwVar.e.compareAndSet(false, true)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addDataScheme("package");
                iln.b(aekwVar.a, aekwVar.b, intentFilter, 2);
                new byhr(Looper.getMainLooper()).post(new aekv(aekwVar.c, aekwVar.d));
            }
            if (flhx.m() || flgf.e() || flix.c()) {
                afjq.a(a2);
                if (flhx.k() && fldt.m()) {
                    eiid eiidVar = (eiid) aesbVar.at.a();
                    if (eiidVar.h()) {
                        ((affl) eiidVar.c()).b(true);
                    } else {
                        String i3 = flhx.i();
                        final eiid eiidVar2 = (eiid) aesbVar.ar.a();
                        final eiid eiidVar3 = (eiid) aesbVar.as.a();
                        final asmf asmfVar = new asmf(Integer.MAX_VALUE, 9);
                        if (eiidVar3.h() && eiidVar2.h()) {
                            dplo dploVar = (dplo) eiidVar2.c();
                            dpok dpokVar = new dpok(null);
                            dpokVar.b(i3);
                            enps.f(enox.g(ensi.h(dploVar.h(dpokVar.a())), Exception.class, new enqc() { // from class: afjm
                                @Override // defpackage.enqc
                                public final enss a(Object obj) {
                                    Exception exc = (Exception) obj;
                                    asot asotVar = AutofillModuleInitIntentOperation.a;
                                    final enss a3 = ((dpja) eiid.this.c()).a((dplo) eiidVar2.c());
                                    a3.hn(new Runnable() { // from class: afjo
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            asot asotVar2 = AutofillModuleInitIntentOperation.a;
                                            try {
                                                ensj.r(enss.this);
                                                ((ejhf) ((ejhf) AutofillModuleInitIntentOperation.a.h()).ah(1016)).x("MDD refresh for AwG Server Predictions has been completed");
                                            } catch (Exception e2) {
                                                ((ejhf) ((ejhf) ((ejhf) AutofillModuleInitIntentOperation.a.j()).s(e2)).ah((char) 1017)).x("MDD refresh for AwG Server Predictions has failed");
                                            }
                                        }
                                    }, asmfVar);
                                    throw exc;
                                }
                            }, asmfVar), new eiho() { // from class: afjn
                                @Override // defpackage.eiho
                                public final Object apply(Object obj) {
                                    asot asotVar = AutofillModuleInitIntentOperation.a;
                                    return null;
                                }
                            }, asmfVar);
                        }
                    }
                }
            }
            a2.b().a();
            eiid p = a2.p();
            if (fldt.t() && ahfw.a(a2.h())) {
                ((afjd) ((eiir) p).a).c();
            } else {
                ((afjd) ((eiir) p).a).d();
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (fleb.d()) {
                String string = Settings.Secure.getString(getContentResolver(), "autofill_service");
                if (string != null && string.equals("com.google.android.gms/com.google.android.gms.autofill.service.AutofillService")) {
                    ahfk.f();
                    ahfk.b(this);
                } else if (ahfk.c(this)) {
                    ahfk.a(this);
                    ahfk.e();
                }
                getContentResolver().registerContentObserver(Settings.Secure.getUriFor("autofill_service"), false, new afjp(this, new byhr(getMainLooper()), this));
            } else if (ahfk.c(this)) {
                ahfk.e();
                ahfk.a(this);
            }
        }
        if (fleh.a.a().e()) {
            byjl c = aevg.c(((aesb) aery.a(this)).a);
            if (!fleh.c()) {
                c.d("GpmMigrationTaskTag", GpmBiometricsValueMigrationTaskBoundService.class.getName());
                return;
            }
            byko bykoVar = new byko();
            bykoVar.w(GpmBiometricsValueMigrationTaskBoundService.class.getName());
            bykoVar.q("GpmMigrationTaskTag");
            bykoVar.a = bykv.j;
            bykoVar.l(false);
            c.f(bykoVar.b());
        }
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        fldt.A();
        if (e()) {
            aggx j = aery.a(this).j();
            eigb eigbVar = eigb.a;
            j.at(eigbVar);
            j.as(eigbVar);
            j.ac(false);
        }
    }
}
