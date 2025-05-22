package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.chimera.modules.mdi.download.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.aszs;
import defpackage.atad;
import defpackage.casd;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.catx;
import defpackage.cauf;
import defpackage.ceqg;
import defpackage.cerq;
import defpackage.cerv;
import defpackage.dhmr;
import defpackage.drtn;
import defpackage.drys;
import defpackage.dstv;
import defpackage.dstx;
import defpackage.dsuk;
import defpackage.dsxd;
import defpackage.ektg;
import defpackage.ekwa;
import defpackage.fpuj;
import defpackage.frvd;
import defpackage.frvu;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MddGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final drtn a = new drys();
    private static boolean b = false;

    public static void d() {
        if (!fpuj.a.lK().x()) {
            int i = dstx.a;
            Context a2 = AppContextProvider.a();
            casd a3 = casd.a(a2);
            SharedPreferences sharedPreferences = a2.getSharedPreferences("gms_icing_mdd_gcm_task_periods", 0);
            frvu frvuVar = frvu.a;
            e(a3, sharedPreferences, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", frvuVar.lK().f(), 2);
            if (frvd.f()) {
                e(a3, sharedPreferences, "MDD.CHARGING.PERIODIC.TASK", frvuVar.lK().d(), 2);
                e(a3, sharedPreferences, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", frvuVar.lK().b(), 0);
                e(a3, sharedPreferences, "MDD.WIFI.CHARGING.PERIODIC.TASK", frvuVar.lK().h(), 1);
            } else if (frvd.d()) {
                a3.d("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a3.d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a3.d("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            }
            b = true;
            return;
        }
        int i2 = dstx.a;
        casd a4 = casd.a(AppContextProvider.a());
        frvu frvuVar2 = frvu.a;
        if (frvuVar2.lK().k()) {
            f(a4, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", catn.e((int) frvuVar2.lK().e()), false, false);
        } else {
            a4.d("MDD.MAINTENANCE.PERIODIC.GCM.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        if (!frvd.f()) {
            if (frvd.d()) {
                a4.d("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a4.d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                a4.d("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
                return;
            }
            return;
        }
        if (frvuVar2.lK().j()) {
            f(a4, "MDD.CHARGING.PERIODIC.TASK", catn.e((int) frvuVar2.lK().c()), false, false);
        } else {
            a4.d("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        if (frvuVar2.lK().i()) {
            f(a4, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", catn.e((int) frvuVar2.lK().a()), true, false);
        } else {
            a4.d("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        if (frvuVar2.lK().l()) {
            f(a4, "MDD.WIFI.CHARGING.PERIODIC.TASK", catn.e((int) frvuVar2.lK().g()), true, true);
        } else {
            a4.d("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
    }

    private static void e(casd casdVar, SharedPreferences sharedPreferences, String str, long j, int i) {
        boolean z;
        if (j <= 0) {
            int i2 = dstx.a;
            casdVar.d(str, "com.google.android.gms.mdi.download.service.MddGcmTaskService");
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
        if (frvd.a.lK().B() && !z && b) {
            return;
        }
        cate cateVar = new cate();
        cateVar.t(str);
        cateVar.e(j, (long) (j * 0.1d), catx.a);
        cateVar.y(i, i);
        cateVar.x(1, 1);
        cateVar.i(true);
        cateVar.u(z);
        cateVar.p = true;
        cateVar.j = "com.google.android.gms.mdi.download.service.MddGcmTaskService";
        casdVar.f(cateVar.b());
    }

    private static void f(casd casdVar, String str, catn catnVar, boolean z, boolean z2) {
        catg catgVar = new catg();
        catgVar.j = "com.google.android.gms.mdi.download.service.MddGcmTaskService";
        catgVar.t(str);
        catgVar.l(z);
        catgVar.a = catnVar;
        catgVar.e();
        catgVar.j();
        catgVar.v(2);
        if (z && z2) {
            catgVar.k();
        }
        casdVar.f(catgVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c;
        Context context;
        ArrayList arrayList;
        int i = dstx.a;
        String str = caufVar.a;
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
            aszs aszsVar = ceqg.a;
            atad atadVar = new atad(a2, (int[][][]) null);
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
                        if (c2 == 3 && frvd.f()) {
                            arrayList2.add(atadVar.ag());
                            arrayList2.add(atadVar.ai(true));
                        }
                    } else if (frvd.f()) {
                        arrayList2.add(atadVar.ag());
                        arrayList2.add(atadVar.ai(false));
                    }
                } else if (frvd.f()) {
                    dsxd dsxdVar = new dsxd(a2);
                    arrayList = arrayList2;
                    int a3 = cerv.a(a2);
                    drtn drtnVar = a;
                    context = a2;
                    new dsuk(context, dsxdVar, a3, new dstv(drtnVar, ekwa.b), drtnVar, ektg.a);
                    cerq.a(context);
                    arrayList.add(atadVar.ak());
                }
                context = a2;
                arrayList = arrayList2;
            } else {
                context = a2;
                arrayList = arrayList2;
                if (frvd.f()) {
                    arrayList.add(atadVar.aj());
                } else if (frvd.d()) {
                    arrayList.add(atadVar.ah());
                }
            }
            try {
                dhmr.n(dhmr.e(arrayList));
            } catch (InterruptedException | ExecutionException e) {
                dstx.f(e, "Exception while waiting for mdd tasks to complete");
                dsxd dsxdVar2 = new dsxd(context);
                int a4 = cerv.a(context);
                drtn drtnVar2 = a;
                new dsuk(context, dsxdVar2, a4, new dstv(drtnVar2, ekwa.b), drtnVar2, ektg.a).l(1044);
            }
        } else {
            dstx.d("%s: MddGcmTaskChimeraService gets unexpected gcm task %s -- Ignored", "MddGcmTaskChimeraService", caufVar.a);
        }
        return 0;
    }
}
