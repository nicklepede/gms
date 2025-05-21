package com.google.android.gms.people.sync.focus.progressupdate.portal;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.cuey;
import defpackage.cuzq;
import defpackage.edet;
import defpackage.edeu;
import defpackage.edfc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SyncProgressPortalChimeraService extends Service {
    public static boolean a = true;
    public static edet b;
    private final edeu c = new cuzq();

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!edfc.c(intent)) {
            return null;
        }
        cuey.f("FSA2_SyncProgressPortalService", "onBind service");
        return this.c;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        if (!edfc.c(intent)) {
            return false;
        }
        cuey.f("FSA2_SyncProgressPortalService", "onUnbind service");
        b = null;
        return false;
    }
}
