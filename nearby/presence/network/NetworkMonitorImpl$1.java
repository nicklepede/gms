package com.google.android.gms.nearby.presence.network;

import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.presence.network.NetworkMonitorImpl$1;
import com.google.android.gms.nearby.presence.service.PresenceChimeraService;
import defpackage.arwm;
import defpackage.cfdi;
import defpackage.ckmb;
import defpackage.clew;
import defpackage.clfe;
import defpackage.clgb;
import defpackage.clif;
import defpackage.eius;
import defpackage.ejhf;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NetworkMonitorImpl$1 extends NetworkCallbackWrapper {
    public final /* synthetic */ clgb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMonitorImpl$1(clgb clgbVar) {
        super("nearby", "NetworkMonitorImplNetworkCallback");
        this.a = clgbVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        ((ejhf) ckmb.a.h()).B("NetworkMonitorImpl onAvailable %s", network);
        clgb clgbVar = this.a;
        if (!clgbVar.h) {
            clgbVar.a();
            clgbVar.h = true;
            return;
        }
        Future future = clgbVar.g;
        if (future != null) {
            future.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = clgbVar.e;
        arwm.s(scheduledExecutorService);
        clgbVar.g = ((cfdi) scheduledExecutorService).schedule(new Runnable() { // from class: clga
            @Override // java.lang.Runnable
            public final void run() {
                NetworkMonitorImpl$1.this.a.a();
            }
        }, 15L, TimeUnit.SECONDS);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        ((ejhf) ckmb.a.h()).B("NetworkMonitorImpl onLost %s", network);
        clgb clgbVar = this.a;
        Map map = clgbVar.b;
        map.remove(network);
        Future future = clgbVar.g;
        if (future != null) {
            future.cancel(false);
        }
        clif clifVar = clgbVar.i;
        if (!map.isEmpty()) {
            ((ejhf) ckmb.a.h()).B("Skipped reporting network disconnect as there's still active networks: {%s}.", map.keySet());
            return;
        }
        if (clifVar != null) {
            PresenceChimeraService presenceChimeraService = clifVar.a;
            final clfe clfeVar = presenceChimeraService.o;
            if (clfeVar != null) {
                presenceChimeraService.c(new Runnable() { // from class: clid
                    @Override // java.lang.Runnable
                    public final void run() {
                        clfe.this.F();
                    }
                });
            }
            final clew clewVar = presenceChimeraService.n;
            if (clewVar != null) {
                presenceChimeraService.c(new Runnable() { // from class: clie
                    @Override // java.lang.Runnable
                    public final void run() {
                        clew.this.b(false);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void d(Network network, LinkProperties linkProperties) {
        ((ejhf) ckmb.a.h()).B("NetworkMonitorImpl onLinkPropertiesChanged %s", network);
        eius eiusVar = new eius();
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            ckmb.a.f(ckmb.a()).B("NetworkMonitorImpl appending ip address %s", linkAddress.getAddress());
            eiusVar.c(linkAddress.getAddress());
        }
        clgb clgbVar = this.a;
        clgbVar.b.put(network, eiusVar.g());
    }
}
