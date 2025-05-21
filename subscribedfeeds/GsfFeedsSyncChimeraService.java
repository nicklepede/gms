package com.google.android.gms.subscribedfeeds;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.devc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GsfFeedsSyncChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new devc(getApplicationContext(), "subscribedfeeds").getSyncAdapterBinder();
    }
}
