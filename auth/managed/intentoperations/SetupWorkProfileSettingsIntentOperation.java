package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fkzn;
import defpackage.fkzs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetupWorkProfileSettingsIntentOperation extends anxy {
    public static boolean e(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        return fkzn.c() && PhoneskyDpcInstallChimeraActivity.q(context) && devicePolicyManager != null && devicePolicyManager.getDeviceOwner() == null && devicePolicyManager.getProfileOwner() == null;
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        Bundle bundle = new Bundle();
        int i = SetupWorkProfileChimeraActivity.j;
        Intent putExtras = new Intent().setClassName(this, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity").putExtras(bundle);
        putExtras.addFlags(268435456);
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(putExtras, 7, R.string.auth_device_management_setup_work_profile_settings_entry, aojj.WORK_PROFILE_ITEM, asew.DEFAULT_AUTH_MANAGED);
        googleSettingsItem.j = fkzs.a.a().d();
        if (e(this)) {
            return googleSettingsItem;
        }
        return null;
    }
}
