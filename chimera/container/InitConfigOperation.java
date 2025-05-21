package com.google.android.gms.chimera.container;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aoaj;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.eike;
import defpackage.fmpv;
import defpackage.fnck;
import defpackage.ppr;
import defpackage.ppt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class InitConfigOperation extends IntentOperation {
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "chimera.CLIENT_SESSION_ID"
            java.lang.String r0 = r8.getStringExtra(r0)
            java.lang.String r1 = "progressListener"
            puv r1 = defpackage.qad.a(r8, r1)
            if (r1 == 0) goto L18
            aoch r2 = new aoch
            boolean r3 = defpackage.fmqr.g()
            r2.<init>(r1, r3)
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.String r1 = "chimera.URGENTLY_REQUESTED_FEATURES"
            byte[] r1 = r8.getByteArrayExtra(r1)
            r3 = 0
            if (r1 == 0) goto L4b
            febw r4 = defpackage.febw.a     // Catch: defpackage.fedk -> L3b
            feep r4 = defpackage.feep.a     // Catch: defpackage.fedk -> L3b
            febw r4 = defpackage.febw.a     // Catch: defpackage.fedk -> L3b
            pup r5 = defpackage.pup.a     // Catch: defpackage.fedk -> L3b
            int r6 = r1.length     // Catch: defpackage.fedk -> L3b
            fecp r1 = defpackage.fecp.y(r5, r1, r3, r6, r4)     // Catch: defpackage.fedk -> L3b
            defpackage.fecp.M(r1)     // Catch: defpackage.fedk -> L3b
            pup r1 = (defpackage.pup) r1     // Catch: defpackage.fedk -> L3b
            fedh r1 = r1.b     // Catch: defpackage.fedk -> L3b
            eitj r1 = defpackage.eitj.i(r1)     // Catch: defpackage.fedk -> L3b
            goto L4f
        L3b:
            r1 = move-exception
            java.lang.String r4 = "Ignoring corrupt urgent features list: "
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r4.concat(r1)
            java.lang.String r4 = "FeatureMgr"
            android.util.Log.w(r4, r1)
        L4b:
            int r1 = defpackage.eitj.d
            eitj r1 = defpackage.ejcb.a
        L4f:
            anza r4 = defpackage.anza.a(r7)
            r5 = 5
            r4.g(r5, r2, r0, r1)
            if (r2 == 0) goto L7a
            boolean r0 = defpackage.fmqr.g()
            if (r0 == 0) goto L64
            puv r0 = r2.a
            if (r0 != 0) goto L64
            goto L7a
        L64:
            java.lang.Class<com.google.android.gms.chimera.container.WaitUpdateCompleteOperation> r0 = com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.class
            java.lang.String r1 = "com.google.android.gms.chimera.action.WAIT_UPDATE_COMPLETE"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent(r7, r0, r1)
            defpackage.eike.e(r0)
            java.lang.String r1 = "liveListener"
            defpackage.qad.c(r0, r1, r2)
            com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.a(r8, r0, r3)
            r7.startService(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.InitConfigOperation.a(android.content.Intent):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        eike.e(action);
        switch (action.hashCode()) {
            case -1482987174:
                if (action.equals("com.google.android.chimera.container.REQUESTED_FEATURES_CHANGED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -500294787:
                if (action.equals("com.google.android.gms.chimera.container.ACTION_FORCE_CONFIG_RECHECK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -444354185:
                if (action.equals("com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 438946629:
                if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            a(ppr.a(this, ppt.d().f(), new aoaj(), null));
        } else if (c != 1) {
            if (c == 2 || c == 3) {
                a(intent);
                return;
            }
            return;
        }
        ConfigChimeraService.d().e(this);
        byjl a = byjl.a(this);
        int i = AppModuleManagementService.a;
        if (fnck.a.a().p()) {
            byko bykoVar = new byko();
            bykoVar.t("AppModuleManagemntSrvce");
            bykoVar.w(AppModuleManagementService.class.getName());
            bykoVar.l(false);
            bykoVar.a = bykv.n;
            bykoVar.p = false;
            bykoVar.j();
            bykoVar.e();
            a.f(bykoVar.b());
            return;
        }
        bykm bykmVar = new bykm();
        bykmVar.j(byki.a(fmpv.a.a().b()));
        bykmVar.w(AppModuleManagementService.class.getName());
        bykmVar.v(1);
        bykmVar.g(2);
        bykmVar.r(true);
        bykmVar.i(true);
        bykmVar.p = false;
        bykmVar.t("AppModuleManagemntSrvce");
        a.f(bykmVar.b());
    }
}
