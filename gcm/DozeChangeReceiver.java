package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bhwz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DozeChangeReceiver extends TracingBroadcastReceiver {
    public DozeChangeReceiver() {
        super("gcm");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, "android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
            bhwz.b().e().b(4);
        } else if (Objects.equals(action, "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED")) {
            bhwz.b().e().b(5);
        }
    }
}
