package com.google.android.gms.personalsafety.ringing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.personalsafety.ringing.FinderRingingIntentOperation;
import defpackage.ausn;
import defpackage.cxzc;
import defpackage.cxze;
import defpackage.cxzf;
import defpackage.cybj;
import defpackage.cybk;
import defpackage.cybm;
import defpackage.cycc;
import defpackage.cycd;
import defpackage.dytl;
import defpackage.dyzw;
import defpackage.dyzx;
import defpackage.dyzy;
import defpackage.dzam;
import defpackage.dzgp;
import defpackage.ejaa;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.ewwa;
import defpackage.eymk;
import defpackage.eymm;
import defpackage.eymn;
import defpackage.fgpr;
import defpackage.flnj;
import defpackage.fpro;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FinderRingingIntentOperation extends IntentOperation {
    public cycc a;
    public final List b = new ArrayList();
    public int c = 0;
    cybj d;
    public dzam e;

    public final void a(cycc cyccVar) {
        cxzc a = cxzc.a(getApplicationContext());
        if (a == null) {
            ((eluo) cxze.a.i()).x("ClearcutLogger is null");
            return;
        }
        String str = cyccVar.a;
        eymk eymkVar = (eymk) eymn.a.v();
        String c = cxzf.c(str);
        if (!eymkVar.b.L()) {
            eymkVar.U();
        }
        eymn eymnVar = (eymn) eymkVar.b;
        eymnVar.b |= 2;
        eymnVar.d = c;
        eymkVar.a(this.b);
        if (!eymkVar.b.L()) {
            eymkVar.U();
        }
        eymn eymnVar2 = (eymn) eymkVar.b;
        eymnVar2.b |= 64;
        eymnVar2.j = 5;
        Long l = cyccVar.e;
        if (l != null) {
            long longValue = l.longValue();
            if (!eymkVar.b.L()) {
                eymkVar.U();
            }
            eymn eymnVar3 = (eymn) eymkVar.b;
            eymnVar3.b |= 1;
            eymnVar3.c = longValue;
        }
        Long l2 = cyccVar.c;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            if (!eymkVar.b.L()) {
                eymkVar.U();
            }
            eymn eymnVar4 = (eymn) eymkVar.b;
            eymnVar4.b |= 8;
            eymnVar4.g = longValue2;
        }
        eymm eymmVar = cyccVar.i;
        if (eymmVar != null) {
            if (!eymkVar.b.L()) {
                eymkVar.U();
            }
            eymn eymnVar5 = (eymn) eymkVar.b;
            eymnVar5.i = eymmVar.f;
            eymnVar5.b |= 32;
        }
        Long l3 = cyccVar.g;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            if (!eymkVar.b.L()) {
                eymkVar.U();
            }
            eymn eymnVar6 = (eymn) eymkVar.b;
            eymnVar6.b |= 16;
            eymnVar6.h = longValue3;
        }
        Integer num = cyccVar.h;
        if (num != null) {
            int intValue = num.intValue();
            if (!eymkVar.b.L()) {
                eymkVar.U();
            }
            eymn eymnVar7 = (eymn) eymkVar.b;
            eymnVar7.b |= 4;
            eymnVar7.f = intValue;
        }
        a.e((eymn) eymkVar.Q());
    }

    public final void b(cycc cyccVar) {
        if (fpro.ak()) {
            fpro fproVar = fpro.a;
            if (fproVar.lK().aT()) {
                this.c++;
                this.a = cyccVar;
                String str = cyccVar.a;
                if (this.d == null) {
                    flnj flnjVar = cybk.a;
                    this.d = new cybj();
                }
                this.d.a(this);
                Context applicationContext = getApplicationContext();
                dyzx a = dyzy.a();
                a.a = ekvi.j(str);
                a.b((int) fpro.z());
                a.c(true);
                dyzy a2 = a.a();
                dytl dytlVar = new dytl(null);
                if (!fproVar.lK().bD()) {
                    ausn ausnVar = cxze.a;
                    String str2 = cyccVar.j;
                    if (str2 == null) {
                        ((eluo) cxze.a.i()).B("%s Missing ring key.", "[S]");
                        return;
                    }
                    dytlVar.b(fgpr.B(str2));
                }
                ejaa g = ejaa.g(this.e.a(new dyzw() { // from class: cybl
                    @Override // defpackage.dyzw
                    public final eqgl a(int i) {
                        ausn ausnVar2 = cxze.a;
                        if (i - 1 != 4) {
                            ((eluo) cxze.a.i()).P("%s Unexpected progress status: %s", "[S]", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "CONNECTED" : "CONNECTING" : "SCANNING" : "RESCANNING" : "RECONNECTING");
                        } else {
                            FinderRingingIntentOperation finderRingingIntentOperation = FinderRingingIntentOperation.this;
                            fgrc v = eyky.a.v();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fgri fgriVar = v.b;
                            eyky eykyVar = (eyky) fgriVar;
                            eykyVar.b = 1 | eykyVar.b;
                            eykyVar.c = currentTimeMillis;
                            eykx eykxVar = eykx.CONNECT;
                            if (!fgriVar.L()) {
                                v.U();
                            }
                            List list = finderRingingIntentOperation.b;
                            eyky eykyVar2 = (eyky) v.b;
                            eykyVar2.d = eykxVar.h;
                            eykyVar2.b = 2 | eykyVar2.b;
                            list.add((eyky) v.Q());
                            cyby.a(finderRingingIntentOperation.getApplicationContext(), 5, finderRingingIntentOperation.a.a, "com.google.android.personalsafety.internal.ringing.CONNECTION_SUCCESSFUL");
                        }
                        return eqgf.a;
                    }
                }).d(a2, dytlVar.a(), ewwa.DEVICE_COMPONENT_UNSPECIFIED, (int) fpro.E(), 2));
                g.k(new cybm(this, applicationContext, str, cyccVar), eqex.a);
                dzgp.a("Ring tag", g);
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((eluo) cxze.a.i()).B("%s Intent is null", "[S]");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.personalsafety.internal.ringing.RING_TAG")) {
            ((eluo) cxze.a.j()).P("%s Unknown action received: %s", "[S]", action);
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((eluo) cxze.a.j()).B("%s Ringing intent extras are null", "[S]");
            return;
        }
        cycc a = cycd.a(extras);
        if (a == null) {
            ((eluo) cxze.a.i()).B("%s TagRingingInfo is null.", "[S]");
            return;
        }
        this.b.clear();
        this.c = 0;
        b(a);
    }
}
