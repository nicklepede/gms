package com.google.android.gms.usagereporting.settings;

import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.usagereporting.AppContextProvider;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.aura;
import defpackage.fucj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UsageReportingSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        fucj.a.lK().a();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(aura.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"), -1, getResources().getString(R.string.common_usage_and_diagnostics), aqlc.USAGE_REPORTING_ITEM, auiq.DEFAULT_USAGEREPORTING);
        googleSettingsItem.j = false;
        googleSettingsItem.p = AppContextProvider.a().getString(R.string.usage_diagnostics_page_description);
        return googleSettingsItem;
    }
}
