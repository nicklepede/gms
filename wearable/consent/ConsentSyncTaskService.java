package com.google.android.gms.wearable.consent;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import defpackage.a;
import defpackage.aqxo;
import defpackage.byln;
import defpackage.dhqf;
import defpackage.dkdw;
import defpackage.dlzl;
import defpackage.dmdj;
import defpackage.ftgt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConsentSyncTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    public static void d(Context context, dlzl dlzlVar) {
        aqxo a2 = dhqf.a(context);
        int i = true != dlzlVar.c ? 2 : 1;
        if (Log.isLoggable("wearable.ConsentsSync", 3)) {
            Log.d("wearable.ConsentsSync", a.j(i, "Update optin consent in usage reporting with code: "));
        }
        a2.aN(new UsageReportingOptInOptions(i));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (Log.isLoggable("wearable.ConsentsSync", 3)) {
            Log.d("wearable.ConsentsSync", "onRunTask");
        }
        dmdj.j(getApplicationContext());
        if (!ftgt.e() || !dmdj.m()) {
            return 0;
        }
        dkdw dkdwVar = dkdw.a;
        if (dkdwVar == null) {
            Log.e("wearable.ConsentsSync", "onRunTask: ConsentService is null");
            return 2;
        }
        dlzl i = dkdwVar.i();
        if (i == null) {
            Log.e("wearable.ConsentsSync", "onRunTask: wearableOptinConsent is null");
            return 2;
        }
        d(getApplicationContext(), i);
        return 0;
    }
}
