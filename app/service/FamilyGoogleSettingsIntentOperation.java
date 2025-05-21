package com.google.android.gms.app.service;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FamilyGoogleSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem d(Account account) {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setComponent(new ComponentName(this, "com.google.android.libraries.families.FamilyActivity")).putExtra("appId", 14).putExtra("flowType", 3).putExtra("utmSource", "googlesettings").putExtra("utmMedium", "allservices"), 11, R.string.common_google_settings_family_group, aojj.FAMILY_ITEM, asew.DEFAULT_FAMILY);
        googleSettingsItem.j = false;
        googleSettingsItem.e = true;
        return googleSettingsItem;
    }
}
