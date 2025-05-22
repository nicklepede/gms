package com.google.android.gms.location.util.wifi;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.util.wifi.WifiConnectionHelper$NetworkStateChangedReceiver;
import defpackage.ccyj;
import defpackage.ccyk;
import defpackage.fsiu;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WifiConnectionHelper$NetworkStateChangedReceiver extends TracingBroadcastReceiver {
    public final ccyj a;
    public final /* synthetic */ ccyk b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiConnectionHelper$NetworkStateChangedReceiver(ccyk ccykVar, ccyj ccyjVar) {
        super(ccykVar.a);
        this.b = ccykVar;
        this.a = ccyjVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            final boolean z = false;
            if (networkInfo != null && networkInfo.isConnected()) {
                z = true;
            }
            if (z || this.c) {
                this.c = z;
                final String str = null;
                if (fsiu.v() && z) {
                    str = ((WifiManager) Objects.requireNonNull(this.b.b)).getConnectionInfo().getBSSID();
                }
                ccyk ccykVar = this.b;
                ccykVar.c.execute(new Runnable() { // from class: ccyi
                    @Override // java.lang.Runnable
                    public final void run() {
                        WifiConnectionHelper$NetworkStateChangedReceiver wifiConnectionHelper$NetworkStateChangedReceiver = WifiConnectionHelper$NetworkStateChangedReceiver.this;
                        ccyk ccykVar2 = wifiConnectionHelper$NetworkStateChangedReceiver.b;
                        synchronized (ccykVar2) {
                            if (ccykVar2.d != wifiConnectionHelper$NetworkStateChangedReceiver) {
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
