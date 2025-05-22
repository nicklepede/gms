package com.google.android.gms.threadnetwork.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auid;
import defpackage.auiq;
import defpackage.ausn;
import defpackage.dicu;
import defpackage.eluo;
import defpackage.fvhs;
import defpackage.fxqp;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SettingsIntentOperation extends apzq {
    private static final ausn a = ausn.b("SettingsIntentOperation", auid.THREADNETWORK);

    @Override // defpackage.apzq
    @fxqp
    public final GoogleSettingsItem b() {
        if (!fvhs.d()) {
            return null;
        }
        dicu dicuVar = SettingsChimeraActivity.j;
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(dicu.a(), 6, getString(R.string.gmscore_settings_threadnetwork_item_title), aqlc.THREADNETWORK_ITEM, auiq.DEFAULT_THREADNETWORK);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.p = getString(R.string.gmscore_settings_threadnetwork_item_description);
        googleSettingsItem.m = "ThreadNetworksSettings";
        return googleSettingsItem;
    }

    @Override // defpackage.apzq, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        try {
            super.onHandleIntent(intent);
        } catch (IllegalArgumentException e) {
            ((eluo) ((eluo) a.j()).s(e)).x("Invalid intent");
        }
    }
}
