package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.caqj;
import defpackage.cead;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class HotspotEnabler$WifiApStateBroadcastReceiver extends TracingBroadcastReceiver {
    public final Handler a;
    public Runnable b;
    public final /* synthetic */ cead c;
    private final ResultReceiver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotspotEnabler$WifiApStateBroadcastReceiver(cead ceadVar, ResultReceiver resultReceiver) {
        super("auth_magictether");
        this.c = ceadVar;
        this.d = resultReceiver;
        this.a = new caqj();
    }

    public final void b(Context context, int i) {
        cead.d(this.d, i, null);
        context.unregisterReceiver(this);
        this.a.removeCallbacks(this.b);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("wifi_state", -1);
            if (intExtra == 13) {
                b(context, 0);
            } else if (intExtra == 14) {
                b(context, 2);
            }
        }
    }
}
