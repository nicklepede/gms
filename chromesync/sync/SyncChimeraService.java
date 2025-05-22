package com.google.android.gms.chromesync.sync;

import android.content.Intent;
import android.os.IBinder;
import defpackage.arru;
import defpackage.arry;
import defpackage.arrz;
import defpackage.fxqo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SyncChimeraService extends arru {
    private static final Object b = new Object();
    private static arry c;
    public fxqo a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return c.getSyncAdapterBinder();
    }

    @Override // defpackage.arru, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        synchronized (b) {
            if (c == null) {
                c = ((arrz) this.a).a();
            }
        }
    }
}
