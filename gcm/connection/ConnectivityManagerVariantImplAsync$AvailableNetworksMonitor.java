package com.google.android.gms.gcm.connection;

import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.bkfz;
import defpackage.bkga;
import defpackage.bkhb;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ConnectivityManagerVariantImplAsync$AvailableNetworksMonitor extends NetworkCallbackWrapper {
    public static final /* synthetic */ int c = 0;
    public final Object a;
    public final Map b;
    private final bkfz d;

    public ConnectivityManagerVariantImplAsync$AvailableNetworksMonitor(bkfz bkfzVar) {
        super("gcm", "AvailableNetworksMonitor");
        this.a = new Object();
        this.b = new HashMap();
        this.d = bkfzVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network, NetworkCapabilities networkCapabilities) {
        bkhb bkhbVar;
        Object obj = this.a;
        bkhb e = bkga.e(network, networkCapabilities);
        synchronized (obj) {
            bkhbVar = (bkhb) this.b.put(network, e);
        }
        if (e.equals(bkhbVar)) {
            return;
        }
        this.d.a(e, false);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        synchronized (this.a) {
            bkhb bkhbVar = (bkhb) this.b.remove(network);
            if (bkhbVar == null) {
                return;
            }
            this.d.a(bkhbVar, true);
        }
    }
}
