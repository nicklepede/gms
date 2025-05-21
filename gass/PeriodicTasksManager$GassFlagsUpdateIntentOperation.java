package com.google.android.gms.gass;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bhsx;
import defpackage.fnck;
import defpackage.fogm;
import defpackage.fogy;
import defpackage.fohe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PeriodicTasksManager$GassFlagsUpdateIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            if (fnck.c()) {
                bhsx.f(getBaseContext());
            } else if (!bhsx.d.equals(Long.valueOf(fogm.c())) || bhsx.e != fogm.f() || !bhsx.f.equals(Long.valueOf(fogm.b()))) {
                bhsx.e(getBaseContext());
            }
            if (fnck.i()) {
                bhsx.b(getBaseContext());
                bhsx.c(getBaseContext());
                return;
            }
            if (!bhsx.g.equals(Long.valueOf(fogy.c())) || bhsx.h != fogy.g() || !bhsx.i.equals(Long.valueOf(fogy.b()))) {
                bhsx.a(getBaseContext());
            }
            if (bhsx.j.equals(Long.valueOf(fohe.c())) && bhsx.k == fohe.i() && bhsx.m.equals(Long.valueOf(fohe.b())) && bhsx.l == fohe.g()) {
                return;
            }
            bhsx.d(getBaseContext());
        }
    }
}
