package com.google.android.gms.auth;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.arxo;
import defpackage.pkz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChimeraGetToken extends Service {
    public static final arxo a = new arxo("Auth", "GetToken");
    private pkz b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        pkz pkzVar = this.b;
        pkzVar.asBinder();
        return pkzVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.b = new pkz(this);
    }
}
