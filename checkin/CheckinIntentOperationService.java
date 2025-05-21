package com.google.android.gms.checkin;

import android.content.Intent;
import defpackage.anrp;
import defpackage.anrt;
import defpackage.ansi;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.fmdm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CheckinIntentOperationService extends anya {
    static {
        asot.b("CheckinIntentSrv", asej.CHECKIN_API);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        CheckinChimeraService.d(this);
        CheckinIntentOperation.a(getBaseContext(), false, 2, false, false, null);
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        if (fmdm.c()) {
            anrp.a();
        }
        anrt anrtVar = (anrt) anrt.a.b();
        anrtVar.d.b();
        eitj eitjVar = anrtVar.e;
        for (int i = 0; i < ((ejcb) eitjVar).c; i++) {
            ((ansi) eitjVar.get(i)).c();
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
    }
}
