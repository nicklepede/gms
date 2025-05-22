package com.google.android.gms.people.sync.focus.progressupdate.portal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cwof;
import defpackage.cxiy;
import defpackage.efro;
import defpackage.efrp;
import defpackage.efrx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SyncProgressPortalChimeraService extends Service {
    public static boolean a = true;
    public static efro b;
    private final efrp c = new cxiy();

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!efrx.c(intent)) {
            return null;
        }
        cwof.f("FSA2_SyncProgressPortalService", "onBind service");
        return this.c;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        if (!efrx.c(intent)) {
            return false;
        }
        cwof.f("FSA2_SyncProgressPortalService", "onUnbind service");
        b = null;
        return false;
    }
}
