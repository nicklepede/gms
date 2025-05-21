package com.google.android.gms.people.sync.focus;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cuuf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsSyncAdapterChimeraService extends Service {
    private static final Object a = new Object();
    private static cuuf b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new cuuf(getApplicationContext());
            }
        }
    }
}
