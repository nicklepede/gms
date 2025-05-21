package com.google.android.gms.auth.account.accounttransfer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import defpackage.arwm;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountTransferChimeraReceiver extends BroadcastReceiver {
    private static final Collection b = Arrays.asList("com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE", "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE", "com.google.android.gms.auth.START_ACCOUNT_EXPORT");

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.w("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferReceiver] onReceive(intent=null)", new Object[0]));
            return;
        }
        String action = intent.getAction();
        arwm.s(action);
        String stringExtra = intent.getStringExtra("key_extra_account_type");
        if (b.contains(action)) {
            Intent startIntent = IntentOperation.getStartIntent(context, AccountTransferIntentOperation.class, action);
            if (startIntent == null) {
                Log.w("Auth", String.format(Locale.US, "[AccountTransfer, AccountTransferReceiver] IntentOperation null", new Object[0]));
                return;
            }
            if (stringExtra != null) {
                startIntent.putExtra("key_extra_account_type", stringExtra);
            }
            context.startService(startIntent);
        }
    }
}
