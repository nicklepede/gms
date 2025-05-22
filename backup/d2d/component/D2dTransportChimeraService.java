package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aklj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class D2dTransportChimeraService extends Service {
    private aklj a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        Intent intent2 = new Intent("com.google.android.gms.backup.NOTIFY_BACKUP_TRANSPORT_BOUND");
        intent2.putExtra("transport", "com.google.android.gms/.backup.migrate.service.D2dTransport");
        intent2.setPackage(getPackageName());
        sendBroadcast(intent2);
        return this.a.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (this.a == null) {
            this.a = new aklj(this);
        }
    }
}
