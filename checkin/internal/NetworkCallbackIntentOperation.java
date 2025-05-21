package com.google.android.gms.checkin.internal;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.anrr;
import defpackage.antd;
import defpackage.arxo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class NetworkCallbackIntentOperation extends IntentOperation {
    private static final arxo a = antd.a("NetworkCallbackIntentOperation");

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
            new anrr(this, bundle).a();
        } finally {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }
}
