package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.cgiv;
import defpackage.dngr;
import defpackage.fqld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DeviceDetailChimeraService extends BoundService {
    public static final /* synthetic */ int a = 0;
    private dngr b;

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        cgiv.a.d().B("FastPair: Device detail service bound to intent %s", intent);
        if (!fqld.a.a().ag()) {
            cgiv.a.d().x("FastPair: Device detail service not enabled");
            return null;
        }
        if (!"com.google.android.gms.nearby.discovery.fastpair.ACTION_BIND_DEVICE_DETAIL".equals(intent.getAction())) {
            return null;
        }
        if (this.b == null) {
            this.b = new dngr(this);
        }
        return this.b;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        cgiv.a.d().B("FastPair: Device detail service unbind to intent %s", intent);
        return false;
    }
}
