package com.google.android.gms.gcm.connection;

import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.bibk;
import defpackage.bibl;
import defpackage.bicm;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ConnectivityManagerVariantImplAsync$AvailableNetworksMonitor extends NetworkCallbackWrapper {
    public static final /* synthetic */ int c = 0;
    public final Object a;
    public final Map b;
    private final bibk d;

    public ConnectivityManagerVariantImplAsync$AvailableNetworksMonitor(bibk bibkVar) {
        super("gcm", "AvailableNetworksMonitor");
        this.a = new Object();
        this.b = new HashMap();
        this.d = bibkVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network, NetworkCapabilities networkCapabilities) {
        bicm bicmVar;
        Object obj = this.a;
        bicm e = bibl.e(network, networkCapabilities);
        synchronized (obj) {
            bicmVar = (bicm) this.b.put(network, e);
        }
        if (e.equals(bicmVar)) {
            return;
        }
        this.d.a(e, false);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        synchronized (this.a) {
            bicm bicmVar = (bicm) this.b.remove(network);
            if (bicmVar == null) {
                return;
            }
            this.d.a(bicmVar, true);
        }
    }
}
