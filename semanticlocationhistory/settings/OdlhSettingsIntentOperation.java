package com.google.android.gms.semanticlocationhistory.settings;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asej;
import defpackage.asew;
import defpackage.asot;
import defpackage.czlp;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OdlhSettingsIntentOperation extends anxy {
    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhSIO");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        try {
            if (!czlp.g(this, czlp.a)) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.semanticlocationhistory.settings.OnDeviceSettingsActivity"), -1, getString(R.string.timeline_settings_title), aojj.ODLH_ITEM, asew.SEMANTIC_LOCATION_HISTORY);
            googleSettingsItem.j = false;
            return googleSettingsItem;
        } catch (IOException unused) {
            return null;
        }
    }
}
