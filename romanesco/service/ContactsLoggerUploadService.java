package com.google.android.gms.romanesco.service;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.bywx;
import defpackage.byxt;
import defpackage.byxu;
import defpackage.byyj;
import defpackage.cxkw;
import defpackage.cxln;
import defpackage.cxoo;
import defpackage.cxpk;
import defpackage.cxqg;
import defpackage.drbi;
import defpackage.drbl;
import defpackage.drbo;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiih;
import defpackage.eiir;
import defpackage.ejhf;
import defpackage.elbs;
import defpackage.elbu;
import defpackage.elbv;
import defpackage.elcc;
import defpackage.enpf;
import defpackage.enre;
import defpackage.enss;
import defpackage.fecj;
import defpackage.fgli;
import defpackage.frrw;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsLoggerUploadService extends GmsTaskChimeraService {
    public static final asot a = asot.b("DCU_ContactsLogService", asej.ROMANESCO);
    public final cxqg b;
    public final eiih c;
    public final fecj d;

    public ContactsLoggerUploadService() {
        this.d = elcc.a.v();
        this.c = new eiih() { // from class: cxqe
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                return cxmf.a(new cxoo(ContactsLoggerUploadService.this.getApplicationContext()), (cxme) obj);
            }
        };
        this.b = new cxqg() { // from class: cxqf
            @Override // defpackage.cxqg
            public final cxmn a(Context context, fecj fecjVar, String str, boolean z, long j) {
                asot asotVar = cxmn.a;
                cxmk cxmkVar = new cxmk(context.getContentResolver());
                cxmv cxmvVar = new cxmv(context, cxmkVar, new cxiw(context), new cxmw(context, str, new cxma(context), new cxoo(context), cxjc.a(context), new cxiw(context)), new cxjd(context));
                asot asotVar2 = cxlo.a;
                return new cxmn(context, fecjVar, str, z, j, cxmkVar, cxmvVar);
            }
        };
    }

    private final int e(cxln cxlnVar, drbi drbiVar) {
        bywx l = cxlnVar.a.l((fgli) drbiVar.a);
        drbo drboVar = new drbo() { // from class: cxqc
            /* JADX WARN: Can't wrap try/catch for region: R(10:(24:32|33|34|35|(5:40|41|42|(2:44|45)(2:47|48)|46)|49|50|51|52|53|54|55|56|57|58|59|60|61|(10:63|64|65|66|(1:68)(6:172|173|174|175|(3:(4:179|180|181|177)|182|183)(1:185)|184)|69|(8:153|154|(1:156)|157|(1:159)|160|(1:162)|163)(1:71)|(1:(2:74|75)(1:77))|78|(8:142|(1:144)|145|146|(1:148)|149|(1:151)|152)(6:83|(7:85|(1:87)|88|(1:90)|91|(1:93)|94)(1:141)|(12:96|97|98|(1:100)|101|102|103|104|105|106|107|108)(1:140)|(10:112|113|(1:115)|116|117|118|119|120|121|122)(1:110)|111|75))(2:191|192)|76|41|42|(0)(0)|46)|59|60|61|(0)(0)|76|41|42|(0)(0)|46) */
            /* JADX WARN: Can't wrap try/catch for region: R(14:21|(6:22|23|24|25|26|27)|(10:(24:32|33|34|35|(5:40|41|42|(2:44|45)(2:47|48)|46)|49|50|51|52|53|54|55|56|57|58|59|60|61|(10:63|64|65|66|(1:68)(6:172|173|174|175|(3:(4:179|180|181|177)|182|183)(1:185)|184)|69|(8:153|154|(1:156)|157|(1:159)|160|(1:162)|163)(1:71)|(1:(2:74|75)(1:77))|78|(8:142|(1:144)|145|146|(1:148)|149|(1:151)|152)(6:83|(7:85|(1:87)|88|(1:90)|91|(1:93)|94)(1:141)|(12:96|97|98|(1:100)|101|102|103|104|105|106|107|108)(1:140)|(10:112|113|(1:115)|116|117|118|119|120|121|122)(1:110)|111|75))(2:191|192)|76|41|42|(0)(0)|46)|59|60|61|(0)(0)|76|41|42|(0)(0)|46)|217|50|51|52|53|54|55|56|57|58|19) */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x0192, code lost:
            
                r13 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x0532, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x0533, code lost:
            
                r19 = r2;
                r17 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x0538, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x053e, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x053f, code lost:
            
                r19 = r2;
                r17 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x0546, code lost:
            
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
            /* JADX WARN: Type inference failed for: r15v0, types: [cxqg] */
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
            @Override // defpackage.drbo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.enss a(defpackage.drgn r39) {
                /*
                    Method dump skipped, instructions count: 1443
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cxqc.a(drgn):enss");
            }
        };
        int i = drbiVar.b;
        enss c = l.c(drboVar, i, enre.a);
        eiho eihoVar = new eiho() { // from class: cxqd
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = ContactsLoggerUploadService.a;
                return 0;
            }
        };
        byxu a2 = ((byxt) l.b).a();
        int a3 = byyj.a(a2 != null ? a2.b(i) : null, c, eihoVar);
        l.a.a();
        return a3;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        cxln b = cxln.b(getApplicationContext());
        drbi a2 = b.a().a(bylnVar.a);
        eiid a3 = cxpk.a(getApplicationContext());
        elbs elbsVar = (elbs) elbv.a.v();
        int ordinal = ((fgli) a2.a).ordinal();
        if (ordinal == 1) {
            if (!elbsVar.b.L()) {
                elbsVar.U();
            }
            ((elbv) elbsVar.b).d = elbu.a(3);
            elbsVar.a(6);
            eiid b2 = cxkw.b(bylnVar.b);
            if (b2.h()) {
                int i = ((cxkw) b2.c()).a;
                if (!elbsVar.b.L()) {
                    elbsVar.U();
                }
                elbv elbvVar = (elbv) elbsVar.b;
                elbvVar.b |= 256;
                elbvVar.m = i;
                long currentTimeMillis = System.currentTimeMillis() - ((cxkw) b2.c()).b;
                if (!elbsVar.b.L()) {
                    elbsVar.U();
                }
                elbv elbvVar2 = (elbv) elbsVar.b;
                elbvVar2.b |= 512;
                elbvVar2.n = currentTimeMillis;
            }
            fecj fecjVar = this.d;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            elcc elccVar = (elcc) fecjVar.b;
            elbv elbvVar3 = (elbv) elbsVar.Q();
            elcc elccVar2 = elcc.a;
            elbvVar3.getClass();
            elccVar.s = elbvVar3;
            elccVar.b |= 32768;
            ((cxpk) ((eiir) a3).a).c();
            return e(b, a2);
        }
        if (ordinal != 2 && ordinal != 3) {
            ((ejhf) ((ejhf) a.j()).ah((char) 9247)).x("Ignoring task with unknown tag");
            return 2;
        }
        if (!elbsVar.b.L()) {
            elbsVar.U();
        }
        ((elbv) elbsVar.b).d = elbu.a(5);
        elbsVar.a(6);
        eiid b3 = cxkw.b(bylnVar.b);
        if (b3.h()) {
            int i2 = ((cxkw) b3.c()).a;
            if (!elbsVar.b.L()) {
                elbsVar.U();
            }
            elbv elbvVar4 = (elbv) elbsVar.b;
            elbvVar4.b |= 256;
            elbvVar4.m = i2;
            long currentTimeMillis2 = System.currentTimeMillis() - ((cxkw) b3.c()).b;
            if (!elbsVar.b.L()) {
                elbsVar.U();
            }
            elbv elbvVar5 = (elbv) elbsVar.b;
            elbvVar5.b |= 512;
            elbvVar5.n = currentTimeMillis2;
        }
        fecj fecjVar2 = this.d;
        if (!fecjVar2.b.L()) {
            fecjVar2.U();
        }
        elcc elccVar3 = (elcc) fecjVar2.b;
        elbv elbvVar6 = (elbv) elbsVar.Q();
        elcc elccVar4 = elcc.a;
        elbvVar6.getClass();
        elccVar3.s = elbvVar6;
        elccVar3.b |= 32768;
        ((cxpk) ((eiir) a3).a).c();
        int e = e(b, a2);
        if (e != 0) {
            return e;
        }
        try {
            ((enpf) b.a.l(fgli.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL).b(new drbl() { // from class: cxqb
                @Override // defpackage.drbl
                public final enss a() {
                    asot asotVar = ContactsLoggerUploadService.a;
                    return ensj.i(null);
                }
            }, 1, enre.a)).u();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e2)).ah((char) 9249)).x("Interrupted");
        } catch (ExecutionException e3) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e3)).ah((char) 9250)).x("Failed to mark incremental upload successful");
        }
        return 0;
    }

    public final boolean d(String str) {
        if (!frrw.a.a().b()) {
            return false;
        }
        cxoo cxooVar = new cxoo(getApplicationContext());
        try {
            if (frrw.a.a().a()) {
                return ((Boolean) ((enpf) cxooVar.c().a(new Account(str, "com.google")).i(4)).u()).booleanValue();
            }
            return true;
        } catch (InterruptedException | ExecutionException e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 9244)).x("Exception while checking isSwaaOptedIn.");
            return false;
        }
    }

    ContactsLoggerUploadService(eiih eiihVar, cxqg cxqgVar) {
        this.d = elcc.a.v();
        this.c = eiihVar;
        this.b = cxqgVar;
    }
}
