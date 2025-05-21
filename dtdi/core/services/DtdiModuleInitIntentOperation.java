package com.google.android.gms.dtdi.core.services;

import android.content.Intent;
import defpackage.anya;
import defpackage.asot;
import defpackage.asqh;
import defpackage.ayay;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DtdiModuleInitIntentOperation extends anya {
    private static final asot a = ayay.a("DtdiModuleInitIntentOperation");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asot asotVar = a;
        ((ejhf) asotVar.h()).z("Init runtime state. flags: %x", i);
        if (asqh.c()) {
            startService(new Intent(intent).setClassName(this, "com.google.android.gms.dtdi.lifecycle.LifecycleService"));
        } else {
            ((ejhf) asotVar.h()).x("Platform version too old");
        }
    }
}
