package com.google.android.gms.update;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cvkh;
import defpackage.djoc;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ChimeraSystemUpdateService extends Service {
    public static final ausn a = ausn.b("CmaSystemUpdateService", auid.OTA);
    public static final cvkh b = cvkh.b();
    private djoc c;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.update.START_SERVICE")) {
            ((eluo) ((eluo) a.j()).ai((char) 11929)).x("onBind is called with an unexpected intent, returning null.");
            return null;
        }
        djoc djocVar = this.c;
        djocVar.asBinder();
        return djocVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.c = new djoc(this, this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }
}
