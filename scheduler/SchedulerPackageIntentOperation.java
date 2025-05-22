package com.google.android.gms.scheduler;

import android.content.Intent;
import android.net.Uri;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.atzb;
import defpackage.dajw;
import defpackage.damb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SchedulerPackageIntentOperation extends IntentOperation {
    public static damb a(Intent intent, int i) {
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return null;
        }
        return new damb(schemeSpecificPart, i);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        dajw.e(this);
        if (dajw.b() == 0) {
            SchedulerProxyIntentOperation.a(intent, 0);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gms.gcm.nts.USER_FORWARD");
        intent2.setPackage(getPackageName());
        intent2.putExtra("intent", intent);
        intent2.putExtra("userSerial", dajw.b());
        if (!dajw.f()) {
            sendBroadcast(intent2);
            return;
        }
        Object d = dajw.d(0);
        atzb.s(d);
        sendBroadcastAsUser(intent2, (UserHandle) d);
    }
}
