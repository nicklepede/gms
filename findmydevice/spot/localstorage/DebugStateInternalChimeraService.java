package com.google.android.gms.findmydevice.spot.localstorage;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgjg;
import defpackage.bhfh;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DebugStateInternalChimeraService extends BoundService {
    public static final ausn a = ausn.b("DebugStateIntSrv", auid.FIND_MY_DEVICE_SPOT);

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        if (bhfh.b()) {
            return new bgjg(null);
        }
        ((eluo) ((eluo) a.j()).ai((char) 4205)).x("No Finder use case is enabled.");
        return null;
    }
}
