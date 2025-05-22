package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;
import defpackage.auad;
import defpackage.aura;
import defpackage.auua;
import defpackage.casd;
import defpackage.ekus;
import defpackage.tmt;
import defpackage.usy;
import defpackage.uvs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FlagChangedIntentOperation extends uvs {
    public Context b;
    public casd c;
    private static final auad e = new auad("AccountSettings", "FlagChangedOp");
    static final String a = auua.f("com.google.android.gms.accountsettings");

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((usy) tmt.a(usy.class, this.d)).b(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ((ekus.a(action, "com.google.android.gms.phenotype.COMMITTED") || ekus.a(action, a)) ? ekus.a(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.accountsettings") : ekus.a(action, "com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            if (aura.a(this.b, "com.google.android.gms.accountsettings.service.PurgeScreenDataService") != 1) {
                e.j("Service isn't enabled - drop scheduling task", new Object[0]);
            } else {
                this.c.f(PurgeScreenDataChimeraService.b());
            }
        }
    }
}
