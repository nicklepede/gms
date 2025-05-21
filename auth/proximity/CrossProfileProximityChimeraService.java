package com.google.android.gms.auth.proximity;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.acec;
import defpackage.rkk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CrossProfileProximityChimeraService extends BoundService {
    private final rkk a = new acec(this);

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final /* synthetic */ IBinder onBind(Intent intent) {
        return this.a;
    }
}
