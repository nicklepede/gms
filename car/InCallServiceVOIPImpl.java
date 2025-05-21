package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import defpackage.aktv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class InCallServiceVOIPImpl extends InCallServiceImpl {
    @Override // com.google.android.gms.car.InCallServiceImpl, com.google.android.chimera.InCallService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return "local_action".equals(intent.getAction()) ? new aktv(this) : super.onBind(intent);
    }
}
