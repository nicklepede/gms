package com.google.android.gms.appset.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.ekut;
import defpackage.epiv;
import defpackage.epjj;
import defpackage.epnn;
import defpackage.epno;
import defpackage.eqdl;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.weh;
import defpackage.weu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppSetIdProviderChimeraService extends Service {
    public static final String a = "AppSetIdProviderChimeraService";
    weu b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        try {
            return this.b.onBind(intent);
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
            fgrc v2 = epjj.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            epjj epjjVar = (epjj) v2.b;
            epjjVar.c = 3;
            epjjVar.b |= 1;
            epjj epjjVar2 = (epjj) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            epiv epivVar3 = (epiv) v.b;
            epjjVar2.getClass();
            epivVar3.d = epjjVar2;
            epivVar3.c = 5;
            epnnVar.s(v);
            weh.b((epno) epnnVar.Q());
            throw e;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = new weu();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        try {
            weu weuVar = this.b;
            if (weuVar.a) {
                eqdl.f(weuVar.b, new ekut() { // from class: wes
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        int i = weu.d;
                        ((wdq) ((wdw) obj)).c();
                        return null;
                    }
                }, weuVar.c);
            }
            super.onDestroy();
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
            fgrc v2 = epjj.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            epjj epjjVar = (epjj) v2.b;
            epjjVar.c = 6;
            epjjVar.b |= 1;
            epjj epjjVar2 = (epjj) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            epiv epivVar3 = (epiv) v.b;
            epjjVar2.getClass();
            epivVar3.d = epjjVar2;
            epivVar3.c = 5;
            epnnVar.s(v);
            weh.b((epno) epnnVar.Q());
            throw e;
        }
    }
}
