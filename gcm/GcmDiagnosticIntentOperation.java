package com.google.android.gms.gcm;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmDiagnosticIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.gcm.GcmDiagnostics").setFlags(268435456), 2, "GCM Diagnostics", aojj.GCM_DIAGNOSTIC_ITEM, asew.DEFAULT_GCM);
    }
}
