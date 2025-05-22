package com.google.android.gms.credential.manager.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.axro;
import defpackage.azee;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SafetyCenterIntentOperation extends IntentOperation {
    public SafetyCenterIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        new azee(this);
        int i = axro.a;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafetyCenterIntentOperation(Context context) {
        this();
        fxxm.f(context, "context");
        attachBaseContext(context);
    }
}
