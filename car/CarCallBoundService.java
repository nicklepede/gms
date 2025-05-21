package com.google.android.gms.car;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.akpq;
import defpackage.akyb;
import defpackage.albn;
import defpackage.alhw;
import defpackage.alja;
import defpackage.alnt;
import defpackage.asqh;
import defpackage.bxhl;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarCallBoundService extends akyb {
    private akpq a;
    private alja b;
    private bxhl c;

    static {
        albn.a("CAR.CALL.CLIENT");
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        if (asqh.g()) {
            return null;
        }
        return this.c;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new akpq(this);
            int i = bxhl.b;
            this.c = alhw.a(this, this.a, ejck.a, alnt.a);
            return;
        }
        alja aljaVar = new alja(this);
        this.b = aljaVar;
        aljaVar.f();
        int i2 = bxhl.b;
        this.c = alhw.a(this, this.b, ejck.a, alnt.a);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        akpq akpqVar = this.a;
        if (akpqVar != null) {
            akpqVar.y();
            this.a = null;
        } else {
            alja aljaVar = this.b;
            if (aljaVar != null) {
                aljaVar.y();
                this.b = null;
            }
        }
        this.c = null;
    }
}
