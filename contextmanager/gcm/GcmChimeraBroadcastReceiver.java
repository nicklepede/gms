package com.google.android.gms.contextmanager.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.avul;
import defpackage.sce;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        new avul(context, intent).k(new sce("GcmBroadcastHandler", "com.google.android.gms", null));
    }
}
