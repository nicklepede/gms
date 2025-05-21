package com.google.android.gms.phenotype.sync;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxbl;
import defpackage.byjl;
import defpackage.byll;
import defpackage.egkp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PackageUpdateTaskChimeraService extends GmsTaskChimeraService {
    public static final asot a = asot.e(asej.PHENOTYPE);
    private static final Long b = -1L;

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a5, code lost:
    
        if (r2.p < defpackage.frmf.a.a().b()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if (r2.p < defpackage.frmf.a.a().a()) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r21, java.util.Set r22, java.util.Map r23, defpackage.epob r24) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.d(android.content.Context, java.util.Set, java.util.Map, epob):void");
    }

    public static void e(Context context, byll byllVar) {
        byjl.a(context).f(byllVar);
        if (((Boolean) bxbl.b.a()).booleanValue()) {
            bxbl a2 = bxbl.a();
            egkp k = a2.c.k("broadcastTaskScheduled");
            try {
                a2.j(11, byllVar.j);
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x017b, code lost:
    
        if (r19.equals(r7.a(r17)) != false) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026f A[Catch: all -> 0x02cd, TryCatch #17 {all -> 0x02cd, blocks: (B:105:0x01b4, B:115:0x0264, B:117:0x026f, B:118:0x0272, B:179:0x023d, B:181:0x0250, B:182:0x0253, B:183:0x025f, B:171:0x0230, B:170:0x022d), top: B:25:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0250 A[Catch: all -> 0x02cd, TryCatch #17 {all -> 0x02cd, blocks: (B:105:0x01b4, B:115:0x0264, B:117:0x026f, B:118:0x0272, B:179:0x023d, B:181:0x0250, B:182:0x0253, B:183:0x025f, B:171:0x0230, B:170:0x022d), top: B:25:0x0064 }] */
    /* JADX WARN: Type inference failed for: r21v0, types: [byln] */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16, types: [int] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [int] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r21) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.sync.PackageUpdateTaskChimeraService.a(byln):int");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
    }
}
