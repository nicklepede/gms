package com.google.android.gms.personalsafety.psa;

import android.app.KeyguardManager;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import defpackage.cvpa;
import defpackage.cvpo;
import defpackage.cvpu;
import defpackage.cvqr;
import defpackage.cvrg;
import defpackage.ejhf;
import defpackage.fmzv;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PSimMonitorIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fmzv.k() || fmzv.l() || intent == null || !Objects.equals(intent.getAction(), "android.telephony.action.SIM_CARD_STATE_CHANGED")) {
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
        if (keyguardManager.isDeviceSecure() && !keyguardManager.isDeviceLocked() && intent.getIntExtra("android.telephony.extra.SIM_STATE", 0) == 1) {
            cvrg.a();
            getString(R.string.physical_sim_lock_screen_message);
            cvpa.a(this);
            ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8587)).x("PSimMonitorIntentOperation: locked");
            if (fmzv.m()) {
                cvpu.a(this, cvqr.a(this, 2));
            }
        }
    }
}
