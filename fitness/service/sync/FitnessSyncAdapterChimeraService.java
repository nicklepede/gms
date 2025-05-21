package com.google.android.gms.fitness.service.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bggg;
import defpackage.bguq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessSyncAdapterChimeraService extends Service {
    private bguq a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.a.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new bguq(this, bggg.a(this));
    }
}
