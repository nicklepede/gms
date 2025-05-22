package com.google.android.gms.crisisalerts.settings.debug;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fpzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsGoogleInternalSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem d(Account account) {
        if (fpzr.f()) {
            return new GoogleSettingsItem(new Intent("com.google.android.gms.crisisalerts.settings.debug.CRISIS_ALERTS_GOOGLE_SETTING_DEBUG").setPackage(getPackageName()), 2, "Crisis Alerts Debug", aqlc.CRISIS_ALERTS_DEBUG_ITEM, auiq.FACETID_UNKNOWN);
        }
        return null;
    }
}
