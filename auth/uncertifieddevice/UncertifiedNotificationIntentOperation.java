package com.google.android.gms.auth.uncertifieddevice;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationIntentOperation;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import defpackage.asmf;
import defpackage.asot;
import defpackage.biny;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.fnfa;
import defpackage.foku;
import defpackage.vba;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UncertifiedNotificationIntentOperation extends IntentOperation {
    public static final asot a = vba.a("Auth");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r2 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r8) {
        /*
            r7 = this;
            byjl r0 = defpackage.byjl.a(r7)
            asbo r1 = defpackage.asbo.f(r7)
            boolean r2 = defpackage.fnfa.d()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L32
            boolean r2 = defpackage.foku.c()
            if (r2 == 0) goto L1f
            boolean r2 = r8.d
            long r5 = r8.e
            boolean r2 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.g(r2, r5)
            goto L30
        L1f:
            int r2 = defpackage.vfv.a()
            if (r2 != r3) goto L27
            r2 = r4
            goto L28
        L27:
            r2 = 0
        L28:
            long r5 = defpackage.fkib.b()
            boolean r2 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.g(r2, r5)
        L30:
            if (r2 == 0) goto L40
        L32:
            java.lang.String r2 = "UncertifiedNotificationTask"
            java.lang.String r5 = "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService"
            r0.d(r2, r5)
            dfee r0 = defpackage.dfee.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL
            java.lang.String r2 = "UncertifiedNotificationChimeraService"
            r1.o(r2, r4, r0)
        L40:
            boolean r0 = defpackage.fnfa.d()
            if (r0 == 0) goto L95
            boolean r0 = defpackage.foku.c()
            if (r0 == 0) goto L51
            boolean r0 = r8.d
            if (r0 == 0) goto L95
            goto L58
        L51:
            int r0 = defpackage.vfv.a()
            if (r0 == r3) goto L58
            goto L95
        L58:
            byjl r0 = defpackage.byjl.a(r7)
            boolean r1 = defpackage.foku.c()
            if (r1 == 0) goto L65
            long r1 = r8.e
            goto L6b
        L65:
            dvni r1 = defpackage.vfv.a
            long r1 = defpackage.fkib.b()
        L6b:
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            r3 = 0
            long r1 = java.lang.Math.max(r3, r1)
            r5 = -604800000(0xffffffffdbf37c00, double:NaN)
            long r1 = r1 + r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L7f
            goto L80
        L7f:
            r3 = r1
        L80:
            android.os.Bundle r8 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.d(r8)
            dvni r1 = defpackage.vfv.a
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r1
            long r1 = defpackage.fkkz.h()
            long r1 = r1 + r3
            bykk r8 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.e(r3, r1, r8)
            r0.f(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationIntentOperation.a(com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse):void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnfa.c()) {
            return;
        }
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "android.intent.action.BOOT_COMPLETED".equals(action) || "com.google.android.gms.gmscompliance.COMPLIANCE_UPDATED".equals(action)) {
            if (!"com.google.android.gms.gmscompliance.COMPLIANCE_UPDATED".equals(action) || foku.c()) {
                if (!foku.c()) {
                    a(new GmsDeviceComplianceResponse());
                    return;
                }
                asmf asmfVar = new asmf(1, 10);
                dfaq a2 = new biny(this).a();
                a2.t(asmfVar, new dfah() { // from class: adpe
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        ((ejhf) ((ejhf) UncertifiedNotificationIntentOperation.a.j()).s(exc)).x("Error fetching compliance status.");
                    }
                });
                a2.w(asmfVar, new dfak() { // from class: adpf
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) obj;
                        if (gmsDeviceComplianceResponse != null) {
                            UncertifiedNotificationIntentOperation.this.a(gmsDeviceComplianceResponse);
                        } else {
                            ((ejhf) UncertifiedNotificationIntentOperation.a.j()).x("Error fetching compliance status, null response returned.");
                        }
                    }
                });
            }
        }
    }
}
