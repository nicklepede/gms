package com.google.android.gms.googlehelp.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bivk;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.folg;
import defpackage.fosp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InvalidateGcmTokenGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final asot a = asot.b("gH_GcmHeartbeatsService", asej.GOOGLE_HELP);

    public static void d(Context context) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
        if (bivk.a(fosp.d())) {
            intent.setPackage("com.google.android.gms");
        }
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (!TextUtils.equals(str, "HEARTBEAT")) {
            ((ejhf) a.j()).B("Unrecognized task tag: %s", str);
            return 0;
        }
        d(this);
        int i = bylnVar.b.getInt("REMAINING");
        if (i > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt("REMAINING", i - 1);
            bykj bykjVar = new bykj();
            bykjVar.j = "com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService";
            bykjVar.t("HEARTBEAT");
            bykjVar.e(folg.a.a().q(), folg.a.a().p());
            bykjVar.u = bundle;
            bykjVar.v(1);
            bykjVar.p = true;
            byjl.a(this).f(bykjVar.b());
        }
        return 0;
    }
}
