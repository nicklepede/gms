package com.google.android.gms.nearby.mediums.wifi.aware;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.aware.WifiAwareManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.wifi.aware.LazyWifiAwareSession$1;
import defpackage.clno;
import defpackage.cmdz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LazyWifiAwareSession$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cmdz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyWifiAwareSession$1(cmdz cmdzVar) {
        super("nearby", "WifiAwareAvailabilityReceiver");
        this.a = cmdzVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        boolean isAvailable;
        cmdz cmdzVar = this.a;
        WifiAwareManager wifiAwareManager = cmdzVar.a;
        if (wifiAwareManager == null) {
            return;
        }
        isAvailable = wifiAwareManager.isAvailable();
        if (isAvailable) {
            return;
        }
        clno.a.b().p("WiFi Aware is no longer available.", new Object[0]);
        cmdzVar.b.execute(new Runnable() { // from class: cmdw
            @Override // java.lang.Runnable
            public final void run() {
                LazyWifiAwareSession$1.this.a.a();
            }
        });
    }
}
