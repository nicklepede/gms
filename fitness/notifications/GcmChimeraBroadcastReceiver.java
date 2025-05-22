package com.google.android.gms.fitness.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.ausn;
import defpackage.bhny;
import defpackage.bikw;
import defpackage.bjen;
import defpackage.bjev;
import defpackage.bkcz;
import defpackage.eluo;
import defpackage.etry;
import defpackage.etrz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final ausn b = bjev.a();

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bkcz.a(context);
        if ("gcm".equals(bkcz.e(intent))) {
            String stringExtra = intent.getStringExtra("action");
            if (stringExtra == null) {
                ((eluo) ((eluo) b.i()).ai((char) 4686)).x("Received a chime message without any action");
                return;
            }
            String stringExtra2 = intent.getStringExtra("account");
            if (stringExtra2 == null) {
                ((eluo) ((eluo) b.i()).ai((char) 4685)).x("Received a chime message without any account");
                return;
            }
            if (!bikw.a(context).e().d().contains(stringExtra2)) {
                ((eluo) ((eluo) b.i()).ai((char) 4684)).x("Received a chime message with an account not available on this device");
            } else if ("sync".equals(stringExtra)) {
                bjen.a(context, stringExtra2, bhny.SERVER_INITIATED);
            } else {
                ((eluo) ((eluo) b.i()).ai((char) 4683)).B("Invalid chime message with action: %s", new etrz(etry.NO_USER_DATA, stringExtra));
            }
        }
    }
}
