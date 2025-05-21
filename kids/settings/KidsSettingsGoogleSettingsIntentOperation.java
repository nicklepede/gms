package com.google.android.gms.kids.settings;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asot;
import defpackage.asqh;
import defpackage.fpio;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class KidsSettingsGoogleSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        Intent intent = new Intent();
        asot asotVar = KidsSettingsChimeraActivity.j;
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent.setComponent(new ComponentName(this, "com.google.android.gms.kids.settings.KidsSettingsActivity")), 11, R.string.common_parental_controls_label, aojj.PARENTAL_CONTROL_ITEM, asew.DEFAULT_KIDS_SETTINGS);
        googleSettingsItem.j = fpio.a.a().e() && !asqh.e();
        googleSettingsItem.e = false;
        return googleSettingsItem;
    }
}
