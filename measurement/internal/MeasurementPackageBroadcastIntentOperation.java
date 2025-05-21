package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.cdvo;
import defpackage.cdvv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class MeasurementPackageBroadcastIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data == null ? null : data.getSchemeSpecificPart();
        cdvv z = cdvv.z(this);
        if (schemeSpecificPart == null) {
            z.aJ().f.a("Got package removed intent with a null package name");
            return;
        }
        z.aJ().j.b("Got package removed intent", schemeSpecificPart);
        if ("com.google.android.gms".equals(schemeSpecificPart) || !z.n().a) {
            return;
        }
        z.au();
        z.aK().f(new cdvo(z, schemeSpecificPart, System.currentTimeMillis()));
    }
}
