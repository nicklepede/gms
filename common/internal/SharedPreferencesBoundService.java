package com.google.android.gms.common.internal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.arvt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SharedPreferencesBoundService extends BoundService {
    private arvt a;

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        arvt arvtVar = this.a;
        arvtVar.asBinder();
        return arvtVar;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.a = new arvt(getApplicationContext());
    }
}
