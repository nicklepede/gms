package com.google.android.gms.nearby.mediums.wifi.aware;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.aware.WifiAwareManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.wifi.aware.LazyWifiAwareSession$1;
import defpackage.cjfj;
import defpackage.cjvu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LazyWifiAwareSession$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjvu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyWifiAwareSession$1(cjvu cjvuVar) {
        super("nearby", "WifiAwareAvailabilityReceiver");
        this.a = cjvuVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        boolean isAvailable;
        cjvu cjvuVar = this.a;
        WifiAwareManager wifiAwareManager = cjvuVar.a;
        if (wifiAwareManager == null) {
            return;
        }
        isAvailable = wifiAwareManager.isAvailable();
        if (isAvailable) {
            return;
        }
        cjfj.a.b().p("WiFi Aware is no longer available.", new Object[0]);
        cjvuVar.b.execute(new Runnable() { // from class: cjvr
            @Override // java.lang.Runnable
            public final void run() {
                LazyWifiAwareSession$1.this.a.a();
            }
        });
    }
}
