package com.google.android.gms.autofill.smsretriever;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.agkf;
import defpackage.entj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class TracingSmsBroadcastReceiver extends TracingBroadcastReceiver {
    private final entj a;

    public TracingSmsBroadcastReceiver(entj entjVar) {
        super("autofill");
        this.a = entjVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        Status status;
        if (!"com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED".equals(intent.getAction()) || (status = (Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null) {
            return;
        }
        this.a.q(new agkf(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE"), status.i));
    }
}
