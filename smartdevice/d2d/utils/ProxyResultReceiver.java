package com.google.android.gms.smartdevice.d2d.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.dgbw;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ProxyResultReceiver extends ResultReceiver {
    private final WeakReference a;

    public ProxyResultReceiver(Handler handler, dgbw dgbwVar) {
        super(handler);
        this.a = new WeakReference(dgbwVar);
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        dgbw dgbwVar = (dgbw) this.a.get();
        if (dgbwVar == null) {
            return;
        }
        dgbwVar.y(i, bundle);
    }
}
