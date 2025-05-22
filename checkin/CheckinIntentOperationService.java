package com.google.android.gms.checkin;

import android.content.Intent;
import defpackage.apth;
import defpackage.aptl;
import defpackage.apua;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fouy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CheckinIntentOperationService extends apzs {
    static {
        ausn.b("CheckinIntentSrv", auid.CHECKIN_API);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        CheckinChimeraService.d(this);
        CheckinIntentOperation.a(getBaseContext(), false, 2, false, false, null);
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        if (fouy.c()) {
            apth.a();
        }
        aptl aptlVar = (aptl) aptl.a.b();
        aptlVar.d.b();
        elgo elgoVar = aptlVar.e;
        for (int i = 0; i < ((elpg) elgoVar).c; i++) {
            ((apua) elgoVar.get(i)).c();
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
    }
}
