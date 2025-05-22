package com.google.android.gms.adsidentity.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fmqy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdsIdentityGoogleSettingsIntentOperation extends apzq {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (fmqy.i()) {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.adsidentity.ACTION_ADS_IDENTITY_SETTINGS").setPackage(getPackageName()), 0, R.string.common_ads_settings_title, aqlc.ADSIDENTITY_ITEM, auiq.DEFAULT_ADSIDENTITY);
            googleSettingsItem.e = false;
            googleSettingsItem.p = getString(R.string.zero_out_preference_top_intro_title);
            googleSettingsItem.j = false;
            return googleSettingsItem;
        }
        fmqy.v();
        GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.ADS_PRIVACY"), 0, R.string.common_ads_settings_title, aqlc.ADSIDENTITY_ITEM, auiq.DEFAULT_ADSIDENTITY);
        googleSettingsItem2.e = false;
        googleSettingsItem2.p = getString(R.string.zero_out_preference_top_intro_title);
        googleSettingsItem2.j = false;
        return googleSettingsItem2;
    }
}
