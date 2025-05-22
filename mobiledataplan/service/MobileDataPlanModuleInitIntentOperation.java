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
import defpackage.apzs;
import defpackage.aued;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.caqj;
import defpackage.casd;
import defpackage.catb;
import defpackage.cgkb;
import defpackage.cgls;
import defpackage.cglz;
import defpackage.cgmf;
import defpackage.cgmv;
import defpackage.cgzp;
import defpackage.eluo;
import defpackage.entl;
import defpackage.entm;
import defpackage.entn;
import defpackage.entx;
import defpackage.ewmg;
import defpackage.ewmh;
import defpackage.ewmi;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhvs;
import defpackage.fszn;
import defpackage.fszt;
import defpackage.fszz;
import defpackage.ftaf;
import defpackage.ftat;
import defpackage.ftax;
import defpackage.ftbb;
import defpackage.ftbn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MobileDataPlanModuleInitIntentOperation extends apzs {
    private static final Collection b = Arrays.asList("com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity", "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity", "com.google.android.gms.mobiledataplan.gcm.GcmBroadcastReceiver", "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");
    public static final ausn a = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ewmi h;
        for (String str : new ArrayList(b)) {
            try {
                aura.K(str, true);
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) a.j()).s(e)).B("Failed to enable %s", str);
            }
        }
        ausn ausnVar = a;
        ausnVar.f(cgzp.h()).X("%s: PeriodicService:%b Update:%b CpidManagement:%b BgManager:%b GcoreRegister:%b ConsentFetch:%b", "ModuleInit", Boolean.valueOf(ftax.J()), Boolean.valueOf(ftax.P()), Boolean.valueOf(ftax.D()), Boolean.valueOf(fszn.l()), Boolean.valueOf(fszt.j()), Boolean.valueOf(fszz.f()));
        if (ftax.D()) {
            ausnVar.f(cgzp.h()).B("%s: Resetting recent message count.", "ModuleInit");
            for (String str2 : cgkb.c().t()) {
                if (!TextUtils.isEmpty(str2) && (h = cgkb.c().h(str2)) != null) {
                    fgrc fgrcVar = (fgrc) h.iQ(5, null);
                    fgrcVar.X(h);
                    ewmh ewmhVar = (ewmh) fgrcVar;
                    for (int i2 = 0; i2 < ((ewmi) ewmhVar.b).b.size(); i2++) {
                        ewmg a2 = ewmhVar.a(i2);
                        if (a2 != null) {
                            fgrc fgrcVar2 = (fgrc) a2.iQ(5, null);
                            fgrcVar2.X(a2);
                            if (!fgrcVar2.b.L()) {
                                fgrcVar2.U();
                            }
                            ((ewmg) fgrcVar2.b).d = 0L;
                            if (!ewmhVar.b.L()) {
                                ewmhVar.U();
                            }
                            ewmi ewmiVar = (ewmi) ewmhVar.b;
                            ewmg ewmgVar = (ewmg) fgrcVar2.Q();
                            ewmgVar.getClass();
                            ewmiVar.b();
                            ewmiVar.b.set(i2, ewmgVar);
                        }
                    }
                    boolean E = cgkb.c().E(str2, (ewmi) ewmhVar.Q());
                    if (ftat.h()) {
                        cgls c = cgls.c();
                        fgrc v = entn.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        ((entn) fgriVar).b = entm.a(5);
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        ((entn) v.b).c = E;
                        c.j((entn) v.Q(), "MDP_PeriodicService", 0);
                    }
                }
            }
        }
        cglz cglzVar = new cglz();
        if (Build.VERSION.SDK_INT >= 26) {
            int i3 = true != ftbn.a.lK().x() ? 3 : 4;
            aued auedVar = cglzVar.d;
            Context context = cglzVar.c;
            auedVar.q(new NotificationChannelGroup("com.google.android.gms.mobiledataplan.NOTIFICATION", context.getString(R.string.notification_group_name)));
            ArrayList arrayList = new ArrayList();
            arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT", context.getString(R.string.notification_account_alert_channel), i3)));
            arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE", context.getString(R.string.notification_data_balance_channel), i3)));
            arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER", context.getString(R.string.notification_upsell_channel), i3)));
            if (ftbn.f()) {
                if (ftbn.l()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.OUT_OF_DATA", context.getString(R.string.notification_out_of_data_channel), i3)));
                }
                if (ftbn.i()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.EXPIRATION_REMINDER", context.getString(R.string.notification_expiration_channel), i3)));
                }
                if (ftbn.g()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_BALANCE_UPDATE", context.getString(R.string.notification_account_balance_channel), 4)));
                }
                if (ftbn.o()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.PURCHASE", context.getString(R.string.notification_purchase_channel), i3)));
                }
                if (ftbn.e()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.NETWORK_SETUP", context.getString(R.string.notification_network_setup_channel), i3)));
                }
                if (ftbn.h()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.DAILY_UPDATE", context.getString(R.string.notification_daily_update_channel), 1)));
                }
                if (ftbn.m()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.PAY_AS_YOU_GO", context.getString(R.string.notification_paygo_channel), i3)));
                }
                if (ftbn.k()) {
                    arrayList.add(cglzVar.i(cglz.u("com.google.android.gms.mobiledataplan.NOTIFICATION.OTHER", context.getString(R.string.notification_other_channel), i3)));
                }
                cglz.n(arrayList);
            } else {
                cglz.n(arrayList);
            }
        }
        Context a3 = AppContextProvider.a();
        int a4 = cgls.a();
        entl entlVar = entl.a;
        if (ftat.g()) {
            fgrc fgrcVar3 = (fgrc) entlVar.iQ(5, null);
            fgrcVar3.X(entlVar);
            boolean z = (i & 4) != 0;
            if (!fgrcVar3.b.L()) {
                fgrcVar3.U();
            }
            fgri fgriVar2 = fgrcVar3.b;
            ((entl) fgriVar2).c = z;
            boolean z2 = (i & 8) != 0;
            if (!fgriVar2.L()) {
                fgrcVar3.U();
            }
            fgri fgriVar3 = fgrcVar3.b;
            ((entl) fgriVar3).d = z2;
            boolean z3 = (i & 2) != 0;
            if (!fgriVar3.L()) {
                fgrcVar3.U();
            }
            ((entl) fgrcVar3.b).b = z3;
            entlVar = (entl) fgrcVar3.Q();
        }
        entl entlVar2 = entlVar;
        if (fszn.l()) {
            final cgmv a5 = cgmv.a();
            a5.f.execute(new Runnable() { // from class: cgmq
                @Override // java.lang.Runnable
                public final void run() {
                    ausn ausnVar2 = cgmv.a;
                    ausnVar2.f(cgzp.h()).T("%s: moduleInitialized: workflow:%b. cellular monitor:%b", "BgTaskManager", Boolean.valueOf(fszn.n()), Boolean.valueOf(fszn.h()));
                    cgmv cgmvVar = cgmv.this;
                    int a6 = cgls.a();
                    if (fszn.n()) {
                        ChimeraPeriodicUpdaterService.g(cgmvVar.c);
                    }
                    if (fszn.h()) {
                        cgmo.a(cgmvVar.c);
                    }
                    cgmvVar.i(fgvt.TASK_GCORE_REGISTER, 3, a6);
                    if (cgmv.c()) {
                        cgmvVar.i(fgvt.TASK_HTTP_CPID_FETCH, 3, a6);
                    } else {
                        ausnVar2.f(cgzp.h()).B("%s: moduleInitialized: no active SIM needs CPID", "BgTaskManager");
                    }
                }
            });
            ausnVar.f(cgzp.h()).B("%s: PeriodicBgWorkflow will be started.", "ModuleInit");
        }
        if (ftax.D() && !fszn.a.lK().t()) {
            ChimeraPeriodicUpdaterService.f(a3, ftax.o(), ftax.m(), entx.MODULE_INIT_EVENT, entlVar2);
            ausnVar.f(cgzp.h()).B("%s: PeriodicCpidFetch will be started.", "ModuleInit");
        }
        if (cgmf.b(a3)) {
            ausn ausnVar2 = ChimeraPeriodicUpdaterService.a;
            catb catbVar = new catb();
            catbVar.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            catbVar.t("mobiledataplan_consent_status_conversion");
            catbVar.e(ftaf.b(), ftaf.c());
            catbVar.y(2, 2);
            catbVar.v(1);
            Bundle bundle = new Bundle();
            bundle.putInt("event_flow_id", a4);
            catbVar.u = bundle;
            ftaf.b();
            ftaf.c();
            cgls.c().l(fhvs.CONSENT_STATUS_CONVERSION_SCHEDULED, Integer.valueOf(a4));
            casd.a(a3).f(catbVar.b());
        }
        if (fszt.j() && !fszn.o()) {
            ChimeraPeriodicUpdaterService.j(a3);
            ausnVar.f(cgzp.h()).B("%s: PeriodicGcoreRegistration will be started.", "ModuleInit");
        }
        if (fszz.f() && !fszn.a.lK().s() && !ftaf.n()) {
            ChimeraPeriodicUpdaterService.h(a3);
            ausnVar.f(cgzp.h()).B("%s: PeriodicConsentFetch will be started.", "ModuleInit");
        }
        if (Build.VERSION.SDK_INT >= 29 && ftbb.i()) {
            if (ftbb.a.lK().s()) {
                ChimeraPeriodicUpdaterService.l(a3, 26, a4);
            } else {
                ChimeraPeriodicUpdaterService.k(a3);
            }
            ausnVar.f(cgzp.h()).B("%s: MeterednessUpdate will be started.", "ModuleInit");
        }
        if (ftax.I()) {
            new caqj(a3.getMainLooper()).post(new Runnable() { // from class: cgmj
                @Override // java.lang.Runnable
                public final void run() {
                    ausn ausnVar3 = MobileDataPlanModuleInitIntentOperation.a;
                    SubscriptionManager subscriptionManager = (SubscriptionManager) AppContextProvider.a().getSystemService("telephony_subscription_service");
                    if (subscriptionManager == null) {
                        ((eluo) MobileDataPlanModuleInitIntentOperation.a.j()).x("Couldn't register subscription change listener because SubscriptionManager is null");
                        return;
                    }
                    try {
                        subscriptionManager.addOnSubscriptionsChangedListener(new cglg());
                        MobileDataPlanModuleInitIntentOperation.a.f(cgzp.h()).B("%s: registered subscription change listener", "ModuleInit");
                    } catch (IllegalStateException | SecurityException e2) {
                        ((eluo) ((eluo) MobileDataPlanModuleInitIntentOperation.a.j()).s(e2)).x("Exception thrown when registering subscription change listener");
                    }
                }
            });
        }
        ausnVar.f(cgzp.h()).P("%s: flag %s.", "ModuleInit", Integer.toBinaryString(i));
    }
}
