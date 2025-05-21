package com.google.android.gms.nearby.mediums.wifi;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.wifi.WifiRadio$1;
import defpackage.cjfj;
import defpackage.cjuy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class WifiRadio$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjuy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiRadio$1(cjuy cjuyVar) {
        super("nearby", "ManualRadioStateReceiver");
        this.a = cjuyVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        if (isInitialStickyBroadcast()) {
            cjfj.a.d().h("%s Long-running receiver got initial sticky broadcast.", "[WIFI_RADIO]");
            return;
        }
        cjuy cjuyVar = this.a;
        cjuyVar.b.execute(new Runnable() { // from class: cjuw
            @Override // java.lang.Runnable
            public final void run() {
                WifiRadio$1.this.a.b(intent);
            }
        });
    }
}
