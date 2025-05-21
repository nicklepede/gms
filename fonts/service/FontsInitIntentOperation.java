package com.google.android.gms.fonts.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fonts.update.UpdateSchedulerBase;
import defpackage.bhbq;
import defpackage.bhcm;
import defpackage.bhdp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FontsInitIntentOperation extends IntentOperation {
    protected static void a(Context context) {
        bhdp bhdpVar = bhdp.a;
        bhdpVar.g(context);
        if (bhdpVar.k) {
            UpdateSchedulerBase.e(bhdpVar, context);
        }
        boolean z = bhdpVar.n;
        bhbq.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.fonts.init.INIT_ACTION".equals(intent.getAction())) {
            a(getApplicationContext());
        } else {
            bhcm.f("FontsInitOp", "Invalid action: %s", intent.getAction());
        }
    }
}
