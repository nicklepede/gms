package com.google.android.gms.checkin.internal;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.aptj;
import defpackage.apuv;
import defpackage.auad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class NetworkCallbackIntentOperation extends IntentOperation {
    private static final auad a = apuv.a("NetworkCallbackIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.h("onHandleIntent, %s", intent);
        Bundle bundle = new Bundle();
        bundle.putInt("CheckinService_onStart_checkinReason", 21);
        bundle.putBoolean("CheckinService_forceCheckin", true);
        bundle.putString("checkin_source_package", "com.google.android.gms");
        bundle.putString("checkin_source_class", getClass().getCanonicalName());
        bundle.putBoolean("checkin_source_force", true);
        try {
            new aptj(this, bundle).a();
        } finally {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
