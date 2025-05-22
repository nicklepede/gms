package com.google.android.gms.dtdi.core.services;

import android.content.Intent;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.auub;
import defpackage.baey;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DtdiModuleInitIntentOperation extends apzs {
    private static final ausn a = baey.a("DtdiModuleInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).z("Init runtime state. flags: %x", i);
        if (auub.c()) {
            startService(new Intent(intent).setClassName(this, "com.google.android.gms.dtdi.lifecycle.LifecycleService"));
        } else {
            ((eluo) ausnVar.h()).x("Platform version too old");
        }
    }
}
