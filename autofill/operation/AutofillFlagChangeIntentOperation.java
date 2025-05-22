package com.google.android.gms.autofill.operation;

import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AutofillFlagChangeIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AutofillFlagChangeIntentOperation", auid.AUTOFILL);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            ausn r0 = com.google.android.gms.autofill.operation.AutofillFlagChangeIntentOperation.a
            eltz r0 = r0.h()
            java.lang.String r1 = "onHandleIntent()"
            r2 = 1004(0x3ec, float:1.407E-42)
            defpackage.a.A(r0, r1, r2)
            boolean r0 = com.google.android.gms.autofill.operation.AutofillModuleInitIntentOperation.e()
            if (r0 != 0) goto L15
            goto L99
        L15:
            if (r6 == 0) goto L99
            java.lang.String r0 = r6.getAction()
            if (r0 == 0) goto L99
            fnvu r1 = defpackage.fnvu.a
            fnvy r1 = r1.lK()
            boolean r1 = r1.P()
            java.lang.String r2 = "com.google.android.gms.phenotype.com.google.android.gms.autofill.COMMITTED"
            if (r1 == 0) goto L30
            boolean r6 = r0.equals(r2)
            goto L64
        L30:
            int r1 = r0.hashCode()
            r3 = -544318258(0xffffffffdf8e5cce, float:-2.0516601E19)
            r4 = 1
            if (r1 == r3) goto L48
            r3 = -335680806(0xffffffffebfdeada, float:-6.1393458E26)
            if (r1 == r3) goto L40
            goto L52
        L40:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L52
            r0 = 0
            goto L53
        L48:
            java.lang.String r1 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r4
            goto L53
        L52:
            r0 = -1
        L53:
            if (r0 == 0) goto L66
            if (r0 == r4) goto L58
            goto L99
        L58:
            java.lang.String r0 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r0 = "com.google.android.gms.autofill"
            boolean r6 = r0.equals(r6)
        L64:
            if (r6 == 0) goto L99
        L66:
            agsm r6 = defpackage.agsl.a(r5)
            defpackage.ahkc.a(r6)
            boolean r6 = defpackage.auub.f()
            if (r6 == 0) goto L99
            boolean r6 = defpackage.fnvl.d()
            if (r6 == 0) goto L87
            boolean r6 = defpackage.ajga.c(r5)
            if (r6 == 0) goto L80
            goto L87
        L80:
            defpackage.ajga.f()
            defpackage.ajga.b(r5)
            return
        L87:
            boolean r6 = defpackage.fnvl.d()
            if (r6 != 0) goto L99
            boolean r6 = defpackage.ajga.c(r5)
            if (r6 == 0) goto L99
            defpackage.ajga.e()
            defpackage.ajga.a(r5)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.autofill.operation.AutofillFlagChangeIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
