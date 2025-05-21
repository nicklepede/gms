package com.google.android.gms.update;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.asej;
import defpackage.asot;
import defpackage.ctbd;
import defpackage.dhcw;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChimeraSystemUpdateService extends Service {
    public static final asot a = asot.b("CmaSystemUpdateService", asej.OTA);
    public static final ctbd b = ctbd.b();
    private dhcw c;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.update.START_SERVICE")) {
            ((ejhf) ((ejhf) a.j()).ah((char) 11926)).x("onBind is called with an unexpected intent, returning null.");
            return null;
        }
        dhcw dhcwVar = this.c;
        dhcwVar.asBinder();
        return dhcwVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.c = new dhcw(this, this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }
}
