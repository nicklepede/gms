package com.google.android.gms.smartdevice.d2d.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.ddqr;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ProxyResultReceiver extends ResultReceiver {
    private final WeakReference a;

    public ProxyResultReceiver(Handler handler, ddqr ddqrVar) {
        super(handler);
        this.a = new WeakReference(ddqrVar);
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        ddqr ddqrVar = (ddqr) this.a.get();
        if (ddqrVar == null) {
            return;
        }
        ddqrVar.y(i, bundle);
    }
}
