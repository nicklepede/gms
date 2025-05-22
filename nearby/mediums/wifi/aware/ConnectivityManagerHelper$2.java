package com.google.android.gms.nearby.mediums.wifi.aware;

import android.net.LinkProperties;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.mediums.wifi.aware.ConnectivityManagerHelper$2;
import defpackage.clno;
import defpackage.cmdn;
import defpackage.cmeo;
import defpackage.cmfi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ConnectivityManagerHelper$2 extends NetworkCallbackWrapper {
    final /* synthetic */ cmfi a;
    final /* synthetic */ int b;
    public final /* synthetic */ cmdn c;
    final /* synthetic */ cmeo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityManagerHelper$2(cmdn cmdnVar, cmfi cmfiVar, int i, cmeo cmeoVar) {
        super("nearby", "AwareHostNetworkCallback");
        this.a = cmfiVar;
        this.b = i;
        this.d = cmeoVar;
        this.c = cmdnVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        clno.a.b().i("A remote peer[%s] joined to our Aware network[%s]", this.a, network);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        clno.a.b().p("Lost connection to the WiFi Aware network.", new Object[0]);
        this.c.c.l(this.a);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void d(final Network network, final LinkProperties linkProperties) {
        final int i = this.b;
        final cmfi cmfiVar = this.a;
        final cmeo cmeoVar = this.d;
        this.c.a.execute(new Runnable() { // from class: cmdk
            @Override // java.lang.Runnable
            public final void run() {
                ConnectivityManagerHelper$2.this.c.g(cmfiVar, network, linkProperties, i, cmeoVar);
            }
        });
    }
}
