package com.google.android.gms.credential.manager.operations;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SettingsIntentOperation extends apzq {
    public SettingsIntentOperation() {
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.credential.manager.PasswordManagerActivity").putExtra("utm_source", "google-settings").putExtra("utm_medium", "android"), -1, R.string.pwm_password_manager, aqlc.PASSWORD_MANAGER_ITEM, auri.b(this));
        googleSettingsItem.e = true;
        googleSettingsItem.j = true;
        googleSettingsItem.p = getString(R.string.pwm_settings_page_description_service_info);
        googleSettingsItem.m = "com.google.android.gms.credential.manager.PasswordManagerActivity";
        googleSettingsItem.l = true;
        googleSettingsItem.h = String.valueOf(TextUtils.expandTemplate(getResources().getString(R.string.pwm_page_description), ""));
        googleSettingsItem.a(getResources().getString(R.string.pwm_password_manager));
        googleSettingsItem.a(getResources().getString(R.string.common_passwords));
        googleSettingsItem.a(getResources().getString(R.string.common_password));
        return googleSettingsItem;
    }

    protected SettingsIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
