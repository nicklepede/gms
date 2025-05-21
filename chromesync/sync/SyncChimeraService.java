package com.google.android.gms.chromesync.sync;

import android.content.Intent;
import android.os.IBinder;
import defpackage.appd;
import defpackage.apph;
import defpackage.appi;
import defpackage.fuuq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SyncChimeraService extends appd {
    private static final Object b = new Object();
    private static apph c;
    public fuuq a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return c.getSyncAdapterBinder();
    }

    @Override // defpackage.appd, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        synchronized (b) {
            if (c == null) {
                c = ((appi) this.a).a();
            }
        }
    }
}
