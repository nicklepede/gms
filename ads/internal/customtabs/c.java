package com.google.android.gms.ads.internal.customtabs;

import android.content.ComponentName;
import defpackage.akc;
import defpackage.akf;
import defpackage.akg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c extends akf {
    public akg b;

    public c() {
        new AtomicBoolean(false);
    }

    @Override // defpackage.akf
    public final void a(akc akcVar) {
        akcVar.c();
        this.b = akcVar.a(new b());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b = null;
    }
}
