package com.google.android.gms.core.settings;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asnd;
import defpackage.assx;
import defpackage.fnea;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SystemServicesManagementSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem d(Account account) {
        fnea.d();
        if (!fnea.c() || !asnd.q(this)) {
            return null;
        }
        try {
            PackageInfo f = assx.b(getApplicationContext()).f("com.android.vending", 0);
            if (f == null) {
                return null;
            }
            if (f.versionCode < ((int) fnea.a.a().a())) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("android.settings.SYSTEM_SERVICES_MANAGEMENT").setPackage("com.android.vending"), 0, R.string.common_system_service_management_page, aojj.SYSTEM_SERVICES_MANAGEMENT_ITEM, asew.DEFAULT_CORE);
            googleSettingsItem.e = true;
            googleSettingsItem.j = true;
            googleSettingsItem.l = true;
            return googleSettingsItem;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
