package com.google.android.gms.mobiledataplan.service;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.mobiledataplan.service.ChimeraPeriodicUpdaterService;
import com.google.android.gms.mobiledataplan.service.MobileDataPlanModuleInitIntentOperation;
import defpackage.anya;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.byhr;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.ceau;
import defpackage.cecl;
import defpackage.cecs;
import defpackage.cecy;
import defpackage.cedo;
import defpackage.ceqi;
import defpackage.ejhf;
import defpackage.elfy;
import defpackage.elfz;
import defpackage.elga;
import defpackage.elgk;
import defpackage.etwo;
import defpackage.etwp;
import defpackage.etwq;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ffgu;
import defpackage.fqfv;
import defpackage.fqgb;
import defpackage.fqgh;
import defpackage.fqgn;
import defpackage.fqhb;
import defpackage.fqhf;
import defpackage.fqhj;
import defpackage.fqhv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MobileDataPlanModuleInitIntentOperation extends anya {
    private static final Collection b = Arrays.asList("com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity", "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity", "com.google.android.gms.mobiledataplan.gcm.GcmBroadcastReceiver", "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");
    public static final asot a = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        etwq h;
        for (String str : new ArrayList(b)) {
            try {
                asng.K(str, true);
            } catch (IllegalArgumentException e) {
                ((ejhf) ((ejhf) a.j()).s(e)).B("Failed to enable %s", str);
            }
        }
        asot asotVar = a;
        asotVar.f(ceqi.h()).X("%s: PeriodicService:%b Update:%b CpidManagement:%b BgManager:%b GcoreRegister:%b ConsentFetch:%b", "ModuleInit", Boolean.valueOf(fqhf.J()), Boolean.valueOf(fqhf.R()), Boolean.valueOf(fqhf.D()), Boolean.valueOf(fqfv.l()), Boolean.valueOf(fqgb.j()), Boolean.valueOf(fqgh.f()));
        if (fqhf.D()) {
            asotVar.f(ceqi.h()).B("%s: Resetting recent message count.", "ModuleInit");
            for (String str2 : ceau.c().t()) {
                if (!TextUtils.isEmpty(str2) && (h = ceau.c().h(str2)) != null) {
                    fecj fecjVar = (fecj) h.iB(5, null);
                    fecjVar.X(h);
                    etwp etwpVar = (etwp) fecjVar;
                    for (int i2 = 0; i2 < ((etwq) etwpVar.b).b.size(); i2++) {
                        etwo a2 = etwpVar.a(i2);
                        if (a2 != null) {
                            fecj fecjVar2 = (fecj) a2.iB(5, null);
                            fecjVar2.X(a2);
                            if (!fecjVar2.b.L()) {
                                fecjVar2.U();
                            }
                            ((etwo) fecjVar2.b).d = 0L;
                            if (!etwpVar.b.L()) {
                                etwpVar.U();
                            }
                            etwq etwqVar = (etwq) etwpVar.b;
                            etwo etwoVar = (etwo) fecjVar2.Q();
                            etwoVar.getClass();
                            etwqVar.b();
                            etwqVar.b.set(i2, etwoVar);
                        }
                    }
                    boolean E = ceau.c().E(str2, (etwq) etwpVar.Q());
                    if (fqhb.h()) {
                        cecl c = cecl.c();
                        fecj v = elga.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        ((elga) fecpVar).b = elfz.a(5);
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        ((elga) v.b).c = E;
                        c.j((elga) v.Q(), "MDP_PeriodicService", 0);
                    }
                }
            }
        }
        cecs cecsVar = new cecs();
        if (Build.VERSION.SDK_INT >= 26) {
            int i3 = true != fqhv.a.a().x() ? 3 : 4;
            asbo asboVar = cecsVar.d;
            Context context = cecsVar.c;
            asboVar.q(new NotificationChannelGroup("com.google.android.gms.mobiledataplan.NOTIFICATION", context.getString(R.string.notification_group_name)));
            ArrayList arrayList = new ArrayList();
            arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT", context.getString(R.string.notification_account_alert_channel), i3)));
            arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE", context.getString(R.string.notification_data_balance_channel), i3)));
            arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER", context.getString(R.string.notification_upsell_channel), i3)));
            if (fqhv.f()) {
                if (fqhv.l()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.OUT_OF_DATA", context.getString(R.string.notification_out_of_data_channel), i3)));
                }
                if (fqhv.i()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.EXPIRATION_REMINDER", context.getString(R.string.notification_expiration_channel), i3)));
                }
                if (fqhv.g()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_BALANCE_UPDATE", context.getString(R.string.notification_account_balance_channel), 4)));
                }
                if (fqhv.o()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.PURCHASE", context.getString(R.string.notification_purchase_channel), i3)));
                }
                if (fqhv.e()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.NETWORK_SETUP", context.getString(R.string.notification_network_setup_channel), i3)));
                }
                if (fqhv.h()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.DAILY_UPDATE", context.getString(R.string.notification_daily_update_channel), 1)));
                }
                if (fqhv.m()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.PAY_AS_YOU_GO", context.getString(R.string.notification_paygo_channel), i3)));
                }
                if (fqhv.k()) {
                    arrayList.add(cecsVar.i(cecs.u("com.google.android.gms.mobiledataplan.NOTIFICATION.OTHER", context.getString(R.string.notification_other_channel), i3)));
                }
                cecs.n(arrayList);
            } else {
                cecs.n(arrayList);
            }
        }
        Context a3 = AppContextProvider.a();
        int a4 = cecl.a();
        elfy elfyVar = elfy.a;
        if (fqhb.g()) {
            fecj fecjVar3 = (fecj) elfyVar.iB(5, null);
            fecjVar3.X(elfyVar);
            boolean z = (i & 4) != 0;
            if (!fecjVar3.b.L()) {
                fecjVar3.U();
            }
            fecp fecpVar2 = fecjVar3.b;
            ((elfy) fecpVar2).c = z;
            boolean z2 = (i & 8) != 0;
            if (!fecpVar2.L()) {
                fecjVar3.U();
            }
            fecp fecpVar3 = fecjVar3.b;
            ((elfy) fecpVar3).d = z2;
            boolean z3 = (i & 2) != 0;
            if (!fecpVar3.L()) {
                fecjVar3.U();
            }
            ((elfy) fecjVar3.b).b = z3;
            elfyVar = (elfy) fecjVar3.Q();
        }
        elfy elfyVar2 = elfyVar;
        if (fqfv.l()) {
            final cedo a5 = cedo.a();
            a5.f.execute(new Runnable() { // from class: cedj
                @Override // java.lang.Runnable
                public final void run() {
                    asot asotVar2 = cedo.a;
                    asotVar2.f(ceqi.h()).T("%s: moduleInitialized: workflow:%b. cellular monitor:%b", "BgTaskManager", Boolean.valueOf(fqfv.n()), Boolean.valueOf(fqfv.h()));
                    cedo cedoVar = cedo.this;
                    int a6 = cecl.a();
                    if (fqfv.n()) {
                        ChimeraPeriodicUpdaterService.g(cedoVar.c);
                    }
                    if (fqfv.h()) {
                        cedh.a(cedoVar.c);
                    }
                    cedoVar.i(feha.TASK_GCORE_REGISTER, 3, a6);
                    if (cedo.c()) {
                        cedoVar.i(feha.TASK_HTTP_CPID_FETCH, 3, a6);
                    } else {
                        asotVar2.f(ceqi.h()).B("%s: moduleInitialized: no active SIM needs CPID", "BgTaskManager");
                    }
                }
            });
            asotVar.f(ceqi.h()).B("%s: PeriodicBgWorkflow will be started.", "ModuleInit");
        }
        if (fqhf.D() && !fqfv.a.a().t()) {
            ChimeraPeriodicUpdaterService.f(a3, fqhf.o(), fqhf.m(), elgk.MODULE_INIT_EVENT, elfyVar2);
            asotVar.f(ceqi.h()).B("%s: PeriodicCpidFetch will be started.", "ModuleInit");
        }
        if (cecy.b(a3)) {
            asot asotVar2 = ChimeraPeriodicUpdaterService.a;
            bykj bykjVar = new bykj();
            bykjVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            bykjVar.t("mobiledataplan_consent_status_conversion");
            bykjVar.e(fqgn.b(), fqgn.c());
            bykjVar.y(2, 2);
            bykjVar.v(1);
            Bundle bundle = new Bundle();
            bundle.putInt("event_flow_id", a4);
            bykjVar.u = bundle;
            fqgn.b();
            fqgn.c();
            cecl.c().l(ffgu.CONSENT_STATUS_CONVERSION_SCHEDULED, Integer.valueOf(a4));
            byjl.a(a3).f(bykjVar.b());
        }
        if (fqgb.j() && !fqfv.o()) {
            ChimeraPeriodicUpdaterService.j(a3);
            asotVar.f(ceqi.h()).B("%s: PeriodicGcoreRegistration will be started.", "ModuleInit");
        }
        if (fqgh.f() && !fqfv.a.a().s() && !fqgn.n()) {
            ChimeraPeriodicUpdaterService.h(a3);
            asotVar.f(ceqi.h()).B("%s: PeriodicConsentFetch will be started.", "ModuleInit");
        }
        if (Build.VERSION.SDK_INT >= 29 && fqhj.i()) {
            if (fqhj.a.a().s()) {
                ChimeraPeriodicUpdaterService.l(a3, 26, a4);
            } else {
                ChimeraPeriodicUpdaterService.k(a3);
            }
            asotVar.f(ceqi.h()).B("%s: MeterednessUpdate will be started.", "ModuleInit");
        }
        if (fqhf.I()) {
            new byhr(a3.getMainLooper()).post(new Runnable() { // from class: cedc
                @Override // java.lang.Runnable
                public final void run() {
                    asot asotVar3 = MobileDataPlanModuleInitIntentOperation.a;
                    SubscriptionManager subscriptionManager = (SubscriptionManager) AppContextProvider.a().getSystemService("telephony_subscription_service");
                    if (subscriptionManager == null) {
                        ((ejhf) MobileDataPlanModuleInitIntentOperation.a.j()).x("Couldn't register subscription change listener because SubscriptionManager is null");
                        return;
                    }
                    try {
                        subscriptionManager.addOnSubscriptionsChangedListener(new cebz());
                        MobileDataPlanModuleInitIntentOperation.a.f(ceqi.h()).B("%s: registered subscription change listener", "ModuleInit");
                    } catch (IllegalStateException | SecurityException e2) {
                        ((ejhf) ((ejhf) MobileDataPlanModuleInitIntentOperation.a.j()).s(e2)).x("Exception thrown when registering subscription change listener");
                    }
                }
            });
        }
        asotVar.f(ceqi.h()).P("%s: flag %s.", "ModuleInit", Integer.toBinaryString(i));
    }
}
