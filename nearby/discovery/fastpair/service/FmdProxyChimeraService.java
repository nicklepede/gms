package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.asxe;
import defpackage.chkb;
import defpackage.ciqy;
import defpackage.dpsk;
import defpackage.ekvl;
import defpackage.ekvm;
import defpackage.ezqm;
import defpackage.fiyl;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FmdProxyChimeraService extends BoundService {
    private asxe a;
    private dpsk b;

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        chkb chkbVar = ciqy.a;
        chkbVar.d().B("FastPair: FmdProxy service bound to intent %s", intent);
        if (!"com.google.android.gms.nearby.discovery.fastpair.ACTION_BIND_FMD_PROXY".equals(intent.getAction())) {
            return null;
        }
        if (this.a == null) {
            this.a = asxe.d(this);
        }
        final asxe asxeVar = this.a;
        ekvl.y(asxeVar);
        Objects.requireNonNull(asxeVar);
        if (ezqm.c(this, new ekvm() { // from class: cjzf
            @Override // defpackage.ekvm
            public final boolean a(Object obj) {
                return asxe.this.h((String) obj);
            }
        }).equals(fiyl.ENTRY_POINT_UNKNOWN)) {
            chkbVar.g().z("FastPair: no allowed access from uid:%d", Binder.getCallingUid());
            return null;
        }
        if (this.b == null) {
            this.b = new dpsk(this);
        }
        return this.b;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        ciqy.a.d().B("FastPair: FmdProxy service unbind to intent %s", intent);
        return false;
    }
}
