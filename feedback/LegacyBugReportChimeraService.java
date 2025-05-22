package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.bcoi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LegacyBugReportChimeraService extends Service {
    private final IBinder a = new bcoi(this);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
