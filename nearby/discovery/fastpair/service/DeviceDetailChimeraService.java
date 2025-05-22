package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.chkb;
import defpackage.ciqy;
import defpackage.dpra;
import defpackage.ftey;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DeviceDetailChimeraService extends BoundService {
    public static final /* synthetic */ int a = 0;
    private dpra b;

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        chkb chkbVar = ciqy.a;
        chkbVar.d().B("FastPair: Device detail service bound to intent %s", intent);
        if (!ftey.a.lK().ai()) {
            chkbVar.d().x("FastPair: Device detail service not enabled");
            return null;
        }
        if (!"com.google.android.gms.nearby.discovery.fastpair.ACTION_BIND_DEVICE_DETAIL".equals(intent.getAction())) {
            return null;
        }
        if (this.b == null) {
            this.b = new dpra(this);
        }
        return this.b;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        ciqy.a.d().B("FastPair: Device detail service unbind to intent %s", intent);
        return false;
    }
}
