package com.google.android.gms.location.provider.gnss;

import android.content.Context;
import android.content.Intent;
import android.location.provider.LocationProviderBase;
import android.location.provider.ProviderRequest;
import android.os.IBinder;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.a;
import defpackage.atad;
import defpackage.atai;
import defpackage.ateo;
import defpackage.ateq;
import defpackage.ater;
import defpackage.atfb;
import defpackage.atfd;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auti;
import defpackage.cbsf;
import defpackage.cbsu;
import defpackage.cbtd;
import defpackage.ccsd;
import defpackage.ccse;
import defpackage.ccsg;
import defpackage.ccsj;
import defpackage.ccsk;
import defpackage.ccso;
import defpackage.ccvv;
import defpackage.dhln;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dhoy;
import defpackage.dhpi;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fsfk;
import defpackage.fvgk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GnssLocationChimeraService extends Service {
    public static final ausn a = ausn.b("GnssShim", auid.LOCATION);
    public ccsj b;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cbsf cbsfVar;
        cbtd cbtdVar;
        List asList = Arrays.asList(strArr);
        auti autiVar = new auti(printWriter, "  ");
        autiVar.println("Flags:");
        autiVar.b();
        autiVar.println(a.aa(fsfk.k(), "use_blue_star_location_provider: "));
        autiVar.println("enable_blue_star_in_flp: " + fsfk.i());
        autiVar.println("enable_bugreport_measurement_logging: " + fsfk.j());
        autiVar.println("bugreport_measurement_logging_duration_seconds: " + fsfk.b());
        autiVar.println("disable_inertials: " + fsfk.g());
        autiVar.println("disable_request_chipset_location_updates: " + fsfk.h());
        autiVar.println("disable_activity_recognition: " + fsfk.f());
        autiVar.println("use_chipset_default: " + fsfk.l());
        autiVar.println("use_chipset_pedestrian: " + fsfk.m());
        autiVar.println("use_chipset_vehicle: " + fsfk.n());
        autiVar.println(a.aa(fvgk.c(), "tensorgps_location_provider_enabled: "));
        if (this.b == null || asList.contains("disableMeasurementLogs")) {
            return;
        }
        ccsj ccsjVar = this.b;
        ccsg ccsgVar = ccsjVar.d;
        ccsg ccsgVar2 = ccsjVar.b;
        ccsg ccsgVar3 = ccsjVar.c;
        StringBuilder sb = new StringBuilder("Active delegate: ");
        sb.append(ccsgVar == ccsgVar2 ? "chipset" : "bluestar");
        sb.append(ccsgVar3 != null ? " and tensorgps" : "");
        printWriter.println(sb.toString());
        ccsg ccsgVar4 = ccsjVar.a;
        if (ccsgVar4 == null || (cbsfVar = ((ccsd) ccsgVar4).e) == null || (cbtdVar = ((cbsu) cbsfVar.e).u) == null) {
            return;
        }
        printWriter.println("MeasurementLogStore Begin");
        synchronized (cbtdVar) {
            cbtdVar.b();
        }
        cbtdVar.a.c(printWriter);
        printWriter.println("MeasurementLogStore End");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        dhlw je;
        Context createSubmoduleContext = ModuleManager.createSubmoduleContext(this, "gnss_location_provider");
        ekvl.y(createSubmoduleContext);
        ccvv c = ccvv.c();
        final long currentTimeMillis = System.currentTimeMillis();
        final long e = fsfk.a.lK().e();
        final AtomicInteger atomicInteger = new AtomicInteger();
        eqgl f = c.f(new ekut() { // from class: ccvs
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ccvw ccvwVar = (ccvw) obj;
                ausn ausnVar = ccvv.a;
                ccvy ccvyVar = (ccvy) ccvwVar.b;
                long j = ccvyVar.h;
                long j2 = currentTimeMillis;
                int i = j2 - j > e ? 0 : ccvyVar.i + 1;
                atomicInteger.set(i);
                if (!ccvwVar.b.L()) {
                    ccvwVar.U();
                }
                ccvy ccvyVar2 = (ccvy) ccvwVar.b;
                ccvyVar2.b |= 32;
                ccvyVar2.i = i;
                if (!ccvwVar.b.L()) {
                    ccvwVar.U();
                }
                ccvy ccvyVar3 = (ccvy) ccvwVar.b;
                ccvyVar3.b |= 16;
                ccvyVar3.h = j2;
                return ccvwVar;
            }
        });
        ekut ekutVar = new ekut() { // from class: ccuy
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = ccvv.a;
                return Integer.valueOf(atomicInteger.get());
            }
        };
        eqex eqexVar = eqex.a;
        eqgc.t(eqdl.f(f, ekutVar, eqexVar), new ccsk(this, createSubmoduleContext), eqexVar);
        if (this.b == null) {
            ccsj ccsjVar = new ccsj(createSubmoduleContext);
            this.b = ccsjVar;
            ccsjVar.d = ccsjVar.a(ProviderRequest.EMPTY_REQUEST);
            ccsg ccsgVar = ccsjVar.a;
            if (ccsgVar != null) {
                final ccsd ccsdVar = (ccsd) ccsgVar;
                ccsdVar.c.execute(new Runnable() { // from class: ccsc
                    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 635
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsc.run():void");
                    }
                });
            }
            ccsg ccsgVar2 = ccsjVar.b;
            ccsg ccsgVar3 = ccsjVar.c;
            if (ccsgVar3 != null) {
                final ccso ccsoVar = (ccso) ccsgVar3;
                if (!ccsoVar.c.get() && !ccsoVar.f) {
                    ccsoVar.f = true;
                    if (ccsoVar.e == null) {
                        ccsoVar.e = new dhpi(ccsoVar.a);
                    }
                    atai ataiVar = ccsoVar.e;
                    if (ataiVar != null) {
                        atad atadVar = (atad) ataiVar;
                        final ateq ja = atadVar.ja(ccsoVar.d, "TensorGpsLocationListener");
                        ateo ateoVar = ja.b;
                        if (ateoVar == null) {
                            je = dhmr.d(null);
                        } else {
                            final int hashCode = ateoVar.hashCode();
                            atfd atfdVar = new atfd() { // from class: dhpc
                                @Override // defpackage.atfd
                                public final void d(Object obj, Object obj2) {
                                    dhpj dhpjVar = (dhpj) obj;
                                    int i = dhpi.a;
                                    dhpf dhpfVar = new dhpf((dhma) obj2);
                                    dhpa dhpaVar = (dhpa) dhpjVar.H();
                                    dhpb dhpbVar = new dhpb(ja);
                                    ApiMetadata a2 = bsxa.a(dhpjVar.r);
                                    Parcel fE = dhpaVar.fE();
                                    qmr.g(fE, dhpfVar);
                                    qmr.g(fE, dhpbVar);
                                    fE.writeInt(hashCode);
                                    qmr.e(fE, a2);
                                    dhpaVar.fG(1, fE);
                                }
                            };
                            atfd atfdVar2 = new atfd() { // from class: dhpd
                                @Override // defpackage.atfd
                                public final void d(Object obj, Object obj2) {
                                    dhpj dhpjVar = (dhpj) obj;
                                    int i = dhpi.a;
                                    dhph dhphVar = new dhph((dhma) obj2);
                                    dhpa dhpaVar = (dhpa) dhpjVar.H();
                                    ApiMetadata a2 = bsxa.a(dhpjVar.r);
                                    Parcel fE = dhpaVar.fE();
                                    qmr.g(fE, dhphVar);
                                    fE.writeInt(hashCode);
                                    qmr.e(fE, a2);
                                    dhpaVar.fG(2, fE);
                                }
                            };
                            atfb atfbVar = new atfb();
                            atfbVar.c = ja;
                            atfbVar.d = new Feature[]{dhoy.a};
                            atfbVar.a = atfdVar;
                            atfbVar.b = atfdVar2;
                            atfbVar.e = 34301;
                            je = atadVar.je(atfbVar.a());
                        }
                        je.y(new dhln() { // from class: ccsm
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                ccso.this.c.set(true);
                            }
                        });
                    }
                }
            }
        }
        return this.b.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ccsj ccsjVar = this.b;
        if (ccsjVar != null) {
            ccsg ccsgVar = ccsjVar.a;
            if (ccsgVar != null) {
                final ccsd ccsdVar = (ccsd) ccsgVar;
                ccsdVar.c.execute(new Runnable() { // from class: ccsa
                    @Override // java.lang.Runnable
                    public final void run() {
                        ccsd ccsdVar2 = ccsd.this;
                        cbsf cbsfVar = ccsdVar2.e;
                        if (cbsfVar != null) {
                            cbsfVar.c();
                            ccsdVar2.e = null;
                            ccsdVar2.f = null;
                        }
                    }
                });
            }
            ccse ccseVar = (ccse) ccsjVar.b;
            ccseVar.c.removeUpdates(ccseVar.d);
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray = ccseVar.a;
            synchronized (sparseArray) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    arrayList.add((LocationProviderBase.OnFlushCompleteCallback) sparseArray.valueAt(i));
                }
                sparseArray.clear();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((LocationProviderBase.OnFlushCompleteCallback) arrayList.get(i2)).onFlushComplete();
            }
            ccsg ccsgVar2 = ccsjVar.c;
            if (ccsgVar2 != null) {
                ccso ccsoVar = (ccso) ccsgVar2;
                if (!ccsoVar.c.get() && ccsoVar.f) {
                    ccsoVar.f = false;
                    atai ataiVar = ccsoVar.e;
                    if (ataiVar != null) {
                        ateo a2 = ater.a(ccsoVar.d, "TensorGpsLocationListener");
                        a2.hashCode();
                        ((atad) ataiVar).jh(a2, 34302).y(new dhln() { // from class: ccsl
                            @Override // defpackage.dhln
                            public final void gB(Exception exc) {
                                int i3 = ccso.h;
                            }
                        });
                    }
                }
            }
            this.b = null;
        }
        super.onDestroy();
    }
}
