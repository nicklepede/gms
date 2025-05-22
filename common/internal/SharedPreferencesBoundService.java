package com.google.android.gms.common.internal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.atyi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SharedPreferencesBoundService extends BoundService {
    private atyi a;

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        atyi atyiVar = this.a;
        atyiVar.asBinder();
        return atyiVar;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.a = new atyi(getApplicationContext());
    }
}
