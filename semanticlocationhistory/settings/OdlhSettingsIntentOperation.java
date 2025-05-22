package com.google.android.gms.semanticlocationhistory.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auid;
import defpackage.auiq;
import defpackage.ausn;
import defpackage.dbvl;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OdlhSettingsIntentOperation extends apzq {
    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhSIO");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        try {
            if (!dbvl.g(this, dbvl.a)) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.semanticlocationhistory.settings.OnDeviceSettingsActivity"), -1, getString(R.string.timeline_settings_title), aqlc.ODLH_ITEM, auiq.SEMANTIC_LOCATION_HISTORY);
            googleSettingsItem.j = false;
            return googleSettingsItem;
        } catch (IOException unused) {
            return null;
        }
    }
}
