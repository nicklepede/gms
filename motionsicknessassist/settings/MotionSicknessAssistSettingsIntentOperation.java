package com.google.android.gms.motionsicknessassist.settings;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asnd;
import defpackage.fqiw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MotionSicknessAssistSettingsIntentOperation extends anxy {
    private Boolean a = null;

    public MotionSicknessAssistSettingsIntentOperation() {
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem d(Account account) {
        if (!fqiw.d()) {
            return null;
        }
        if (this.a == null) {
            this.a = Boolean.valueOf(asnd.t(getApplicationContext()));
        }
        if (!this.a.booleanValue()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.motionsicknessassist.settings.MOTION_SICKNESS_COLLAPSING_TOOLBAR_SETTINGS"), 10, getString(R.string.motion_sickness_settings_activity_label), aojj.MSA_ITEM, asew.DEFAULT_MOTIONSICKNESSASSIST);
        googleSettingsItem.e = true;
        googleSettingsItem.p = getString(R.string.motion_sickness_settings_page_description);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.m = "MotionSicknessAssistSettingsIndexKey";
        for (String str : getResources().getStringArray(R.array.motion_sickness_index_settings_keywords)) {
            googleSettingsItem.a(str);
        }
        return googleSettingsItem;
    }

    MotionSicknessAssistSettingsIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
