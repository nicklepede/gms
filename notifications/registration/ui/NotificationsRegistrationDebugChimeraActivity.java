package com.google.android.gms.notifications.registration.ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase;
import com.google.android.gms.notifications.registration.ui.NotificationsRegistrationDebugChimeraActivity;
import defpackage.auvq;
import defpackage.auwe;
import defpackage.auwh;
import defpackage.auwj;
import defpackage.bsxe;
import defpackage.cukr;
import defpackage.cunu;
import defpackage.cuoc;
import defpackage.dzwm;
import defpackage.fxuv;
import defpackage.fycr;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.iri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationDebugChimeraActivity extends cuoc {
    public cukr j;
    public ChimeGmsAccountDatabase k;
    public final fyea l;
    public final auwj m;
    public final auwj n;
    public dzwm o;
    private final auwj r;
    private final auwj s;

    public NotificationsRegistrationDebugChimeraActivity() {
        fxuv fxuvVar = bsxe.a;
        this.l = fyeb.b(bsxe.b);
        this.r = new auwj(this);
        this.m = new auwj(this);
        this.n = new auwj(this);
        this.s = new auwj(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.fxun r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cunr
            if (r0 == 0) goto L13
            r0 = r7
            cunr r0 = (defpackage.cunr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cunr r0 = new cunr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fxrc.b(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.fxrc.b(r7)
            com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase r7 = r6.k
            if (r7 != 0) goto L3c
            java.lang.String r7 = "chimeGmsAccountDatabase"
            defpackage.fxxm.j(r7)
            r7 = 0
        L3c:
            cukw r7 = r7.v()
            r0.c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            cunq r4 = new cunq
            r4.<init>()
            r3 = 0
            r5 = 30
            java.lang.String r1 = "\n"
            r2 = 0
            java.lang.String r7 = defpackage.fxsr.aw(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.registration.ui.NotificationsRegistrationDebugChimeraActivity.a(fxun):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.fxun r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cuns
            if (r0 == 0) goto L13
            r0 = r5
            cuns r0 = (defpackage.cuns) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuns r0 = new cuns
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fxrc.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fxrc.b(r5)
            dzwm r5 = r4.o
            if (r5 != 0) goto L3c
            java.lang.String r5 = "registrationDataStore"
            defpackage.fxxm.j(r5)
            r5 = 0
        L3c:
            eqgl r5 = r5.a()
            java.lang.String r2 = "getData(...)"
            defpackage.fxxm.e(r5, r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fyqe.b(r5, r0)
            if (r5 == r1) goto L89
        L4d:
            cuko r5 = (defpackage.cuko) r5
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "EEE, MMM d H:mm:ss"
            java.lang.String r0 = android.text.format.DateFormat.getBestDateTimePattern(r0, r1)
            fgub r1 = r5.e
            if (r1 != 0) goto L5f
            fgub r1 = defpackage.fgub.a
        L5f:
            long r1 = defpackage.fgvq.b(r1)
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
            java.lang.String r5 = defpackage.fybh.b(r5)
            return r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.registration.ui.NotificationsRegistrationDebugChimeraActivity.k(fxun):java.lang.Object");
    }

    public final void l() {
        fycr.b(this.l, null, null, new cunu(this, null), 3);
    }

    @Override // defpackage.cuoc, defpackage.apzf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Notifications Registration");
        int i = iri.a;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        l();
    }

    @Override // defpackage.apzf
    protected final void q(auwh auwhVar) {
        auwe auweVar = auwhVar != null ? auwhVar.a : null;
        auwj auwjVar = this.r;
        auwjVar.o(0);
        auwjVar.s("Register");
        auwjVar.q("Registers all accounts on the device");
        auwjVar.n(new auvq() { // from class: cunp
            @Override // defpackage.auvq
            public final void p(View view, auwj auwjVar2) {
                NotificationsRegistrationDebugChimeraActivity notificationsRegistrationDebugChimeraActivity = NotificationsRegistrationDebugChimeraActivity.this;
                fycr.b(notificationsRegistrationDebugChimeraActivity.l, null, null, new cunz(notificationsRegistrationDebugChimeraActivity, null), 3);
            }
        });
        if (auweVar != null) {
            auweVar.k(auwjVar);
        }
        auwe I = auwhVar != null ? auwhVar.I("Registration Status") : null;
        auwj auwjVar2 = this.s;
        auwjVar2.o(0);
        auwjVar2.s("Refresh");
        auwjVar2.q("Reloads the data below");
        auwjVar2.n(new auvq() { // from class: cuno
            @Override // defpackage.auvq
            public final void p(View view, auwj auwjVar3) {
                NotificationsRegistrationDebugChimeraActivity.this.l();
            }
        });
        if (I != null) {
            I.k(auwjVar2);
        }
        auwj auwjVar3 = this.m;
        auwjVar3.s("Last Successful Registration");
        if (I != null) {
            I.k(auwjVar3);
        }
        auwj auwjVar4 = this.n;
        auwjVar4.s("Accounts Status");
        if (I != null) {
            I.k(auwjVar4);
        }
    }

    @Override // defpackage.apzf
    public final void r() {
    }
}
