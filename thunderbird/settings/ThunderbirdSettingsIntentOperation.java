package com.google.android.gms.thunderbird.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.thunderbird.settings.ThunderbirdSettingsActivity"), -1, getString(R.string.thunderbird_settings_title_text), aqlc.THUNDERBIRD_ITEM, auri.b(this));
        googleSettingsItem.j = false;
        googleSettingsItem.p = getString(R.string.thunderbird_settings_page_description);
        return googleSettingsItem;
    }
}
