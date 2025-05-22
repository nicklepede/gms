package com.google.android.gms.smartdevice.common;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.atpj;
import defpackage.auad;
import defpackage.auiq;
import defpackage.aury;
import defpackage.fuzy;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetupDeviceSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final List a() {
        Context applicationContext = getApplicationContext();
        auad auadVar = TargetChimeraActivity.h;
        return Collections.singletonList(new GoogleSettingsItem(new Intent().setClassName(applicationContext, "com.google.android.gms.smartdevice.d2d.ui.TargetActivity").putExtra("smartdevice.theme", "glif_v2_light"), 2, "SmartDevice Target flow", aqlc.SMART_DEVICE_ITEM, auiq.DEFAULT_SMARTDEVICE));
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        boolean isManagedProfile;
        if (aury.c(this) || aury.d(this) || ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 7 || !((Boolean) atpj.g.i()).booleanValue()) {
            return null;
        }
        Intent f = f("com.google.android.gms.settings.SMART_DEVICE_DISCOVERY");
        f.putExtra("android.intent.extra.REFERRER_NAME", "gcore-settings");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f, 7, R.string.common_set_up_nearby_device_settings_title, aqlc.SETUP_NEARBY_DEVICE_ITEM, auiq.DEFAULT_SMARTDEVICE);
        googleSettingsItem.j = fuzy.a.lK().e();
        UserManager userManager = (UserManager) getSystemService("user");
        boolean z = false;
        if (userManager != null) {
            isManagedProfile = userManager.isManagedProfile();
            if (isManagedProfile) {
                z = true;
            }
        }
        googleSettingsItem.i = !z;
        return googleSettingsItem;
    }
}
