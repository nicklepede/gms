package com.google.android.gms.auth.aang.impl.accountstate;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.ekgh;
import defpackage.fecj;
import defpackage.uuw;
import defpackage.vba;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialStateSyncChimeraService extends Service {
    private static final Object a = new Object();
    private static uuw b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        fecj v = ekgh.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekgh ekghVar = (ekgh) v.b;
        ekghVar.c = 8;
        ekghVar.b |= 1;
        vba.p((ekgh) v.Q());
        return b.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new uuw(getApplicationContext());
            }
        }
    }
}
