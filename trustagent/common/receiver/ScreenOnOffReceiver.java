package com.google.android.gms.trustagent.common.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.dgls;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ScreenOnOffReceiver extends TracingBroadcastReceiver {
    private final Context a;
    private final dgls b;
    private boolean c;

    static {
        asot.b("TrustAgent", asej.TRUSTAGENT);
    }

    public ScreenOnOffReceiver(Context context, dgls dglsVar) {
        super("trustagent");
        this.c = false;
        this.a = context;
        this.b = dglsVar;
    }

    public final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.a.registerReceiver(this, intentFilter);
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            this.a.unregisterReceiver(this);
            this.c = false;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.b.jM();
        } else if (Objects.equals(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            this.b.jS();
        } else if (Objects.equals(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
            this.b.jL();
        }
    }
}
