package com.google.android.gms.romanesco.service;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cbfo;
import defpackage.cbgk;
import defpackage.cbgl;
import defpackage.cbha;
import defpackage.czus;
import defpackage.czvj;
import defpackage.czyl;
import defpackage.czzh;
import defpackage.daad;
import defpackage.dtlq;
import defpackage.dtlt;
import defpackage.dtlw;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvm;
import defpackage.ekvw;
import defpackage.eluo;
import defpackage.enpf;
import defpackage.enph;
import defpackage.enpi;
import defpackage.enpp;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.eqgl;
import defpackage.fgrc;
import defpackage.fjag;
import defpackage.fumj;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsLoggerUploadService extends GmsTaskChimeraService {
    public static final ausn a = ausn.b("DCU_ContactsLogService", auid.ROMANESCO);
    public final daad b;
    public final ekvm c;
    public final fgrc d;

    public ContactsLoggerUploadService() {
        this.d = enpp.a.v();
        this.c = new ekvm() { // from class: daab
            @Override // defpackage.ekvm
            public final boolean a(Object obj) {
                return czwb.a(new czyl(ContactsLoggerUploadService.this.getApplicationContext()), (czwa) obj);
            }
        };
        this.b = new daad() { // from class: daac
            @Override // defpackage.daad
            public final czwj a(Context context, fgrc fgrcVar, String str, boolean z, long j) {
                ausn ausnVar = czwj.a;
                czwg czwgVar = new czwg(context.getContentResolver());
                czwr czwrVar = new czwr(context, czwgVar, new czss(context), new czws(context, str, new czvw(context), new czyl(context), czsy.a(context), new czss(context)), new czsz(context));
                ausn ausnVar2 = czvk.a;
                return new czwj(context, fgrcVar, str, z, j, czwgVar, czwrVar);
            }
        };
    }

    private final int e(czvj czvjVar, dtlq dtlqVar) {
        cbfo l = czvjVar.a.l((fjag) dtlqVar.a);
        dtlw dtlwVar = new dtlw() { // from class: czzz
            /* JADX WARN: Can't wrap try/catch for region: R(10:(24:32|33|34|35|(5:40|41|42|(2:44|45)(2:47|48)|46)|49|50|51|52|53|54|55|56|57|58|59|60|61|(10:63|64|65|66|(1:68)(6:172|173|174|175|(3:(4:179|180|181|177)|182|183)(1:185)|184)|69|(8:153|154|(1:156)|157|(1:159)|160|(1:162)|163)(1:71)|(1:(2:74|75)(1:77))|78|(8:142|(1:144)|145|146|(1:148)|149|(1:151)|152)(6:83|(7:85|(1:87)|88|(1:90)|91|(1:93)|94)(1:141)|(12:96|97|98|(1:100)|101|102|103|104|105|106|107|108)(1:140)|(10:112|113|(1:115)|116|117|118|119|120|121|122)(1:110)|111|75))(2:191|192)|76|41|42|(0)(0)|46)|59|60|61|(0)(0)|76|41|42|(0)(0)|46) */
            /* JADX WARN: Can't wrap try/catch for region: R(14:21|(6:22|23|24|25|26|27)|(10:(24:32|33|34|35|(5:40|41|42|(2:44|45)(2:47|48)|46)|49|50|51|52|53|54|55|56|57|58|59|60|61|(10:63|64|65|66|(1:68)(6:172|173|174|175|(3:(4:179|180|181|177)|182|183)(1:185)|184)|69|(8:153|154|(1:156)|157|(1:159)|160|(1:162)|163)(1:71)|(1:(2:74|75)(1:77))|78|(8:142|(1:144)|145|146|(1:148)|149|(1:151)|152)(6:83|(7:85|(1:87)|88|(1:90)|91|(1:93)|94)(1:141)|(12:96|97|98|(1:100)|101|102|103|104|105|106|107|108)(1:140)|(10:112|113|(1:115)|116|117|118|119|120|121|122)(1:110)|111|75))(2:191|192)|76|41|42|(0)(0)|46)|59|60|61|(0)(0)|76|41|42|(0)(0)|46)|217|50|51|52|53|54|55|56|57|58|19) */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x0192, code lost:
            
                r13 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x0530, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x0533, code lost:
            
                r19 = r2;
                r17 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x0538, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x053c, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x053f, code lost:
            
                r19 = r2;
                r17 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x0544, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x0547, code lost:
            
                r19 = r2;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:169:0x054e  */
            /* JADX WARN: Removed duplicated region for block: B:191:0x051f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:200:0x057d  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x0585  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0558  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0562  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r13v10 */
            /* JADX WARN: Type inference failed for: r13v11 */
            /* JADX WARN: Type inference failed for: r13v32 */
            /* JADX WARN: Type inference failed for: r13v33 */
            /* JADX WARN: Type inference failed for: r13v38 */
            /* JADX WARN: Type inference failed for: r13v4 */
            /* JADX WARN: Type inference failed for: r13v5 */
            /* JADX WARN: Type inference failed for: r13v7 */
            /* JADX WARN: Type inference failed for: r13v8 */
            /* JADX WARN: Type inference failed for: r13v9, types: [long] */
            /* JADX WARN: Type inference failed for: r15v0, types: [daad] */
            /* JADX WARN: Type inference failed for: r19v0 */
            /* JADX WARN: Type inference failed for: r19v1 */
            /* JADX WARN: Type inference failed for: r19v2 */
            /* JADX WARN: Type inference failed for: r19v29 */
            /* JADX WARN: Type inference failed for: r19v3, types: [boolean] */
            /* JADX WARN: Type inference failed for: r19v30 */
            /* JADX WARN: Type inference failed for: r19v4 */
            /* JADX WARN: Type inference failed for: r19v5 */
            /* JADX WARN: Type inference failed for: r19v6 */
            /* JADX WARN: Type inference failed for: r19v7 */
            /* JADX WARN: Type inference failed for: r19v8 */
            @Override // defpackage.dtlw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.eqgl a(defpackage.dtqv r39) {
                /*
                    Method dump skipped, instructions count: 1443
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.czzz.a(dtqv):eqgl");
            }
        };
        int i = dtlqVar.b;
        eqgl c = l.c(dtlwVar, i, eqex.a);
        ekut ekutVar = new ekut() { // from class: daaa
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = ContactsLoggerUploadService.a;
                return 0;
            }
        };
        cbgl lK = ((cbgk) l.b).lK();
        int a2 = cbha.a(lK != null ? lK.b(i) : null, c, ekutVar);
        l.a.a();
        return a2;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        czvj b = czvj.b(getApplicationContext());
        dtlq a2 = b.a().a(caufVar.a);
        ekvi a3 = czzh.a(getApplicationContext());
        enpf enpfVar = (enpf) enpi.a.v();
        int ordinal = ((fjag) a2.a).ordinal();
        if (ordinal == 1) {
            if (!enpfVar.b.L()) {
                enpfVar.U();
            }
            ((enpi) enpfVar.b).d = enph.a(3);
            enpfVar.a(6);
            ekvi b2 = czus.b(caufVar.b);
            if (b2.h()) {
                int i = ((czus) b2.c()).a;
                if (!enpfVar.b.L()) {
                    enpfVar.U();
                }
                enpi enpiVar = (enpi) enpfVar.b;
                enpiVar.b |= 256;
                enpiVar.m = i;
                long currentTimeMillis = System.currentTimeMillis() - ((czus) b2.c()).b;
                if (!enpfVar.b.L()) {
                    enpfVar.U();
                }
                enpi enpiVar2 = (enpi) enpfVar.b;
                enpiVar2.b |= 512;
                enpiVar2.n = currentTimeMillis;
            }
            fgrc fgrcVar = this.d;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enpp enppVar = (enpp) fgrcVar.b;
            enpi enpiVar3 = (enpi) enpfVar.Q();
            enpp enppVar2 = enpp.a;
            enpiVar3.getClass();
            enppVar.s = enpiVar3;
            enppVar.b |= 32768;
            ((czzh) ((ekvw) a3).a).c();
            return e(b, a2);
        }
        if (ordinal != 2 && ordinal != 3) {
            ((eluo) ((eluo) a.j()).ai((char) 9249)).x("Ignoring task with unknown tag");
            return 2;
        }
        if (!enpfVar.b.L()) {
            enpfVar.U();
        }
        ((enpi) enpfVar.b).d = enph.a(5);
        enpfVar.a(6);
        ekvi b3 = czus.b(caufVar.b);
        if (b3.h()) {
            int i2 = ((czus) b3.c()).a;
            if (!enpfVar.b.L()) {
                enpfVar.U();
            }
            enpi enpiVar4 = (enpi) enpfVar.b;
            enpiVar4.b |= 256;
            enpiVar4.m = i2;
            long currentTimeMillis2 = System.currentTimeMillis() - ((czus) b3.c()).b;
            if (!enpfVar.b.L()) {
                enpfVar.U();
            }
            enpi enpiVar5 = (enpi) enpfVar.b;
            enpiVar5.b |= 512;
            enpiVar5.n = currentTimeMillis2;
        }
        fgrc fgrcVar2 = this.d;
        if (!fgrcVar2.b.L()) {
            fgrcVar2.U();
        }
        enpp enppVar3 = (enpp) fgrcVar2.b;
        enpi enpiVar6 = (enpi) enpfVar.Q();
        enpp enppVar4 = enpp.a;
        enpiVar6.getClass();
        enppVar3.s = enpiVar6;
        enppVar3.b |= 32768;
        ((czzh) ((ekvw) a3).a).c();
        int e = e(b, a2);
        if (e != 0) {
            return e;
        }
        try {
            ((eqcy) b.a.l(fjag.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL).b(new dtlt() { // from class: czzy
                @Override // defpackage.dtlt
                public final eqgl a() {
                    ausn ausnVar = ContactsLoggerUploadService.a;
                    return eqgc.i(null);
                }
            }, 1, eqex.a)).u();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((eluo) ((eluo) ((eluo) a.i()).s(e2)).ai((char) 9251)).x("Interrupted");
        } catch (ExecutionException e3) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e3)).ai((char) 9252)).x("Failed to mark incremental upload successful");
        }
        return 0;
    }

    public final boolean d(String str) {
        fumj fumjVar = fumj.a;
        if (!fumjVar.lK().b()) {
            return false;
        }
        czyl czylVar = new czyl(getApplicationContext());
        try {
            if (fumjVar.lK().a()) {
                return ((Boolean) ((eqcy) czylVar.c().a(new Account(str, "com.google")).i(4)).u()).booleanValue();
            }
            return true;
        } catch (InterruptedException | ExecutionException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 9246)).x("Exception while checking isSwaaOptedIn.");
            return false;
        }
    }

    ContactsLoggerUploadService(ekvm ekvmVar, daad daadVar) {
        this.d = enpp.a.v();
        this.c = ekvmVar;
        this.b = daadVar;
    }
}
