package com.google.android.gms.gcm;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmDiagnosticIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.gcm.GcmDiagnostics").setFlags(268435456), 2, "GCM Diagnostics", aqlc.GCM_DIAGNOSTIC_ITEM, auiq.DEFAULT_GCM);
    }
}
