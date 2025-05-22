package com.google.android.gms.mdm.services;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.cfcw;
import defpackage.cfiv;
import defpackage.eluo;
import defpackage.thh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class OneTimeInitializerIntentOperation extends IntentOperation {
    private static final String a = "OneTimeInitializerIntentOperation";
    private static final ausn b = ausn.b(a, auid.SECURITY);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.onetimeinitializer.ONE_TIME_INITIALIZED".equals(intent.getAction())) {
            try {
                if (aura.a(this, "com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver") == 2) {
                    return;
                }
                try {
                    thh thhVar = cfcw.l;
                    if (((Integer) thhVar.c()).intValue() == 0 && intent.getIntExtra("run_count", 0) == 0) {
                        thhVar.d(1);
                        cfiv.c(this, true);
                    }
                } catch (RuntimeException e) {
                    ((eluo) ((eluo) b.i()).s(e)).x("One time init failed.");
                }
            } finally {
                aura.M("com.google.android.gms.mdm.receivers.OneTimeInitializerReceiver", 2);
            }
        }
    }
}
