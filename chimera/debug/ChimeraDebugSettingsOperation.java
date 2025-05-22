package com.google.android.gms.chimera.debug;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fpio;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ChimeraDebugSettingsOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        Intent intent = new Intent("com.google.android.gms.chimera.CHIMERA_SETTINGS_ACTIVITY").setPackage(getPackageName());
        fxxm.e(intent, "setPackage(...)");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "Google Play services modules", aqlc.CHIMERA_DEBUG_ITEM, auiq.DEFAULT_CHIMERA_DEBUG);
        googleSettingsItem.g = fpio.a.lK().p();
        return googleSettingsItem;
    }
}
