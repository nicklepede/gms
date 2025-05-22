package com.google.android.gms.people.sync.focus.progressupdate.notification;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cvts;
import defpackage.cvtu;
import defpackage.cvyt;
import defpackage.cwof;
import defpackage.cxih;
import defpackage.cxin;
import defpackage.enme;
import defpackage.enmq;
import defpackage.enna;
import defpackage.ennb;
import defpackage.enng;
import defpackage.ennj;
import defpackage.ennm;
import defpackage.ennz;
import defpackage.eoac;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.ftyr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationReceiver extends TracingBroadcastReceiver {
    public cxin a;
    private final cvyt b;

    public NotificationReceiver(cvyt cvytVar, cxin cxinVar) {
        super("people");
        this.b = cvytVar;
        this.a = cxinVar;
    }

    private static void b(cxih cxihVar, int i) {
        cvts a = cvts.a();
        fgrc v = ennb.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i2 = cxihVar.c;
        ennb ennbVar = (ennb) v.b;
        ennbVar.b |= 1;
        ennbVar.c = i2;
        fgrc v2 = enna.a.v();
        eoac eoacVar = cxihVar.d;
        int i3 = eoacVar == eoac.UNKNOWN_STAGE ? 3 : 2;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        enna ennaVar = (enna) fgriVar;
        ennaVar.c = i3 - 1;
        ennaVar.b |= 1;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        enna ennaVar2 = (enna) fgriVar2;
        ennaVar2.d = eoacVar.h;
        ennaVar2.b |= 2;
        int i4 = cxihVar.e;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        enna ennaVar3 = (enna) fgriVar3;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        ennaVar3.e = i5;
        ennaVar3.b |= 4;
        if (!fgriVar3.L()) {
            v2.U();
        }
        enna ennaVar4 = (enna) v2.b;
        ennaVar4.f = i - 1;
        ennaVar4.b |= 8;
        enna ennaVar5 = (enna) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        ennb ennbVar2 = (ennb) v.b;
        ennaVar5.getClass();
        ennbVar2.b();
        ennbVar2.e.add(ennaVar5);
        ennb ennbVar3 = (ennb) v.Q();
        fgrc v3 = ennm.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        String str = cxihVar.a;
        fgri fgriVar4 = v3.b;
        ennm ennmVar = (ennm) fgriVar4;
        ennmVar.b |= 16;
        ennmVar.g = 80;
        if (str != null) {
            if (!fgriVar4.L()) {
                v3.U();
            }
            ennm ennmVar2 = (ennm) v3.b;
            ennmVar2.b |= 32768;
            ennmVar2.s = str;
        }
        enmq enmqVar = (enmq) enng.a.v();
        if (!enmqVar.b.L()) {
            enmqVar.U();
        }
        enng enngVar = (enng) enmqVar.b;
        ennbVar3.getClass();
        enngVar.b();
        enngVar.n.add(ennbVar3);
        enng enngVar2 = (enng) enmqVar.Q();
        enme enmeVar = (enme) ennj.a.v();
        if (!enmeVar.b.L()) {
            enmeVar.U();
        }
        ennj ennjVar = (ennj) enmeVar.b;
        enngVar2.getClass();
        ennjVar.f = enngVar2;
        ennjVar.b |= 1048576;
        if (!v3.b.L()) {
            v3.U();
        }
        ennm ennmVar3 = (ennm) v3.b;
        ennj ennjVar2 = (ennj) enmeVar.Q();
        ennjVar2.getClass();
        ennmVar3.p = ennjVar2;
        ennmVar3.b |= 8192;
        fgrc v4 = ennz.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        String str2 = cxihVar.b;
        ennz ennzVar = (ennz) v4.b;
        ennm ennmVar4 = (ennm) v3.Q();
        ennmVar4.getClass();
        ennzVar.e = ennmVar4;
        ennzVar.b |= 4;
        cvtu cvtuVar = a.b;
        cvtu.b(str2, v4);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        Intent f;
        String action = intent.getAction();
        if (action == null) {
            cwof.c("FSA2_NotificationReceiver", "Should not receive null intent.");
            return;
        }
        cxih n = this.a.n();
        if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN")) {
            this.b.w(n.b);
            b(n, 8);
            return;
        }
        if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP")) {
            this.b.w(n.b);
            if (ftyr.a.lK().r()) {
                b(n, 8);
                return;
            }
            return;
        }
        if (action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN")) {
            Intent f2 = this.a.f();
            if (f2 != null) {
                try {
                    context.startActivity(f2.setFlags(268435456));
                    b(n, 7);
                    return;
                } catch (ActivityNotFoundException e) {
                    cwof.m("FSA2_NotificationReceiver", "Activity not found when starting tap intent.", e);
                    b(n, 10);
                    return;
                }
            }
            return;
        }
        if (!action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP") || (f = this.a.f()) == null) {
            return;
        }
        try {
            context.startActivity(f.setFlags(268435456));
            b(n, 7);
        } catch (ActivityNotFoundException e2) {
            cwof.m("FSA2_NotificationReceiver", "Activity not found when starting tap intent.", e2);
            b(n, 10);
        }
    }
}
