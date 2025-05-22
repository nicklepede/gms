package com.google.android.gms.adid.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.epir;
import defpackage.epiv;
import defpackage.epnn;
import defpackage.epno;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.uwz;
import defpackage.uxa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdIdProviderChimeraService extends Service {
    uxa a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        try {
            return this.a.onBind(intent);
        } catch (RuntimeException e) {
            long currentTimeMillis = System.currentTimeMillis();
            epnn epnnVar = (epnn) epno.a.v();
            fgrc v = epiv.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            epiv epivVar = (epiv) fgriVar;
            epivVar.b |= 1;
            epivVar.e = currentTimeMillis;
            if (!fgriVar.L()) {
                v.U();
            }
            epiv epivVar2 = (epiv) v.b;
            epivVar2.g = 2;
            epivVar2.b |= 4;
            fgrc v2 = epir.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            epir epirVar = (epir) fgriVar2;
            epirVar.f = 1;
            epirVar.b |= 8;
            if (!fgriVar2.L()) {
                v2.U();
            }
            epir epirVar2 = (epir) v2.b;
            epirVar2.c = 3;
            epirVar2.b |= 1;
            epir epirVar3 = (epir) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            epiv epivVar3 = (epiv) v.b;
            epirVar3.getClass();
            epivVar3.d = epirVar3;
            epivVar3.c = 4;
            epnnVar.s(v);
            uwz.a((epno) epnnVar.Q());
            throw e;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new uxa();
    }
}
