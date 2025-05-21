package com.google.android.gms.icing.ui.control;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OnDeviceSharingIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.icing.ON_DEVICE_SHARING_UI"), 0, R.string.personalize_using_shared_data_settings_title, aojj.ON_DEVICE_SHARING_ITEM, asew.DEFAULT_ICING);
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
