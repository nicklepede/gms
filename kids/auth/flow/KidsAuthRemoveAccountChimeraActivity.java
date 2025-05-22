package com.google.android.gms.kids.auth.flow;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.ausn;
import defpackage.braq;
import defpackage.brar;
import defpackage.bras;
import defpackage.brbg;
import defpackage.brbh;
import defpackage.brci;
import defpackage.brey;
import defpackage.bsxe;
import defpackage.eluo;
import defpackage.fsbd;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.jvd;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class KidsAuthRemoveAccountChimeraActivity extends rxx {
    private static final ausn n = braq.a("KidsAuthRemoveAccountChimeraActivity");
    public fxuv j;
    public Context k;
    public brci l;
    public brey m;
    private final aca o = registerForActivityResult(new acq(), new aby() { // from class: brbc
        @Override // defpackage.aby
        public final void jF(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            fxxm.f(activityResult, "it");
            int i = activityResult.a;
            exgh exghVar = i == -1 ? exgh.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_RESULT_SUCCESS : exgh.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_RESULT_FAILURE;
            KidsAuthRemoveAccountChimeraActivity kidsAuthRemoveAccountChimeraActivity = KidsAuthRemoveAccountChimeraActivity.this;
            brnb.a(exghVar);
            kidsAuthRemoveAccountChimeraActivity.setResult(i, activityResult.b);
            kidsAuthRemoveAccountChimeraActivity.finish();
        }
    });
    private bras p;

    private final void m() {
        setResult(0);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Bundle r5, defpackage.fxun r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.brbd
            if (r0 == 0) goto L13
            r0 = r6
            brbd r0 = (defpackage.brbd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            brbd r0 = new brbd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fxrc.b(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fxrc.b(r6)
            android.content.Intent r6 = r4.getIntent()
            r6.getAction()
            exgh r6 = defpackage.exgh.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_STARTED
            defpackage.brnb.a(r6)
            if (r5 != 0) goto L83
            brci r5 = r4.l
            if (r5 != 0) goto L4a
            java.lang.String r5 = "supervisionBinaryIntentBuilder"
            defpackage.fxxm.j(r5)
            r5 = 0
        L4a:
            android.content.Intent r6 = r4.getIntent()
            java.lang.String r2 = "getIntent(...)"
            defpackage.fxxm.e(r6, r2)
            r0.c = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 == r1) goto L82
        L5b:
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto L75
            ausn r5 = com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity.n
            eltz r5 = r5.j()
            eluo r5 = (defpackage.eluo) r5
            java.lang.String r6 = "No suitable activity for remove account was found."
            r5.x(r6)
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_ERROR_NO_ACTIVITY
            defpackage.brnb.a(r5)
            r4.m()
            goto L7f
        L75:
            aca r5 = r4.o
            r5.b(r6)
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_LAUNCHED
            defpackage.brnb.a(r5)
        L7f:
            fxrq r5 = defpackage.fxrq.a
            return r5
        L82:
            return r1
        L83:
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_ERROR_SAVED_INSTANCE
            defpackage.brnb.a(r5)
            r4.m()
            fxrq r5 = defpackage.fxrq.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity.a(android.os.Bundle, fxun):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (a(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(android.os.Bundle r7, defpackage.fxun r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.brbe
            if (r0 == 0) goto L13
            r0 = r8
            brbe r0 = (defpackage.brbe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            brbe r0 = new brbe
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fxrc.b(r8)
            goto L68
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            android.os.Bundle r7 = r0.d
            defpackage.fxrc.b(r8)
            goto L55
        L39:
            defpackage.fxrc.b(r8)
            r0.d = r7
            r0.c = r4
            fxuv r8 = r6.j
            if (r8 != 0) goto L4a
            java.lang.String r8 = "blockingContext"
            defpackage.fxxm.j(r8)
            r8 = r5
        L4a:
            brbf r2 = new brbf
            r2.<init>(r6, r5)
            java.lang.Object r8 = defpackage.fyct.a(r8, r2, r0)
            if (r8 == r1) goto L8b
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L68
            goto L8b
        L68:
            fxrq r7 = defpackage.fxrq.a
            return r7
        L6b:
            brey r7 = r6.l()
            r7.a()
            brey r7 = r6.l()
            android.content.Context r7 = r7.a
            java.lang.String r8 = "com.google.android.gms.kids.auth.service.ACCOUNT_REMOVAL_REQUESTED"
            android.content.Intent r8 = defpackage.brfb.a(r8)
            r7.startService(r8)
            r7 = -1
            r6.setResult(r7)
            r6.finish()
            fxrq r7 = defpackage.fxrq.a
            return r7
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity.k(android.os.Bundle, fxun):java.lang.Object");
    }

    public final brey l() {
        brey breyVar = this.m;
        if (breyVar != null) {
            return breyVar;
        }
        fxxm.j("supervisionSetupApi");
        return null;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fxxm.n(getCallingPackage(), "com.google.android.gms")) {
            ((eluo) n.j()).B("Expecting to receive intent from GMS Core, received from: %s", getCallingPackage());
            m();
            return;
        }
        if (!fxxm.n(getIntent().getAction(), "com.google.android.gms.auth.removeaccount.DM_PRE_REMOVE_ACCOUNT")) {
            ((eluo) n.j()).B("Expecting to receive intent with action to remove account, received: %s", getIntent().getAction());
            m();
            return;
        }
        if (this.p == null) {
            brar brarVar = new brar();
            Context applicationContext = getApplication().getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            brarVar.b(applicationContext);
            fxuv fxuvVar = bsxe.a;
            brarVar.c(bsxe.d);
            brarVar.a = jvd.a(this);
            this.p = brarVar.a();
        }
        bras brasVar = this.p;
        if (brasVar != null) {
            this.j = brasVar.b;
            Context context = brasVar.a;
            this.k = context;
            this.l = brasVar.a();
            this.m = new brey(context);
        }
        if (fsbd.c() || fsbd.a.lK().b()) {
            fycr.b(jvd.a(this), null, null, new brbg(this, bundle, null), 3);
        } else {
            fycr.b(jvd.a(this), null, null, new brbh(this, bundle, null), 3);
        }
    }
}
