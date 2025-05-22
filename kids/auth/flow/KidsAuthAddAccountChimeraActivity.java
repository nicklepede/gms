package com.google.android.gms.kids.auth.flow;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.ausn;
import defpackage.braq;
import defpackage.brar;
import defpackage.bras;
import defpackage.brba;
import defpackage.brbb;
import defpackage.brci;
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
public final class KidsAuthAddAccountChimeraActivity extends rxx {
    public static final /* synthetic */ int m = 0;
    private static final ausn n = braq.a("KidsAuthAddAccountChimeraActivity");
    public fxuv j;
    public Context k;
    public brci l;
    private final aca o = registerForActivityResult(new acq(), new aby() { // from class: brat
        @Override // defpackage.aby
        public final void jF(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            fxxm.f(activityResult, "it");
            int i = activityResult.a;
            if (i == -1) {
                brnb.a(exgh.KIDS_AUTH_PROXY_ADD_ACCOUNT_RESULT_SUCCESS);
            } else {
                brnb.a(exgh.KIDS_AUTH_PROXY_ADD_ACCOUNT_RESULT_FAILURE);
            }
            KidsAuthAddAccountChimeraActivity kidsAuthAddAccountChimeraActivity = KidsAuthAddAccountChimeraActivity.this;
            kidsAuthAddAccountChimeraActivity.setResult(i, activityResult.b);
            kidsAuthAddAccountChimeraActivity.finish();
        }
    });
    private bras p;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Bundle r5, defpackage.fxun r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.brax
            if (r0 == 0) goto L13
            r0 = r6
            brax r0 = (defpackage.brax) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            brax r0 = new brax
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fxrc.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fxrc.b(r6)
            exgh r6 = defpackage.exgh.KIDS_AUTH_PROXY_ADD_ACCOUNT_STARTED
            defpackage.brnb.a(r6)
            if (r5 != 0) goto L7e
            brci r5 = r4.l
            if (r5 != 0) goto L43
            java.lang.String r5 = "supervisionBinaryIntentBuilder"
            defpackage.fxxm.j(r5)
            r5 = 0
        L43:
            android.content.Intent r6 = r4.getIntent()
            java.lang.String r2 = "getIntent(...)"
            defpackage.fxxm.e(r6, r2)
            r0.c = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 == r1) goto L7d
        L54:
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto L70
            ausn r5 = com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity.n
            eltz r5 = r5.j()
            eluo r5 = (defpackage.eluo) r5
            java.lang.String r6 = "No suitable activity for add account was found."
            r5.x(r6)
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_ADD_ACCOUNT_ERROR_NO_ACTIVITY
            defpackage.brnb.a(r5)
            r4.l()
            fxrq r5 = defpackage.fxrq.a
            return r5
        L70:
            aca r5 = r4.o
            r5.b(r6)
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_ADD_ACCOUNT_LAUNCHED
            defpackage.brnb.a(r5)
            fxrq r5 = defpackage.fxrq.a
            return r5
        L7d:
            return r1
        L7e:
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_ADD_ACCOUNT_ERROR_SAVED_INSTANCE
            defpackage.brnb.a(r5)
            r4.l()
            fxrq r5 = defpackage.fxrq.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity.a(android.os.Bundle, fxun):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (a(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
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
            boolean r0 = r8 instanceof defpackage.bray
            if (r0 == 0) goto L13
            r0 = r8
            bray r0 = (defpackage.bray) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bray r0 = new bray
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
            braz r2 = new braz
            r2.<init>(r6, r5)
            java.lang.Object r8 = defpackage.fyct.a(r8, r2, r0)
            if (r8 == r1) goto La7
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6b
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L68
            goto La7
        L68:
            fxrq r7 = defpackage.fxrq.a
            return r7
        L6b:
            defpackage.brcn.a(r6)
            edzp r7 = new edzp
            r8 = 2132151580(0x7f160d1c, float:1.9945227E38)
            r7.<init>(r6, r8)
            r8 = 2132091619(0x7f1522e3, float:1.9823611E38)
            r7.M(r8)
            r8 = 2132091618(0x7f1522e2, float:1.982361E38)
            r7.B(r8)
            brau r8 = new brau
            r8.<init>()
            r0 = 2132084770(0x7f150822, float:1.980972E38)
            r7.K(r0, r8)
            brav r8 = new brav
            r8.<init>()
            r7.I(r8)
            braw r8 = new braw
            r8.<init>()
            r7.H(r8)
            iq r7 = r7.create()
            r7.show()
            fxrq r7 = defpackage.fxrq.a
            return r7
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity.k(android.os.Bundle, fxun):java.lang.Object");
    }

    public final void l() {
        setResult(0);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fxxm.n(getCallingPackage(), "com.google.android.gms")) {
            ((eluo) n.j()).B("Expecting to receive intent from GMS Core, received from: %s", getCallingPackage());
            l();
            return;
        }
        if (!fxxm.n(getIntent().getAction(), "com.google.android.gms.auth.addaccount.DM_PRE_ADD_ACCOUNT")) {
            ((eluo) n.j()).B("Expecting to receive intent with action to add account, received: %s", getIntent().getAction());
            l();
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
            this.k = brasVar.a;
            this.l = brasVar.a();
        }
        if (fsbd.c()) {
            fycr.b(jvd.a(this), null, null, new brba(this, bundle, null), 3);
        } else {
            fycr.b(jvd.a(this), null, null, new brbb(this, bundle, null), 3);
        }
    }
}
