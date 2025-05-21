package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.dmlo;
import defpackage.fecj;
import defpackage.rmw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SynchronizedUpdateBoundService extends BoundService {
    public static byte[] a(int i) {
        fecj v = dmlo.a.v();
        if (!v.b.L()) {
            v.U();
        }
        dmlo dmloVar = (dmlo) v.b;
        dmloVar.c = i - 1;
        dmloVar.b |= 1;
        return ((dmlo) v.Q()).r();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return new rmw(this);
    }
}
