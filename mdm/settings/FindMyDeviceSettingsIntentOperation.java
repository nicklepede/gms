package com.google.android.gms.mdm.settings;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.cfiu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FindMyDeviceSettingsIntentOperation extends apzq {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!cfiu.e(this)) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(AdmSettingsChimeraActivity.k(this), 0, R.string.common_mdm_feature_name, aqlc.FIND_MY_DEVICE_ITEM, auiq.DEFAULT_FINDMYDEVICE);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.p = getString(R.string.fmd_settings_page_description);
        googleSettingsItem.m = "FindMyDeviceSettings";
        return googleSettingsItem;
    }
}
