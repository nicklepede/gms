package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acwb;
import defpackage.adas;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneHubSetupTimeoutGmsTaskBoundService extends GmsTaskBoundService {
    private static final arxo a = new arxo("ProximityAuth", "PhoneHubSetupGmsTaskBoundService");

    public static Bundle d(String str, adas adasVar) {
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", str);
        bundle.putInt("cameraRollSetupResult", adasVar.a());
        return bundle;
    }

    public static void e(Context context) {
        if (flcw.w()) {
            byjl.a(context).d("PhoneHubSetupResultUpdate", PhoneHubSetupTimeoutGmsTaskBoundService.class.getName());
        }
    }

    public static void f(Context context, Bundle bundle) {
        if (flcw.w()) {
            byjl a2 = byjl.a(context);
            bykj bykjVar = new bykj();
            bykjVar.w(PhoneHubSetupTimeoutGmsTaskBoundService.class.getName());
            bykjVar.t("PhoneHubSetupResultUpdate");
            bykjVar.e(flcw.d(), flcw.d() + flcw.a.a().o());
            bykjVar.v(0);
            bykjVar.x(0, 0);
            bykjVar.g(2);
            bykjVar.u = bundle;
            a2.f(bykjVar.b());
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!flcw.C() || !flcw.w()) {
            a.m("Trying to run task when flag is disabled!", new Object[0]);
            return 2;
        }
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            a.m("No extra parameters found for PhoneHubSetupTimeoutGmsTaskBoundService, no task run", new Object[0]);
            return 2;
        }
        String string = bundle.getString("deviceId");
        int i = bundle.getInt("cameraRollSetupResult");
        if (string == null) {
            a.m("No deviceId found for PhoneHubSetupTimeoutGmsTaskBoundService, no task run", new Object[0]);
            return 2;
        }
        acwb.b().e(i, adas.RESULT_ERROR_ACTION_TIMEOUT.a(), string, true);
        return 0;
    }
}
