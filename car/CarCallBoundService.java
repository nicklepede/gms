package com.google.android.gms.car;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.amrb;
import defpackage.amzm;
import defpackage.ancy;
import defpackage.anjh;
import defpackage.ankl;
import defpackage.anpe;
import defpackage.auub;
import defpackage.bzqb;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarCallBoundService extends amzm {
    private amrb a;
    private ankl b;
    private bzqb c;

    static {
        ancy.a("CAR.CALL.CLIENT");
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        if (auub.g()) {
            return null;
        }
        return this.c;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new amrb(this);
            int i = bzqb.b;
            this.c = anjh.a(this, this.a, elpp.a, anpe.a);
            return;
        }
        ankl anklVar = new ankl(this);
        this.b = anklVar;
        anklVar.f();
        int i2 = bzqb.b;
        this.c = anjh.a(this, this.b, elpp.a, anpe.a);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        amrb amrbVar = this.a;
        if (amrbVar != null) {
            amrbVar.y();
            this.a = null;
        } else {
            ankl anklVar = this.b;
            if (anklVar != null) {
                anklVar.y();
                this.b = null;
            }
        }
        this.c = null;
    }
}
