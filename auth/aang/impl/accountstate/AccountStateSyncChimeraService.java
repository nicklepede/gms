package com.google.android.gms.auth.aang.impl.accountstate;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.emtt;
import defpackage.fgrc;
import defpackage.wqu;
import defpackage.wxa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountStateSyncChimeraService extends Service {
    private static final Object a = new Object();
    private static wqu b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        fgrc v = emtt.a.v();
        if (!v.b.L()) {
            v.U();
        }
        emtt emttVar = (emtt) v.b;
        emttVar.c = 7;
        emttVar.b |= 1;
        wxa.p((emtt) v.Q());
        return b.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new wqu(getApplicationContext());
            }
        }
    }
}
