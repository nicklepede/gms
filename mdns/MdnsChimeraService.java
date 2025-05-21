package com.google.android.gms.mdns;

import android.content.Context;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxd;
import defpackage.brz;
import defpackage.bsa;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.cdaq;
import defpackage.cdas;
import defpackage.cday;
import defpackage.cdaz;
import defpackage.cdbb;
import defpackage.cdbd;
import defpackage.cdce;
import defpackage.cdcz;
import defpackage.cdeu;
import defpackage.ejck;
import defpackage.ergh;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdnsChimeraService extends bxgd {
    private final cdeu a;
    private cdbb b;
    private cdaz c;
    private bxgo d;
    private cdaq m;
    private cday n;
    private cdcz o;

    public MdnsChimeraService() {
        super(168, "com.google.android.gms.mdns.service.START", ejck.a, 1, 10);
        this.a = new cdeu("MdnsChimeraService");
        setWantIntentExtras(true);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        byte[] byteArray;
        cdce cdceVar;
        Bundle bundle = getServiceRequest.i;
        MdnsOptions mdnsOptions = (bundle == null || (byteArray = bundle.getByteArray("MDNS_OPTIONS")) == null) ? null : (MdnsOptions) arxd.a(byteArray, MdnsOptions.CREATOR);
        if (mdnsOptions == null) {
            bxgjVar.a(8, null);
            return;
        }
        if (this.b == null || this.c == null || this.d == null) {
            this.a.a("MdnsChimeraService was not properly set up. Not creating service stub.");
            cdceVar = null;
        } else {
            cdceVar = new cdce(mdnsOptions, this.b, this.d, this.c, getServiceRequest.f, getServiceRequest.p);
        }
        if (cdceVar == null) {
            bxgjVar.a(8, null);
        } else {
            bxgjVar.c(cdceVar);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        WifiManager wifiManager = (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            this.a.a("Cannot call MdnsChimeraService.onCreate without wifiManager");
            return;
        }
        WifiManager.MulticastLock createMulticastLock = wifiManager.createMulticastLock("mdns-cast");
        createMulticastLock.setReferenceCounted(false);
        cdas cdasVar = new cdas(applicationContext.getApplicationContext());
        this.m = cdasVar;
        cdas.a.a("Start watching connectivity changes");
        if (!cdasVar.d) {
            cdasVar.f.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), cdasVar.e);
            cdasVar.d = true;
        }
        this.n = new cday();
        this.o = new cdcz(applicationContext.getApplicationContext(), this.m, createMulticastLock);
        cdbb cdbbVar = new cdbb(this.n, this.o);
        this.b = cdbbVar;
        this.o.f(cdbbVar);
        this.d = l();
        this.c = new cdbd(applicationContext.getApplicationContext(), wifiManager);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        HandlerThread handlerThread;
        this.d = null;
        this.b = null;
        this.o = null;
        cdaq cdaqVar = this.m;
        if (cdaqVar != null) {
            cdas.a.a("Stop watching connectivity changes");
            cdas cdasVar = (cdas) cdaqVar;
            if (cdasVar.d) {
                cdasVar.f.unregisterNetworkCallback(cdasVar.e);
                cdasVar.d = false;
            }
            this.m = null;
        }
        cday cdayVar = this.n;
        if (cdayVar != null) {
            brz brzVar = new brz((bsa) cdayVar.a);
            while (brzVar.hasNext()) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) brzVar.next();
                if (!scheduledExecutorService.isShutdown()) {
                    scheduledExecutorService.shutdownNow();
                }
            }
        }
        cdaz cdazVar = this.c;
        if (cdazVar != null) {
            cdbd cdbdVar = (cdbd) cdazVar;
            cdbdVar.b = null;
            cdbdVar.c = null;
            Set<ScheduledExecutorService> set = cdbdVar.a.a;
            for (ScheduledExecutorService scheduledExecutorService2 : set) {
                if (!scheduledExecutorService2.isShutdown()) {
                    scheduledExecutorService2.shutdownNow();
                }
            }
            set.clear();
            ergh erghVar = cdbdVar.b;
            if (erghVar != null && (handlerThread = erghVar.d.a) != null) {
                handlerThread.quitSafely();
            }
            this.c = null;
        }
        super.onDestroy();
    }
}
