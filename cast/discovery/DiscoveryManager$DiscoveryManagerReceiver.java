package com.google.android.gms.cast.discovery;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.cast.discovery.DiscoveryManager$DiscoveryManagerReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aopg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DiscoveryManager$DiscoveryManagerReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ aopg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryManager$DiscoveryManagerReceiver(aopg aopgVar) {
        super("cast");
        this.a = aopgVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        this.a.e.execute(new Runnable() { // from class: aopf
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                if (intent2 == null) {
                    return;
                }
                aopg aopgVar = DiscoveryManager$DiscoveryManagerReceiver.this.a;
                if (aopgVar.p) {
                    return;
                }
                if (TextUtils.equals("android.intent.action.SCREEN_OFF", intent2.getAction()) || TextUtils.equals("android.intent.action.SCREEN_ON", intent2.getAction())) {
                    aopgVar.e(false);
                }
            }
        });
    }
}
