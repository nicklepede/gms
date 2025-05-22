package com.google.android.gms.auth;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.auad;
import defpackage.red;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChimeraGetToken extends Service {
    public static final auad a = new auad("Auth", "GetToken");
    private red b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        red redVar = this.b;
        redVar.asBinder();
        return redVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = new red(this);
    }
}
