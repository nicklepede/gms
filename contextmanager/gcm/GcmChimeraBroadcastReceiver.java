package com.google.android.gms.contextmanager.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.atqi;
import defpackage.qja;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        new atqi(context, intent).k(new qja("GcmBroadcastHandler", "com.google.android.gms", null));
    }
}
