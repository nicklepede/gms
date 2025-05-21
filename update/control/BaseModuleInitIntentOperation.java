package com.google.android.gms.update.control;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BaseModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        int i2 = ReceiverIntentOperation.b;
        startService(IntentOperation.getStartIntent(this, ReceiverIntentOperation.class, "com.google.android.gms.update.BASE_MODULE_INIT"));
    }
}
