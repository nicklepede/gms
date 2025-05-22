package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.doxc;
import defpackage.fgrc;
import defpackage.tga;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SynchronizedUpdateBoundService extends BoundService {
    public static byte[] a(int i) {
        fgrc v = doxc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        doxc doxcVar = (doxc) v.b;
        doxcVar.c = i - 1;
        doxcVar.b |= 1;
        return ((doxc) v.Q()).r();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return new tga(this);
    }
}
