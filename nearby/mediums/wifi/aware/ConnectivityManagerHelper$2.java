package com.google.android.gms.nearby.mediums.wifi.aware;

import android.net.LinkProperties;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.mediums.wifi.aware.ConnectivityManagerHelper$2;
import defpackage.cjfj;
import defpackage.cjvi;
import defpackage.cjwj;
import defpackage.cjxd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ConnectivityManagerHelper$2 extends NetworkCallbackWrapper {
    final /* synthetic */ cjxd a;
    final /* synthetic */ int b;
    public final /* synthetic */ cjvi c;
    final /* synthetic */ cjwj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityManagerHelper$2(cjvi cjviVar, cjxd cjxdVar, int i, cjwj cjwjVar) {
        super("nearby", "AwareHostNetworkCallback");
        this.a = cjxdVar;
        this.b = i;
        this.d = cjwjVar;
        this.c = cjviVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        cjfj.a.b().i("A remote peer[%s] joined to our Aware network[%s]", this.a, network);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        cjfj.a.b().p("Lost connection to the WiFi Aware network.", new Object[0]);
        this.c.c.l(this.a);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void d(final Network network, final LinkProperties linkProperties) {
        final int i = this.b;
        final cjxd cjxdVar = this.a;
        final cjwj cjwjVar = this.d;
        this.c.a.execute(new Runnable() { // from class: cjvf
            @Override // java.lang.Runnable
            public final void run() {
                ConnectivityManagerHelper$2.this.c.g(cjxdVar, network, linkProperties, i, cjwjVar);
            }
        });
    }
}
