package com.google.android.gms.credential.manager.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.avno;
import defpackage.axae;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SafetyCenterIntentOperation extends IntentOperation {
    public SafetyCenterIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        new axae(this);
        int i = avno.a;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafetyCenterIntentOperation(Context context) {
        this();
        fvbo.f(context, "context");
        attachBaseContext(context);
    }
}
