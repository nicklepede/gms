package com.google.android.gms.fonts.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fonts.update.UpdateSchedulerBase;
import defpackage.bjgg;
import defpackage.bjhc;
import defpackage.bjif;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FontsInitIntentOperation extends IntentOperation {
    protected static void a(Context context) {
        bjif bjifVar = bjif.a;
        bjifVar.g(context);
        if (bjifVar.k) {
            UpdateSchedulerBase.e(bjifVar, context);
        }
        boolean z = bjifVar.n;
        bjgg.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.fonts.init.INIT_ACTION".equals(intent.getAction())) {
            a(getApplicationContext());
        } else {
            bjhc.f("FontsInitOp", "Invalid action: %s", intent.getAction());
        }
    }
}
