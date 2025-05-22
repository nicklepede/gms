package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import defpackage.amvg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class InCallServiceVOIPImpl extends InCallServiceImpl {
    @Override // com.google.android.gms.car.InCallServiceImpl, com.google.android.chimera.InCallService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return "local_action".equals(intent.getAction()) ? new amvg(this) : super.onBind(intent);
    }
}
