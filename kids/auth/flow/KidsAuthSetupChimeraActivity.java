package com.google.android.gms.kids.auth.flow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.ausn;
import defpackage.braq;
import defpackage.brar;
import defpackage.bras;
import defpackage.brbm;
import defpackage.brbn;
import defpackage.brbo;
import defpackage.brbp;
import defpackage.brci;
import defpackage.brdr;
import defpackage.brds;
import defpackage.brmk;
import defpackage.brmm;
import defpackage.brmn;
import defpackage.brmp;
import defpackage.brnb;
import defpackage.bsxe;
import defpackage.eluo;
import defpackage.exgh;
import defpackage.fsbd;
import defpackage.fxqu;
import defpackage.fxuv;
import defpackage.fxwd;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.fycr;
import defpackage.jvd;
import defpackage.jxm;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class KidsAuthSetupChimeraActivity extends rxx implements brmp {
    private static final ausn m = braq.a("KidsAuthSetupChimeraActivity");
    public brci j;
    public brds k;
    public brmk l;
    private final fxqu n;
    private final aca o;
    private bras p;

    public KidsAuthSetupChimeraActivity() {
        fxwd fxwdVar = new fxwd() { // from class: brbi
            @Override // defpackage.fxwd
            public final Object a() {
                brds brdsVar = KidsAuthSetupChimeraActivity.this.k;
                if (brdsVar != null) {
                    return brdsVar;
                }
                fxxm.j("viewModelFactory");
                return null;
            }
        };
        int i = fxya.a;
        this.n = new jxm(new fxxg(brdr.class), new brbo(this), fxwdVar, new brbp(this));
        this.o = registerForActivityResult(new acq(), new aby() { // from class: brbj
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                fxxm.f(activityResult, "it");
                int i2 = activityResult.a;
                exgh exghVar = i2 == -1 ? exgh.KIDS_AUTH_PROXY_SETUP_RESULT_SUCCESS : exgh.KIDS_AUTH_PROXY_SETUP_RESULT_FAILURE;
                KidsAuthSetupChimeraActivity kidsAuthSetupChimeraActivity = KidsAuthSetupChimeraActivity.this;
                brnb.a(exghVar);
                kidsAuthSetupChimeraActivity.setResult(i2, activityResult.b);
                kidsAuthSetupChimeraActivity.finish();
            }
        });
    }

    private final brdr m() {
        return (brdr) this.n.a();
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
    public final java.lang.Object a(android.os.Bundle r5, defpackage.fxun r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.brbk
            if (r0 == 0) goto L13
            r0 = r6
            brbk r0 = (defpackage.brbk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            brbk r0 = new brbk
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
            exgh r6 = defpackage.exgh.KIDS_AUTH_PROXY_SETUP_STARTED
            defpackage.brnb.a(r6)
            if (r5 != 0) goto L83
            brci r5 = r4.j
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
            ausn r5 = com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity.m
            eltz r5 = r5.j()
            eluo r5 = (defpackage.eluo) r5
            java.lang.String r6 = "No suitable activity for account setup was found."
            r5.x(r6)
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_SETUP_ERROR_NO_SETUP_ACTIVITY
            defpackage.brnb.a(r5)
            r4.n()
            goto L7f
        L75:
            aca r5 = r4.o
            r5.b(r6)
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_SETUP_LAUNCHED
            defpackage.brnb.a(r5)
        L7f:
            fxrq r5 = defpackage.fxrq.a
            return r5
        L82:
            return r1
        L83:
            exgh r5 = defpackage.exgh.KIDS_AUTH_PROXY_SETUP_ERROR_SAVED_INSTANCE
            defpackage.brnb.a(r5)
            fxrq r5 = defpackage.fxrq.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity.a(android.os.Bundle, fxun):java.lang.Object");
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
    public final java.lang.Object k(android.os.Bundle r11, defpackage.fxun r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity.k(android.os.Bundle, fxun):java.lang.Object");
    }

    @Override // defpackage.brmp
    public final void l(int i, int i2) {
        overridePendingTransition(i, i2);
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        brnb.a(i2 != -1 ? i2 != 0 ? exgh.KIDS_AUTH_SETUP_ACTIVITY_RESULT_UNKNOWN : exgh.KIDS_AUTH_SETUP_ACTIVITY_RESULT_CANCELED : exgh.KIDS_AUTH_SETUP_ACTIVITY_RESULT_SUCCESS);
        if (intent == null || !intent.getBooleanExtra("intentionally_canceled", false)) {
            return;
        }
        brnb.a(exgh.KIDS_AUTH_SETUP_ACTIVITY_RESULT_INTENTIONAL_CANCEL);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        brnb.a(exgh.KIDS_AUTH_SETUP_ACTIVITY_STARTED);
        if (!fxxm.n(getCallingPackage(), "com.google.android.gms")) {
            ((eluo) m.j()).B("Expecting to receive intent from GMS Core, received from: %s", getCallingPackage());
            n();
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
            Context context = brasVar.a;
            this.l = new brmk(context, brasVar.b, brmn.c(context), brmm.c(context));
            this.j = brasVar.a();
            this.k = new brds(brasVar.r);
        }
        if (fsbd.c()) {
            fycr.b(jvd.a(this), null, null, new brbm(this, bundle, null), 3);
        } else {
            fycr.b(jvd.a(this), null, null, new brbn(this, bundle, null), 3);
        }
    }
}
