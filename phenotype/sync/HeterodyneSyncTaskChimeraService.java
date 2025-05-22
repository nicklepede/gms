package com.google.android.gms.phenotype.sync;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import defpackage.asxe;
import defpackage.aszs;
import defpackage.auid;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.ausn;
import defpackage.bzkb;
import defpackage.cauf;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.cyll;
import defpackage.cylo;
import defpackage.cymo;
import defpackage.cynj;
import defpackage.cyoe;
import defpackage.cyqf;
import defpackage.cyqg;
import defpackage.cyqh;
import defpackage.cyqj;
import defpackage.cyqu;
import defpackage.cyra;
import defpackage.cyrb;
import defpackage.cyrf;
import defpackage.dpya;
import defpackage.dxza;
import defpackage.eixs;
import defpackage.ekww;
import defpackage.esca;
import defpackage.fkvq;
import defpackage.fkvt;
import defpackage.fkwc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class HeterodyneSyncTaskChimeraService extends GmsTaskChimeraService {
    public Context a;
    cymo b;
    public cyqf c;
    private cylo f;
    private cylo h;
    private cyki i;
    private PackageManager j;
    private asxe k;
    private aurp l;
    private static final ausn e = ausn.e(auid.PHENOTYPE);
    public static final cyqh d = new Object() { // from class: cyqh
    };

    public HeterodyneSyncTaskChimeraService() {
    }

    public static /* synthetic */ cyqu e(Context context) {
        HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService = new HeterodyneSyncTaskChimeraService();
        heterodyneSyncTaskChimeraService.f(context);
        return heterodyneSyncTaskChimeraService.c;
    }

    private final long g() {
        try {
            cylo cyloVar = this.f;
            return cyloVar.f.getDatabasePath(cyloVar.g).length();
        } catch (SQLiteException e2) {
            cynj.k(this.a, e2, fkwc.PHENOTYPE_SCHEDULE_TASK);
            return 0L;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        fkvq fkvqVar = (fkvq) fkvt.a.v();
        Bundle bundle = caufVar.b;
        final esca b = bundle == null ? esca.UNSPECIFIED : esca.b(bundle.getInt("fetchReason"));
        if (b == null) {
            b = esca.UNSPECIFIED;
        }
        String string = bundle == null ? null : bundle.getString("fetchPackage");
        if (((Boolean) bzkb.b.lK()).booleanValue()) {
            final String str = caufVar.a;
            final bzkb a = bzkb.a();
            eixs k = a.c.k("syncTaskExecuted");
            try {
                a.h(new Runnable() { // from class: bzjr
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgrc m = bzkb.m(9);
                        if (!m.b.L()) {
                            m.U();
                        }
                        String str2 = str;
                        epqm epqmVar = (epqm) m.b;
                        epqm epqmVar2 = epqm.a;
                        epqmVar.b |= 16;
                        epqmVar.g = str2;
                        if (!m.b.L()) {
                            m.U();
                        }
                        bzkb bzkbVar = bzkb.this;
                        esca escaVar = b;
                        epqm epqmVar3 = (epqm) m.b;
                        epqmVar3.h = escaVar.x;
                        epqmVar3.b |= 32;
                        bzkbVar.l(m);
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
        String str2 = caufVar.a;
        if (str2.equals("PhenotypePeriodicSync") && !dpya.h(this.a)) {
            this.f.g();
            cylo cyloVar = this.h;
            if (cyloVar != null) {
                cyloVar.g();
            }
        }
        int d2 = d(b, string, fkvqVar, str2);
        if (cylo.i() && str2.equals("PhenotypePeriodicSync") && !dpya.h(this.a)) {
            this.f.h();
            cylo cyloVar2 = this.h;
            if (cyloVar2 != null) {
                cyloVar2.h();
            }
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x029e, code lost:
    
        if (((java.lang.Boolean) defpackage.bzkb.b.lK()).booleanValue() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a0, code lost:
    
        defpackage.bzkb.a().e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0514, code lost:
    
        r20.b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0519, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0510, code lost:
    
        if (((java.lang.Boolean) defpackage.bzkb.b.lK()).booleanValue() == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0419, code lost:
    
        if (((java.lang.Boolean) defpackage.bzkb.b.lK()).booleanValue() == false) goto L233;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0434 A[Catch: all -> 0x02c9, TryCatch #22 {all -> 0x02c9, blocks: (B:88:0x01d1, B:198:0x030c, B:200:0x0314, B:201:0x0317, B:202:0x0323, B:168:0x032e, B:170:0x0341, B:171:0x0344, B:138:0x0427, B:140:0x0434, B:141:0x0437, B:126:0x02c8, B:125:0x02c5), top: B:35:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0341 A[Catch: all -> 0x02c9, TryCatch #22 {all -> 0x02c9, blocks: (B:88:0x01d1, B:198:0x030c, B:200:0x0314, B:201:0x0317, B:202:0x0323, B:168:0x032e, B:170:0x0341, B:171:0x0344, B:138:0x0427, B:140:0x0434, B:141:0x0437, B:126:0x02c8, B:125:0x02c5), top: B:35:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0314 A[Catch: all -> 0x02c9, TryCatch #22 {all -> 0x02c9, blocks: (B:88:0x01d1, B:198:0x030c, B:200:0x0314, B:201:0x0317, B:202:0x0323, B:168:0x032e, B:170:0x0341, B:171:0x0344, B:138:0x0427, B:140:0x0434, B:141:0x0437, B:126:0x02c8, B:125:0x02c5), top: B:35:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e8  */
    /* JADX WARN: Type inference failed for: r10v23, types: [cynj, cyov] */
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
    public final int d(defpackage.esca r21, java.lang.String r22, defpackage.fkvq r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService.d(esca, java.lang.String, fkvq, java.lang.String):int");
    }

    public final void f(Context context) {
        this.a = context;
        this.f = cyll.b(context);
        int i = cyoe.b;
        if (dpya.j()) {
            this.h = cyll.a(context);
        }
        aszs aszsVar = cyjh.a;
        this.i = new cyki(context);
        this.b = new cymo(this.i, context);
        this.j = context.getPackageManager();
        this.k = asxe.d(context);
        this.l = aurt.a;
        cylo cyloVar = this.f;
        cylo cyloVar2 = this.h;
        Context context2 = this.a;
        this.c = new cyqf(context, cyloVar, cyloVar2, new cyrb(context2, cyqu.o(context2), new ekww() { // from class: cyqi
            @Override // defpackage.ekww
            public final Object lK() {
                return cakp.a(HeterodyneSyncTaskChimeraService.this.a);
            }
        }), new cyqj(context));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        cyqg.c(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        f(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        this.f.close();
        cylo cyloVar = this.h;
        if (cyloVar != null) {
            cyloVar.close();
        }
        super.onDestroy();
    }

    public HeterodyneSyncTaskChimeraService(cylo cyloVar, cylo cyloVar2, dxza dxzaVar, Context context, cyki cykiVar, PackageManager packageManager, asxe asxeVar, aurp aurpVar) {
        this(cyloVar, cyloVar2, dxzaVar, context, cykiVar, packageManager, asxeVar, aurpVar, new cyra());
    }

    public HeterodyneSyncTaskChimeraService(cylo cyloVar, cylo cyloVar2, dxza dxzaVar, Context context, cyki cykiVar, PackageManager packageManager, asxe asxeVar, aurp aurpVar, cyrf cyrfVar) {
        this.f = cyloVar;
        this.h = cyloVar2;
        this.a = context;
        this.i = cykiVar;
        this.j = packageManager;
        this.k = asxeVar;
        this.l = aurpVar;
        this.b = new cymo(cykiVar, context);
        this.c = new cyqf(context, cyloVar, cyloVar2, cyrfVar, dxzaVar);
    }
}
