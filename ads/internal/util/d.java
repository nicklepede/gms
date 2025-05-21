package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import defpackage.byhr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d extends byhr {
    public d(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.c.d().d(e, "AdMobHandler.handleMessage");
        }
    }

    @Override // defpackage.byhr
    protected final void ls(Message message) {
        try {
            super.ls(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.c.e();
            m.k(com.google.android.gms.ads.internal.c.d().d, th);
            throw th;
        }
    }
}
