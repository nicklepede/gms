package com.google.android.gms.people.sync.focus;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cxdm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsSyncAdapterChimeraService extends Service {
    private static final Object a = new Object();
    private static cxdm b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new cxdm(getApplicationContext());
            }
        }
    }
}
