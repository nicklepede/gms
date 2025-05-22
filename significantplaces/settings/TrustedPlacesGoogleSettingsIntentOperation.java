package com.google.android.gms.significantplaces.settings;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TrustedPlacesGoogleSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem d(Account account) {
        if (!g()) {
            return null;
        }
        Intent component = new Intent("com.google.android.gms.significantplaces.settings.TRUSTED_PLACES_SETTINGS").setComponent(new ComponentName(this, "com.google.android.gms.significantplaces.settings.TrustedPlacesListActivity"));
        fxxm.e(component, "setComponent(...)");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(component, 12, getString(R.string.significant_places_trusted_places_title), aqlc.TRUSTED_PLACES_ITEM, auiq.DEFAULT_SIGNIFICANT_PLACES);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.m = "TrustedPlacesSettingsIndexKey";
        return googleSettingsItem;
    }
}
