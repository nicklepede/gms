package com.google.android.gms.kids.auth.flow;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.asot;
import defpackage.bota;
import defpackage.botb;
import defpackage.botc;
import defpackage.botk;
import defpackage.botl;
import defpackage.bous;
import defpackage.bqpn;
import defpackage.ejhf;
import defpackage.fphp;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.joo;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class KidsAuthAddAccountChimeraActivity extends qet {
    public static final /* synthetic */ int m = 0;
    private static final asot n = bota.a("KidsAuthAddAccountChimeraActivity");
    public fuyx j;
    public Context k;
    public bous l;
    private final abv o = registerForActivityResult(new acl(), new abt() { // from class: botd
        @Override // defpackage.abt
        public final void jq(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            fvbo.f(activityResult, "it");
            int i = activityResult.a;
            if (i == -1) {
                bpfl.a(euqo.KIDS_AUTH_PROXY_ADD_ACCOUNT_RESULT_SUCCESS);
            } else {
                bpfl.a(euqo.KIDS_AUTH_PROXY_ADD_ACCOUNT_RESULT_FAILURE);
            }
            KidsAuthAddAccountChimeraActivity kidsAuthAddAccountChimeraActivity = KidsAuthAddAccountChimeraActivity.this;
            kidsAuthAddAccountChimeraActivity.setResult(i, activityResult.b);
            kidsAuthAddAccountChimeraActivity.finish();
        }
    });
    private botc p;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Bundle r5, defpackage.fuyp r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.both
            if (r0 == 0) goto L13
            r0 = r6
            both r0 = (defpackage.both) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            both r0 = new both
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fuve.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fuve.b(r6)
            euqo r6 = defpackage.euqo.KIDS_AUTH_PROXY_ADD_ACCOUNT_STARTED
            defpackage.bpfl.a(r6)
            if (r5 != 0) goto L7e
            bous r5 = r4.l
            if (r5 != 0) goto L43
            java.lang.String r5 = "supervisionBinaryIntentBuilder"
            defpackage.fvbo.j(r5)
            r5 = 0
        L43:
            android.content.Intent r6 = r4.getIntent()
            java.lang.String r2 = "getIntent(...)"
            defpackage.fvbo.e(r6, r2)
            r0.c = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 == r1) goto L7d
        L54:
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto L70
            asot r5 = com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity.n
            ejgq r5 = r5.j()
            ejhf r5 = (defpackage.ejhf) r5
            java.lang.String r6 = "No suitable activity for add account was found."
            r5.x(r6)
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_ADD_ACCOUNT_ERROR_NO_ACTIVITY
            defpackage.bpfl.a(r5)
            r4.l()
            fuvs r5 = defpackage.fuvs.a
            return r5
        L70:
            abv r5 = r4.o
            r5.b(r6)
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_ADD_ACCOUNT_LAUNCHED
            defpackage.bpfl.a(r5)
            fuvs r5 = defpackage.fuvs.a
            return r5
        L7d:
            return r1
        L7e:
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_ADD_ACCOUNT_ERROR_SAVED_INSTANCE
            defpackage.bpfl.a(r5)
            r4.l()
            fuvs r5 = defpackage.fuvs.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity.a(android.os.Bundle, fuyp):java.lang.Object");
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
    public final java.lang.Object k(android.os.Bundle r7, defpackage.fuyp r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.boti
            if (r0 == 0) goto L13
            r0 = r8
            boti r0 = (defpackage.boti) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            boti r0 = new boti
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fuve.b(r8)
            goto L68
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            android.os.Bundle r7 = r0.d
            defpackage.fuve.b(r8)
            goto L55
        L39:
            defpackage.fuve.b(r8)
            r0.d = r7
            r0.c = r4
            fuyx r8 = r6.j
            if (r8 != 0) goto L4a
            java.lang.String r8 = "blockingContext"
            defpackage.fvbo.j(r8)
            r8 = r5
        L4a:
            botj r2 = new botj
            r2.<init>(r6, r5)
            java.lang.Object r8 = defpackage.fvgv.a(r8, r2, r0)
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
            fuvs r7 = defpackage.fuvs.a
            return r7
        L6b:
            defpackage.boux.a(r6)
            ebna r7 = new ebna
            r8 = 2132151565(0x7f160d0d, float:1.9945196E38)
            r7.<init>(r6, r8)
            r8 = 2132091482(0x7f15225a, float:1.9823333E38)
            r7.M(r8)
            r8 = 2132091481(0x7f152259, float:1.9823331E38)
            r7.B(r8)
            bote r8 = new bote
            r8.<init>()
            r0 = 2132084769(0x7f150821, float:1.9809718E38)
            r7.K(r0, r8)
            botf r8 = new botf
            r8.<init>()
            r7.I(r8)
            botg r8 = new botg
            r8.<init>()
            r7.H(r8)
            iq r7 = r7.create()
            r7.show()
            fuvs r7 = defpackage.fuvs.a
            return r7
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity.k(android.os.Bundle, fuyp):java.lang.Object");
    }

    public final void l() {
        setResult(0);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fvbo.n(getCallingPackage(), "com.google.android.gms")) {
            ((ejhf) n.j()).B("Expecting to receive intent from GMS Core, received from: %s", getCallingPackage());
            l();
            return;
        }
        if (!fvbo.n(getIntent().getAction(), "com.google.android.gms.auth.addaccount.DM_PRE_ADD_ACCOUNT")) {
            ((ejhf) n.j()).B("Expecting to receive intent with action to add account, received: %s", getIntent().getAction());
            l();
            return;
        }
        if (this.p == null) {
            botb botbVar = new botb();
            Context applicationContext = getApplication().getApplicationContext();
            fvbo.e(applicationContext, "getApplicationContext(...)");
            botbVar.b(applicationContext);
            fuyx fuyxVar = bqpn.a;
            botbVar.c(bqpn.d);
            botbVar.a = joo.a(this);
            this.p = botbVar.a();
        }
        botc botcVar = this.p;
        if (botcVar != null) {
            this.j = botcVar.b;
            this.k = botcVar.a;
            this.l = botcVar.a();
        }
        if (fphp.c()) {
            fvgt.b(joo.a(this), null, null, new botk(this, bundle, null), 3);
        } else {
            fvgt.b(joo.a(this), null, null, new botl(this, bundle, null), 3);
        }
    }
}
