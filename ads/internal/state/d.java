package com.google.android.gms.ads.internal.state;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class d extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.i.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.i.set(false);
    }
}
