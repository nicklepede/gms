package com.google.android.gms.auth.uncertifieddevice;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationIntentOperation;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bksn;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.fpwz;
import defpackage.frdk;
import defpackage.wxa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UncertifiedNotificationIntentOperation extends IntentOperation {
    public static final ausn a = wxa.a("Auth");

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
            casd r0 = defpackage.casd.a(r7)
            aued r1 = defpackage.aued.f(r7)
            boolean r2 = defpackage.fpwz.d()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L32
            boolean r2 = defpackage.frdk.c()
            if (r2 == 0) goto L1f
            boolean r2 = r8.d
            long r5 = r8.e
            boolean r2 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.g(r2, r5)
            goto L30
        L1f:
            int r2 = defpackage.xbw.a()
            if (r2 != r3) goto L27
            r2 = r4
            goto L28
        L27:
            r2 = 0
        L28:
            long r5 = defpackage.fmyq.b()
            boolean r2 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.g(r2, r5)
        L30:
            if (r2 == 0) goto L40
        L32:
            java.lang.String r2 = "UncertifiedNotificationTask"
            java.lang.String r5 = "com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationService"
            r0.d(r2, r5)
            dhpk r0 = defpackage.dhpk.AUTH_ACCOUNT_UNCERTIFIED_PROVISIONAL
            java.lang.String r2 = "UncertifiedNotificationChimeraService"
            r1.o(r2, r4, r0)
        L40:
            boolean r0 = defpackage.fpwz.d()
            if (r0 == 0) goto L95
            boolean r0 = defpackage.frdk.c()
            if (r0 == 0) goto L51
            boolean r0 = r8.d
            if (r0 == 0) goto L95
            goto L58
        L51:
            int r0 = defpackage.xbw.a()
            if (r0 == r3) goto L58
            goto L95
        L58:
            casd r0 = defpackage.casd.a(r7)
            boolean r1 = defpackage.frdk.c()
            if (r1 == 0) goto L65
            long r1 = r8.e
            goto L6b
        L65:
            dxyi r1 = defpackage.xbw.a
            long r1 = defpackage.fmyq.b()
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
            dxyi r1 = defpackage.xbw.a
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r1
            long r1 = defpackage.fnbo.h()
            long r1 = r1 + r3
            catc r8 = com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationChimeraService.e(r3, r1, r8)
            r0.f(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uncertifieddevice.UncertifiedNotificationIntentOperation.a(com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse):void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpwz.c()) {
            return;
        }
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "android.intent.action.BOOT_COMPLETED".equals(action) || "com.google.android.gms.gmscompliance.COMPLIANCE_UPDATED".equals(action)) {
            if (!"com.google.android.gms.gmscompliance.COMPLIANCE_UPDATED".equals(action) || frdk.c()) {
                if (!frdk.c()) {
                    a(new GmsDeviceComplianceResponse());
                    return;
                }
                aupz aupzVar = new aupz(1, 10);
                dhlw a2 = new bksn(this).a();
                a2.t(aupzVar, new dhln() { // from class: afpl
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        ((eluo) ((eluo) UncertifiedNotificationIntentOperation.a.j()).s(exc)).x("Error fetching compliance status.");
                    }
                });
                a2.w(aupzVar, new dhlq() { // from class: afpm
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) obj;
                        if (gmsDeviceComplianceResponse != null) {
                            UncertifiedNotificationIntentOperation.this.a(gmsDeviceComplianceResponse);
                        } else {
                            ((eluo) UncertifiedNotificationIntentOperation.a.j()).x("Error fetching compliance status, null response returned.");
                        }
                    }
                });
            }
        }
    }
}
