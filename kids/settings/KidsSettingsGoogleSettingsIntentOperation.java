package com.google.android.gms.kids.settings;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.ausn;
import defpackage.auub;
import defpackage.fsce;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class KidsSettingsGoogleSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        Intent intent = new Intent();
        ausn ausnVar = KidsSettingsChimeraActivity.j;
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent.setComponent(new ComponentName(this, "com.google.android.gms.kids.settings.KidsSettingsActivity")), 11, R.string.common_parental_controls_label, aqlc.PARENTAL_CONTROL_ITEM, auiq.DEFAULT_KIDS_SETTINGS);
        googleSettingsItem.j = fsce.a.lK().e() && !auub.e();
        googleSettingsItem.e = false;
        return googleSettingsItem;
    }
}
