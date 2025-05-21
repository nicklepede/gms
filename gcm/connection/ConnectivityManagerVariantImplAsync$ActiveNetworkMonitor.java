package com.google.android.gms.gcm.connection;

import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.bibj;
import defpackage.bibl;
import defpackage.bicm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ConnectivityManagerVariantImplAsync$ActiveNetworkMonitor extends NetworkCallbackWrapper {
    public static final /* synthetic */ int b = 0;
    public volatile bicm a;
    private final bibj c;

    public ConnectivityManagerVariantImplAsync$ActiveNetworkMonitor(bibj bibjVar) {
        super("gcm", "ActiveNetworkMonitor");
        this.c = bibjVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network, NetworkCapabilities networkCapabilities) {
        bicm e = bibl.e(network, networkCapabilities);
        if (e.equals(this.a)) {
            return;
        }
        bicm bicmVar = this.a;
        this.a = e;
        this.c.a(bicmVar, e);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        if (this.a == null || !network.equals(this.a.a.c())) {
            return;
        }
        bicm bicmVar = this.a;
        this.a = null;
        this.c.a(bicmVar, null);
    }
}
