package com.google.android.gms.update.control;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BaseModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        int i2 = ReceiverIntentOperation.b;
        startService(IntentOperation.getStartIntent(this, ReceiverIntentOperation.class, "com.google.android.gms.update.BASE_MODULE_INIT"));
    }
}
