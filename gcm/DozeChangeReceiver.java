package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bkbo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DozeChangeReceiver extends TracingBroadcastReceiver {
    public DozeChangeReceiver() {
        super("gcm");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, "android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
            bkbo.b().e().b(4);
        } else if (Objects.equals(action, "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED")) {
            bkbo.b().e().b(5);
        }
    }
}
