package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.bhvo;
import defpackage.bhwz;
import defpackage.deqr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmSenderChimeraProxy extends BroadcastReceiver {
    static deqr b;

    static synchronized void a(Context context) {
        synchronized (GcmSenderChimeraProxy.class) {
            if (b == null) {
                deqr deqrVar = new deqr(context, 1, "GCMSEND", null, "com.google.android.gms");
                b = deqrVar;
                deqrVar.j(false);
            }
            b.c(500L);
        }
    }

    public static void b() {
        deqr deqrVar = b;
        if (deqrVar != null) {
            deqrVar.g();
        }
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bhvo.i(context);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("GOOG.") || str.startsWith("GOOGLE.")) {
                    intent.removeExtra(str);
                }
            }
        }
        if (bhvo.d() != 0) {
            intent.putExtra("GOOGLE.UAID", bhwz.b().f().c());
        }
        GcmProxyIntentOperation.a(context, intent);
    }
}
