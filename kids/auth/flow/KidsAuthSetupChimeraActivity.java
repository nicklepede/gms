package com.google.android.gms.kids.auth.flow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.asot;
import defpackage.bota;
import defpackage.botb;
import defpackage.botc;
import defpackage.botw;
import defpackage.botx;
import defpackage.boty;
import defpackage.botz;
import defpackage.bous;
import defpackage.bowb;
import defpackage.bowc;
import defpackage.bpeu;
import defpackage.bpew;
import defpackage.bpex;
import defpackage.bpez;
import defpackage.bpfl;
import defpackage.bqpn;
import defpackage.ejhf;
import defpackage.euqo;
import defpackage.fphp;
import defpackage.fuuw;
import defpackage.fuyx;
import defpackage.fvaf;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.fvgt;
import defpackage.joo;
import defpackage.jqx;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class KidsAuthSetupChimeraActivity extends qet implements bpez {
    private static final asot m = bota.a("KidsAuthSetupChimeraActivity");
    public bous j;
    public bowc k;
    public bpeu l;
    private final fuuw n;
    private final abv o;
    private botc p;

    public KidsAuthSetupChimeraActivity() {
        fvaf fvafVar = new fvaf() { // from class: bots
            @Override // defpackage.fvaf
            public final Object a() {
                bowc bowcVar = KidsAuthSetupChimeraActivity.this.k;
                if (bowcVar != null) {
                    return bowcVar;
                }
                fvbo.j("viewModelFactory");
                return null;
            }
        };
        int i = fvcc.a;
        this.n = new jqx(new fvbi(bowb.class), new boty(this), fvafVar, new botz(this));
        this.o = registerForActivityResult(new acl(), new abt() { // from class: bott
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fvbo.f(activityResult, "it");
                int i2 = activityResult.a;
                euqo euqoVar = i2 == -1 ? euqo.KIDS_AUTH_PROXY_SETUP_RESULT_SUCCESS : euqo.KIDS_AUTH_PROXY_SETUP_RESULT_FAILURE;
                KidsAuthSetupChimeraActivity kidsAuthSetupChimeraActivity = KidsAuthSetupChimeraActivity.this;
                bpfl.a(euqoVar);
                kidsAuthSetupChimeraActivity.setResult(i2, activityResult.b);
                kidsAuthSetupChimeraActivity.finish();
            }
        });
    }

    private final bowb m() {
        return (bowb) this.n.a();
    }

    private final void n() {
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
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
            boolean r0 = r6 instanceof defpackage.botu
            if (r0 == 0) goto L13
            r0 = r6
            botu r0 = (defpackage.botu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            botu r0 = new botu
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
            euqo r6 = defpackage.euqo.KIDS_AUTH_PROXY_SETUP_STARTED
            defpackage.bpfl.a(r6)
            if (r5 != 0) goto L83
            bous r5 = r4.j
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
            asot r5 = com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity.m
            ejgq r5 = r5.j()
            ejhf r5 = (defpackage.ejhf) r5
            java.lang.String r6 = "No suitable activity for account setup was found."
            r5.x(r6)
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_SETUP_ERROR_NO_SETUP_ACTIVITY
            defpackage.bpfl.a(r5)
            r4.n()
            goto L7f
        L75:
            abv r5 = r4.o
            r5.b(r6)
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_SETUP_LAUNCHED
            defpackage.bpfl.a(r5)
        L7f:
            fuvs r5 = defpackage.fuvs.a
            return r5
        L82:
            return r1
        L83:
            euqo r5 = defpackage.euqo.KIDS_AUTH_PROXY_SETUP_ERROR_SAVED_INSTANCE
            defpackage.bpfl.a(r5)
            fuvs r5 = defpackage.fuvs.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity.a(android.os.Bundle, fuyp):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r7 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r12.i(r2, r5, r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0051, code lost:
    
        if (r12 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(android.os.Bundle r11, defpackage.fuyp r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity.k(android.os.Bundle, fuyp):java.lang.Object");
    }

    @Override // defpackage.bpez
    public final void l(int i, int i2) {
        overridePendingTransition(i, i2);
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        bpfl.a(i2 != -1 ? i2 != 0 ? euqo.KIDS_AUTH_SETUP_ACTIVITY_RESULT_UNKNOWN : euqo.KIDS_AUTH_SETUP_ACTIVITY_RESULT_CANCELED : euqo.KIDS_AUTH_SETUP_ACTIVITY_RESULT_SUCCESS);
        if (intent == null || !intent.getBooleanExtra("intentionally_canceled", false)) {
            return;
        }
        bpfl.a(euqo.KIDS_AUTH_SETUP_ACTIVITY_RESULT_INTENTIONAL_CANCEL);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bpfl.a(euqo.KIDS_AUTH_SETUP_ACTIVITY_STARTED);
        if (!fvbo.n(getCallingPackage(), "com.google.android.gms")) {
            ((ejhf) m.j()).B("Expecting to receive intent from GMS Core, received from: %s", getCallingPackage());
            n();
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
            Context context = botcVar.a;
            this.l = new bpeu(context, botcVar.b, bpex.c(context), bpew.c(context));
            this.j = botcVar.a();
            this.k = new bowc(botcVar.r);
        }
        if (fphp.c()) {
            fvgt.b(joo.a(this), null, null, new botw(this, bundle, null), 3);
        } else {
            fvgt.b(joo.a(this), null, null, new botx(this, bundle, null), 3);
        }
    }
}
