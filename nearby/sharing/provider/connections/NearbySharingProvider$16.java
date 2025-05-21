package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$16;
import defpackage.copw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NearbySharingProvider$16 extends TracingBroadcastReceiver {
    public final /* synthetic */ copw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbySharingProvider$16(copw copwVar) {
        super("nearby", "WifiStateChangeReceiver");
        this.a = copwVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.aY(new Runnable() { // from class: cooh
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                boolean b = arwb.b(intent2.getAction(), "android.net.wifi.STATE_CHANGE");
                NearbySharingProvider$16 nearbySharingProvider$16 = NearbySharingProvider$16.this;
                if (b) {
                    NetworkInfo networkInfo = (NetworkInfo) intent2.getParcelableExtra("networkInfo");
                    if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.DISCONNECTED) {
                        nearbySharingProvider$16.a.aa.set(System.currentTimeMillis());
                        cmfe.a.b().p("Wifi is disconnected", new Object[0]);
                        return;
                    }
                    return;
                }
                if (arwb.b(intent2.getAction(), "android.net.wifi.WIFI_STATE_CHANGED") && intent2.getIntExtra("wifi_state", -1) == 3) {
                    cexi cexiVar = cmfe.a;
                    cexiVar.b().p("Wifi is enabled", new Object[0]);
                    copw copwVar = nearbySharingProvider$16.a;
                    copf copfVar = (copf) copwVar.ac.getAndSet(null);
                    if (copfVar == null || copfVar.a == null) {
                        return;
                    }
                    cexiVar.b().p("Cancel alarm and run bandwidth upgrade.", new Object[0]);
                    cewq cewqVar = copfVar.m;
                    if (cewqVar != null) {
                        cewqVar.b();
                        copfVar.m = null;
                    }
                    copwVar.l.R(copfVar.a);
                }
            }
        });
    }
}
