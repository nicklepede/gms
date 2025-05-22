package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.ajwt;
import defpackage.alhv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class D2dMigrateHelperChimeraService extends Service {
    public static final ajwt a = new ajwt("D2dMigrateHelperService");

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.backup.D2D_MIGRATE_HELPER".equals(intent.getAction())) {
            return new alhv(this);
        }
        return null;
    }
}
