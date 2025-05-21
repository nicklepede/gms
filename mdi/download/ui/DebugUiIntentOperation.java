package com.google.android.gms.mdi.download.ui;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fpbw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DebugUiIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        Intent intent = new Intent("com.google.android.gms.mdi.download.ui.DEBUG_UI").setPackage(getPackageName());
        boolean m = fpbw.a.a().m();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, R.string.mdd_debug_ui_title, aojj.MDD_DEBUG_ITEM, asew.DEFAULT_MDI_DOWNLOAD);
        googleSettingsItem.f = !m;
        return googleSettingsItem;
    }
}
