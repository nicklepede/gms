package com.google.android.gms.nearby.presence.service;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aumo;
import defpackage.ausn;
import defpackage.cmug;
import defpackage.cnaj;
import defpackage.cnqe;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LifeCycleChimeraService extends Service {
    public cnaj a;
    private final ServiceConnection b = new cnqe(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ((eluo) cmug.a.f(cmug.a()).ai(8153)).x("create presence life cycle service");
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ((eluo) cmug.a.f(cmug.a()).ai(8154)).x("presence life cycle service destroy");
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ausn ausnVar = cmug.a;
        ((eluo) ausnVar.f(cmug.a()).ai(8151)).x("bind presence service");
        if (this.a != null) {
            ((eluo) ausnVar.f(cmug.a()).ai(8152)).x("presence api service already bonded");
        } else {
            aumo.a().d(this, new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.PersistentApiServiceNoInstantApps").setAction("com.google.android.gms.nearby.presence.service.START"), this.b, 1);
        }
        return 1;
    }
}
