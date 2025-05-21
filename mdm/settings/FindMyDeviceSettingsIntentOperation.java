package com.google.android.gms.mdm.settings;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.cczu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FindMyDeviceSettingsIntentOperation extends anxy {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!cczu.e(this)) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(AdmSettingsChimeraActivity.k(this), 0, R.string.common_mdm_feature_name, aojj.FIND_MY_DEVICE_ITEM, asew.DEFAULT_FINDMYDEVICE);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.p = getString(R.string.fmd_settings_page_description);
        googleSettingsItem.m = "FindMyDeviceSettings";
        return googleSettingsItem;
    }
}
