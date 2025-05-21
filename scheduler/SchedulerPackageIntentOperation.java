package com.google.android.gms.scheduler;

import android.content.Intent;
import android.net.Uri;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.arwm;
import defpackage.cxzz;
import defpackage.cycd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerPackageIntentOperation extends IntentOperation {
    public static cycd a(Intent intent, int i) {
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return null;
        }
        return new cycd(schemeSpecificPart, i);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        cxzz.e(this);
        if (cxzz.b() == 0) {
            SchedulerProxyIntentOperation.a(intent, 0);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gms.gcm.nts.USER_FORWARD");
        intent2.setPackage(getPackageName());
        intent2.putExtra("intent", intent);
        intent2.putExtra("userSerial", cxzz.b());
        if (!cxzz.f()) {
            sendBroadcast(intent2);
            return;
        }
        Object d = cxzz.d(0);
        arwm.s(d);
        sendBroadcastAsUser(intent2, (UserHandle) d);
    }
}
