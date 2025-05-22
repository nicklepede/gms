package com.google.android.gms.wearable.init;

import android.content.Intent;
import android.util.Log;
import defpackage.apzs;
import defpackage.dooo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WearableInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    public final void b(Intent intent, int i) {
        if (Log.isLoggable("WearableInitOperation", 3)) {
            Log.d("WearableInitOperation", "onInitRuntimeState");
        }
        if ((i & 14) != 0) {
            dooo.f();
            if (!dooo.e(this)) {
                Log.i("Wear_Controller", "onStartup - Wear is not available on this device.");
                return;
            }
            Log.i("Wear_Controller", "Starting control service to bring up the Wear module.");
            dooo.c(this);
            Intent intent2 = new Intent("com.google.android.gms.wearable.ACTION_STARTUP");
            intent2.setClassName(this, "com.google.android.gms.wearable.service.WearableControlService");
            startService(intent2);
        }
    }
}
