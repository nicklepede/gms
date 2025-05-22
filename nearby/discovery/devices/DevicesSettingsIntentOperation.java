package com.google.android.gms.nearby.discovery.devices;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.chen;
import defpackage.ezqz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DevicesSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!ezqz.d(this, chen.f(this))) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.settings.DEVICES").putExtra("caller", 2), 6, R.string.common_devices, aqlc.NEARBY_DEVICES_ITEM, auiq.NEARBY_FAST_PAIR);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.m = "NearbyDevicesSettings";
        for (String str : getResources().getStringArray(R.array.devices_index_settings_keywords)) {
            googleSettingsItem.a(str);
        }
        googleSettingsItem.p = getString(R.string.fast_pair_settings_page_description);
        return googleSettingsItem;
    }
}
