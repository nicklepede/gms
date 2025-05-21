package com.google.android.gms.smartdevice.common;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.armu;
import defpackage.arxo;
import defpackage.asew;
import defpackage.asoe;
import defpackage.fsfb;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupDeviceSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final List a() {
        Context applicationContext = getApplicationContext();
        arxo arxoVar = TargetChimeraActivity.h;
        return Collections.singletonList(new GoogleSettingsItem(new Intent().setClassName(applicationContext, "com.google.android.gms.smartdevice.d2d.ui.TargetActivity").putExtra("smartdevice.theme", "glif_v2_light"), 2, "SmartDevice Target flow", aojj.SMART_DEVICE_ITEM, asew.DEFAULT_SMARTDEVICE));
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        boolean isManagedProfile;
        if (asoe.c(this) || asoe.d(this) || ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 7 || !((Boolean) armu.g.i()).booleanValue()) {
            return null;
        }
        Intent f = f("com.google.android.gms.settings.SMART_DEVICE_DISCOVERY");
        f.putExtra("android.intent.extra.REFERRER_NAME", "gcore-settings");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f, 7, R.string.common_set_up_nearby_device_settings_title, aojj.SETUP_NEARBY_DEVICE_ITEM, asew.DEFAULT_SMARTDEVICE);
        googleSettingsItem.j = fsfb.a.a().e();
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
