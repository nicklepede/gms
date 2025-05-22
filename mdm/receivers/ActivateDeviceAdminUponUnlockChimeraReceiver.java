package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cfiv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ActivateDeviceAdminUponUnlockChimeraReceiver extends IntentOperation {
    private static boolean a;

    public static synchronized void a(boolean z) {
        synchronized (ActivateDeviceAdminUponUnlockChimeraReceiver.class) {
            a = z;
        }
    }

    public static synchronized boolean b() {
        boolean z;
        synchronized (ActivateDeviceAdminUponUnlockChimeraReceiver.class) {
            z = a;
        }
        return z;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (b() && "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            if (!cfiv.k(this)) {
                Intent intent2 = new Intent("com.google.android.gms.settings.SECURITY_SETTINGS");
                intent2.setPackage(getPackageName());
                intent2.putExtra("show_modal_request", true);
                intent2.addFlags(276824064);
                startActivity(intent2);
            }
            a(false);
        }
    }
}
