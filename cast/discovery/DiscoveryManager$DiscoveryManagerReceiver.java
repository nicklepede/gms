package com.google.android.gms.cast.discovery;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.cast.discovery.DiscoveryManager$DiscoveryManagerReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.amnv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DiscoveryManager$DiscoveryManagerReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ amnv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryManager$DiscoveryManagerReceiver(amnv amnvVar) {
        super("cast");
        this.a = amnvVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.e.execute(new Runnable() { // from class: amnu
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                if (intent2 == null) {
                    return;
                }
                amnv amnvVar = DiscoveryManager$DiscoveryManagerReceiver.this.a;
                if (amnvVar.p) {
                    return;
                }
                if (TextUtils.equals("android.intent.action.SCREEN_OFF", intent2.getAction()) || TextUtils.equals("android.intent.action.SCREEN_ON", intent2.getAction())) {
                    amnvVar.e(false);
                }
            }
        });
    }
}
