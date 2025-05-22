package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import defpackage.caqj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d extends caqj {
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

    @Override // defpackage.caqj
    protected final void lP(Message message) {
        try {
            super.lP(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.c.e();
            m.l(com.google.android.gms.ads.internal.c.d().d, th);
            throw th;
        }
    }
}
