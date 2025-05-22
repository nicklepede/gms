package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSharingSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.LocationSharingRedirectActivity"), -1, getString(R.string.common_google_location_sharing), aqlc.LOCATION_SHARING_ITEM, auiq.DEFAULT_LOCATIONSHARING);
        googleSettingsItem.l = true;
        googleSettingsItem.j = true;
        return googleSettingsItem;
    }
}
