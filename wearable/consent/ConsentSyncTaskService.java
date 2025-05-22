package com.google.android.gms.wearable.consent;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import defpackage.a;
import defpackage.atad;
import defpackage.cauf;
import defpackage.dkbl;
import defpackage.dmpp;
import defpackage.dokx;
import defpackage.doov;
import defpackage.fwci;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConsentSyncTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    public static void d(Context context, dokx dokxVar) {
        atad a2 = dkbl.a(context);
        int i = true != dokxVar.c ? 2 : 1;
        if (Log.isLoggable("wearable.ConsentsSync", 3)) {
            Log.d("wearable.ConsentsSync", a.j(i, "Update optin consent in usage reporting with code: "));
        }
        a2.aM(new UsageReportingOptInOptions(i));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (Log.isLoggable("wearable.ConsentsSync", 3)) {
            Log.d("wearable.ConsentsSync", "onRunTask");
        }
        doov.j(getApplicationContext());
        if (!fwci.e() || !doov.m()) {
            return 0;
        }
        dmpp dmppVar = dmpp.a;
        if (dmppVar == null) {
            Log.e("wearable.ConsentsSync", "onRunTask: ConsentService is null");
            return 2;
        }
        dokx i = dmppVar.i();
        if (i == null) {
            Log.e("wearable.ConsentsSync", "onRunTask: wearableOptinConsent is null");
            return 2;
        }
        d(getApplicationContext(), i);
        return 0;
    }
}
