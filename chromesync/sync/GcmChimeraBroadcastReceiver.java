package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.apen;
import defpackage.appy;
import defpackage.asej;
import defpackage.asot;
import defpackage.bhyk;
import defpackage.ejhf;
import defpackage.fmgi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final asot b = asot.b("GcmChimeraBroadcastReceiver", asej.CHROME_SYNC);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        bhyk.a(context);
        if ("gcm".equals(bhyk.e(intent))) {
            try {
                fmgi.a.a().p();
                asot asotVar = SyncIntentOperation.a;
                context.startService(appy.a(context, intent));
            } catch (apen e) {
                ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 3066)).x("GcmChimeraBroadcastReceiver: Error in creating sync intent.");
            }
        }
    }
}
