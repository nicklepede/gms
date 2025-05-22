package com.google.android.gms.people.service.cpg;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catg;
import defpackage.cvts;
import defpackage.ekwr;
import defpackage.eluo;
import defpackage.enkb;
import defpackage.enkf;
import defpackage.fgqi;
import defpackage.fgvn;
import defpackage.fttd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ActionPreferenceCleanupTask extends GmsTaskBoundService {
    private static final ausn a = ausn.b("ActionPreferenceCleanup", auid.PEOPLE);

    public static void d(casd casdVar) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 8319)).x("Initializing the service.");
        fttd fttdVar = fttd.a;
        if (!fttdVar.lK().A() || !fttd.h()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 8318)).x("Canceling the service.");
            casdVar.d("ActionPreferenceCleanupTask.Periodic", ActionPreferenceCleanupTask.class.getName());
            return;
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 8320)).x("Scheduling the service.");
        catg catgVar = new catg();
        catgVar.w(ActionPreferenceCleanupTask.class.getName());
        catgVar.t("ActionPreferenceCleanupTask.Periodic");
        catgVar.v(2);
        catgVar.l(false);
        catgVar.m((int) fttdVar.lK().f());
        casdVar.f(catgVar.b());
    }

    static void e(enkb enkbVar, int i, ekwr ekwrVar) {
        if (!enkbVar.b.L()) {
            enkbVar.U();
        }
        enkf enkfVar = (enkf) enkbVar.b;
        enkf enkfVar2 = enkf.a;
        enkfVar.d = i - 1;
        enkfVar.b |= 2;
        if (ekwrVar.a) {
            ekwrVar.g();
            fgqi a2 = fgvn.a(ekwrVar.d());
            if (!enkbVar.b.L()) {
                enkbVar.U();
            }
            enkf enkfVar3 = (enkf) enkbVar.b;
            a2.getClass();
            enkfVar3.k = a2;
            enkfVar3.b |= 64;
        }
        cvts.a().c((enkf) enkbVar.Q());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x02cf A[Catch: ExecutionException -> 0x02e0, InterruptedException -> 0x0306, TRY_ENTER, TRY_LEAVE, TryCatch #8 {InterruptedException -> 0x0306, ExecutionException -> 0x02e0, blocks: (B:11:0x007f, B:29:0x02cf, B:124:0x02df, B:123:0x02dc), top: B:10:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0355 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a9 A[Catch: all -> 0x02d3, TryCatch #1 {all -> 0x02d3, blocks: (B:13:0x0089, B:15:0x00a4, B:16:0x00a7, B:18:0x011f, B:20:0x0132, B:21:0x0135, B:23:0x0148, B:24:0x014b, B:26:0x015e, B:27:0x0161, B:43:0x016e, B:65:0x01c2, B:66:0x01c5, B:68:0x01cb, B:70:0x01de, B:71:0x01e1, B:73:0x01f4, B:74:0x01f7, B:76:0x020a, B:77:0x020d, B:78:0x021a, B:80:0x0220, B:82:0x023c, B:84:0x0253, B:85:0x0256, B:87:0x0269, B:88:0x026c, B:90:0x027f, B:91:0x0282, B:92:0x0296, B:94:0x02a9, B:95:0x02ac, B:97:0x02bf, B:98:0x02c2, B:101:0x0291, B:113:0x01bf, B:112:0x01bc, B:46:0x0188, B:48:0x018e, B:50:0x0198, B:52:0x01a2, B:55:0x01a7, B:58:0x01b1, B:108:0x01b7), top: B:12:0x0089, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bf A[Catch: all -> 0x02d3, TryCatch #1 {all -> 0x02d3, blocks: (B:13:0x0089, B:15:0x00a4, B:16:0x00a7, B:18:0x011f, B:20:0x0132, B:21:0x0135, B:23:0x0148, B:24:0x014b, B:26:0x015e, B:27:0x0161, B:43:0x016e, B:65:0x01c2, B:66:0x01c5, B:68:0x01cb, B:70:0x01de, B:71:0x01e1, B:73:0x01f4, B:74:0x01f7, B:76:0x020a, B:77:0x020d, B:78:0x021a, B:80:0x0220, B:82:0x023c, B:84:0x0253, B:85:0x0256, B:87:0x0269, B:88:0x026c, B:90:0x027f, B:91:0x0282, B:92:0x0296, B:94:0x02a9, B:95:0x02ac, B:97:0x02bf, B:98:0x02c2, B:101:0x0291, B:113:0x01bf, B:112:0x01bc, B:46:0x0188, B:48:0x018e, B:50:0x0198, B:52:0x01a2, B:55:0x01a7, B:58:0x01b1, B:108:0x01b7), top: B:12:0x0089, inners: #2, #5 }] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r20) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.cpg.ActionPreferenceCleanupTask.a(cauf):int");
    }
}
