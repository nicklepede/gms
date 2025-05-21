package com.google.android.gms.feedback;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arwm;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bajr;
import defpackage.bake;
import defpackage.bakj;
import defpackage.bapl;
import defpackage.birh;
import defpackage.bqux;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ffkz;
import defpackage.fflc;
import defpackage.fflh;
import defpackage.ffli;
import defpackage.fflj;
import defpackage.fflt;
import defpackage.fmut;
import defpackage.fnnl;
import defpackage.fnuc;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OfflineReportSendTaskChimeraService extends GmsTaskChimeraService {
    private static final asot a = asot.b("gF_SendGcmTask", asej.FEEDBACK);
    private ensv b;

    public static void d(Context context) {
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.feedback.OfflineReportSendTaskService";
        bykjVar.e(0L, TimeUnit.DAYS.toSeconds(fnnl.a.a().l()));
        bykjVar.p = true;
        bykjVar.x(fnnl.a.a().J() ? 1 : 0, 1);
        bykjVar.t("gF_OfflineUpload");
        bykjVar.g(0);
        byjl.a(context).f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        bajr bajrVar;
        OfflineReportSendTaskChimeraService offlineReportSendTaskChimeraService = this;
        bapl baplVar = new bapl();
        baplVar.c();
        int i = bake.a;
        File[] listFiles = (fmut.j() ? new File(bqux.a.b(offlineReportSendTaskChimeraService.getFilesDir(), "reports")) : new File(offlineReportSendTaskChimeraService.getFilesDir(), "reports")).listFiles();
        if (listFiles == null) {
            return 2;
        }
        int i2 = 0;
        while (i2 < listFiles.length) {
            File file = listFiles[i2];
            if (file.getName().endsWith(".proto.gz")) {
                if (TimeUnit.MILLISECONDS.toSeconds(baplVar.a()) >= fnnl.a.a().n()) {
                    return 1;
                }
                try {
                    fecj v = fflh.a.v();
                    fflc fflcVar = fflc.a;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fflh fflhVar = (fflh) v.b;
                    fflcVar.getClass();
                    fflhVar.c = fflcVar;
                    fflhVar.b |= 1;
                    ffli ffliVar = ffli.a;
                    fecj v2 = ffliVar.v();
                    fecj v3 = fflt.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fflt ffltVar = (fflt) v3.b;
                    ffltVar.b |= 1;
                    ffltVar.c = 1L;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ffli ffliVar2 = (ffli) v2.b;
                    fflt ffltVar2 = (fflt) v3.Q();
                    ffltVar2.getClass();
                    ffliVar2.c = ffltVar2;
                    ffliVar2.b |= 1;
                    fecj v4 = ffkz.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fecp fecpVar = v4.b;
                    ffkz ffkzVar = (ffkz) fecpVar;
                    ffkzVar.b |= 1;
                    ffkzVar.c = "";
                    if (!fecpVar.L()) {
                        v4.U();
                    }
                    fecp fecpVar2 = v4.b;
                    ffkz ffkzVar2 = (ffkz) fecpVar2;
                    ffkzVar2.b |= 2;
                    ffkzVar2.d = "";
                    if (!fecpVar2.L()) {
                        v4.U();
                    }
                    fecp fecpVar3 = v4.b;
                    ffkz ffkzVar3 = (ffkz) fecpVar3;
                    ffkzVar3.b |= 4;
                    ffkzVar3.e = "";
                    if (!fecpVar3.L()) {
                        v4.U();
                    }
                    fecp fecpVar4 = v4.b;
                    ffkz ffkzVar4 = (ffkz) fecpVar4;
                    ffkzVar4.b |= 8;
                    ffkzVar4.f = "";
                    if (!fecpVar4.L()) {
                        v4.U();
                    }
                    ffkz ffkzVar5 = (ffkz) v4.b;
                    ffkzVar5.b |= 16;
                    ffkzVar5.g = "";
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ffli ffliVar3 = (ffli) v2.b;
                    ffkz ffkzVar6 = (ffkz) v4.Q();
                    ffkzVar6.getClass();
                    ffliVar3.e = ffkzVar6;
                    ffliVar3.b |= 4;
                    fflj ffljVar = fflj.a;
                    fecj v5 = ffljVar.v();
                    if (!v5.b.L()) {
                        v5.U();
                    }
                    fecp fecpVar5 = v5.b;
                    fflj ffljVar2 = (fflj) fecpVar5;
                    try {
                        ffljVar2.b |= 2;
                        ffljVar2.d = "";
                        if (!fecpVar5.L()) {
                            v5.U();
                        }
                        fecp fecpVar6 = v5.b;
                        fflj ffljVar3 = (fflj) fecpVar6;
                        ffljVar3.b |= 4;
                        ffljVar3.e = "";
                        if (!fecpVar6.L()) {
                            v5.U();
                        }
                        fecp fecpVar7 = v5.b;
                        fflj ffljVar4 = (fflj) fecpVar7;
                        ffljVar4.b |= 64;
                        ffljVar4.i = "";
                        if (!fecpVar7.L()) {
                            v5.U();
                        }
                        fflj ffljVar5 = (fflj) v5.b;
                        ffljVar5.b |= 1;
                        ffljVar5.c = "";
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        ffli ffliVar4 = (ffli) v2.b;
                        fflj ffljVar6 = (fflj) v5.Q();
                        ffljVar6.getClass();
                        ffliVar4.d = ffljVar6;
                        ffliVar4.b |= 2;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fflh fflhVar2 = (fflh) v.b;
                        ffli ffliVar5 = (ffli) v2.Q();
                        ffliVar5.getClass();
                        fflhVar2.d = ffliVar5;
                        fflhVar2.b |= 2;
                        fflh fflhVar3 = (fflh) birh.c(file, (fflh) v.Q());
                        if (fflhVar3 == null) {
                            ((ejhf) ((ejhf) a.j()).ah((char) 3623)).x("Can't parse the report.");
                        } else {
                            bakj bakjVar = new bakj(offlineReportSendTaskChimeraService);
                            ffli ffliVar6 = fflhVar3.d;
                            if (ffliVar6 == null) {
                                ffliVar6 = ffliVar;
                            }
                            String a2 = bakj.a(ffliVar6);
                            ffli ffliVar7 = fflhVar3.d;
                            if (ffliVar7 == null) {
                                ffliVar7 = ffliVar;
                            }
                            if (bakjVar.e(a2, bakj.c(ffliVar7))) {
                                ((ejhf) ((ejhf) a.j()).ah((char) 3622)).x("Dropped report.");
                            } else {
                                GoogleHelp googleHelp = new GoogleHelp("gms:feedback:suggestions");
                                fflc fflcVar2 = fflhVar3.c;
                                if (fflcVar2 == null) {
                                    fflcVar2 = fflcVar;
                                }
                                if (!fflcVar2.e.isEmpty()) {
                                    fflc fflcVar3 = fflhVar3.c;
                                    if (fflcVar3 == null) {
                                        fflcVar3 = fflcVar;
                                    }
                                    googleHelp.c = new Account(fflcVar3.e, "com.google");
                                }
                                fflc fflcVar4 = fflhVar3.c;
                                if (fflcVar4 == null) {
                                    fflcVar4 = fflcVar;
                                }
                                if (!fflcVar4.h.isEmpty()) {
                                    fflc fflcVar5 = fflhVar3.c;
                                    if (fflcVar5 != null) {
                                        fflcVar = fflcVar5;
                                    }
                                    googleHelp.D = fflcVar.h;
                                }
                                HelpConfig d = HelpConfig.d(googleHelp, offlineReportSendTaskChimeraService);
                                ffli ffliVar8 = fflhVar3.d;
                                if (ffliVar8 == null) {
                                    ffliVar8 = ffliVar;
                                }
                                if ((ffliVar8.b & 2) != 0) {
                                    fflj ffljVar7 = ffliVar8.d;
                                    if (ffljVar7 == null) {
                                        ffljVar7 = ffljVar;
                                    }
                                    if (ffljVar7.i.isEmpty()) {
                                        ffli ffliVar9 = fflhVar3.d;
                                        if (ffliVar9 == null) {
                                            ffliVar9 = ffliVar;
                                        }
                                        fflj ffljVar8 = ffliVar9.d;
                                        if (ffljVar8 == null) {
                                            ffljVar8 = ffljVar;
                                        }
                                        if (!ffljVar8.c.isEmpty()) {
                                            ffli ffliVar10 = fflhVar3.d;
                                            if (ffliVar10 == null) {
                                                ffliVar10 = ffliVar;
                                            }
                                            fflj ffljVar9 = ffliVar10.d;
                                            if (ffljVar9 != null) {
                                                ffljVar = ffljVar9;
                                            }
                                            d.b = ffljVar.c;
                                        }
                                    } else {
                                        ffli ffliVar11 = fflhVar3.d;
                                        if (ffliVar11 == null) {
                                            ffliVar11 = ffliVar;
                                        }
                                        fflj ffljVar10 = ffliVar11.d;
                                        if (ffljVar10 != null) {
                                            ffljVar = ffljVar10;
                                        }
                                        d.b = ffljVar.i;
                                    }
                                }
                                if (offlineReportSendTaskChimeraService.b == null) {
                                    offlineReportSendTaskChimeraService.b = new asmf(Integer.MAX_VALUE, 10);
                                }
                                ffli ffliVar12 = ffliVar;
                                ensv ensvVar = offlineReportSendTaskChimeraService.b;
                                asot asotVar = bajr.k;
                                arwm.k("Must be called from a worker thread.");
                                if (fnuc.c()) {
                                    ffli ffliVar13 = fflhVar3.d;
                                    if (ffliVar13 != null) {
                                        ffliVar12 = ffliVar13;
                                    }
                                    bajrVar = new bajr((Context) offlineReportSendTaskChimeraService, d, ensvVar, bakj.f(ffliVar12.k, fflhVar3.e, bakj.a(ffliVar12), bakj.c(ffliVar12)), fflhVar3, false);
                                } else {
                                    byte[] a3 = bake.a(file);
                                    ffli ffliVar14 = fflhVar3.d;
                                    if (ffliVar14 == null) {
                                        ffliVar14 = ffliVar12;
                                    }
                                    bajrVar = new bajr((Context) this, d, ensvVar, bakj.b(ffliVar14.k, fflhVar3.e, bakj.a(ffliVar14), bakj.c(ffliVar14)), a3, false);
                                }
                                if (!bajr.q(bajrVar)) {
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
