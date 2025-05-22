package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$16;
import defpackage.cqyr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NearbySharingProvider$16 extends TracingBroadcastReceiver {
    public final /* synthetic */ cqyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbySharingProvider$16(cqyr cqyrVar) {
        super("nearby", "WifiStateChangeReceiver");
        this.a = cqyrVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        this.a.aY(new Runnable() { // from class: cqxc
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                boolean b = atyq.b(intent2.getAction(), "android.net.wifi.STATE_CHANGE");
                NearbySharingProvider$16 nearbySharingProvider$16 = NearbySharingProvider$16.this;
                if (b) {
                    NetworkInfo networkInfo = (NetworkInfo) intent2.getParcelableExtra("networkInfo");
                    if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.DISCONNECTED) {
                        nearbySharingProvider$16.a.aa.set(System.currentTimeMillis());
                        conm.a.b().p("Wifi is disconnected", new Object[0]);
                        return;
                    }
                    return;
                }
                if (atyq.b(intent2.getAction(), "android.net.wifi.WIFI_STATE_CHANGED") && intent2.getIntExtra("wifi_state", -1) == 3) {
                    chet chetVar = conm.a;
                    chetVar.b().p("Wifi is enabled", new Object[0]);
                    cqyr cqyrVar = nearbySharingProvider$16.a;
                    cqya cqyaVar = (cqya) cqyrVar.ac.getAndSet(null);
                    if (cqyaVar == null || cqyaVar.a == null) {
                        return;
                    }
                    chetVar.b().p("Cancel alarm and run bandwidth upgrade.", new Object[0]);
                    cheb chebVar = cqyaVar.m;
                    if (chebVar != null) {
                        chebVar.b();
                        cqyaVar.m = null;
                    }
                    cqyrVar.l.R(cqyaVar.a);
                }
            }
        });
    }
}
