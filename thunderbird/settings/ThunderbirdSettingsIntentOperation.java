package com.google.android.gms.thunderbird.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asno;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.thunderbird.settings.ThunderbirdSettingsActivity"), -1, getString(R.string.thunderbird_settings_title_text), aojj.THUNDERBIRD_ITEM, asno.b(this));
        googleSettingsItem.j = false;
        googleSettingsItem.p = getString(R.string.thunderbird_settings_page_description);
        return googleSettingsItem;
    }
}
