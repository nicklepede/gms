package com.google.android.gms.people.service.cpg;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byko;
import defpackage.ctkm;
import defpackage.eijm;
import defpackage.ejhf;
import defpackage.ekwp;
import defpackage.ekwt;
import defpackage.febp;
import defpackage.fegu;
import defpackage.fqzi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ActionPreferenceCleanupTask extends GmsTaskBoundService {
    private static final asot a = asot.b("ActionPreferenceCleanup", asej.PEOPLE);

    public static void d(byjl byjlVar) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 8366)).x("Initializing the service.");
        if (!fqzi.a.a().A() || !fqzi.h()) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 8365)).x("Canceling the service.");
            byjlVar.d("ActionPreferenceCleanupTask.Periodic", ActionPreferenceCleanupTask.class.getName());
            return;
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 8367)).x("Scheduling the service.");
        byko bykoVar = new byko();
        bykoVar.w(ActionPreferenceCleanupTask.class.getName());
        bykoVar.t("ActionPreferenceCleanupTask.Periodic");
        bykoVar.v(2);
        bykoVar.l(false);
        bykoVar.m((int) fqzi.a.a().f());
        byjlVar.f(bykoVar.b());
    }

    static void e(ekwp ekwpVar, int i, eijm eijmVar) {
        if (!ekwpVar.b.L()) {
            ekwpVar.U();
        }
        ekwt ekwtVar = (ekwt) ekwpVar.b;
        ekwt ekwtVar2 = ekwt.a;
        ekwtVar.d = i - 1;
        ekwtVar.b |= 2;
        if (eijmVar.a) {
            eijmVar.g();
            febp a2 = fegu.a(eijmVar.d());
            if (!ekwpVar.b.L()) {
                ekwpVar.U();
            }
            ekwt ekwtVar3 = (ekwt) ekwpVar.b;
            a2.getClass();
            ekwtVar3.k = a2;
            ekwtVar3.b |= 64;
        }
        ctkm.a().c((ekwt) ekwpVar.Q());
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
    public final int a(defpackage.byln r20) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.cpg.ActionPreferenceCleanupTask.a(byln):int");
    }
}
