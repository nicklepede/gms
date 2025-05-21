package com.google.android.gms.findmydevice.spot.localstorage;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.behu;
import defpackage.bfdr;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DebugStateInternalChimeraService extends BoundService {
    public static final asot a = asot.b("DebugStateIntSrv", asej.FIND_MY_DEVICE_SPOT);

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        if (bfdr.b()) {
            return new behu(null);
        }
        ((ejhf) ((ejhf) a.j()).ah((char) 4199)).x("No Finder use case is enabled.");
        return null;
    }
}
