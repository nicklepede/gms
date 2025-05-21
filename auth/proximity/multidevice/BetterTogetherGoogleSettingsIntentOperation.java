package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.acsm;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asno;
import defpackage.fldd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BetterTogetherGoogleSettingsIntentOperation extends anxy {
    public BetterTogetherGoogleSettingsIntentOperation() {
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!fldd.a.a().r() && !g()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(acsm.a(this), 6, R.string.better_together_app_name, aojj.BETTER_TOGETHER_ITEM, asno.b(this));
        googleSettingsItem.p = getString(R.string.beto_settings_page_description);
        googleSettingsItem.e = true;
        googleSettingsItem.l = true;
        googleSettingsItem.j = true;
        googleSettingsItem.m = "BetterTogetherGoogleSettingsIntentOperation";
        return googleSettingsItem;
    }

    public BetterTogetherGoogleSettingsIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
