package com.google.android.gms.credential.manager.operations;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asno;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SettingsIntentOperation extends anxy {
    public SettingsIntentOperation() {
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.credential.manager.PasswordManagerActivity").putExtra("utm_source", "google-settings").putExtra("utm_medium", "android"), -1, R.string.pwm_password_manager, aojj.PASSWORD_MANAGER_ITEM, asno.b(this));
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
