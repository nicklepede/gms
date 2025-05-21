package com.google.android.gms.tron;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.fsol;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AlarmChimeraReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;

    static {
        asot.b("TronAlarmReceiver", asej.TRON);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fsol.d();
        Intent a = CollectionChimeraService.a(context);
        a.putExtra("com.google.android.gms.tron.extra.reason", 1);
        context.startService(a);
    }
}
