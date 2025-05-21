package com.google.android.gms.mdm.services;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.ccuc;
import defpackage.cczv;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OneTimeInitializerIntentOperation extends IntentOperation {
    private static final String a = "OneTimeInitializerIntentOperation";
    private static final asot b = asot.b(a, asej.SECURITY);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.onetimeinitializer.ONE_TIME_INITIALIZED".equals(intent.getAction())) {
            if (asng.a(this, "com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver") == 2) {
                return;
            }
            try {
                try {
                    if (((Integer) ccuc.l.c()).intValue() == 0 && intent.getIntExtra("run_count", 0) == 0) {
                        ccuc.l.d(1);
                        cczv.c(this, true);
                    }
                } catch (RuntimeException e) {
                    ((ejhf) ((ejhf) b.i()).s(e)).x("One time init failed.");
                }
            } finally {
                asng.M("com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver", 2);
            }
        }
    }
}
