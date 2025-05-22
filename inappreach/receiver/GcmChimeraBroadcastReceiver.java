package com.google.android.gms.inappreach.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhcb;
import defpackage.eluo;
import defpackage.fryl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GcmChimeraBroadcastReceiver extends dhcb {
    private static final String b = "com.google.android.gms.inappreach.receiver.GcmChimeraBroadcastReceiver";
    private static final ausn d = ausn.b(GcmChimeraBroadcastReceiver.class.getName(), auid.INAPP_REACH);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (fryl.d()) {
            int i = PushIntentOperation.b;
            Intent startIntent = IntentOperation.getStartIntent(context, PushIntentOperation.class, "com.google.android.gms.inappreach.intents.HANDLE_GCM_PUSH");
            if (startIntent != null) {
                startIntent.putExtras(intent);
            }
            if (startIntent == null) {
                ((eluo) ((eluo) d.j()).ai(5192)).B("Failed creating service intent for '%s'", PushIntentOperation.a);
            } else {
                WakefulBroadcastReceiver.startWakefulService(context, startIntent);
            }
        }
    }
}
