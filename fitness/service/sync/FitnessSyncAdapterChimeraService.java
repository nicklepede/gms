package com.google.android.gms.fitness.service.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bikw;
import defpackage.bizg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessSyncAdapterChimeraService extends Service {
    private bizg a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.a.getSyncAdapterBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new bizg(this, bikw.a(this));
    }
}
