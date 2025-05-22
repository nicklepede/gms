package com.google.android.gms.core.settings;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.auqx;
import defpackage.auwr;
import defpackage.fpvz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SystemServicesManagementSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem d(Account account) {
        fpvz.d();
        if (!fpvz.c() || !auqx.q(this)) {
            return null;
        }
        try {
            PackageInfo f = auwr.b(getApplicationContext()).f("com.android.vending", 0);
            if (f == null) {
                return null;
            }
            if (f.versionCode < ((int) fpvz.a.lK().a())) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("android.settings.SYSTEM_SERVICES_MANAGEMENT").setPackage("com.android.vending"), 0, R.string.common_system_service_management_page, aqlc.SYSTEM_SERVICES_MANAGEMENT_ITEM, auiq.DEFAULT_CORE);
            googleSettingsItem.e = true;
            googleSettingsItem.j = true;
            googleSettingsItem.l = true;
            return googleSettingsItem;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
