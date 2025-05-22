package com.google.android.gms.autofill.smsretriever;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aikv;
import defpackage.eqhc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class TracingSmsBroadcastReceiver extends TracingBroadcastReceiver {
    private final eqhc a;

    public TracingSmsBroadcastReceiver(eqhc eqhcVar) {
        super("autofill");
        this.a = eqhcVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        Status status;
        if (!"com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED".equals(intent.getAction()) || (status = (Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null) {
            return;
        }
        this.a.q(new aikv(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE"), status.i));
    }
}
