package com.google.android.gms.gass;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.chimera.modules.gass.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bjwy;
import defpackage.bjxj;
import defpackage.bjxo;
import defpackage.bjyx;
import defpackage.bjzg;
import defpackage.cauf;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fqzc;
import defpackage.fqzo;
import defpackage.qmm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SchedulePeriodicTasksServiceImpl extends GmsTaskChimeraService {
    private static bjwy a;

    static {
        ausn.b("SchedPeriodicTask", auid.GASS);
        a = null;
    }

    public static void d(Context context) {
        bjwy bjwyVar;
        if (fqzc.e() && a == null) {
            a = bjwy.a(context);
        }
        if (fqzc.e() && (bjwyVar = a) != null) {
            bjwyVar.b(13009);
        }
        fgrc v = bjyx.a.v();
        String f = b.c(AppContextProvider.a()).f(Binder.getCallingUid());
        if (TextUtils.isEmpty(f)) {
            fgpr w = fgpr.w(new byte[16]);
            if (!v.b.L()) {
                v.U();
            }
            bjyx bjyxVar = (bjyx) v.b;
            bjyxVar.b |= 1;
            bjyxVar.c = w;
        } else {
            fgpr w2 = fgpr.w(f.getBytes());
            if (!v.b.L()) {
                v.U();
            }
            bjyx bjyxVar2 = (bjyx) v.b;
            bjyxVar2.b |= 1;
            bjyxVar2.c = w2;
        }
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        bjyx bjyxVar3 = (bjyx) fgriVar;
        bjyxVar3.b |= 2;
        bjyxVar3.d = 251864004;
        if (!fgriVar.L()) {
            v.U();
        }
        bjyx bjyxVar4 = (bjyx) v.b;
        bjyxVar4.b |= 4;
        bjyxVar4.e = 1;
        long longValue = bjxj.c().longValue();
        if (!v.b.L()) {
            v.U();
        }
        bjyx bjyxVar5 = (bjyx) v.b;
        bjyxVar5.b |= 8;
        bjyxVar5.f = longValue;
        bjxj.d(context, bjxj.e(3, ((bjyx) v.Q()).r()));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if ("GASS_PERIODIC_TASKS_AD_ATTESTATION_SIGNAL".equals(str)) {
            d(this);
            return 0;
        }
        if ("GPTGLS".equals(str)) {
            if (!fqzo.f()) {
                return 2;
            }
            bjxj.d(this, bjxj.e(4, null));
            return 0;
        }
        if (!str.startsWith("GPDT")) {
            return 2;
        }
        bjzg e = bjxj.e(5, null);
        qmm b = qmm.b(caufVar.b.getInt("PDTAKey", -1));
        if (b != null) {
            return bjxo.b(this, b).a(this, e);
        }
        return 2;
    }
}
