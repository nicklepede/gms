package com.google.android.gms.icing.ui.control;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OnDeviceSharingIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.icing.ON_DEVICE_SHARING_UI"), 0, R.string.personalize_using_shared_data_settings_title, aqlc.ON_DEVICE_SHARING_ITEM, auiq.DEFAULT_ICING);
        if (g()) {
            googleSettingsItem.j = true;
            googleSettingsItem.l = true;
            googleSettingsItem.m = "OnDeviceSharing";
            for (String str : getResources().getStringArray(R.array.on_device_sharing_ui_settings_search_keywords)) {
                googleSettingsItem.a(str);
            }
        }
        return googleSettingsItem;
    }
}
