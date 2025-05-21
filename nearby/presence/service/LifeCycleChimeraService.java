package com.google.android.gms.nearby.presence.service;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.asiu;
import defpackage.ckmb;
import defpackage.ckse;
import defpackage.clhw;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LifeCycleChimeraService extends Service {
    public ckse a;
    private final ServiceConnection b = new clhw(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8201)).x("create presence life cycle service");
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8202)).x("presence life cycle service destroy");
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ((ejhf) ckmb.a.f(ckmb.a()).ah(8199)).x("bind presence service");
        if (this.a != null) {
            ((ejhf) ckmb.a.f(ckmb.a()).ah(8200)).x("presence api service already bonded");
        } else {
            asiu.a().d(this, new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.PersistentApiServiceNoInstantApps").setAction("com.google.android.gms.nearby.presence.service.START"), this.b, 1);
        }
        return 1;
    }
}
