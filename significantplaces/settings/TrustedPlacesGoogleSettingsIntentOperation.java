package com.google.android.gms.significantplaces.settings;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TrustedPlacesGoogleSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem d(Account account) {
        if (!g()) {
            return null;
        }
        Intent component = new Intent("com.google.android.gms.significantplaces.settings.TRUSTED_PLACES_SETTINGS").setComponent(new ComponentName(this, "com.google.android.gms.significantplaces.settings.TrustedPlacesListActivity"));
        fvbo.e(component, "setComponent(...)");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(component, 12, getString(R.string.significant_places_trusted_places_title), aojj.TRUSTED_PLACES_ITEM, asew.DEFAULT_SIGNIFICANT_PLACES);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.m = "TrustedPlacesSettingsIndexKey";
        return googleSettingsItem;
    }
}
