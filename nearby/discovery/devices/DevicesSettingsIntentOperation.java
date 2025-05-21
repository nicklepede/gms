package com.google.android.gms.nearby.discovery.devices;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.cexc;
import defpackage.excq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DevicesSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!excq.d(this, cexc.e(this))) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.settings.DEVICES").putExtra("caller", 2), 6, R.string.common_devices, aojj.NEARBY_DEVICES_ITEM, asew.NEARBY_FAST_PAIR);
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
