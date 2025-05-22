package com.google.android.gms.chimera.container;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aqcb;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.ekxj;
import defpackage.fpht;
import defpackage.fpuj;
import defpackage.riv;
import defpackage.rix;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
            rnz r1 = defpackage.rth.a(r8, r1)
            if (r1 == 0) goto L18
            aqdz r2 = new aqdz
            boolean r3 = defpackage.fpip.g()
            r2.<init>(r1, r3)
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.String r1 = "chimera.URGENTLY_REQUESTED_FEATURES"
            byte[] r1 = r8.getByteArrayExtra(r1)
            r3 = 0
            if (r1 == 0) goto L4b
            fgqp r4 = defpackage.fgqp.a     // Catch: defpackage.fgsd -> L3b
            fgti r4 = defpackage.fgti.a     // Catch: defpackage.fgsd -> L3b
            fgqp r4 = defpackage.fgqp.a     // Catch: defpackage.fgsd -> L3b
            rnt r5 = defpackage.rnt.a     // Catch: defpackage.fgsd -> L3b
            int r6 = r1.length     // Catch: defpackage.fgsd -> L3b
            fgri r1 = defpackage.fgri.y(r5, r1, r3, r6, r4)     // Catch: defpackage.fgsd -> L3b
            defpackage.fgri.M(r1)     // Catch: defpackage.fgsd -> L3b
            rnt r1 = (defpackage.rnt) r1     // Catch: defpackage.fgsd -> L3b
            fgsa r1 = r1.b     // Catch: defpackage.fgsd -> L3b
            elgo r1 = defpackage.elgo.i(r1)     // Catch: defpackage.fgsd -> L3b
            goto L4f
        L3b:
            r1 = move-exception
            java.lang.String r4 = "Ignoring corrupt urgent features list: "
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r4.concat(r1)
            java.lang.String r4 = "FeatureMgr"
            android.util.Log.w(r4, r1)
        L4b:
            int r1 = defpackage.elgo.d
            elgo r1 = defpackage.elpg.a
        L4f:
            aqas r4 = defpackage.aqas.a(r7)
            r5 = 5
            r4.g(r5, r2, r0, r1)
            if (r2 == 0) goto L7a
            boolean r0 = defpackage.fpip.g()
            if (r0 == 0) goto L64
            rnz r0 = r2.a
            if (r0 != 0) goto L64
            goto L7a
        L64:
            java.lang.Class<com.google.android.gms.chimera.container.WaitUpdateCompleteOperation> r0 = com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.class
            java.lang.String r1 = "com.google.android.gms.chimera.action.WAIT_UPDATE_COMPLETE"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent(r7, r0, r1)
            defpackage.ekxj.e(r0)
            java.lang.String r1 = "liveListener"
            defpackage.rth.c(r0, r1, r2)
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
        ekxj.e(action);
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
            a(riv.a(this, rix.d().f(), new aqcb(), null));
        } else if (c != 1) {
            if (c == 2 || c == 3) {
                a(intent);
                return;
            }
            return;
        }
        ConfigChimeraService.d().e(this);
        casd a = casd.a(this);
        int i = AppModuleManagementService.a;
        if (fpuj.a.lK().p()) {
            catg catgVar = new catg();
            catgVar.t("AppModuleManagemntSrvce");
            catgVar.w(AppModuleManagementService.class.getName());
            catgVar.l(false);
            catgVar.a = catn.n;
            catgVar.p = false;
            catgVar.j();
            catgVar.e();
            a.f(catgVar.b());
            return;
        }
        cate cateVar = new cate();
        cateVar.j(cata.a(fpht.a.lK().b()));
        cateVar.w(AppModuleManagementService.class.getName());
        cateVar.v(1);
        cateVar.g(2);
        cateVar.r(true);
        cateVar.i(true);
        cateVar.p = false;
        cateVar.t("AppModuleManagemntSrvce");
        a.f(cateVar.b());
    }
}
