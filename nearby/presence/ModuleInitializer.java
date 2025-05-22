package com.google.android.gms.nearby.presence;

import android.content.Intent;
import defpackage.apzs;
import defpackage.ftfv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ModuleInitializer extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (ftfv.D()) {
            startService(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.nearby.presence.service.LifeCycleService"));
        }
    }
}
