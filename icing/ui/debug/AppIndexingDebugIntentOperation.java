package com.google.android.gms.icing.ui.debug;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asop;
import defpackage.fpaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AppIndexingDebugIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (asop.c(fpaz.a.a().a()) && fpaz.a.a().j()) {
            return new GoogleSettingsItem(f("com.google.android.gms.icing.APP_INDEXING_DEBUG"), 3, R.string.app_indexing_debug_google_settings_title, aojj.APP_INDEXING_DEBUG_ITEM, asew.DEFAULT_ICING);
        }
        return null;
    }
}
