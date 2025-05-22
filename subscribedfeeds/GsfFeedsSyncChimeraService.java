package com.google.android.gms.subscribedfeeds;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.dhgf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GsfFeedsSyncChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new dhgf(getApplicationContext(), "subscribedfeeds").getSyncAdapterBinder();
    }
}
