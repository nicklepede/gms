package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aojj;
import defpackage.asno;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eite;
import defpackage.eitj;
import defpackage.fjue;
import defpackage.rtk;
import defpackage.sxb;
import defpackage.szt;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleSettingsInitializer extends szt {
    public Context a;

    private static final Intent e(int i) {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.mg.ui.main.MainActivity").addCategory("android.intent.category.DEFAULT").putExtra("extra.screenId", i).putExtra("extra.launchApi", 2).putExtra("extra.callingPackageName", "com.google.android.gms").putExtra("extra.utmSource", "google-settings-classic");
    }

    @Override // defpackage.anxy
    public final List a() {
        eiid j;
        int i = eitj.d;
        eite eiteVar = new eite();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(e(1), 1, this.a.getString(R.string.common_asm_google_account_title), aojj.GOOGLE_ACCOUNT_ITEM, asno.b(this.a));
        googleSettingsItem.e = true;
        googleSettingsItem.s = R.string.accountsettings_google_account_subtitle;
        googleSettingsItem.d = 1;
        googleSettingsItem.p = this.a.getString(R.string.as_settings_page_description);
        eiteVar.i(googleSettingsItem);
        if (Build.VERSION.SDK_INT >= fjue.b()) {
            j = eigb.a;
        } else {
            GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(e(415), 0, this.a.getString(R.string.common_security_ootp_setting_title), aojj.OFFLINE_OTP_ITEM, asno.b(this.a));
            googleSettingsItem2.e = true;
            j = eiid.j(googleSettingsItem2);
        }
        if (j.h()) {
            eiteVar.i(j.c());
        }
        if (fjue.a.a().H()) {
            eite eiteVar2 = new eite();
            eiteVar2.i(new GoogleSettingsItem(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity").addCategory("android.intent.category.DEFAULT").putExtra("extra.callingPackageName", "com.google.android.gms"), 2, R.string.as_debug_android_privacy_hub_activity_controls, aojj.PRIVACY_HUB_ITEM, asno.b(this.a)));
            eiteVar.k(eiteVar2.g());
        }
        return eiteVar.g();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((sxb) rtk.a(sxb.class, this.b)).c(this);
    }
}
