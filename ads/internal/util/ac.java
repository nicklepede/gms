package com.google.android.gms.ads.internal.util;

import android.os.HandlerThread;
import android.os.Looper;
import defpackage.atzb;
import defpackage.caqj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ac {
    private HandlerThread a = null;
    private int b = 0;
    private final Object c = new Object();

    public final Looper a() {
        Looper looper;
        Object obj = this.c;
        synchronized (obj) {
            if (this.b != 0) {
                atzb.t(this.a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.a == null) {
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.a = handlerThread;
                handlerThread.start();
                new caqj(this.a.getLooper());
            } else {
                obj.notifyAll();
            }
            this.b++;
            looper = this.a.getLooper();
        }
        return looper;
    }
}
