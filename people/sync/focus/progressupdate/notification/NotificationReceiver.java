package com.google.android.gms.people.sync.focus.progressupdate.notification;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ctkm;
import defpackage.ctko;
import defpackage.ctpn;
import defpackage.cuey;
import defpackage.cuyz;
import defpackage.cuzf;
import defpackage.ekys;
import defpackage.ekze;
import defpackage.ekzo;
import defpackage.ekzp;
import defpackage.ekzu;
import defpackage.ekzx;
import defpackage.elaa;
import defpackage.elan;
import defpackage.elmp;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.frew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationReceiver extends TracingBroadcastReceiver {
    public cuzf a;
    private final ctpn b;

    public NotificationReceiver(ctpn ctpnVar, cuzf cuzfVar) {
        super("people");
        this.b = ctpnVar;
        this.a = cuzfVar;
    }

    private static void b(cuyz cuyzVar, int i) {
        ctkm a = ctkm.a();
        fecj v = ekzp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        int i2 = cuyzVar.c;
        ekzp ekzpVar = (ekzp) v.b;
        ekzpVar.b |= 1;
        ekzpVar.c = i2;
        fecj v2 = ekzo.a.v();
        elmp elmpVar = cuyzVar.d;
        int i3 = elmpVar == elmp.UNKNOWN_STAGE ? 3 : 2;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        ekzo ekzoVar = (ekzo) fecpVar;
        ekzoVar.c = i3 - 1;
        ekzoVar.b |= 1;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        ekzo ekzoVar2 = (ekzo) fecpVar2;
        ekzoVar2.d = elmpVar.h;
        ekzoVar2.b |= 2;
        int i4 = cuyzVar.e;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        ekzo ekzoVar3 = (ekzo) fecpVar3;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        ekzoVar3.e = i5;
        ekzoVar3.b |= 4;
        if (!fecpVar3.L()) {
            v2.U();
        }
        ekzo ekzoVar4 = (ekzo) v2.b;
        ekzoVar4.f = i - 1;
        ekzoVar4.b |= 8;
        ekzo ekzoVar5 = (ekzo) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        ekzp ekzpVar2 = (ekzp) v.b;
        ekzoVar5.getClass();
        ekzpVar2.b();
        ekzpVar2.e.add(ekzoVar5);
        ekzp ekzpVar3 = (ekzp) v.Q();
        fecj v3 = elaa.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        String str = cuyzVar.a;
        fecp fecpVar4 = v3.b;
        elaa elaaVar = (elaa) fecpVar4;
        elaaVar.b |= 16;
        elaaVar.g = 80;
        if (str != null) {
            if (!fecpVar4.L()) {
                v3.U();
            }
            elaa elaaVar2 = (elaa) v3.b;
            elaaVar2.b |= 32768;
            elaaVar2.s = str;
        }
        ekze ekzeVar = (ekze) ekzu.a.v();
        if (!ekzeVar.b.L()) {
            ekzeVar.U();
        }
        ekzu ekzuVar = (ekzu) ekzeVar.b;
        ekzpVar3.getClass();
        ekzuVar.b();
        ekzuVar.n.add(ekzpVar3);
        ekzu ekzuVar2 = (ekzu) ekzeVar.Q();
        ekys ekysVar = (ekys) ekzx.a.v();
        if (!ekysVar.b.L()) {
            ekysVar.U();
        }
        ekzx ekzxVar = (ekzx) ekysVar.b;
        ekzuVar2.getClass();
        ekzxVar.f = ekzuVar2;
        ekzxVar.b |= 1048576;
        if (!v3.b.L()) {
            v3.U();
        }
        elaa elaaVar3 = (elaa) v3.b;
        ekzx ekzxVar2 = (ekzx) ekysVar.Q();
        ekzxVar2.getClass();
        elaaVar3.p = ekzxVar2;
        elaaVar3.b |= 8192;
        fecj v4 = elan.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        String str2 = cuyzVar.b;
        elan elanVar = (elan) v4.b;
        elaa elaaVar4 = (elaa) v3.Q();
        elaaVar4.getClass();
        elanVar.e = elaaVar4;
        elanVar.b |= 4;
        ctko ctkoVar = a.b;
        ctko.b(str2, v4);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        Intent f;
        String action = intent.getAction();
        if (action == null) {
            cuey.c("FSA2_NotificationReceiver", "Should not receive null intent.");
            return;
        }
        cuyz n = this.a.n();
        if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN")) {
            this.b.w(n.b);
            b(n, 8);
            return;
        }
        if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP")) {
            this.b.w(n.b);
            if (frew.a.a().r()) {
                b(n, 8);
                return;
            }
            return;
        }
        if (!action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN")) {
            if (!action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP") || (f = this.a.f()) == null) {
                return;
            }
            try {
                context.startActivity(f.setFlags(268435456));
                b(n, 7);
                return;
            } catch (ActivityNotFoundException e) {
                cuey.m("FSA2_NotificationReceiver", "Activity not found when starting tap intent.", e);
                b(n, 10);
                return;
            }
        }
        Intent f2 = this.a.f();
        if (f2 != null) {
            try {
                context.startActivity(f2.setFlags(268435456));
                if (frew.f()) {
                    b(n, 7);
                }
            } catch (ActivityNotFoundException e2) {
                cuey.m("FSA2_NotificationReceiver", "Activity not found when starting tap intent.", e2);
                if (frew.f()) {
                    b(n, 10);
                }
            }
        }
    }
}
