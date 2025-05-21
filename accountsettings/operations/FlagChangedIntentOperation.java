package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;
import defpackage.arxo;
import defpackage.asng;
import defpackage.asqg;
import defpackage.byjl;
import defpackage.eihn;
import defpackage.rtk;
import defpackage.sxa;
import defpackage.szu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FlagChangedIntentOperation extends szu {
    public Context b;
    public byjl c;
    private static final arxo e = new arxo("AccountSettings", "FlagChangedOp");
    static final String a = asqg.f("com.google.android.gms.accountsettings");

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((sxa) rtk.a(sxa.class, this.d)).b(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ((eihn.a(action, "com.google.android.gms.phenotype.COMMITTED") || eihn.a(action, a)) ? eihn.a(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.accountsettings") : eihn.a(action, "com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            if (asng.a(this.b, "com.google.android.gms.accountsettings.service.PurgeScreenDataService") != 1) {
                e.j("Service isn't enabled - drop scheduling task", new Object[0]);
            } else {
                this.c.f(PurgeScreenDataChimeraService.b());
            }
        }
    }
}
