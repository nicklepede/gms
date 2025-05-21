package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.mdi.download.service.DataDownloadChimeraService;
import defpackage.aquo;
import defpackage.aqup;
import defpackage.asng;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ccgv;
import defpackage.cchv;
import defpackage.cchw;
import defpackage.cciu;
import defpackage.cciv;
import defpackage.ccix;
import defpackage.cciy;
import defpackage.ccja;
import defpackage.dnlf;
import defpackage.dnlj;
import defpackage.dpif;
import defpackage.dpim;
import defpackage.dpio;
import defpackage.dqbv;
import defpackage.dqjg;
import defpackage.dqjp;
import defpackage.egnc;
import defpackage.eitj;
import defpackage.eits;
import defpackage.ejcb;
import defpackage.enpf;
import defpackage.enqc;
import defpackage.ensv;
import defpackage.fixm;
import defpackage.fpbw;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DataDownloadChimeraService extends bxgd {
    public static final enqc a = new enqc() { // from class: ccjd
        @Override // defpackage.enqc
        public final enss a(Object obj) {
            enqc enqcVar = DataDownloadChimeraService.a;
            return ensj.i(dphv.SUCCESS);
        }
    };
    private Context b;
    private dqbv c;
    private ccja d;
    private cciv m;
    private dqjg n;
    private dnlf o;

    public DataDownloadChimeraService() {
        super(new int[]{152}, new String[]{"com.google.android.mdd.service.START"}, Collections.EMPTY_SET, 3, 9, 1, (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        int i = dqjp.a;
        bxgjVar.c(new ccgv(this.b, this.c, this.d, this.m, this.n, l(), getServiceRequest.e, asng.X(this.b) ? 1 : true != aqup.d(this.b).h(getServiceRequest.f) ? 3 : 2, this.o, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService
    public final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        int i;
        super.dump(fileDescriptor, printWriter, strArr);
        if (!fpbw.a.a().j() && (strArr == null || strArr.length <= 0 || !"force_mdd_dump".equals(strArr[0]))) {
            printWriter.println("==== MDD dumped info is DISABLED ====");
            return;
        }
        printWriter.println("==== MDD dumped info ====");
        if (fpbw.c()) {
            printWriter.println("==== PhenotypeConfigPopulator ====");
            printWriter.println("DataFileGroups:");
            eitj a2 = ccix.a();
            int i2 = ((ejcb) a2).c;
            for (int i3 = 0; i3 < i2; i3++) {
                printWriter.println(((dpif) a2.get(i3)).c);
            }
            printWriter.println("ManifestConfigs:");
            eitj a3 = cciy.a();
            int i4 = ((ejcb) a3).c;
            int i5 = 0;
            while (i5 < i4) {
                Iterator it = ((dpio) a3.get(i5)).c.iterator();
                while (true) {
                    i = i5 + 1;
                    if (it.hasNext()) {
                        dpif dpifVar = ((dpim) it.next()).c;
                        if (dpifVar == null) {
                            dpifVar = dpif.a;
                        }
                        printWriter.println(dpifVar.c);
                    }
                }
                i5 = i;
            }
        }
        try {
            final dqbv dqbvVar = this.c;
            ((enpf) egnc.k(dqbvVar.k(), new enqc() { // from class: dqam
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    final PrintWriter printWriter2 = printWriter;
                    printWriter2.println("==== MDD_FILE_GROUP_MANAGER ====");
                    printWriter2.println("MDD_FRESH_FILE_GROUPS:");
                    final dqbv dqbvVar2 = dqbv.this;
                    final dpxm dpxmVar = dqbvVar2.d;
                    return egnc.k(dpxmVar.t(dpxmVar.t(dpxmVar.d.c(), new enqc() { // from class: dpvf
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            ArrayList arrayList = new ArrayList((List) obj2);
                            Collections.sort(arrayList, new Comparator() { // from class: dpvt
                                @Override // java.util.Comparator
                                public final int compare(Object obj3, Object obj4) {
                                    dple dpleVar = ((dqfp) obj3).a;
                                    eiqk eiqkVar = eiqk.b;
                                    String str = dpleVar.c;
                                    dple dpleVar2 = ((dqfp) obj4).a;
                                    return eiqkVar.d(str, dpleVar2.c).d(dpleVar.e, dpleVar2.e).a();
                                }
                            });
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                PrintWriter printWriter3 = printWriter2;
                                dqfp dqfpVar = (dqfp) arrayList.get(i6);
                                dple dpleVar = dqfpVar.a;
                                printWriter3.format("GroupName: %s\nAccount: %s\nDataFileGroup:\n %s\n\n", dpleVar.c, dpleVar.e, dqfpVar.b.toString());
                            }
                            return ensm.a;
                        }
                    }), new enqc() { // from class: dpvq
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("MDD_STALE_FILE_GROUPS:");
                            dpxm dpxmVar2 = dpxm.this;
                            return dpxmVar2.t(dpxmVar2.d.e(), new enqc() { // from class: dpss
                                @Override // defpackage.enqc
                                public final enss a(Object obj3) {
                                    for (dpkl dpklVar : (List) obj3) {
                                        PrintWriter printWriter4 = printWriter3;
                                        printWriter4.format("GroupName: %s\nDataFileGroup:\n%s\n", dpklVar.d, dpklVar.toString());
                                    }
                                    return ensm.a;
                                }
                            });
                        }
                    }), new enqc() { // from class: dqac
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            final PrintWriter printWriter3 = printWriter2;
                            printWriter3.println("==== MDD_SHARED_FILES ====");
                            final dqfd dqfdVar = dqbv.this.f;
                            return egnc.k(dqfdVar.c.c(), new enqc() { // from class: dqfb
                                @Override // defpackage.enqc
                                public final enss a(Object obj3) {
                                    enss enssVar = ensm.a;
                                    for (final dpli dpliVar : (List) obj3) {
                                        final PrintWriter printWriter4 = printWriter3;
                                        final dqfd dqfdVar2 = dqfd.this;
                                        enssVar = egnc.k(enssVar, new enqc() { // from class: dqea
                                            @Override // defpackage.enqc
                                            public final enss a(Object obj4) {
                                                final dqfd dqfdVar3 = dqfd.this;
                                                final PrintWriter printWriter5 = printWriter4;
                                                dqfg dqfgVar = dqfdVar3.c;
                                                final dpli dpliVar2 = dpliVar;
                                                return egnc.k(dqfgVar.e(dpliVar2), new enqc() { // from class: dqeh
                                                    @Override // defpackage.enqc
                                                    public final enss a(Object obj5) {
                                                        dplk dplkVar = (dplk) obj5;
                                                        if (dplkVar == null) {
                                                            dqjp.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                                                            return ensm.a;
                                                        }
                                                        dpli dpliVar3 = dpliVar2;
                                                        PrintWriter printWriter6 = printWriter5;
                                                        printWriter6.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", dpliVar3, dplkVar.c, dplkVar.toString());
                                                        if (dplkVar.e) {
                                                            printWriter6.format("Checksum Android-shared file: %s\n", dplkVar.g);
                                                        } else {
                                                            dqfd dqfdVar4 = dqfd.this;
                                                            int a4 = dpkj.a(dpliVar3.f);
                                                            Uri f = dqlj.f(dqfdVar4.a, a4 == 0 ? 1 : a4, dplkVar.c, dpliVar3.e, dqfdVar4.b, dqfdVar4.k, false);
                                                            if (f != null) {
                                                                printWriter6.format("Checksum downloaded file: %s\n", dqht.b(dqfdVar4.e, f));
                                                            }
                                                        }
                                                        return ensm.a;
                                                    }
                                                }, dqfdVar3.l);
                                            }
                                        }, dqfdVar2.l);
                                    }
                                    return enssVar;
                                }
                            }, dqfdVar.l);
                        }
                    }, dqbvVar2.n);
                }
            }, dqbvVar.n)).v(3L, TimeUnit.SECONDS);
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

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        int i = dqjp.a;
        this.b = getApplicationContext();
        this.o = new dnlj();
        ensv ensvVar = this.f;
        if (cciu.b == null) {
            synchronized (cciu.a) {
                if (cciu.b == null) {
                    fixm fixmVar = cchv.a;
                    cciu.b = new cciu(new cchw(ensvVar, ensvVar));
                }
            }
        }
        cciu cciuVar = cciu.b;
        this.c = cciuVar.b();
        this.n = (dqjg) cciuVar.j.a();
        dqbv b = cciuVar.b();
        this.d = new ccja(b, (Executor) cciuVar.g.a());
        this.m = aquo.e(getApplicationContext()) ? new cciv(getApplicationContext()) : null;
    }
}
