package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.flal;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DevicePolicySettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        DevicePolicyManager devicePolicyManager;
        ComponentName profileOwner;
        Intent intent = new Intent("com.google.android.apps.work.clouddpc.ACTION_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 0, R.string.auth_device_policy_settings_entry, aojj.DEVICE_POLICY_ITEM, asew.DEFAULT_AUTH_MANAGED);
        if (!flal.a.a().a() || (devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy")) == null) {
            return null;
        }
        if ((!"com.google.android.apps.work.clouddpc".equals(devicePolicyManager.getDeviceOwner()) && ((profileOwner = devicePolicyManager.getProfileOwner()) == null || !"com.google.android.apps.work.clouddpc".equals(profileOwner.getPackageName()))) || intent.resolveActivityInfo(getPackageManager(), 0) == null) {
            return null;
        }
        return googleSettingsItem;
    }
}
