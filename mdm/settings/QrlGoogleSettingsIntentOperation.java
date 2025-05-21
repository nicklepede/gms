package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.ccxq;
import defpackage.fruc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class QrlGoogleSettingsIntentOperation extends anxy {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        Intent b;
        if (fruc.m() && g()) {
            boolean f = ccxq.f(this);
            Boolean.valueOf(f).getClass();
            if (!f || (b = ccxq.b(this)) == null) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(b, 12, getString(R.string.fmd_quick_remote_lock_activity_title), aojj.QUICK_REMOTE_LOCK_ITEM, asew.DEFAULT_PERSONALSAFETY);
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
