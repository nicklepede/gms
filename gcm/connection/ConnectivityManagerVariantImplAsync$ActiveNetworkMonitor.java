package com.google.android.gms.gcm.connection;

import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.bkfy;
import defpackage.bkga;
import defpackage.bkhb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ConnectivityManagerVariantImplAsync$ActiveNetworkMonitor extends NetworkCallbackWrapper {
    public static final /* synthetic */ int b = 0;
    public volatile bkhb a;
    private final bkfy c;

    public ConnectivityManagerVariantImplAsync$ActiveNetworkMonitor(bkfy bkfyVar) {
        super("gcm", "ActiveNetworkMonitor");
        this.c = bkfyVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network, NetworkCapabilities networkCapabilities) {
        bkhb e = bkga.e(network, networkCapabilities);
        if (e.equals(this.a)) {
            return;
        }
        bkhb bkhbVar = this.a;
        this.a = e;
        this.c.a(bkhbVar, e);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        if (this.a == null || !network.equals(this.a.a.c())) {
            return;
        }
        bkhb bkhbVar = this.a;
        this.a = null;
        this.c.a(bkhbVar, null);
    }
}
