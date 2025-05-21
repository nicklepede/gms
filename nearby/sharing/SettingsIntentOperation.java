package com.google.android.gms.nearby.sharing;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asno;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!ModuleInitializer.a(this)) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.settings.SHARING"), 6, getString(R.string.sharing_product_name_v3), aojj.NEARBY_SHARING_ITEM, asno.b(this));
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
