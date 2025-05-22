package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fnqv;
import defpackage.fnra;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetupWorkProfileSettingsIntentOperation extends apzq {
    public static boolean e(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        return fnqv.c() && PhoneskyDpcInstallChimeraActivity.q(context) && devicePolicyManager != null && devicePolicyManager.getDeviceOwner() == null && devicePolicyManager.getProfileOwner() == null;
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        Bundle bundle = new Bundle();
        int i = SetupWorkProfileChimeraActivity.j;
        Intent putExtras = new Intent().setClassName(this, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity").putExtras(bundle);
        putExtras.addFlags(268435456);
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(putExtras, 7, R.string.auth_device_management_setup_work_profile_settings_entry, aqlc.WORK_PROFILE_ITEM, auiq.DEFAULT_AUTH_MANAGED);
        googleSettingsItem.j = fnra.a.lK().d();
        if (e(this)) {
            return googleSettingsItem;
        }
        return null;
    }
}
