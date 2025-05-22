package com.google.android.gms.tron;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.fvjw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AlarmChimeraReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int b = 0;

    static {
        ausn.b("TronAlarmReceiver", auid.TRON);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fvjw.d();
        Intent a = CollectionChimeraService.a(context);
        a.putExtra("com.google.android.gms.tron.extra.reason", 1);
        context.startService(a);
    }
}
