package com.google.android.gms.contactinteractions.service.operations;

import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ContactInteractionsModuleInitIntentOperation extends apzs {
    static final String[] a;

    static {
        ausn.b("ContactInteractInitOp", auid.CONTACT_INTERACTIONS);
        a = new String[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    @Override // defpackage.apzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void b(android.content.Intent r14, int r15) {
        /*
            r13 = this;
            r14 = r15 & 4
            if (r14 == 0) goto L7
            java.lang.String[] r14 = com.google.android.gms.contactinteractions.service.operations.ContactInteractionsModuleInitIntentOperation.a
            int r14 = r14.length
        L7:
            int r14 = com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.a
            boolean r14 = defpackage.auub.f()
            if (r14 == 0) goto L13
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.f(r13)
            return
        L13:
            avrr r9 = new avrr
            avrn r14 = new avrn
            r14.<init>()
            r9.<init>(r13, r14)
            boolean r14 = defpackage.auub.f()
            if (r14 == 0) goto L27
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.f(r13)
            return
        L27:
            boolean r14 = defpackage.fpey.e()
            if (r14 == 0) goto La7
            java.lang.String r14 = "contactinteractions"
            java.lang.String r15 = "contactinteractions_gms_prefs"
            r0 = 0
            bzlv r14 = defpackage.bzna.a(r13, r14, r15, r0)
            long r5 = android.os.SystemClock.uptimeMillis()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = "clear_interactions_service_one_off_last_scheduled_timestamp"
            long r7 = defpackage.bzlw.b(r14, r15, r3)
            bzlt r1 = r14.c()
            r1.g(r15, r3)
            defpackage.bzlw.f(r1)
            r1 = 0
            long r14 = defpackage.avrp.a(r1, r14)
            long r14 = r3 - r14
            fpey r10 = defpackage.fpey.a
            fpez r11 = r10.lK()
            long r11 = r11.b()
            int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r14 < 0) goto La7
            catb r14 = new catb
            r14.<init>()
            java.lang.String r15 = "com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService"
            r14.j = r15
            java.lang.String r15 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsOneOffTask"
            r14.t(r15)
            r15 = 2
            r14.y(r15, r15)
            r15 = 1
            r14.v(r15)
            r14.p = r0
            fpez r0 = r10.lK()
            long r11 = r0.a()
            r14.e(r1, r11)
            fpez r0 = r10.lK()
            boolean r0 = r0.g()
            r14.x(r0, r15)
            fpez r15 = r10.lK()
            boolean r15 = r15.h()
            r14.i(r15)
            catc r1 = r14.b()
            r2 = 4
            r0 = r13
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.i(r0, r1, r2, r3, r5, r7, r9)
            goto La8
        La7:
            r0 = r13
        La8:
            boolean r14 = defpackage.fpey.f()
            if (r14 == 0) goto Lb2
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.h(r13, r9)
            return
        Lb2:
            com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.f(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contactinteractions.service.operations.ContactInteractionsModuleInitIntentOperation.b(android.content.Intent, int):void");
    }
}
