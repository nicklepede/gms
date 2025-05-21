package com.google.android.gms.notifications.registration.ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase;
import com.google.android.gms.notifications.registration.ui.NotificationsRegistrationDebugChimeraActivity;
import defpackage.asrw;
import defpackage.assk;
import defpackage.assn;
import defpackage.assp;
import defpackage.bqpn;
import defpackage.csbm;
import defpackage.csep;
import defpackage.csex;
import defpackage.dxkm;
import defpackage.fuyx;
import defpackage.fvgt;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.ips;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationDebugChimeraActivity extends csex {
    public csbm j;
    public ChimeGmsAccountDatabase k;
    public final fvic l;
    public final assp m;
    public final assp n;
    public dxkm o;
    private final assp r;
    private final assp s;

    public NotificationsRegistrationDebugChimeraActivity() {
        fuyx fuyxVar = bqpn.a;
        this.l = fvid.b(bqpn.b);
        this.r = new assp(this);
        this.m = new assp(this);
        this.n = new assp(this);
        this.s = new assp(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.fuyp r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.csem
            if (r0 == 0) goto L13
            r0 = r7
            csem r0 = (defpackage.csem) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csem r0 = new csem
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fuve.b(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.fuve.b(r7)
            com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase r7 = r6.k
            if (r7 != 0) goto L3c
            java.lang.String r7 = "chimeGmsAccountDatabase"
            defpackage.fvbo.j(r7)
            r7 = 0
        L3c:
            csbr r7 = r7.v()
            r0.c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            csel r4 = new csel
            r4.<init>()
            r3 = 0
            r5 = 30
            java.lang.String r1 = "\n"
            r2 = 0
            java.lang.String r7 = defpackage.fuwt.aw(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.registration.ui.NotificationsRegistrationDebugChimeraActivity.a(fuyp):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.fuyp r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.csen
            if (r0 == 0) goto L13
            r0 = r5
            csen r0 = (defpackage.csen) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csen r0 = new csen
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fuve.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fuve.b(r5)
            dxkm r5 = r4.o
            if (r5 != 0) goto L3c
            java.lang.String r5 = "registrationDataStore"
            defpackage.fvbo.j(r5)
            r5 = 0
        L3c:
            enss r5 = r5.a()
            java.lang.String r2 = "getData(...)"
            defpackage.fvbo.e(r5, r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fvug.c(r5, r0)
            if (r5 == r1) goto L89
        L4d:
            csbj r5 = (defpackage.csbj) r5
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "EEE, MMM d H:mm:ss"
            java.lang.String r0 = android.text.format.DateFormat.getBestDateTimePattern(r0, r1)
            fefi r1 = r5.e
            if (r1 != 0) goto L5f
            fefi r1 = defpackage.fefi.a
        L5f:
            long r1 = defpackage.fegx.b(r1)
            java.lang.CharSequence r0 = android.text.format.DateFormat.format(r0, r1)
            java.lang.String r5 = r5.f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n          "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "\n          Reason: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = "\n        "
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = defpackage.fvfj.b(r5)
            return r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.registration.ui.NotificationsRegistrationDebugChimeraActivity.k(fuyp):java.lang.Object");
    }

    public final void l() {
        fvgt.b(this.l, null, null, new csep(this, null), 3);
    }

    @Override // defpackage.csex, defpackage.anxn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Notifications Registration");
        int i = ips.a;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        l();
    }

    @Override // defpackage.anxn
    protected final void q(assn assnVar) {
        assk asskVar = assnVar != null ? assnVar.a : null;
        assp asspVar = this.r;
        asspVar.o(0);
        asspVar.s("Register");
        asspVar.q("Registers all accounts on the device");
        asspVar.n(new asrw() { // from class: csek
            @Override // defpackage.asrw
            public final void p(View view, assp asspVar2) {
                NotificationsRegistrationDebugChimeraActivity notificationsRegistrationDebugChimeraActivity = NotificationsRegistrationDebugChimeraActivity.this;
                fvgt.b(notificationsRegistrationDebugChimeraActivity.l, null, null, new cseu(notificationsRegistrationDebugChimeraActivity, null), 3);
            }
        });
        if (asskVar != null) {
            asskVar.k(asspVar);
        }
        assk I = assnVar != null ? assnVar.I("Registration Status") : null;
        assp asspVar2 = this.s;
        asspVar2.o(0);
        asspVar2.s("Refresh");
        asspVar2.q("Reloads the data below");
        asspVar2.n(new asrw() { // from class: csej
            @Override // defpackage.asrw
            public final void p(View view, assp asspVar3) {
                NotificationsRegistrationDebugChimeraActivity.this.l();
            }
        });
        if (I != null) {
            I.k(asspVar2);
        }
        assp asspVar3 = this.m;
        asspVar3.s("Last Successful Registration");
        if (I != null) {
            I.k(asspVar3);
        }
        assp asspVar4 = this.n;
        asspVar4.s("Accounts Status");
        if (I != null) {
            I.k(asspVar4);
        }
    }

    @Override // defpackage.anxn
    public final void r() {
    }
}
