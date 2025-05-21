package com.google.android.gms.ads.internal.customtabs;

import android.content.ComponentName;
import defpackage.ajt;
import defpackage.ajw;
import defpackage.ajx;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c extends ajw {
    public ajx b;

    public c() {
        new AtomicBoolean(false);
    }

    @Override // defpackage.ajw
    public final void a(ajt ajtVar) {
        ajtVar.c();
        this.b = ajtVar.a(new b());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b = null;
    }
}
