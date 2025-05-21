package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.aqup;
import defpackage.cgiv;
import defpackage.dnib;
import defpackage.eiig;
import defpackage.eiih;
import defpackage.excd;
import defpackage.fgjn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FmdProxyChimeraService extends BoundService {
    private aqup a;
    private dnib b;

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        cgiv.a.d().B("FastPair: FmdProxy service bound to intent %s", intent);
        if (!"com.google.android.gms.nearby.discovery.fastpair.ACTION_BIND_FMD_PROXY".equals(intent.getAction())) {
            return null;
        }
        if (this.a == null) {
            this.a = aqup.d(this);
        }
        final aqup aqupVar = this.a;
        eiig.x(aqupVar);
        Objects.requireNonNull(aqupVar);
        if (excd.c(this, new eiih() { // from class: chre
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                return aqup.this.h((String) obj);
            }
        }).equals(fgjn.ENTRY_POINT_UNKNOWN)) {
            cgiv.a.g().z("FastPair: no allowed access from uid:%d", Binder.getCallingUid());
            return null;
        }
        if (this.b == null) {
            this.b = new dnib(this);
        }
        return this.b;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        cgiv.a.d().B("FastPair: FmdProxy service unbind to intent %s", intent);
        return false;
    }
}
