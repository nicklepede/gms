package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationSharingSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.LocationSharingRedirectActivity"), -1, getString(R.string.common_google_location_sharing), aojj.LOCATION_SHARING_ITEM, asew.DEFAULT_LOCATIONSHARING);
        googleSettingsItem.l = true;
        googleSettingsItem.j = true;
        return googleSettingsItem;
    }
}
