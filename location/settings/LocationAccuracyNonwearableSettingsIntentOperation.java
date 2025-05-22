package com.google.android.gms.location.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fsls;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationAccuracyNonwearableSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.location.settings.LocationAccuracyNonwearableActivity"), true != fsls.c() ? -1 : 0, getString(R.string.location_accuracy_setting_label), aqlc.LOCATION_ACCURACY_ITEM, auiq.LOCATION_ACCURACY);
        googleSettingsItem.j = fsls.c();
        if (fsls.c()) {
            googleSettingsItem.l = true;
            googleSettingsItem.m = "LocationAccuracySettingsIndexKey";
        }
        return googleSettingsItem;
    }
}
