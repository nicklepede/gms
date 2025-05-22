package com.google.android.gms.nearby.presence.network;

import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import com.google.android.gms.nearby.presence.network.NetworkMonitorImpl$1;
import com.google.android.gms.nearby.presence.service.PresenceChimeraService;
import defpackage.atzb;
import defpackage.ausn;
import defpackage.chku;
import defpackage.cmug;
import defpackage.cnnb;
import defpackage.cnnk;
import defpackage.cnoh;
import defpackage.cnqn;
import defpackage.elhx;
import defpackage.eluo;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NetworkMonitorImpl$1 extends NetworkCallbackWrapper {
    public final /* synthetic */ cnoh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMonitorImpl$1(cnoh cnohVar) {
        super("nearby", "NetworkMonitorImplNetworkCallback");
        this.a = cnohVar;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        ((eluo) cmug.a.h()).B("NetworkMonitorImpl onAvailable %s", network);
        cnoh cnohVar = this.a;
        if (!cnohVar.h) {
            cnohVar.a();
            cnohVar.h = true;
            return;
        }
        Future future = cnohVar.g;
        if (future != null) {
            future.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = cnohVar.e;
        atzb.s(scheduledExecutorService);
        cnohVar.g = ((chku) scheduledExecutorService).schedule(new Runnable() { // from class: cnog
            @Override // java.lang.Runnable
            public final void run() {
                NetworkMonitorImpl$1.this.a.a();
            }
        }, 15L, TimeUnit.SECONDS);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        ausn ausnVar = cmug.a;
        ((eluo) ausnVar.h()).B("NetworkMonitorImpl onLost %s", network);
        cnoh cnohVar = this.a;
        Map map = cnohVar.b;
        map.remove(network);
        Future future = cnohVar.g;
        if (future != null) {
            future.cancel(false);
        }
        cnqn cnqnVar = cnohVar.i;
        if (!map.isEmpty()) {
            ((eluo) ausnVar.h()).B("Skipped reporting network disconnect as there's still active networks: {%s}.", map.keySet());
            return;
        }
        if (cnqnVar != null) {
            PresenceChimeraService presenceChimeraService = cnqnVar.a;
            final cnnk cnnkVar = presenceChimeraService.o;
            if (cnnkVar != null) {
                presenceChimeraService.c(new Runnable() { // from class: cnql
                    @Override // java.lang.Runnable
                    public final void run() {
                        cnnk.this.G();
                    }
                });
            }
            final cnnb cnnbVar = presenceChimeraService.n;
            if (cnnbVar != null) {
                presenceChimeraService.c(new Runnable() { // from class: cnqm
                    @Override // java.lang.Runnable
                    public final void run() {
                        cnnb.this.b(false);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void d(Network network, LinkProperties linkProperties) {
        ausn ausnVar = cmug.a;
        ((eluo) ausnVar.h()).B("NetworkMonitorImpl onLinkPropertiesChanged %s", network);
        elhx elhxVar = new elhx();
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            ausnVar.f(cmug.a()).B("NetworkMonitorImpl appending ip address %s", linkAddress.getAddress());
            elhxVar.c(linkAddress.getAddress());
        }
        cnoh cnohVar = this.a;
        cnohVar.b.put(network, elhxVar.g());
    }
}
