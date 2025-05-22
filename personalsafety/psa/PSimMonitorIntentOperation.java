package com.google.android.gms.personalsafety.psa;

import android.app.KeyguardManager;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import defpackage.cxyq;
import defpackage.cxze;
import defpackage.cxzk;
import defpackage.cyah;
import defpackage.cyaw;
import defpackage.eluo;
import defpackage.fpru;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PSimMonitorIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fpru.k() || fpru.l() || intent == null || !Objects.equals(intent.getAction(), "android.telephony.action.SIM_CARD_STATE_CHANGED")) {
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
        if (keyguardManager.isDeviceSecure() && !keyguardManager.isDeviceLocked() && intent.getIntExtra("android.telephony.extra.SIM_STATE", 0) == 1) {
            cyaw.a();
            getString(R.string.physical_sim_lock_screen_message);
            cxyq.a(this);
            ((eluo) ((eluo) cxze.a.h()).ai((char) 8584)).x("PSimMonitorIntentOperation: locked");
            if (fpru.m()) {
                cxzk.a(this, cyah.a(this, 2));
            }
        }
    }
}
