package com.google.android.gms.app.service;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FamilyGoogleSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem d(Account account) {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setComponent(new ComponentName(this, "com.google.android.libraries.families.FamilyActivity")).putExtra("appId", 14).putExtra("flowType", 3).putExtra("utmSource", "googlesettings").putExtra("utmMedium", "allservices"), 11, R.string.common_google_settings_family_group, aqlc.FAMILY_ITEM, auiq.DEFAULT_FAMILY);
        googleSettingsItem.j = false;
        googleSettingsItem.e = true;
        return googleSettingsItem;
    }
}
