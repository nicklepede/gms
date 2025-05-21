package com.google.android.gms.kids.auth.flow;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.asot;
import defpackage.bota;
import defpackage.botb;
import defpackage.botc;
import defpackage.botq;
import defpackage.botr;
import defpackage.bous;
import defpackage.boxi;
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
public final class KidsAuthRemoveAccountChimeraActivity extends qet {
    private static final asot n = bota.a("KidsAuthRemoveAccountChimeraActivity");
    public fuyx j;
    public Context k;
    public bous l;
    public boxi m;
    private final abv o = registerForActivityResult(new acl(), new abt() { // from class: botm
        @Override // defpackage.abt
        public final void jq(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            fvbo.f(activityResult, "it");
            int i = activityResult.a;
            euqo euqoVar = i == -1 ? euqo.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_RESULT_SUCCESS : euqo.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_RESULT_FAILURE;
            KidsAuthRemoveAccountChimeraActivity kidsAuthRemoveAccountChimeraActivity = KidsAuthRemoveAccountChimeraActivity.this;
            bpfl.a(euqoVar);
            kidsAuthRemoveAccountChimeraActivity.setResult(i, activityResult.b);
            kidsAuthRemoveAccountChimeraActivity.finish();
        }
    });
    private botc p;

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
    public final java.lang.Object a(android.os.Bundle r5, defpackage.fuyp r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.botn
            if (r0 == 0) goto L13
            r0 = r6
            botn r0 = (defpackage.botn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            botn r0 = new botn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fuve.b(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fuve.b(r6)
            android.content.Intent r6 = r4.getIntent()
            r6.getAction()
            euqo r6 = defpackage.euqo.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_STARTED
            defpackage.bpfl.a(r6)
            if (r5 != 0) goto L83
            bous r5 = r4.l
            if (r5 != 0) goto L4a
            java.lang.String r5 = "supervisionBinaryIntentBuilder"
            defpackage.fvbo.j(r5)
            r5 = 0
        L4a:
            android.content.Intent r6 = r4.getIntent()
            java.lang.String r2 = "getIntent(...)"
            defpackage.fvbo.e(r6, r2)
            r0.c = r3
            java.lang.Object r6 = r5.b(r6, r0)
            if (r6 == r1) goto L82
        L5b:
            android.content.Intent r6 = (android.content.Intent) r6
            if (r6 != 0) goto L75
            asot r5 = com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity.n
            ejgq r5 = r5.j()
            ejhf r5 = (defpackage.ejhf) r5
            java.lang.String r6 = "No suitable activity for remove account was found."
            r5.x(r6)
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_ERROR_NO_ACTIVITY
            defpackage.bpfl.a(r5)
            r4.m()
            goto L7f
        L75:
            abv r5 = r4.o
            r5.b(r6)
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_LAUNCHED
            defpackage.bpfl.a(r5)
        L7f:
            fuvs r5 = defpackage.fuvs.a
            return r5
        L82:
            return r1
        L83:
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_REMOVE_ACCOUNT_ERROR_SAVED_INSTANCE
            defpackage.bpfl.a(r5)
            r4.m()
            fuvs r5 = defpackage.fuvs.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity.a(android.os.Bundle, fuyp):java.lang.Object");
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
    public final java.lang.Object k(android.os.Bundle r7, defpackage.fuyp r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.boto
            if (r0 == 0) goto L13
            r0 = r8
            boto r0 = (defpackage.boto) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            boto r0 = new boto
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
            botp r2 = new botp
            r2.<init>(r6, r5)
            java.lang.Object r8 = defpackage.fvgv.a(r8, r2, r0)
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
            fuvs r7 = defpackage.fuvs.a
            return r7
        L6b:
            boxi r7 = r6.l()
            r7.a()
            boxi r7 = r6.l()
            android.content.Context r7 = r7.a
            java.lang.String r8 = "com.google.android.gms.kids.auth.service.ACCOUNT_REMOVAL_REQUESTED"
            android.content.Intent r8 = defpackage.boxl.a(r8)
            r7.startService(r8)
            r7 = -1
            r6.setResult(r7)
            r6.finish()
            fuvs r7 = defpackage.fuvs.a
            return r7
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity.k(android.os.Bundle, fuyp):java.lang.Object");
    }

    public final boxi l() {
        boxi boxiVar = this.m;
        if (boxiVar != null) {
            return boxiVar;
        }
        fvbo.j("supervisionSetupApi");
        return null;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fvbo.n(getCallingPackage(), "com.google.android.gms")) {
            ((ejhf) n.j()).B("Expecting to receive intent from GMS Core, received from: %s", getCallingPackage());
            m();
            return;
        }
        if (!fvbo.n(getIntent().getAction(), "com.google.android.gms.auth.removeaccount.DM_PRE_REMOVE_ACCOUNT")) {
            ((ejhf) n.j()).B("Expecting to receive intent with action to remove account, received: %s", getIntent().getAction());
            m();
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
            Context context = botcVar.a;
            this.k = context;
            this.l = botcVar.a();
            this.m = new boxi(context);
        }
        if (fphp.c() || fphp.a.a().b()) {
            fvgt.b(joo.a(this), null, null, new botq(this, bundle, null), 3);
        } else {
            fvgt.b(joo.a(this), null, null, new botr(this, bundle, null), 3);
        }
    }
}
