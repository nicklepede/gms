package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class bt implements Runnable {
    final /* synthetic */ ad a;

    public bt(ad adVar) {
        this.a = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar = this.a.a.a;
        if (aaVar != null) {
            try {
                aaVar.a();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.h.m("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
