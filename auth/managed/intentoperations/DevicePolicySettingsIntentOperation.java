package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fnrt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DevicePolicySettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        DevicePolicyManager devicePolicyManager;
        ComponentName profileOwner;
        Intent intent = new Intent("com.google.android.apps.work.clouddpc.ACTION_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 0, R.string.auth_device_policy_settings_entry, aqlc.DEVICE_POLICY_ITEM, auiq.DEFAULT_AUTH_MANAGED);
        if (!fnrt.a.lK().a() || (devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy")) == null) {
            return null;
        }
        if ((!"com.google.android.apps.work.clouddpc".equals(devicePolicyManager.getDeviceOwner()) && ((profileOwner = devicePolicyManager.getProfileOwner()) == null || !"com.google.android.apps.work.clouddpc".equals(profileOwner.getPackageName()))) || intent.resolveActivityInfo(getPackageManager(), 0) == null) {
            return null;
        }
        return googleSettingsItem;
    }
}
