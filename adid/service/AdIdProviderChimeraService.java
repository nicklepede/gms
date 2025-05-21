package com.google.android.gms.adid.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.emvb;
import defpackage.emvf;
import defpackage.emzw;
import defpackage.emzx;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.taz;
import defpackage.tba;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdIdProviderChimeraService extends Service {
    tba a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        try {
            return this.a.onBind(intent);
        } catch (RuntimeException e) {
            long currentTimeMillis = System.currentTimeMillis();
            emzw emzwVar = (emzw) emzx.a.v();
            fecj v = emvf.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            emvf emvfVar = (emvf) fecpVar;
            emvfVar.b |= 1;
            emvfVar.e = currentTimeMillis;
            if (!fecpVar.L()) {
                v.U();
            }
            emvf emvfVar2 = (emvf) v.b;
            emvfVar2.g = 2;
            emvfVar2.b |= 4;
            fecj v2 = emvb.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            emvb emvbVar = (emvb) fecpVar2;
            emvbVar.f = 1;
            emvbVar.b |= 8;
            if (!fecpVar2.L()) {
                v2.U();
            }
            emvb emvbVar2 = (emvb) v2.b;
            emvbVar2.c = 3;
            emvbVar2.b |= 1;
            emvb emvbVar3 = (emvb) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            emvf emvfVar3 = (emvf) v.b;
            emvbVar3.getClass();
            emvfVar3.d = emvbVar3;
            emvfVar3.c = 4;
            emzwVar.s(v);
            taz.a((emzx) emzwVar.Q());
            throw e;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = new tba();
    }
}
