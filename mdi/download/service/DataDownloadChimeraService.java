package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.mdi.download.service.DataDownloadChimeraService;
import defpackage.asxd;
import defpackage.asxe;
import defpackage.aura;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cepp;
import defpackage.ceqp;
import defpackage.ceqq;
import defpackage.cero;
import defpackage.cerp;
import defpackage.cerr;
import defpackage.cers;
import defpackage.ceru;
import defpackage.dpvo;
import defpackage.dpvs;
import defpackage.drso;
import defpackage.drsv;
import defpackage.drsx;
import defpackage.dsmd;
import defpackage.dsto;
import defpackage.dstx;
import defpackage.ejaf;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elpg;
import defpackage.eqcy;
import defpackage.eqdv;
import defpackage.eqgo;
import defpackage.flnj;
import defpackage.frvd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DataDownloadChimeraService extends bzot {
    public static final eqdv a = new eqdv() { // from class: cerx
        @Override // defpackage.eqdv
        public final eqgl a(Object obj) {
            eqdv eqdvVar = DataDownloadChimeraService.a;
            return eqgc.i(drse.SUCCESS);
        }
    };
    private Context b;
    private dsmd c;
    private ceru d;
    private cerp m;
    private dsto n;
    private dpvo o;

    public DataDownloadChimeraService() {
        super(new int[]{152}, new String[]{"com.google.android.mdd.service.START"}, Collections.EMPTY_SET, 3, 9, 1, (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        int i = dstx.a;
        bzozVar.c(new cepp(this.b, this.c, this.d, this.m, this.n, l(), getServiceRequest.e, aura.X(this.b) ? 1 : true != asxe.d(this.b).h(getServiceRequest.f) ? 3 : 2, this.o, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        int i;
        super.dump(fileDescriptor, printWriter, strArr);
        if (!frvd.a.lK().j() && (strArr == null || strArr.length <= 0 || !"force_mdd_dump".equals(strArr[0]))) {
            printWriter.println("==== MDD dumped info is DISABLED ====");
            return;
        }
        printWriter.println("==== MDD dumped info ====");
        if (frvd.c()) {
            printWriter.println("==== PhenotypeConfigPopulator ====");
            printWriter.println("DataFileGroups:");
            elgo a2 = cerr.a();
            int i2 = ((elpg) a2).c;
            for (int i3 = 0; i3 < i2; i3++) {
                printWriter.println(((drso) a2.get(i3)).c);
            }
            printWriter.println("ManifestConfigs:");
            elgo a3 = cers.a();
            int i4 = ((elpg) a3).c;
            int i5 = 0;
            while (i5 < i4) {
                Iterator it = ((drsx) a3.get(i5)).c.iterator();
                while (true) {
                    i = i5 + 1;
                    if (it.hasNext()) {
                        drso drsoVar = ((drsv) it.next()).c;
                        if (drsoVar == null) {
                            drsoVar = drso.a;
                        }
                        printWriter.println(drsoVar.c);
                    }
                }
                i5 = i;
            }
        }
        try {
            final dsmd dsmdVar = this.c;
            ((eqcy) ejaf.k(dsmdVar.k(), new eqdv() { // from class: dsku
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    final PrintWriter printWriter2 = printWriter;
                    printWriter2.println("==== MDD_FILE_GROUP_MANAGER ====");
                    printWriter2.println("MDD_FRESH_FILE_GROUPS:");
                    final dsmd dsmdVar2 = dsmd.this;
                    final dshu dshuVar = dsmdVar2.d;
                    return ejaf.k(dshuVar.t(dshuVar.t(dshuVar.d.c(), new eqdv() { // from class: dsfn
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            ArrayList arrayList = new ArrayList((List) obj2);
                            Collections.sort(arrayList, new Comparator() { // from class: dsgb
                                @Override // java.util.Comparator
                                public final int compare(Object obj3, Object obj4) {
                                    drvn drvnVar = ((dspx) obj3).a;
                                    eldp eldpVar = eldp.b;
                                    String str = drvnVar.c;
                                    drvn drvnVar2 = ((dspx) obj4).a;
                                    return eldpVar.d(str, drvnVar2.c).d(drvnVar.e, drvnVar2.e).a();
                                }
                            });
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                PrintWriter printWriter3 = printWriter2;
                                dspx dspxVar = (dspx) arrayList.get(i6);
                                drvn drvnVar = dspxVar.a;
                                printWriter3.format("GroupName: %s\nAccount: %s\nDataFileGroup:\n %s\n\n", drvnVar.c, drvnVar.e, dspxVar.b.toString());
                            }
                            return eqgf.a;
                        }
                    }), new eqdv() { // from class: dsfy
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("MDD_STALE_FILE_GROUPS:");
                            dshu dshuVar2 = dshu.this;
                            return dshuVar2.t(dshuVar2.d.e(), new eqdv() { // from class: dsda
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj3) {
                                    for (druu druuVar : (List) obj3) {
                                        PrintWriter printWriter4 = printWriter3;
                                        printWriter4.format("GroupName: %s\nDataFileGroup:\n%s\n", druuVar.d, druuVar.toString());
                                    }
                                    return eqgf.a;
                                }
                            });
                        }
                    }), new eqdv() { // from class: dskk
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("==== MDD_SHARED_FILES ====");
                            final dspl dsplVar = dsmd.this.f;
                            return ejaf.k(dsplVar.c.c(), new eqdv() { // from class: dspj
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj3) {
                                    eqgl eqglVar = eqgf.a;
                                    for (final drvr drvrVar : (List) obj3) {
                                        final PrintWriter printWriter4 = printWriter3;
                                        final dspl dsplVar2 = dspl.this;
                                        eqglVar = ejaf.k(eqglVar, new eqdv() { // from class: dsoi
                                            @Override // defpackage.eqdv
                                            public final eqgl a(Object obj4) {
                                                final dspl dsplVar3 = dspl.this;
                                                final PrintWriter printWriter5 = printWriter4;
                                                dspo dspoVar = dsplVar3.c;
                                                final drvr drvrVar2 = drvrVar;
                                                return ejaf.k(dspoVar.e(drvrVar2), new eqdv() { // from class: dsop
                                                    @Override // defpackage.eqdv
                                                    public final eqgl a(Object obj5) {
                                                        drvt drvtVar = (drvt) obj5;
                                                        if (drvtVar == null) {
                                                            dstx.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                                                            return eqgf.a;
                                                        }
                                                        drvr drvrVar3 = drvrVar2;
                                                        PrintWriter printWriter6 = printWriter5;
                                                        printWriter6.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", drvrVar3, drvtVar.c, drvtVar.toString());
                                                        if (drvtVar.e) {
                                                            printWriter6.format("Checksum Android-shared file: %s\n", drvtVar.g);
                                                        } else {
                                                            dspl dsplVar4 = dspl.this;
                                                            int a4 = drus.a(drvrVar3.f);
                                                            Uri f = dsvr.f(dsplVar4.a, a4 == 0 ? 1 : a4, drvtVar.c, drvrVar3.e, dsplVar4.b, dsplVar4.k, false);
                                                            if (f != null) {
                                                                printWriter6.format("Checksum downloaded file: %s\n", dssb.b(dsplVar4.e, f));
                                                            }
                                                        }
                                                        return eqgf.a;
                                                    }
                                                }, dsplVar3.l);
                                            }
                                        }, dsplVar2.l);
                                    }
                                    return eqglVar;
                                }
                            }, dsplVar.l);
                        }
                    }, dsmdVar2.n);
                }
            }, dsmdVar.n)).v(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", e);
        } catch (ExecutionException e2) {
            e = e2;
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", e);
        } catch (TimeoutException e3) {
            e = e3;
            printWriter.format("Failed to get debug info from MobileDataDownloadManager with exception %s", e);
        }
        printWriter.println();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        int i = dstx.a;
        this.b = getApplicationContext();
        this.o = new dpvs();
        eqgo eqgoVar = this.f;
        if (cero.b == null) {
            synchronized (cero.a) {
                if (cero.b == null) {
                    flnj flnjVar = ceqp.a;
                    cero.b = new cero(new ceqq(eqgoVar, eqgoVar));
                }
            }
        }
        cero ceroVar = cero.b;
        this.c = ceroVar.b();
        this.n = (dsto) ceroVar.j.a();
        dsmd b = ceroVar.b();
        this.d = new ceru(b, (Executor) ceroVar.g.a());
        this.m = asxd.e(getApplicationContext()) ? new cerp(getApplicationContext()) : null;
    }
}
