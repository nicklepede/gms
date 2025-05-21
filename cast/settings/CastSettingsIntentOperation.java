package com.google.android.gms.cast.settings;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anku;
import defpackage.anlj;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asno;
import defpackage.flze;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final List a() {
        GoogleSettingsItem googleSettingsItem;
        GoogleSettingsItem googleSettingsItem2;
        ArrayList arrayList = new ArrayList();
        Context applicationContext = getApplicationContext();
        int i = anku.a;
        if (anlj.k(applicationContext)) {
            googleSettingsItem = new GoogleSettingsItem(anku.x(), 6, anlj.j(applicationContext) ? applicationContext.getString(R.string.cast_sender_options) : applicationContext.getString(R.string.cast_options), aojj.CAST_MEDIA_ITEM, asew.DEFAULT_CAST);
            googleSettingsItem.j = true;
            googleSettingsItem.l = true;
            googleSettingsItem.m = "CastSettingsChimeraActivity";
            googleSettingsItem.e = false;
        } else {
            googleSettingsItem = null;
        }
        Context applicationContext2 = getApplicationContext();
        if (anlj.j(applicationContext2)) {
            googleSettingsItem2 = new GoogleSettingsItem(anlj.b(), 6, anlj.k(applicationContext2) ? applicationContext2.getString(R.string.cast_receiver_options) : applicationContext2.getString(R.string.cast_options), aojj.CHROMECAST_MEDIA_ITEM, asew.DEFAULT_CAST);
            googleSettingsItem2.j = true;
            googleSettingsItem2.l = true;
            googleSettingsItem2.m = "CastSettingsChimeraActivity";
            googleSettingsItem2.e = false;
        } else {
            googleSettingsItem2 = null;
        }
        GoogleSettingsItem googleSettingsItem3 = flze.a.a().b() ? new GoogleSettingsItem(anlj.a("CastDebugSettingsPref"), 2, getApplicationContext().getString(R.string.cast_settings_debug), aojj.CAST_DEBUG_ITEM, asew.DEFAULT_CAST) : null;
        if (googleSettingsItem != null) {
            arrayList.add(googleSettingsItem);
        }
        if (googleSettingsItem2 != null) {
            arrayList.add(googleSettingsItem2);
        }
        if (googleSettingsItem3 != null) {
            arrayList.add(googleSettingsItem3);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            GoogleSettingsItem googleSettingsItem4 = (GoogleSettingsItem) arrayList.get(i2);
            googleSettingsItem4.o = asno.b(this).a();
            googleSettingsItem4.p = getString(R.string.cast_settings_page_description);
        }
        return arrayList;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
