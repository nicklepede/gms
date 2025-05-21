package com.google.android.gms.usagereporting.settings;

import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.usagereporting.AppContextProvider;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asng;
import defpackage.frin;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UsageReportingSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        frin.a.a().a();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(asng.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"), -1, getResources().getString(R.string.common_usage_and_diagnostics), aojj.USAGE_REPORTING_ITEM, asew.DEFAULT_USAGEREPORTING);
        googleSettingsItem.j = false;
        googleSettingsItem.p = AppContextProvider.a().getString(R.string.usage_diagnostics_page_description);
        return googleSettingsItem;
    }
}
