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
import com.google.android.gms.common.api.ComplianceOptions;
import defpackage.a;
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arbz;
import defpackage.arcb;
import defpackage.arcc;
import defpackage.arcm;
import defpackage.arco;
import defpackage.asej;
import defpackage.asot;
import defpackage.aspo;
import defpackage.bzjo;
import defpackage.bzkd;
import defpackage.bzkm;
import defpackage.cajn;
import defpackage.cajo;
import defpackage.cajq;
import defpackage.cajt;
import defpackage.caju;
import defpackage.cajy;
import defpackage.canf;
import defpackage.dfah;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dfds;
import defpackage.dfec;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fpls;
import defpackage.fsli;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GnssLocationChimeraService extends Service {
    public static final asot a = asot.b("GnssShim", asej.LOCATION);
    public cajt b;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bzjo bzjoVar;
        bzkm bzkmVar;
        List asList = Arrays.asList(strArr);
        aspo aspoVar = new aspo(printWriter, "  ");
        aspoVar.println("Flags:");
        aspoVar.b();
        aspoVar.println(a.Z(fpls.k(), "use_blue_star_location_provider: "));
        aspoVar.println("enable_blue_star_in_flp: " + fpls.i());
        aspoVar.println("enable_bugreport_measurement_logging: " + fpls.j());
        aspoVar.println("bugreport_measurement_logging_duration_seconds: " + fpls.b());
        aspoVar.println("disable_inertials: " + fpls.g());
        aspoVar.println("disable_request_chipset_location_updates: " + fpls.h());
        aspoVar.println("disable_activity_recognition: " + fpls.f());
        aspoVar.println("use_chipset_default: " + fpls.l());
        aspoVar.println("use_chipset_pedestrian: " + fpls.m());
        aspoVar.println("use_chipset_vehicle: " + fpls.n());
        aspoVar.println(a.Z(fsli.c(), "tensorgps_location_provider_enabled: "));
        if (this.b == null || asList.contains("disableMeasurementLogs")) {
            return;
        }
        cajt cajtVar = this.b;
        cajq cajqVar = cajtVar.d;
        cajq cajqVar2 = cajtVar.b;
        cajq cajqVar3 = cajtVar.c;
        StringBuilder sb = new StringBuilder("Active delegate: ");
        sb.append(cajqVar == cajqVar2 ? "chipset" : "bluestar");
        sb.append(cajqVar3 != null ? " and tensorgps" : "");
        printWriter.println(sb.toString());
        cajq cajqVar4 = cajtVar.a;
        if (cajqVar4 == null || (bzjoVar = ((cajn) cajqVar4).e) == null || (bzkmVar = ((bzkd) bzjoVar.e).u) == null) {
            return;
        }
        printWriter.println("MeasurementLogStore Begin");
        synchronized (bzkmVar) {
            bzkmVar.b();
        }
        bzkmVar.a.c(printWriter);
        printWriter.println("MeasurementLogStore End");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        dfaq iP;
        Context createSubmoduleContext = ModuleManager.createSubmoduleContext(this, "gnss_location_provider");
        eiig.x(createSubmoduleContext);
        canf c = canf.c();
        final long currentTimeMillis = System.currentTimeMillis();
        final long e = fpls.a.a().e();
        final AtomicInteger atomicInteger = new AtomicInteger();
        enss f = c.f(new eiho() { // from class: canc
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                cang cangVar = (cang) obj;
                asot asotVar = canf.a;
                cani caniVar = (cani) cangVar.b;
                long j = caniVar.h;
                long j2 = currentTimeMillis;
                int i = j2 - j > e ? 0 : caniVar.i + 1;
                atomicInteger.set(i);
                if (!cangVar.b.L()) {
                    cangVar.U();
                }
                cani caniVar2 = (cani) cangVar.b;
                caniVar2.b |= 32;
                caniVar2.i = i;
                if (!cangVar.b.L()) {
                    cangVar.U();
                }
                cani caniVar3 = (cani) cangVar.b;
                caniVar3.b |= 16;
                caniVar3.h = j2;
                return cangVar;
            }
        });
        eiho eihoVar = new eiho() { // from class: cami
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = canf.a;
                return Integer.valueOf(atomicInteger.get());
            }
        };
        enre enreVar = enre.a;
        ensj.t(enps.f(f, eihoVar, enreVar), new caju(this, createSubmoduleContext), enreVar);
        if (this.b == null) {
            cajt cajtVar = new cajt(createSubmoduleContext);
            this.b = cajtVar;
            cajtVar.d = cajtVar.a(ProviderRequest.EMPTY_REQUEST);
            cajq cajqVar = cajtVar.a;
            if (cajqVar != null) {
                final cajn cajnVar = (cajn) cajqVar;
                cajnVar.c.execute(new Runnable() { // from class: cajm
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
                    
                        if (r12.equals("sm-s908b") != false) goto L27;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 631
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cajm.run():void");
                    }
                });
            }
            cajq cajqVar2 = cajtVar.b;
            cajq cajqVar3 = cajtVar.c;
            if (cajqVar3 != null) {
                final cajy cajyVar = (cajy) cajqVar3;
                if (!cajyVar.c.get() && !cajyVar.f) {
                    cajyVar.f = true;
                    if (cajyVar.e == null) {
                        cajyVar.e = new dfec(cajyVar.a);
                    }
                    aqxt aqxtVar = cajyVar.e;
                    if (aqxtVar != null) {
                        aqxo aqxoVar = (aqxo) aqxtVar;
                        final arcb iL = aqxoVar.iL(cajyVar.d, "TensorGpsLocationListener");
                        arbz arbzVar = iL.b;
                        if (arbzVar == null) {
                            iP = dfbl.d(null);
                        } else {
                            final int hashCode = arbzVar.hashCode();
                            arco arcoVar = new arco() { // from class: dfdw
                                @Override // defpackage.arco
                                public final void d(Object obj, Object obj2) {
                                    dfed dfedVar = (dfed) obj;
                                    int i = dfec.a;
                                    dfdz dfdzVar = new dfdz((dfau) obj2);
                                    Context context = dfedVar.r;
                                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                                    dfdu dfduVar = (dfdu) dfedVar.H();
                                    dfdv dfdvVar = new dfdv(iL);
                                    ApiMetadata apiMetadata = new ApiMetadata(complianceOptions);
                                    Parcel fr = dfduVar.fr();
                                    oto.g(fr, dfdzVar);
                                    oto.g(fr, dfdvVar);
                                    fr.writeInt(hashCode);
                                    oto.e(fr, apiMetadata);
                                    dfduVar.ft(1, fr);
                                }
                            };
                            arco arcoVar2 = new arco() { // from class: dfdx
                                @Override // defpackage.arco
                                public final void d(Object obj, Object obj2) {
                                    dfed dfedVar = (dfed) obj;
                                    int i = dfec.a;
                                    dfeb dfebVar = new dfeb((dfau) obj2);
                                    Context context = dfedVar.r;
                                    ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                                    dfdu dfduVar = (dfdu) dfedVar.H();
                                    ApiMetadata apiMetadata = new ApiMetadata(complianceOptions);
                                    Parcel fr = dfduVar.fr();
                                    oto.g(fr, dfebVar);
                                    fr.writeInt(hashCode);
                                    oto.e(fr, apiMetadata);
                                    dfduVar.ft(2, fr);
                                }
                            };
                            arcm arcmVar = new arcm();
                            arcmVar.c = iL;
                            arcmVar.d = new Feature[]{dfds.a};
                            arcmVar.a = arcoVar;
                            arcmVar.b = arcoVar2;
                            arcmVar.e = 34301;
                            iP = aqxoVar.iP(arcmVar.a());
                        }
                        iP.y(new dfah() { // from class: cajw
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                cajy.this.c.set(true);
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
        cajt cajtVar = this.b;
        if (cajtVar != null) {
            cajq cajqVar = cajtVar.a;
            if (cajqVar != null) {
                final cajn cajnVar = (cajn) cajqVar;
                cajnVar.c.execute(new Runnable() { // from class: cajk
                    @Override // java.lang.Runnable
                    public final void run() {
                        cajn cajnVar2 = cajn.this;
                        bzjo bzjoVar = cajnVar2.e;
                        if (bzjoVar != null) {
                            bzjoVar.c();
                            cajnVar2.e = null;
                            cajnVar2.f = null;
                        }
                    }
                });
            }
            cajo cajoVar = (cajo) cajtVar.b;
            cajoVar.c.removeUpdates(cajoVar.d);
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray = cajoVar.a;
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
            cajq cajqVar2 = cajtVar.c;
            if (cajqVar2 != null) {
                cajy cajyVar = (cajy) cajqVar2;
                if (!cajyVar.c.get() && cajyVar.f) {
                    cajyVar.f = false;
                    aqxt aqxtVar = cajyVar.e;
                    if (aqxtVar != null) {
                        arbz a2 = arcc.a(cajyVar.d, "TensorGpsLocationListener");
                        a2.hashCode();
                        ((aqxo) aqxtVar).iS(a2, 34302).y(new dfah() { // from class: cajv
                            @Override // defpackage.dfah
                            public final void gm(Exception exc) {
                                int i3 = cajy.h;
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
