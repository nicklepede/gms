package com.google.android.gms.crisisalerts.settings.debug;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fnhq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsGoogleInternalSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem d(Account account) {
        if (fnhq.f()) {
            return new GoogleSettingsItem(new Intent("com.google.android.gms.crisisalerts.settings.debug.CRISIS_ALERTS_GOOGLE_SETTING_DEBUG").setPackage(getPackageName()), 2, "Crisis Alerts Debug", aojj.CRISIS_ALERTS_DEBUG_ITEM, asew.FACETID_UNKNOWN);
        }
        return null;
    }
}
