package com.google.android.gms.nearby.presence;

import android.content.Intent;
import defpackage.anya;
import defpackage.fqma;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fqma.B()) {
            startService(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.nearby.presence.service.LifeCycleService"));
        }
    }
}
