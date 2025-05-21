package com.google.android.gms.smartdevice.logging;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.dcve;
import defpackage.dcyf;
import defpackage.ddta;
import defpackage.denq;
import defpackage.edkl;
import defpackage.fsdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private static final arxo a = new denq(new String[]{"SetupWizardFinishedIntentOperation"});
    private edkl b;
    private dcve c;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        edkl a2 = edkl.a(getApplicationContext());
        dcve a3 = dcyf.a(getApplicationContext());
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
            if (fsdg.a.a().e()) {
                CleanBufferedLogsService.d(getApplicationContext());
                return;
            }
            ddta ddtaVar = new ddta(getApplicationContext(), this.c);
            ddtaVar.a(this.b, "SMART_SETUP");
            ddtaVar.a(this.b, "ANDROID_AUTH");
        }
    }
}
