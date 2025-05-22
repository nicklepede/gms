package com.google.android.gms.icing.ui.debug;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.ausj;
import defpackage.frug;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppIndexingDebugIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        frug frugVar = frug.a;
        if (ausj.c(frugVar.lK().a()) && frugVar.lK().j()) {
            return new GoogleSettingsItem(f("com.google.android.gms.icing.APP_INDEXING_DEBUG"), 3, R.string.app_indexing_debug_google_settings_title, aqlc.APP_INDEXING_DEBUG_ITEM, auiq.DEFAULT_ICING);
        }
        return null;
    }
}
