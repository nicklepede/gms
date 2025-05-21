package com.google.android.gms.contactinteractions.service.operations;

import defpackage.anya;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ContactInteractionsModuleInitIntentOperation extends anya {
    static final String[] a;

    static {
        asot.b("ContactInteractInitOp", asej.CONTACT_INTERACTIONS);
        a = new String[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    @Override // defpackage.anya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void b(android.content.Intent r13, int r14) {
        /*
            r12 = this;
            r13 = r14 & 4
            if (r13 == 0) goto L7
            java.lang.String[] r13 = com.google.android.gms.contactinteractions.service.operations.ContactInteractionsModuleInitIntentOperation.a
            int r13 = r13.length
        L7:
            int r13 = com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.a
            boolean r13 = defpackage.asqh.f()
            if (r13 == 0) goto L13
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.f(r12)
            return
        L13:
            atno r9 = new atno
            atnk r13 = new atnk
            r13.<init>()
            r9.<init>(r12, r13)
            boolean r13 = defpackage.asqh.f()
            if (r13 == 0) goto L27
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.f(r12)
            return
        L27:
            boolean r13 = defpackage.fmnc.e()
            if (r13 == 0) goto La9
            java.lang.String r13 = "contactinteractions"
            java.lang.String r14 = "contactinteractions_gms_prefs"
            r0 = 0
            bxdf r13 = defpackage.bxek.a(r12, r13, r14, r0)
            long r5 = android.os.SystemClock.uptimeMillis()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r14 = "clear_interactions_service_one_off_last_scheduled_timestamp"
            long r7 = defpackage.bxdg.b(r13, r14, r3)
            bxdd r1 = r13.c()
            r1.g(r14, r3)
            defpackage.bxdg.f(r1)
            r1 = 0
            long r13 = defpackage.atnm.a(r1, r13)
            long r13 = r3 - r13
            fmnc r10 = defpackage.fmnc.a
            fmnd r10 = r10.a()
            long r10 = r10.b()
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 < 0) goto La9
            bykj r13 = new bykj
            r13.<init>()
            java.lang.String r14 = "com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService"
            r13.j = r14
            java.lang.String r14 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsOneOffTask"
            r13.t(r14)
            r14 = 2
            r13.y(r14, r14)
            r14 = 1
            r13.v(r14)
            r13.p = r0
            fmnc r0 = defpackage.fmnc.a
            fmnd r10 = r0.a()
            long r10 = r10.a()
            r13.e(r1, r10)
            fmnd r1 = r0.a()
            boolean r1 = r1.g()
            r13.x(r1, r14)
            fmnd r14 = r0.a()
            boolean r14 = r14.h()
            r13.i(r14)
            bykk r1 = r13.b()
            r2 = 4
            r0 = r12
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.i(r0, r1, r2, r3, r5, r7, r9)
            goto Laa
        La9:
            r0 = r12
        Laa:
            boolean r13 = defpackage.fmnc.f()
            if (r13 == 0) goto Lb4
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.h(r12, r9)
            return
        Lb4:
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.f(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contactinteractions.service.operations.ContactInteractionsModuleInitIntentOperation.b(android.content.Intent, int):void");
    }
}
