package com.google.android.gms.auth.managed.intentoperations;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.adzu;
import defpackage.adzx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RevokePasswordRequirementsIntentOperation extends IntentOperation {
    public static PendingIntent a(Context context) {
        Intent startIntent = getStartIntent(context, RevokePasswordRequirementsIntentOperation.class, "com.google.android.gms.auth.managed.REVOKE_PASSWORD_REQUIREMENTS");
        if (startIntent == null) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, RevokePasswordRequirementsIntentOperation] Cannot create PendingIntent: getStartIntent returns null.", new Object[0]));
            return null;
        }
        PendingIntent pendingIntent = getPendingIntent(context, RevokePasswordRequirementsIntentOperation.class, startIntent, 0, 1342177280);
        if (pendingIntent == null) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, RevokePasswordRequirementsIntentOperation] Cannot create PendingIntent: getPendingIntent returns null.", new Object[0]));
        }
        return pendingIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        adzu.a(this).k(7);
        adzx.f().g(this);
    }
}
