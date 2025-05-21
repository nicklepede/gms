package com.google.android.gms.adsidentity.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fkas;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdsIdentityGoogleSettingsIntentOperation extends anxy {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (fkas.i()) {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.adsidentity.ACTION_ADS_IDENTITY_SETTINGS").setPackage(getPackageName()), 0, R.string.common_ads_settings_title, aojj.ADSIDENTITY_ITEM, asew.DEFAULT_ADSIDENTITY);
            googleSettingsItem.e = false;
            googleSettingsItem.p = getString(R.string.zero_out_preference_top_intro_title);
            googleSettingsItem.j = false;
            return googleSettingsItem;
        }
        fkas.w();
        GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.ADS_PRIVACY"), 0, R.string.common_ads_settings_title, aojj.ADSIDENTITY_ITEM, asew.DEFAULT_ADSIDENTITY);
        googleSettingsItem2.e = false;
        googleSettingsItem2.p = getString(R.string.zero_out_preference_top_intro_title);
        googleSettingsItem2.j = false;
        return googleSettingsItem2;
    }
}
