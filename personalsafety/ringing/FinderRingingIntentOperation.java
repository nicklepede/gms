package com.google.android.gms.personalsafety.ringing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.personalsafety.ringing.FinderRingingIntentOperation;
import defpackage.asot;
import defpackage.cvpm;
import defpackage.cvpo;
import defpackage.cvpp;
import defpackage.cvrt;
import defpackage.cvru;
import defpackage.cvrw;
import defpackage.cvsm;
import defpackage.cvsn;
import defpackage.dwhk;
import defpackage.dwnv;
import defpackage.dwnw;
import defpackage.dwnx;
import defpackage.dwom;
import defpackage.dwup;
import defpackage.egmx;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.eugh;
import defpackage.evwo;
import defpackage.evwq;
import defpackage.evwr;
import defpackage.feay;
import defpackage.fixm;
import defpackage.fmzp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FinderRingingIntentOperation extends IntentOperation {
    public cvsm a;
    public final List b = new ArrayList();
    public int c = 0;
    cvrt d;
    public dwom e;

    public final void a(cvsm cvsmVar) {
        cvpm a = cvpm.a(getApplicationContext());
        if (a == null) {
            ((ejhf) cvpo.a.i()).x("ClearcutLogger is null");
            return;
        }
        String str = cvsmVar.a;
        evwo evwoVar = (evwo) evwr.a.v();
        String c = cvpp.c(str);
        if (!evwoVar.b.L()) {
            evwoVar.U();
        }
        evwr evwrVar = (evwr) evwoVar.b;
        evwrVar.b |= 2;
        evwrVar.d = c;
        evwoVar.a(this.b);
        if (!evwoVar.b.L()) {
            evwoVar.U();
        }
        evwr evwrVar2 = (evwr) evwoVar.b;
        evwrVar2.b |= 64;
        evwrVar2.j = 5;
        Long l = cvsmVar.e;
        if (l != null) {
            long longValue = l.longValue();
            if (!evwoVar.b.L()) {
                evwoVar.U();
            }
            evwr evwrVar3 = (evwr) evwoVar.b;
            evwrVar3.b |= 1;
            evwrVar3.c = longValue;
        }
        Long l2 = cvsmVar.c;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            if (!evwoVar.b.L()) {
                evwoVar.U();
            }
            evwr evwrVar4 = (evwr) evwoVar.b;
            evwrVar4.b |= 8;
            evwrVar4.g = longValue2;
        }
        evwq evwqVar = cvsmVar.i;
        if (evwqVar != null) {
            if (!evwoVar.b.L()) {
                evwoVar.U();
            }
            evwr evwrVar5 = (evwr) evwoVar.b;
            evwrVar5.i = evwqVar.f;
            evwrVar5.b |= 32;
        }
        Long l3 = cvsmVar.g;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            if (!evwoVar.b.L()) {
                evwoVar.U();
            }
            evwr evwrVar6 = (evwr) evwoVar.b;
            evwrVar6.b |= 16;
            evwrVar6.h = longValue3;
        }
        Integer num = cvsmVar.h;
        if (num != null) {
            int intValue = num.intValue();
            if (!evwoVar.b.L()) {
                evwoVar.U();
            }
            evwr evwrVar7 = (evwr) evwoVar.b;
            evwrVar7.b |= 4;
            evwrVar7.f = intValue;
        }
        a.e((evwr) evwoVar.Q());
    }

    public final void b(cvsm cvsmVar) {
        if (fmzp.ah()) {
            fmzp fmzpVar = fmzp.a;
            if (fmzpVar.a().aO()) {
                this.c++;
                this.a = cvsmVar;
                String str = cvsmVar.a;
                if (this.d == null) {
                    fixm fixmVar = cvru.a;
                    this.d = new cvrt();
                }
                this.d.a(this);
                Context applicationContext = getApplicationContext();
                dwnw a = dwnx.a();
                a.a = eiid.j(str);
                a.b((int) fmzp.x());
                a.c(true);
                dwnx a2 = a.a();
                dwhk dwhkVar = new dwhk(null);
                if (!fmzpVar.a().bA()) {
                    asot asotVar = cvpo.a;
                    String str2 = cvsmVar.j;
                    if (str2 == null) {
                        ((ejhf) cvpo.a.i()).B("%s Missing ring key.", "[S]");
                        return;
                    }
                    dwhkVar.b(feay.B(str2));
                }
                egmx f = egmx.f(this.e.a(new dwnv() { // from class: cvrv
                    @Override // defpackage.dwnv
                    public final enss a(dwny dwnyVar) {
                        asot asotVar2 = cvpo.a;
                        if (dwnyVar.ordinal() != 4) {
                            ((ejhf) cvpo.a.i()).P("%s Unexpected progress status: %s", "[S]", dwnyVar.name());
                        } else {
                            FinderRingingIntentOperation finderRingingIntentOperation = FinderRingingIntentOperation.this;
                            fecj v = evvc.a.v();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fecp fecpVar = v.b;
                            evvc evvcVar = (evvc) fecpVar;
                            evvcVar.b |= 1;
                            evvcVar.c = currentTimeMillis;
                            evvb evvbVar = evvb.CONNECT;
                            if (!fecpVar.L()) {
                                v.U();
                            }
                            List list = finderRingingIntentOperation.b;
                            evvc evvcVar2 = (evvc) v.b;
                            evvcVar2.d = evvbVar.h;
                            evvcVar2.b |= 2;
                            list.add((evvc) v.Q());
                            cvsi.a(finderRingingIntentOperation.getApplicationContext(), 5, finderRingingIntentOperation.a.a, "com.google.android.personalsafety.internal.ringing.CONNECTION_SUCCESSFUL");
                        }
                        return ensm.a;
                    }
                }).d(a2, dwhkVar.a(), eugh.DEVICE_COMPONENT_UNSPECIFIED, (int) fmzp.C(), 2));
                f.k(new cvrw(this, applicationContext, str, cvsmVar), enre.a);
                dwup.a("Ring tag", f);
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            ((ejhf) cvpo.a.i()).B("%s Intent is null", "[S]");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.personalsafety.internal.ringing.RING_TAG")) {
            ((ejhf) cvpo.a.j()).P("%s Unknown action received: %s", "[S]", action);
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((ejhf) cvpo.a.j()).B("%s Ringing intent extras are null", "[S]");
            return;
        }
        cvsm a = cvsn.a(extras);
        if (a == null) {
            ((ejhf) cvpo.a.i()).B("%s TagRingingInfo is null.", "[S]");
            return;
        }
        this.b.clear();
        this.c = 0;
        b(a);
    }
}
