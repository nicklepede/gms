package com.google.android.gms.nearby.mediums.wifi;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.wifi.WifiRadio$1;
import defpackage.clno;
import defpackage.cmdd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WifiRadio$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cmdd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiRadio$1(cmdd cmddVar) {
        super("nearby", "ManualRadioStateReceiver");
        this.a = cmddVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        if (isInitialStickyBroadcast()) {
            clno.a.d().h("%s Long-running receiver got initial sticky broadcast.", "[WIFI_RADIO]");
            return;
        }
        cmdd cmddVar = this.a;
        cmddVar.b.execute(new Runnable() { // from class: cmdb
            @Override // java.lang.Runnable
            public final void run() {
                WifiRadio$1.this.a.b(intent);
            }
        });
    }
}
