package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.ahwd;
import defpackage.ajhd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class D2dMigrateHelperChimeraService extends Service {
    public static final ahwd a = new ahwd("D2dMigrateHelperService");

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.backup.D2D_MIGRATE_HELPER".equals(intent.getAction())) {
            return new ajhd(this);
        }
        return null;
    }
}
