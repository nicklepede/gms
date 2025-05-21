package com.google.android.gms.location.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fpsa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationAccuracyNonwearableSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.location.settings.LocationAccuracyNonwearableActivity"), true != fpsa.c() ? -1 : 0, getString(R.string.location_accuracy_setting_label), aojj.LOCATION_ACCURACY_ITEM, asew.LOCATION_ACCURACY);
        googleSettingsItem.j = fpsa.c();
        if (fpsa.c()) {
            googleSettingsItem.l = true;
            googleSettingsItem.m = "LocationAccuracySettingsIndexKey";
        }
        return googleSettingsItem;
    }
}
