package com.google.android.gms.carsetup;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.amte;
import defpackage.amvs;
import defpackage.ansm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarDataChimeraService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        ansm ansmVar = new ansm(getApplicationContext());
        return ansmVar.getInterfaceDescriptor() == null ? ansmVar : new amvs(ansmVar);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        amte.a(this);
    }
}
