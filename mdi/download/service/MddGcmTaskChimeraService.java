package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.chimera.modules.mdi.download.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bylf;
import defpackage.byln;
import defpackage.cchm;
import defpackage.cciw;
import defpackage.ccjb;
import defpackage.dfbl;
import defpackage.dpje;
import defpackage.dpoj;
import defpackage.dqjn;
import defpackage.dqjp;
import defpackage.dqkc;
import defpackage.dqmv;
import defpackage.eigb;
import defpackage.eiiv;
import defpackage.fnck;
import defpackage.fpbw;
import defpackage.fpcn;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MddGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final dpje a = new dpoj();
    private static boolean b = false;

    public static void d() {
        if (!fnck.a.a().x()) {
            int i = dqjp.a;
            Context a2 = AppContextProvider.a();
            byjl a3 = byjl.a(a2);
            SharedPreferences sharedPreferences = a2.getSharedPreferences("gms_icing_mdd_gcm_task_periods", 0);
            e(a3, sharedPreferences, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", fpcn.a.a().f(), 2);
            if (fpbw.f()) {
                fpcn fpcnVar = fpcn.a;
                e(a3, sharedPreferences, "MDD.CHARGING.PERIODIC.TASK", fpcnVar.a().d(), 2);
                e(a3, sharedPreferences, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", fpcnVar.a().b(), 0);
                e(a3, sharedPreferences, "MDD.WIFI.CHARGING.PERIODIC.TASK", fpcnVar.a().h(), 1);
            } else if (fpbw.d()) {
                a3.d("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a3.d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a3.d("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            }
            b = true;
            return;
        }
        int i2 = dqjp.a;
        byjl a4 = byjl.a(AppContextProvider.a());
        if (fpcn.a.a().k()) {
            f(a4, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", bykv.e((int) fpcn.a.a().e()), false, false);
        } else {
            a4.d("MDD.MAINTENANCE.PERIODIC.GCM.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        if (!fpbw.f()) {
            if (fpbw.d()) {
                a4.d("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a4.d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a4.d("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                return;
            }
            return;
        }
        fpcn fpcnVar2 = fpcn.a;
        if (fpcnVar2.a().j()) {
            f(a4, "MDD.CHARGING.PERIODIC.TASK", bykv.e((int) fpcnVar2.a().c()), false, false);
        } else {
            a4.d("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        if (fpcnVar2.a().i()) {
            f(a4, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", bykv.e((int) fpcnVar2.a().a()), true, false);
        } else {
            a4.d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        if (fpcnVar2.a().l()) {
            f(a4, "MDD.WIFI.CHARGING.PERIODIC.TASK", bykv.e((int) fpcnVar2.a().g()), true, true);
        } else {
            a4.d("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
    }

    private static void e(byjl byjlVar, SharedPreferences sharedPreferences, String str, long j, int i) {
        boolean z;
        if (j <= 0) {
            int i2 = dqjp.a;
            byjlVar.d(str, "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            return;
        }
        if (sharedPreferences.getLong(str, 0L) != j) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str, j);
            edit.apply();
            z = true;
        } else {
            z = false;
        }
        if (fpbw.a.a().B() && !z && b) {
            return;
        }
        bykm bykmVar = new bykm();
        bykmVar.t(str);
        bykmVar.e(j, (long) (j * 0.1d), bylf.a);
        bykmVar.y(i, i);
        bykmVar.x(1, 1);
        bykmVar.i(true);
        bykmVar.u(z);
        bykmVar.p = true;
        bykmVar.j = "com.google.android.gms.mdi.download.service.MddGcmTaskService";
        byjlVar.f(bykmVar.b());
    }

    private static void f(byjl byjlVar, String str, bykv bykvVar, boolean z, boolean z2) {
        byko bykoVar = new byko();
        bykoVar.j = "com.google.android.gms.mdi.download.service.MddGcmTaskService";
        bykoVar.t(str);
        bykoVar.l(z);
        bykoVar.a = bykvVar;
        bykoVar.e();
        bykoVar.j();
        bykoVar.v(2);
        if (z && z2) {
            bykoVar.k();
        }
        byjlVar.f(bykoVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c;
        Context context;
        ArrayList arrayList;
        int i = dqjp.a;
        String str = bylnVar.a;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2105562759:
                if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1202768674:
                if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -69128772:
                if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 437964371:
                if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            Context a2 = AppContextProvider.a();
            aqxd aqxdVar = cchm.a;
            aqxo aqxoVar = new aqxo(a2, (int[][][]) null);
            ArrayList arrayList2 = new ArrayList();
            switch (str.hashCode()) {
                case -2105562759:
                    if (str.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1202768674:
                    if (str.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -69128772:
                    if (str.equals("MDD.CHARGING.PERIODIC.TASK")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 437964371:
                    if (str.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        if (c2 == 3 && fpbw.f()) {
                            arrayList2.add(aqxoVar.ah());
                            arrayList2.add(aqxoVar.aj(true));
                        }
                    } else if (fpbw.f()) {
                        arrayList2.add(aqxoVar.ah());
                        arrayList2.add(aqxoVar.aj(false));
                    }
                } else if (fpbw.f()) {
                    dqmv dqmvVar = new dqmv(a2);
                    arrayList = arrayList2;
                    int a3 = ccjb.a(a2);
                    dpje dpjeVar = a;
                    context = a2;
                    new dqkc(context, dqmvVar, a3, new dqjn(dpjeVar, eiiv.b), dpjeVar, eigb.a);
                    cciw.a(context);
                    arrayList.add(aqxoVar.al());
                }
                context = a2;
                arrayList = arrayList2;
            } else {
                context = a2;
                arrayList = arrayList2;
                if (fpbw.f()) {
                    arrayList.add(aqxoVar.ak());
                } else if (fpbw.d()) {
                    arrayList.add(aqxoVar.ai());
                }
            }
            try {
                dfbl.n(dfbl.e(arrayList));
            } catch (InterruptedException | ExecutionException e) {
                dqjp.f(e, "Exception while waiting for mdd tasks to complete");
                dqmv dqmvVar2 = new dqmv(context);
                int a4 = ccjb.a(context);
                dpje dpjeVar2 = a;
                new dqkc(context, dqmvVar2, a4, new dqjn(dpjeVar2, eiiv.b), dpjeVar2, eigb.a).l(1044);
            }
        } else {
            dqjp.d("%s: MddGcmTaskChimeraService gets unexpected gcm task %s -- Ignored", "MddGcmTaskChimeraService", bylnVar.a);
        }
        return 0;
    }
}
