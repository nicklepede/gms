package com.google.android.gms.smartdevice.logging;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.dfgj;
import defpackage.dfjk;
import defpackage.dgef;
import defpackage.dgyt;
import defpackage.efxh;
import defpackage.fuyd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private static final auad a = new dgyt(new String[]{"SetupWizardFinishedIntentOperation"});
    private efxh b;
    private dfgj c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        efxh a2 = efxh.a(getApplicationContext());
        dfgj a3 = dfjk.a(getApplicationContext());
        this.b = a2;
        this.c = a3;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            a.f("Received null intent", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.gms.smartdevice.logging.SETUP_WIZARD_FINISHED")) {
            a.f("Received unexpected intent action: %s", String.valueOf(action));
        } else {
            if (fuyd.a.lK().e()) {
                CleanBufferedLogsService.d(getApplicationContext());
                return;
            }
            dgef dgefVar = new dgef(getApplicationContext(), this.c);
            dgefVar.a(this.b, "SMART_SETUP");
            dgefVar.a(this.b, "ANDROID_AUTH");
        }
    }
}
