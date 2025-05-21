package com.google.android.gms.appset.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.eiho;
import defpackage.emvf;
import defpackage.emvt;
import defpackage.emzw;
import defpackage.emzx;
import defpackage.enps;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.uii;
import defpackage.uiv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppSetIdProviderChimeraService extends Service {
    public static final String a = "AppSetIdProviderChimeraService";
    uiv b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        try {
            return this.b.onBind(intent);
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
            fecj v2 = emvt.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            emvt emvtVar = (emvt) v2.b;
            emvtVar.c = 3;
            emvtVar.b |= 1;
            emvt emvtVar2 = (emvt) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            emvf emvfVar3 = (emvf) v.b;
            emvtVar2.getClass();
            emvfVar3.d = emvtVar2;
            emvfVar3.c = 5;
            emzwVar.s(v);
            uii.b((emzx) emzwVar.Q());
            throw e;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = new uiv();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        try {
            uiv uivVar = this.b;
            if (uivVar.a) {
                enps.f(uivVar.b, new eiho() { // from class: uit
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        int i = uiv.d;
                        ((uhr) ((uhx) obj)).c();
                        return null;
                    }
                }, uivVar.c);
            }
            super.onDestroy();
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
            fecj v2 = emvt.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            emvt emvtVar = (emvt) v2.b;
            emvtVar.c = 6;
            emvtVar.b |= 1;
            emvt emvtVar2 = (emvt) v2.Q();
            if (!v.b.L()) {
                v.U();
            }
            emvf emvfVar3 = (emvf) v.b;
            emvtVar2.getClass();
            emvfVar3.d = emvtVar2;
            emvfVar3.c = 5;
            emzwVar.s(v);
            uii.b((emzx) emzwVar.Q());
            throw e;
        }
    }
}
