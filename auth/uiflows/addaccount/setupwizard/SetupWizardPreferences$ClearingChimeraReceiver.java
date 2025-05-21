package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.fsdg;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetupWizardPreferences$ClearingChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent startIntent;
        context.getSharedPreferences("com.google.android.gms.auth.accounts.addaccount.setupwizard.SetupWizardPreferences", 0).edit().clear().apply();
        Intent startIntent2 = IntentOperation.getStartIntent(context, BufferedLogsUploadIntentOperation.class, "com.google.android.gms.auth.uiflows.addaccount.setupwizard.auth_action_suw_finished");
        if (startIntent2 != null) {
            context.startService(startIntent2);
        } else {
            Log.e("Auth", String.format(Locale.US, "[SetupWizardPreferences] Unable to create an intent for BufferedLogsUploadIntentOperation.", new Object[0]));
        }
        Intent startIntent3 = IntentOperation.getStartIntent(context, "com.google.android.gms.enterprise.loader.service.operation.ConsentedLoggingUploadIntentOperation", "com.google.android.gms.enterprise.loader.service.operation.ACTION_SUW_FINISHED");
        if (startIntent3 != null) {
            context.startService(startIntent3);
        } else {
            Log.e("Auth", String.format(Locale.US, "[SetupWizardPreferences] Unable to create an intent for ConsentedLoggingUploadIntentOperation.", new Object[0]));
        }
        if (!fsdg.c() || (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.smartdevice.logging.SetupWizardFinishedIntentOperation", "com.google.android.gms.smartdevice.logging.SETUP_WIZARD_FINISHED")) == null) {
            return;
        }
        context.startService(startIntent);
    }
}
