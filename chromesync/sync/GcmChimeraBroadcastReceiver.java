package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.arhe;
import defpackage.arsp;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkcz;
import defpackage.eluo;
import defpackage.foxu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final ausn b = ausn.b("GcmChimeraBroadcastReceiver", auid.CHROME_SYNC);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        bkcz.a(context);
        if ("gcm".equals(bkcz.e(intent))) {
            try {
                foxu.a.lK().o();
                ausn ausnVar = SyncIntentOperation.a;
                context.startService(arsp.a(context, intent));
            } catch (arhe e) {
                ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 3070)).x("GcmChimeraBroadcastReceiver: Error in creating sync intent.");
            }
        }
    }
}
