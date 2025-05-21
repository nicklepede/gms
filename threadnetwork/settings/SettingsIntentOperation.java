package com.google.android.gms.threadnetwork.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asej;
import defpackage.asew;
import defpackage.asot;
import defpackage.dfrp;
import defpackage.ejhf;
import defpackage.fsmk;
import defpackage.fuur;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SettingsIntentOperation extends anxy {
    private static final asot a = asot.b("SettingsIntentOperation", asej.THREADNETWORK);

    @Override // defpackage.anxy
    @fuur
    public final GoogleSettingsItem b() {
        if (!fsmk.d()) {
            return null;
        }
        dfrp dfrpVar = SettingsChimeraActivity.j;
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(dfrp.a(), 6, getString(R.string.gmscore_settings_threadnetwork_item_title), aojj.THREADNETWORK_ITEM, asew.DEFAULT_THREADNETWORK);
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.p = getString(R.string.gmscore_settings_threadnetwork_item_description);
        googleSettingsItem.m = "ThreadNetworksSettings";
        return googleSettingsItem;
    }

    @Override // defpackage.anxy, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        try {
            super.onHandleIntent(intent);
        } catch (IllegalArgumentException e) {
            ((ejhf) ((ejhf) a.j()).s(e)).x("Invalid intent");
        }
    }
}
