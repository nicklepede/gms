package com.google.android.gms.mdi.download.ui;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.frvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DebugUiIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        Intent intent = new Intent("com.google.android.gms.mdi.download.ui.DEBUG_UI").setPackage(getPackageName());
        boolean m = frvd.a.lK().m();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, R.string.mdd_debug_ui_title, aqlc.MDD_DEBUG_ITEM, auiq.DEFAULT_MDI_DOWNLOAD);
        googleSettingsItem.f = !m;
        return googleSettingsItem;
    }
}
