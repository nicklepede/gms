package com.google.android.gms.location.util.wifi;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.util.wifi.WifiConnectionHelper$NetworkStateChangedReceiver;
import defpackage.capt;
import defpackage.capu;
import defpackage.fppc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class WifiConnectionHelper$NetworkStateChangedReceiver extends TracingBroadcastReceiver {
    public final capt a;
    public final /* synthetic */ capu b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiConnectionHelper$NetworkStateChangedReceiver(capu capuVar, capt captVar) {
        super(capuVar.a);
        this.b = capuVar;
        this.a = captVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            final boolean z = false;
            if (networkInfo != null && networkInfo.isConnected()) {
                z = true;
            }
            if (z || this.c) {
                this.c = z;
                final String str = null;
                if (fppc.v() && z) {
                    str = ((WifiManager) Objects.requireNonNull(this.b.b)).getConnectionInfo().getBSSID();
                }
                capu capuVar = this.b;
                capuVar.c.execute(new Runnable() { // from class: caps
                    @Override // java.lang.Runnable
                    public final void run() {
                        WifiConnectionHelper$NetworkStateChangedReceiver wifiConnectionHelper$NetworkStateChangedReceiver = WifiConnectionHelper$NetworkStateChangedReceiver.this;
                        capu capuVar2 = wifiConnectionHelper$NetworkStateChangedReceiver.b;
                        synchronized (capuVar2) {
                            if (capuVar2.d != wifiConnectionHelper$NetworkStateChangedReceiver) {
                                return;
                            }
                            String str2 = str;
                            wifiConnectionHelper$NetworkStateChangedReceiver.a.k(z, str2);
                        }
                    }
                });
            }
        }
    }
}
