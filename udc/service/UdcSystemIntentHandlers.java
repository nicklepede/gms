package com.google.android.gms.udc.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.aura;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UdcSystemIntentHandlers {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class OnUpgradeOrBootOperation extends apzs {
        private static final String[] a = {"com.google.android.gms.udc.gcm.GcmBroadcastReceiver", "com.google.android.gms.udc.service.UdcContextInitService", "com.google.android.gms.udc.ui.AuthenticatingWebViewActivity", "com.google.android.gms.udc.ui.UdcSettingsListActivity"};

        @Override // defpackage.apzs
        protected final void a(Intent intent, boolean z) {
            String[] strArr = a;
            for (int i = 0; i < 4; i++) {
                aura.H(this, strArr[i], true);
            }
        }

        @Override // defpackage.apzs
        protected final void b(Intent intent, int i) {
            intent.getAction();
            startService(IntentOperation.getStartIntent(this, "com.google.android.gms.udc.intentoperation.BootOrGmsUpdatedPersistentIntentOperation", "com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED"));
        }
    }

    private UdcSystemIntentHandlers() {
    }
}
