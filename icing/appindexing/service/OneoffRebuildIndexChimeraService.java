package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import defpackage.atzb;
import defpackage.auur;
import defpackage.bnmo;
import defpackage.bnqh;
import defpackage.casd;
import defpackage.catb;
import defpackage.catp;
import defpackage.catq;
import defpackage.cauf;
import defpackage.ekvh;
import defpackage.epwo;
import defpackage.frtk;
import defpackage.frun;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OneoffRebuildIndexChimeraService extends RebuildIndexChimeraService {
    static final catq a = catp.a(0, (int) TimeUnit.MINUTES.toSeconds(30), (int) TimeUnit.DAYS.toSeconds(1));
    public static final /* synthetic */ int b = 0;

    public static void e(Context context, String str, epwo epwoVar) {
        long r;
        long p;
        atzb.s(str);
        if (!"com.google.android.gms".equals(str)) {
            Intent a2 = bnqh.a(str);
            if (!bnqh.d(context, a2) && !bnqh.c(context, a2)) {
                bnmo.b("Rebuild index intent missing for package %s.", str);
                return;
            }
        }
        String valueOf = String.valueOf(str.substring(Math.max(0, str.length() - 119)));
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        bundle.putInt("sourceValue", epwoVar.a());
        casd a3 = casd.a(context);
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 0) {
            p = 60;
            r = 30;
        } else {
            frtk frtkVar = frtk.a;
            r = frtkVar.lK().r();
            p = frtkVar.lK().p();
        }
        String concat = "OneoffIndexRebuild-".concat(valueOf);
        catb catbVar = new catb();
        catbVar.e(r, p);
        catbVar.t = a;
        catbVar.u = bundle;
        catbVar.t(concat);
        catbVar.p = true;
        frtk frtkVar2 = frtk.a;
        catbVar.y((int) frtkVar2.lK().q(), 1);
        catbVar.x(frtkVar2.lK().ac() ? 1 : 0, 1);
        catbVar.j = "com.google.android.gms.icing.indexapi.OneoffRebuildIndexService";
        catbVar.v(1);
        if (frun.l()) {
            catbVar.f(0, 1);
        } else {
            catbVar.i(frtk.l());
        }
        a3.f(catbVar.b());
        bnmo.b("Scheduled oneoff index rebuild for %s.", str);
    }

    @Override // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final int d(cauf caufVar, bnqh bnqhVar) {
        Bundle bundle = caufVar.b;
        atzb.s(bundle);
        String string = bundle.getString("packageName");
        int i = bundle.getInt("sourceValue", 0);
        if (string == null || auur.d(string)) {
            bnmo.g("%s: package name is null or empty.", caufVar.a);
            return 2;
        }
        if (bnqhVar.e(string, System.currentTimeMillis(), (epwo) ekvh.c(epwo.b(i), epwo.UNKNOWN), true)) {
            return 0;
        }
        bnmo.b("Failed to send index request to package %s; will reschedule.", string);
        return 1;
    }
}
