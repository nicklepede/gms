package com.google.android.gms.trustagent.common.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.diwx;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ScreenOnOffReceiver extends TracingBroadcastReceiver {
    private final Context a;
    private final diwx b;
    private boolean c;

    static {
        ausn.b("TrustAgent", auid.TRUSTAGENT);
    }

    public ScreenOnOffReceiver(Context context, diwx diwxVar) {
        super("trustagent");
        this.c = false;
        this.a = context;
        this.b = diwxVar;
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
    public final void jP(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.b.c();
        } else if (Objects.equals(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            this.b.kh();
        } else if (Objects.equals(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
            this.b.kb();
        }
    }
}
