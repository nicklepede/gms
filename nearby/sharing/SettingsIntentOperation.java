package com.google.android.gms.nearby.sharing;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!ModuleInitializer.a(this)) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.settings.SHARING"), 6, getString(R.string.sharing_product_name_v3), aqlc.NEARBY_SHARING_ITEM, auri.b(this));
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.p = getString(R.string.nearby_sharing_settings_page_description);
        googleSettingsItem.m = "NearbySharingSettings";
        for (String str : getResources().getStringArray(R.array.sharing_index_settings_keywords)) {
            googleSettingsItem.a(str);
        }
        return googleSettingsItem;
    }
}
