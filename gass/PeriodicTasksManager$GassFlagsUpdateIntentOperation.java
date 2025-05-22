package com.google.android.gms.gass;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bjxm;
import defpackage.fpuj;
import defpackage.fqzc;
import defpackage.fqzo;
import defpackage.fqzu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PeriodicTasksManager$GassFlagsUpdateIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            if (fpuj.c()) {
                bjxm.f(getBaseContext());
            } else if (!bjxm.d.equals(Long.valueOf(fqzc.c())) || bjxm.e != fqzc.f() || !bjxm.f.equals(Long.valueOf(fqzc.b()))) {
                bjxm.e(getBaseContext());
            }
            if (fpuj.i()) {
                bjxm.b(getBaseContext());
                bjxm.c(getBaseContext());
                return;
            }
            if (!bjxm.g.equals(Long.valueOf(fqzo.c())) || bjxm.h != fqzo.g() || !bjxm.i.equals(Long.valueOf(fqzo.b()))) {
                bjxm.a(getBaseContext());
            }
            if (bjxm.j.equals(Long.valueOf(fqzu.c())) && bjxm.k == fqzu.i() && bjxm.m.equals(Long.valueOf(fqzu.b())) && bjxm.l == fqzu.g()) {
                return;
            }
            bjxm.d(getBaseContext());
        }
    }
}
