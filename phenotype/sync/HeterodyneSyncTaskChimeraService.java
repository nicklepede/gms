package com.google.android.gms.phenotype.sync;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import defpackage.aqup;
import defpackage.aqxd;
import defpackage.asej;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.asot;
import defpackage.bxbl;
import defpackage.byln;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.cwbo;
import defpackage.cwbr;
import defpackage.cwcr;
import defpackage.cwdm;
import defpackage.cweh;
import defpackage.cwgi;
import defpackage.cwgj;
import defpackage.cwgk;
import defpackage.cwgm;
import defpackage.cwgx;
import defpackage.cwhd;
import defpackage.cwhe;
import defpackage.cwhi;
import defpackage.dnnr;
import defpackage.dvoa;
import defpackage.egkp;
import defpackage.eijr;
import defpackage.epob;
import defpackage.fift;
import defpackage.fifw;
import defpackage.figf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class HeterodyneSyncTaskChimeraService extends GmsTaskChimeraService {
    public Context a;
    cwcr b;
    public cwgi c;
    private cwbr f;
    private cwbr h;
    private cwal i;
    private PackageManager j;
    private aqup k;
    private asnv l;
    private static final asot e = asot.e(asej.PHENOTYPE);
    public static final cwgk d = new Object() { // from class: cwgk
    };

    public HeterodyneSyncTaskChimeraService() {
    }

    public static /* synthetic */ cwgx e(Context context) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = new HeterodyneSyncTaskChimeraService();
        heterodyneSyncTaskChimeraService.f(context);
        return heterodyneSyncTaskChimeraService.c;
    }

    private final long g() {
        try {
            cwbr cwbrVar = this.f;
            return cwbrVar.f.getDatabasePath(cwbrVar.g).length();
        } catch (SQLiteException e2) {
            cwdm.k(this.a, e2, figf.PHENOTYPE_SCHEDULE_TASK);
            return 0L;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        fift fiftVar = (fift) fifw.a.v();
        Bundle bundle = bylnVar.b;
        final epob b = bundle == null ? epob.UNSPECIFIED : epob.b(bundle.getInt("fetchReason"));
        if (b == null) {
            b = epob.UNSPECIFIED;
        }
        String string = bundle == null ? null : bundle.getString("fetchPackage");
        if (((Boolean) bxbl.b.a()).booleanValue()) {
            final String str = bylnVar.a;
            final bxbl a = bxbl.a();
            egkp k = a.c.k("syncTaskExecuted");
            try {
                a.h(new Runnable() { // from class: bxbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        fecj m = bxbl.m(9);
                        if (!m.b.L()) {
                            m.U();
                        }
                        String str2 = str;
                        encv encvVar = (encv) m.b;
                        encv encvVar2 = encv.a;
                        encvVar.b |= 16;
                        encvVar.g = str2;
                        if (!m.b.L()) {
                            m.U();
                        }
                        bxbl bxblVar = bxbl.this;
                        epob epobVar = b;
                        encv encvVar3 = (encv) m.b;
                        encvVar3.h = epobVar.x;
                        encvVar3.b |= 32;
                        bxblVar.l(m);
                    }
                });
                if (k != null) {
                    k.close();
                }
            } catch (Throwable th) {
                if (k != null) {
                    try {
                        k.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        String str2 = bylnVar.a;
        if (str2.equals("PhenotypePeriodicSync") && !dnnr.h(this.a)) {
            this.f.g();
            cwbr cwbrVar = this.h;
            if (cwbrVar != null) {
                cwbrVar.g();
            }
        }
        int d2 = d(b, string, fiftVar, str2);
        if (cwbr.i() && str2.equals("PhenotypePeriodicSync") && !dnnr.h(this.a)) {
            this.f.h();
            cwbr cwbrVar2 = this.h;
            if (cwbrVar2 != null) {
                cwbrVar2.h();
            }
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x029e, code lost:
    
        if (((java.lang.Boolean) defpackage.bxbl.b.a()).booleanValue() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a0, code lost:
    
        defpackage.bxbl.a().e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0514, code lost:
    
        r20.b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0519, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0510, code lost:
    
        if (((java.lang.Boolean) defpackage.bxbl.b.a()).booleanValue() == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0419, code lost:
    
        if (((java.lang.Boolean) defpackage.bxbl.b.a()).booleanValue() == false) goto L233;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0434 A[Catch: all -> 0x02c9, TryCatch #23 {all -> 0x02c9, blocks: (B:88:0x01d1, B:198:0x030c, B:200:0x0314, B:201:0x0317, B:202:0x0323, B:168:0x032e, B:170:0x0341, B:171:0x0344, B:138:0x0427, B:140:0x0434, B:141:0x0437, B:126:0x02c8, B:125:0x02c5), top: B:35:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0341 A[Catch: all -> 0x02c9, TryCatch #23 {all -> 0x02c9, blocks: (B:88:0x01d1, B:198:0x030c, B:200:0x0314, B:201:0x0317, B:202:0x0323, B:168:0x032e, B:170:0x0341, B:171:0x0344, B:138:0x0427, B:140:0x0434, B:141:0x0437, B:126:0x02c8, B:125:0x02c5), top: B:35:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0314 A[Catch: all -> 0x02c9, TryCatch #23 {all -> 0x02c9, blocks: (B:88:0x01d1, B:198:0x030c, B:200:0x0314, B:201:0x0317, B:202:0x0323, B:168:0x032e, B:170:0x0341, B:171:0x0344, B:138:0x0427, B:140:0x0434, B:141:0x0437, B:126:0x02c8, B:125:0x02c5), top: B:35:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e8  */
    /* JADX WARN: Type inference failed for: r10v23, types: [cwdm, cwey] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.epob r21, java.lang.String r22, defpackage.fift r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService.d(epob, java.lang.String, fift, java.lang.String):int");
    }

    public final void f(Context context) {
        this.a = context;
        this.f = cwbo.b(context);
        int i = cweh.b;
        if (dnnr.j()) {
            this.h = cwbo.a(context);
        }
        aqxd aqxdVar = cvzk.a;
        this.i = new cwal(context);
        this.b = new cwcr(this.i, context);
        this.j = context.getPackageManager();
        this.k = aqup.d(context);
        this.l = asnz.a;
        cwbr cwbrVar = this.f;
        cwbr cwbrVar2 = this.h;
        Context context2 = this.a;
        this.c = new cwgi(context, cwbrVar, cwbrVar2, new cwhe(context2, cwgx.o(context2), new eijr() { // from class: cwgl
            @Override // defpackage.eijr
            public final Object a() {
                return bybx.a(HeterodyneSyncTaskChimeraService.this.a);
            }
        }), new cwgm(context));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        cwgj.c(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        f(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        this.f.close();
        cwbr cwbrVar = this.h;
        if (cwbrVar != null) {
            cwbrVar.close();
        }
        super.onDestroy();
    }

    public HeterodyneSyncTaskChimeraService(cwbr cwbrVar, cwbr cwbrVar2, dvoa dvoaVar, Context context, cwal cwalVar, PackageManager packageManager, aqup aqupVar, asnv asnvVar) {
        this(cwbrVar, cwbrVar2, dvoaVar, context, cwalVar, packageManager, aqupVar, asnvVar, new cwhd());
    }

    public HeterodyneSyncTaskChimeraService(cwbr cwbrVar, cwbr cwbrVar2, dvoa dvoaVar, Context context, cwal cwalVar, PackageManager packageManager, aqup aqupVar, asnv asnvVar, cwhi cwhiVar) {
        this.f = cwbrVar;
        this.h = cwbrVar2;
        this.a = context;
        this.i = cwalVar;
        this.j = packageManager;
        this.k = aqupVar;
        this.l = asnvVar;
        this.b = new cwcr(cwalVar, context);
        this.c = new cwgi(context, cwbrVar, cwbrVar2, cwhiVar, dvoaVar);
    }
}
