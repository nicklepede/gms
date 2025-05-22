package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.cfgo;
import defpackage.fuow;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class QrlGoogleSettingsIntentOperation extends apzq {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        Intent b;
        if (fuow.l() && g()) {
            boolean f = cfgo.f(this);
            Boolean.valueOf(f).getClass();
            if (!f || (b = cfgo.b(this)) == null) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(b, 12, getString(R.string.fmd_quick_remote_lock_activity_title), aqlc.QUICK_REMOTE_LOCK_ITEM, auiq.DEFAULT_PERSONALSAFETY);
            googleSettingsItem.p = getString(R.string.fmd_quick_remote_lock_summary);
            googleSettingsItem.j = true;
            googleSettingsItem.m = "QrlSettingsIndexKey";
            for (String str : getResources().getStringArray(R.array.fmd_quick_remote_lock_settings_keywords)) {
                googleSettingsItem.a(str);
            }
            return googleSettingsItem;
        }
        return null;
    }
}
