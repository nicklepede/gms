package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.bkad;
import defpackage.bkbo;
import defpackage.dhbu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmSenderChimeraProxy extends BroadcastReceiver {
    static dhbu b;

    static synchronized void a(Context context) {
        synchronized (GcmSenderChimeraProxy.class) {
            if (b == null) {
                dhbu dhbuVar = new dhbu(context, 1, "GCMSEND", null, "com.google.android.gms");
                b = dhbuVar;
                dhbuVar.j(false);
            }
            b.c(500L);
        }
    }

    public static void b() {
        dhbu dhbuVar = b;
        if (dhbuVar != null) {
            dhbuVar.g();
        }
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bkad.i(context);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("GOOG.") || str.startsWith("GOOGLE.")) {
                    intent.removeExtra(str);
                }
            }
        }
        if (bkad.d() != 0) {
            intent.putExtra("GOOGLE.UAID", bkbo.b().f().c());
        }
        GcmProxyIntentOperation.a(context, intent);
    }
}
