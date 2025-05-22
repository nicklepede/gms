package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.atzb;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bcnn;
import defpackage.bcoa;
import defpackage.bcof;
import defpackage.bcth;
import defpackage.bkvw;
import defpackage.btco;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhzx;
import defpackage.fiaa;
import defpackage.fiaf;
import defpackage.fiag;
import defpackage.fiah;
import defpackage.fiar;
import defpackage.fpmr;
import defpackage.fqfu;
import defpackage.fqml;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OfflineReportSendTaskChimeraService extends GmsTaskChimeraService {
    private static final ausn a = ausn.b("gF_SendGcmTask", auid.FEEDBACK);
    private eqgo b;

    public static void d(Context context) {
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.feedback.OfflineReportSendTaskService";
        TimeUnit timeUnit = TimeUnit.DAYS;
        fqfu fqfuVar = fqfu.a;
        catbVar.e(0L, timeUnit.toSeconds(fqfuVar.lK().l()));
        catbVar.p = true;
        catbVar.x(fqfuVar.lK().J() ? 1 : 0, 1);
        catbVar.t("gF_OfflineUpload");
        catbVar.g(0);
        casd.a(context).f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        bcnn bcnnVar;
        OfflineReportSendTaskChimeraService offlineReportSendTaskChimeraService = this;
        bcth bcthVar = new bcth();
        bcthVar.c();
        int i = bcoa.a;
        File[] listFiles = (fpmr.j() ? new File(btco.a.b(offlineReportSendTaskChimeraService.getFilesDir(), "reports")) : new File(offlineReportSendTaskChimeraService.getFilesDir(), "reports")).listFiles();
        if (listFiles == null) {
            return 2;
        }
        int i2 = 0;
        while (i2 < listFiles.length) {
            File file = listFiles[i2];
            if (file.getName().endsWith(".proto.gz")) {
                if (TimeUnit.MILLISECONDS.toSeconds(bcthVar.a()) >= fqfu.a.lK().n()) {
                    return 1;
                }
                try {
                    fgrc v = fiaf.a.v();
                    fiaa fiaaVar = fiaa.a;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fiaf fiafVar = (fiaf) v.b;
                    fiaaVar.getClass();
                    fiafVar.c = fiaaVar;
                    fiafVar.b |= 1;
                    fiag fiagVar = fiag.a;
                    fgrc v2 = fiagVar.v();
                    fgrc v3 = fiar.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fiar fiarVar = (fiar) v3.b;
                    fiarVar.b |= 1;
                    fiarVar.c = 1L;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fiag fiagVar2 = (fiag) v2.b;
                    fiar fiarVar2 = (fiar) v3.Q();
                    fiarVar2.getClass();
                    fiagVar2.c = fiarVar2;
                    fiagVar2.b |= 1;
                    fgrc v4 = fhzx.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fgri fgriVar = v4.b;
                    fhzx fhzxVar = (fhzx) fgriVar;
                    fhzxVar.b |= 1;
                    fhzxVar.c = "";
                    if (!fgriVar.L()) {
                        v4.U();
                    }
                    fgri fgriVar2 = v4.b;
                    fhzx fhzxVar2 = (fhzx) fgriVar2;
                    fhzxVar2.b |= 2;
                    fhzxVar2.d = "";
                    if (!fgriVar2.L()) {
                        v4.U();
                    }
                    fgri fgriVar3 = v4.b;
                    fhzx fhzxVar3 = (fhzx) fgriVar3;
                    fhzxVar3.b |= 4;
                    fhzxVar3.e = "";
                    if (!fgriVar3.L()) {
                        v4.U();
                    }
                    fgri fgriVar4 = v4.b;
                    fhzx fhzxVar4 = (fhzx) fgriVar4;
                    fhzxVar4.b |= 8;
                    fhzxVar4.f = "";
                    if (!fgriVar4.L()) {
                        v4.U();
                    }
                    fhzx fhzxVar5 = (fhzx) v4.b;
                    fhzxVar5.b |= 16;
                    fhzxVar5.g = "";
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fiag fiagVar3 = (fiag) v2.b;
                    fhzx fhzxVar6 = (fhzx) v4.Q();
                    fhzxVar6.getClass();
                    fiagVar3.e = fhzxVar6;
                    fiagVar3.b |= 4;
                    fiah fiahVar = fiah.a;
                    fgrc v5 = fiahVar.v();
                    if (!v5.b.L()) {
                        v5.U();
                    }
                    fgri fgriVar5 = v5.b;
                    fiah fiahVar2 = (fiah) fgriVar5;
                    try {
                        fiahVar2.b |= 2;
                        fiahVar2.d = "";
                        if (!fgriVar5.L()) {
                            v5.U();
                        }
                        fgri fgriVar6 = v5.b;
                        fiah fiahVar3 = (fiah) fgriVar6;
                        fiahVar3.b |= 4;
                        fiahVar3.e = "";
                        if (!fgriVar6.L()) {
                            v5.U();
                        }
                        fgri fgriVar7 = v5.b;
                        fiah fiahVar4 = (fiah) fgriVar7;
                        fiahVar4.b |= 64;
                        fiahVar4.i = "";
                        if (!fgriVar7.L()) {
                            v5.U();
                        }
                        fiah fiahVar5 = (fiah) v5.b;
                        fiahVar5.b |= 1;
                        fiahVar5.c = "";
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fiag fiagVar4 = (fiag) v2.b;
                        fiah fiahVar6 = (fiah) v5.Q();
                        fiahVar6.getClass();
                        fiagVar4.d = fiahVar6;
                        fiagVar4.b |= 2;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fiaf fiafVar2 = (fiaf) v.b;
                        fiag fiagVar5 = (fiag) v2.Q();
                        fiagVar5.getClass();
                        fiafVar2.d = fiagVar5;
                        fiafVar2.b |= 2;
                        fiaf fiafVar3 = (fiaf) bkvw.c(file, (fiaf) v.Q());
                        if (fiafVar3 == null) {
                            ((eluo) ((eluo) a.j()).ai((char) 3629)).x("Can't parse the report.");
                        } else {
                            bcof bcofVar = new bcof(offlineReportSendTaskChimeraService);
                            fiag fiagVar6 = fiafVar3.d;
                            if (fiagVar6 == null) {
                                fiagVar6 = fiagVar;
                            }
                            String a2 = bcof.a(fiagVar6);
                            fiag fiagVar7 = fiafVar3.d;
                            if (fiagVar7 == null) {
                                fiagVar7 = fiagVar;
                            }
                            if (bcofVar.e(a2, bcof.c(fiagVar7))) {
                                ((eluo) ((eluo) a.j()).ai((char) 3628)).x("Dropped report.");
                            } else {
                                GoogleHelp googleHelp = new GoogleHelp("gms:feedback:suggestions");
                                fiaa fiaaVar2 = fiafVar3.c;
                                if (fiaaVar2 == null) {
                                    fiaaVar2 = fiaaVar;
                                }
                                if (!fiaaVar2.e.isEmpty()) {
                                    fiaa fiaaVar3 = fiafVar3.c;
                                    if (fiaaVar3 == null) {
                                        fiaaVar3 = fiaaVar;
                                    }
                                    googleHelp.c = new Account(fiaaVar3.e, "com.google");
                                }
                                fiaa fiaaVar4 = fiafVar3.c;
                                if (fiaaVar4 == null) {
                                    fiaaVar4 = fiaaVar;
                                }
                                if (!fiaaVar4.h.isEmpty()) {
                                    fiaa fiaaVar5 = fiafVar3.c;
                                    if (fiaaVar5 != null) {
                                        fiaaVar = fiaaVar5;
                                    }
                                    googleHelp.D = fiaaVar.h;
                                }
                                HelpConfig d = HelpConfig.d(googleHelp, offlineReportSendTaskChimeraService);
                                fiag fiagVar8 = fiafVar3.d;
                                if (fiagVar8 == null) {
                                    fiagVar8 = fiagVar;
                                }
                                if ((fiagVar8.b & 2) != 0) {
                                    fiah fiahVar7 = fiagVar8.d;
                                    if (fiahVar7 == null) {
                                        fiahVar7 = fiahVar;
                                    }
                                    if (fiahVar7.i.isEmpty()) {
                                        fiag fiagVar9 = fiafVar3.d;
                                        if (fiagVar9 == null) {
                                            fiagVar9 = fiagVar;
                                        }
                                        fiah fiahVar8 = fiagVar9.d;
                                        if (fiahVar8 == null) {
                                            fiahVar8 = fiahVar;
                                        }
                                        if (!fiahVar8.c.isEmpty()) {
                                            fiag fiagVar10 = fiafVar3.d;
                                            if (fiagVar10 == null) {
                                                fiagVar10 = fiagVar;
                                            }
                                            fiah fiahVar9 = fiagVar10.d;
                                            if (fiahVar9 != null) {
                                                fiahVar = fiahVar9;
                                            }
                                            d.b = fiahVar.c;
                                        }
                                    } else {
                                        fiag fiagVar11 = fiafVar3.d;
                                        if (fiagVar11 == null) {
                                            fiagVar11 = fiagVar;
                                        }
                                        fiah fiahVar10 = fiagVar11.d;
                                        if (fiahVar10 != null) {
                                            fiahVar = fiahVar10;
                                        }
                                        d.b = fiahVar.i;
                                    }
                                }
                                if (offlineReportSendTaskChimeraService.b == null) {
                                    offlineReportSendTaskChimeraService.b = new aupz(Integer.MAX_VALUE, 10);
                                }
                                fiag fiagVar12 = fiagVar;
                                eqgo eqgoVar = offlineReportSendTaskChimeraService.b;
                                ausn ausnVar = bcnn.k;
                                atzb.k("Must be called from a worker thread.");
                                if (fqml.c()) {
                                    fiag fiagVar13 = fiafVar3.d;
                                    if (fiagVar13 != null) {
                                        fiagVar12 = fiagVar13;
                                    }
                                    bcnnVar = new bcnn((Context) offlineReportSendTaskChimeraService, d, eqgoVar, bcof.f(fiagVar12.k, fiafVar3.e, bcof.a(fiagVar12), bcof.c(fiagVar12)), fiafVar3, false);
                                } else {
                                    byte[] a3 = bcoa.a(file);
                                    fiag fiagVar14 = fiafVar3.d;
                                    if (fiagVar14 == null) {
                                        fiagVar14 = fiagVar12;
                                    }
                                    bcnnVar = new bcnn((Context) this, d, eqgoVar, bcof.b(fiagVar14.k, fiafVar3.e, bcof.a(fiagVar14), bcof.c(fiagVar14)), a3, false);
                                }
                                if (!bcnn.q(bcnnVar)) {
                                }
                            }
                        }
                        file.delete();
                    } catch (IOException unused) {
                        return 1;
                    }
                } catch (IOException unused2) {
                    return 1;
                }
            }
            i2++;
            offlineReportSendTaskChimeraService = this;
        }
        return 0;
    }
}
