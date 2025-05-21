package com.google.android.gms.auth.folsom.operation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.abnf;
import defpackage.abng;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.ekch;
import java.util.Locale;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FolsomNotificationIntentOperation extends IntentOperation {
    private static final arxo a = abng.a("FolsomNotificationIntentOperation");

    public static PendingIntent a(Context context, String str, String str2, int i) {
        arwm.s(str);
        Intent startIntent = IntentOperation.getStartIntent(context, FolsomNotificationIntentOperation.class, "com.google.android.gms.auth.folsom.NOTIFICATION_DISMISSED");
        arwm.t(startIntent, "Error getting FolsomNotificationIntentOperation.");
        Uri parse = Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.FolsomNotificationIntentOperation/%s/%s/%d", str2, str, Integer.valueOf(i)));
        startIntent.putExtra("domain", str);
        startIntent.putExtra("event_type", i);
        startIntent.setData(parse);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FolsomNotificationIntentOperation.class, startIntent, 0, 1207959552);
        arwm.t(pendingIntent, "Getting null PendingIntent.");
        return pendingIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.d("onHandleIntent(). Action: ".concat(String.valueOf(intent.getAction())), new Object[0]);
        String uuid = UUID.randomUUID().toString();
        if ("com.google.android.gms.auth.folsom.NOTIFICATION_DISMISSED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("domain");
            int a2 = ekch.a(intent.getIntExtra("event_type", 0));
            if (stringExtra == null || a2 == 0) {
                return;
            }
            abnf.h(stringExtra, a2, uuid);
        }
    }
}
