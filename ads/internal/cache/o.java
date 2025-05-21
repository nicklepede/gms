package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.Binder;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class o {
    public c a;
    public boolean b;
    public final Context c;
    public final Object d = new Object();

    public o(Context context) {
        this.c = context;
    }

    public final void a() {
        synchronized (this.d) {
            c cVar = this.a;
            if (cVar == null) {
                return;
            }
            cVar.m();
            this.a = null;
            Binder.flushPendingCommands();
        }
    }
}
