package com.google.android.gms.chimera.debug;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fmqq;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ChimeraDebugSettingsOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        Intent intent = new Intent("com.google.android.gms.chimera.CHIMERA_SETTINGS_ACTIVITY").setPackage(getPackageName());
        fvbo.e(intent, "setPackage(...)");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "Google Play services modules", aojj.CHIMERA_DEBUG_ITEM, asew.DEFAULT_CHIMERA_DEBUG);
        googleSettingsItem.g = fmqq.a.a().p();
        return googleSettingsItem;
    }
}
