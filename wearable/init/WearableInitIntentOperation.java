package com.google.android.gms.wearable.init;

import android.content.Intent;
import android.util.Log;
import defpackage.anya;
import defpackage.dmdc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WearableInitIntentOperation extends anya {
    @Override // defpackage.anya
    public final void b(Intent intent, int i) {
        if (Log.isLoggable("WearableInitOperation", 3)) {
            Log.d("WearableInitOperation", "onInitRuntimeState");
        }
        if ((i & 14) != 0) {
            dmdc.f();
            if (!dmdc.e(this)) {
                Log.i("Wear_Controller", "onStartup - Wear is not available on this device.");
                return;
            }
            Log.i("Wear_Controller", "Starting control service to bring up the Wear module.");
            dmdc.c(this);
            Intent intent2 = new Intent("com.google.android.gms.wearable.ACTION_STARTUP");
            intent2.setClassName(this, "com.google.android.gms.wearable.service.WearableControlService");
            startService(intent2);
        }
    }
}
