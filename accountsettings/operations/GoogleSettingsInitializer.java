package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aqlc;
import defpackage.auri;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.fmkf;
import defpackage.tmt;
import defpackage.usz;
import defpackage.uvr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleSettingsInitializer extends uvr {
    public Context a;

    private static final Intent e(int i) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.mg.ui.main.MainActivity").addCategory("android.intent.category.DEFAULT").putExtra("extra.screenId", i).putExtra("extra.launchApi", 2).putExtra("extra.callingPackageName", "com.google.android.gms").putExtra("extra.utmSource", "google-settings-classic");
    }

    @Override // defpackage.apzq
    public final List a() {
        ekvi j;
        int i = elgo.d;
        elgj elgjVar = new elgj();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(e(1), 1, this.a.getString(R.string.common_asm_google_account_title), aqlc.GOOGLE_ACCOUNT_ITEM, auri.b(this.a));
        googleSettingsItem.e = true;
        googleSettingsItem.s = R.string.accountsettings_google_account_subtitle;
        googleSettingsItem.d = 1;
        googleSettingsItem.p = this.a.getString(R.string.as_settings_page_description);
        elgjVar.i(googleSettingsItem);
        if (Build.VERSION.SDK_INT >= fmkf.c()) {
            j = ektg.a;
        } else {
            GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(e(415), 0, this.a.getString(R.string.common_security_ootp_setting_title), aqlc.OFFLINE_OTP_ITEM, auri.b(this.a));
            googleSettingsItem2.e = true;
            j = ekvi.j(googleSettingsItem2);
        }
        if (j.h()) {
            elgjVar.i(j.c());
        }
        if (fmkf.a.lK().H()) {
            elgj elgjVar2 = new elgj();
            elgjVar2.i(new GoogleSettingsItem(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity").addCategory("android.intent.category.DEFAULT").putExtra("extra.callingPackageName", "com.google.android.gms"), 2, R.string.as_debug_android_privacy_hub_activity_controls, aqlc.PRIVACY_HUB_ITEM, auri.b(this.a)));
            elgjVar.k(elgjVar2.g());
        }
        return elgjVar.g();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((usz) tmt.a(usz.class, this.b)).c(this);
    }
}
