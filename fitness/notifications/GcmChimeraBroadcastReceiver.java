package com.google.android.gms.fitness.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.asot;
import defpackage.bfji;
import defpackage.bggg;
import defpackage.bgzx;
import defpackage.bhaf;
import defpackage.bhyk;
import defpackage.ejhf;
import defpackage.erdc;
import defpackage.erdd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final asot b = bhaf.a();

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bhyk.a(context);
        if ("gcm".equals(bhyk.e(intent))) {
            String stringExtra = intent.getStringExtra("action");
            if (stringExtra == null) {
                ((ejhf) ((ejhf) b.i()).ah((char) 4676)).x("Received a chime message without any action");
                return;
            }
            String stringExtra2 = intent.getStringExtra("account");
            if (stringExtra2 == null) {
                ((ejhf) ((ejhf) b.i()).ah((char) 4675)).x("Received a chime message without any account");
                return;
            }
            if (!bggg.a(context).e().d().contains(stringExtra2)) {
                ((ejhf) ((ejhf) b.i()).ah((char) 4674)).x("Received a chime message with an account not available on this device");
            } else if ("sync".equals(stringExtra)) {
                bgzx.a(context, stringExtra2, bfji.SERVER_INITIATED);
            } else {
                ((ejhf) ((ejhf) b.i()).ah((char) 4673)).B("Invalid chime message with action: %s", new erdd(erdc.NO_USER_DATA, stringExtra));
            }
        }
    }
}
