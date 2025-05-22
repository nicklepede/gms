package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aewb;
import defpackage.afas;
import defpackage.auad;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneHubSetupTimeoutGmsTaskBoundService extends GmsTaskBoundService {
    private static final auad a = new auad("ProximityAuth", "PhoneHubSetupGmsTaskBoundService");

    public static Bundle d(String str, afas afasVar) {
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", str);
        bundle.putInt("cameraRollSetupResult", afasVar.a());
        return bundle;
    }

    public static void e(Context context) {
        if (fnuf.w()) {
            casd.a(context).d("PhoneHubSetupResultUpdate", PhoneHubSetupTimeoutGmsTaskBoundService.class.getName());
        }
    }

    public static void f(Context context, Bundle bundle) {
        if (fnuf.w()) {
            casd a2 = casd.a(context);
            catb catbVar = new catb();
            catbVar.w(PhoneHubSetupTimeoutGmsTaskBoundService.class.getName());
            catbVar.t("PhoneHubSetupResultUpdate");
            catbVar.e(fnuf.d(), fnuf.d() + fnuf.a.lK().o());
            catbVar.v(0);
            catbVar.x(0, 0);
            catbVar.g(2);
            catbVar.u = bundle;
            a2.f(catbVar.b());
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fnuf.C() || !fnuf.w()) {
            a.m("Trying to run task when flag is disabled!", new Object[0]);
            return 2;
        }
        Bundle bundle = caufVar.b;
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
        aewb.b().e(i, afas.RESULT_ERROR_ACTION_TIMEOUT.a(), string, true);
        return 0;
    }
}
