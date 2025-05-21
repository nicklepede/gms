package com.google.android.gms.gass;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.chimera.modules.gass.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bhsj;
import defpackage.bhsu;
import defpackage.bhsz;
import defpackage.bhui;
import defpackage.bhur;
import defpackage.byln;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fogm;
import defpackage.fogy;
import defpackage.otj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SchedulePeriodicTasksServiceImpl extends GmsTaskChimeraService {
    private static bhsj a;

    static {
        asot.b("SchedPeriodicTask", asej.GASS);
        a = null;
    }

    public static void d(Context context) {
        bhsj bhsjVar;
        if (fogm.e() && a == null) {
            a = bhsj.a(context);
        }
        if (fogm.e() && (bhsjVar = a) != null) {
            bhsjVar.b(13009);
        }
        fecj v = bhui.a.v();
        String f = b.c(AppContextProvider.a()).f(Binder.getCallingUid());
        if (TextUtils.isEmpty(f)) {
            feay w = feay.w(new byte[16]);
            if (!v.b.L()) {
                v.U();
            }
            bhui bhuiVar = (bhui) v.b;
            bhuiVar.b |= 1;
            bhuiVar.c = w;
        } else {
            feay w2 = feay.w(f.getBytes());
            if (!v.b.L()) {
                v.U();
            }
            bhui bhuiVar2 = (bhui) v.b;
            bhuiVar2.b |= 1;
            bhuiVar2.c = w2;
        }
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        bhui bhuiVar3 = (bhui) fecpVar;
        bhuiVar3.b |= 2;
        bhuiVar3.d = 251661004;
        if (!fecpVar.L()) {
            v.U();
        }
        bhui bhuiVar4 = (bhui) v.b;
        bhuiVar4.b |= 4;
        bhuiVar4.e = 1;
        long longValue = bhsu.c().longValue();
        if (!v.b.L()) {
            v.U();
        }
        bhui bhuiVar5 = (bhui) v.b;
        bhuiVar5.b |= 8;
        bhuiVar5.f = longValue;
        bhsu.d(context, bhsu.e(3, ((bhui) v.Q()).r()));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if ("GASS_PERIODIC_TASKS_AD_ATTESTATION_SIGNAL".equals(str)) {
            d(this);
            return 0;
        }
        if ("GPTGLS".equals(str)) {
            if (!fogy.f()) {
                return 2;
            }
            bhsu.d(this, bhsu.e(4, null));
            return 0;
        }
        if (!str.startsWith("GPDT")) {
            return 2;
        }
        bhur e = bhsu.e(5, null);
        otj b = otj.b(bylnVar.b.getInt("PDTAKey", -1));
        if (b != null) {
            return bhsz.b(this, b).a(this, e);
        }
        return 2;
    }
}
