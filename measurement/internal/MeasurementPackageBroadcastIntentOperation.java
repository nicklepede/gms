package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.cgeo;
import defpackage.cgev;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MeasurementPackageBroadcastIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data == null ? null : data.getSchemeSpecificPart();
        cgev z = cgev.z(this);
        if (schemeSpecificPart == null) {
            z.aK().f.a("Got package removed intent with a null package name");
            return;
        }
        z.aK().j.b("Got package removed intent", schemeSpecificPart);
        if ("com.google.android.gms".equals(schemeSpecificPart) || !z.n().a) {
            return;
        }
        z.au();
        z.aL().f(new cgeo(z, schemeSpecificPart, System.currentTimeMillis()));
    }
}
