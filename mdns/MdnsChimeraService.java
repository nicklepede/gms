package com.google.android.gms.mdns;

import android.content.Context;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atzs;
import defpackage.bsk;
import defpackage.bsl;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.cfjq;
import defpackage.cfjs;
import defpackage.cfjy;
import defpackage.cfjz;
import defpackage.cfkb;
import defpackage.cfkd;
import defpackage.cfle;
import defpackage.cfly;
import defpackage.cfnt;
import defpackage.elpp;
import defpackage.etuw;
import defpackage.etvm;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdnsChimeraService extends bzot {
    private final cfnt a;
    private cfkb b;
    private cfjz c;
    private bzpe d;
    private cfjq m;
    private cfjy n;
    private cfly o;

    public MdnsChimeraService() {
        super(168, "com.google.android.gms.mdns.service.START", elpp.a, 1, 10);
        this.a = new cfnt("MdnsChimeraService");
        setWantIntentExtras(true);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        byte[] byteArray;
        cfle cfleVar;
        Bundle bundle = getServiceRequest.i;
        MdnsOptions mdnsOptions = (bundle == null || (byteArray = bundle.getByteArray("MDNS_OPTIONS")) == null) ? null : (MdnsOptions) atzs.a(byteArray, MdnsOptions.CREATOR);
        if (mdnsOptions == null) {
            bzozVar.a(8, null);
            return;
        }
        if (this.b == null || this.c == null || this.d == null) {
            this.a.a("MdnsChimeraService was not properly set up. Not creating service stub.");
            cfleVar = null;
        } else {
            cfleVar = new cfle(mdnsOptions, this.b, this.d, this.c, getServiceRequest.f, getServiceRequest.p);
        }
        if (cfleVar == null) {
            bzozVar.a(8, null);
        } else {
            bzozVar.c(cfleVar);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        WifiManager wifiManager = (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            this.a.a("Cannot call MdnsChimeraService.onCreate without wifiManager");
            return;
        }
        WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("mdns-cast");
        createMulticastLock.setReferenceCounted(false);
        cfjs cfjsVar = new cfjs(applicationContext.getApplicationContext());
        this.m = cfjsVar;
        cfjs.a.a("Start watching connectivity changes");
        if (!cfjsVar.d) {
            cfjsVar.f.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), cfjsVar.e);
            cfjsVar.d = true;
        }
        this.n = new cfjy();
        this.o = new cfly(applicationContext.getApplicationContext(), this.m, createMulticastLock);
        cfkb cfkbVar = new cfkb(this.n, this.o);
        this.b = cfkbVar;
        this.o.f(cfkbVar);
        this.d = l();
        this.c = new cfkd(applicationContext.getApplicationContext(), wifiManager);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.d = null;
        this.b = null;
        this.o = null;
        cfjq cfjqVar = this.m;
        if (cfjqVar != null) {
            cfjs.a.a("Stop watching connectivity changes");
            cfjs cfjsVar = (cfjs) cfjqVar;
            if (cfjsVar.d) {
                cfjsVar.f.unregisterNetworkCallback(cfjsVar.e);
                cfjsVar.d = false;
            }
            this.m = null;
        }
        cfjy cfjyVar = this.n;
        if (cfjyVar != null) {
            bsk bskVar = new bsk((bsl) cfjyVar.a);
            while (bskVar.hasNext()) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bskVar.next();
                if (!scheduledExecutorService.isShutdown()) {
                    scheduledExecutorService.shutdownNow();
                }
            }
        }
        cfjz cfjzVar = this.c;
        if (cfjzVar != null) {
            cfkd cfkdVar = (cfkd) cfjzVar;
            cfkdVar.b = null;
            cfkdVar.c = null;
            Set<ScheduledExecutorService> set = cfkdVar.a.a;
            for (ScheduledExecutorService scheduledExecutorService2 : set) {
                if (!scheduledExecutorService2.isShutdown()) {
                    scheduledExecutorService2.shutdownNow();
                }
            }
            set.clear();
            etvm etvmVar = cfkdVar.b;
            if (etvmVar != null) {
                etuw etuwVar = etvmVar.d;
                HandlerThread handlerThread = etuwVar.a;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                synchronized (etuwVar.c) {
                }
            }
            this.c = null;
        }
        super.onDestroy();
    }
}
