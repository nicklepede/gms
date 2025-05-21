package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.byhr;
import defpackage.cbrl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class HotspotEnabler$WifiApStateBroadcastReceiver extends TracingBroadcastReceiver {
    public final Handler a;
    public Runnable b;
    public final /* synthetic */ cbrl c;
    private final ResultReceiver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotspotEnabler$WifiApStateBroadcastReceiver(cbrl cbrlVar, ResultReceiver resultReceiver) {
        super("auth_magictether");
        this.c = cbrlVar;
        this.d = resultReceiver;
        this.a = new byhr();
    }

    public final void b(Context context, int i) {
        cbrl.d(this.d, i, null);
        context.unregisterReceiver(this);
        this.a.removeCallbacks(this.b);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
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
