package com.google.android.gms.googlehelp.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkzz;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.frdz;
import defpackage.frli;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InvalidateGcmTokenGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final ausn a = ausn.b("gH_GcmHeartbeatsService", auid.GOOGLE_HELP);

    public static void d(Context context) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
        if (bkzz.a(frli.d())) {
            intent.setPackage("com.google.android.gms");
        }
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (!TextUtils.equals(str, "HEARTBEAT")) {
            ((eluo) a.j()).B("Unrecognized task tag: %s", str);
            return 0;
        }
        d(this);
        int i = caufVar.b.getInt("REMAINING");
        if (i > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt("REMAINING", i - 1);
            catb catbVar = new catb();
            catbVar.j = "com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService";
            catbVar.t("HEARTBEAT");
            frdz frdzVar = frdz.a;
            catbVar.e(frdzVar.lK().q(), frdzVar.lK().p());
            catbVar.u = bundle;
            catbVar.v(1);
            catbVar.p = true;
            casd.a(this).f(catbVar.b());
        }
        return 0;
    }
}
