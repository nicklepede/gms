package com.google.android.gms.reminders.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cxgs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RemindersSyncChimeraService extends Service {
    private static final Object a = new Object();
    private static cxgs b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new cxgs(getApplicationContext());
            }
        }
    }
}
