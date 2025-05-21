package com.google.android.gms.carsetup;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.akrt;
import defpackage.akuh;
import defpackage.alrb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarDataChimeraService extends BoundService {
    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        alrb alrbVar = new alrb(getApplicationContext());
        return alrbVar.getInterfaceDescriptor() == null ? alrbVar : new akuh(alrbVar);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        akrt.a(this);
    }
}
