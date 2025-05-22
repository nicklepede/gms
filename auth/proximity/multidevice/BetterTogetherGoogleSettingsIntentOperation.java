package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aesm;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auri;
import defpackage.fnum;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BetterTogetherGoogleSettingsIntentOperation extends apzq {
    public BetterTogetherGoogleSettingsIntentOperation() {
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!fnum.a.lK().r() && !g()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(aesm.a(this), 6, R.string.better_together_app_name, aqlc.BETTER_TOGETHER_ITEM, auri.b(this));
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
