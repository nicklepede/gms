package com.google.android.gms.cast.settings;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apmh;
import defpackage.apmy;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.auri;
import defpackage.foqo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final List a() {
        GoogleSettingsItem googleSettingsItem;
        GoogleSettingsItem googleSettingsItem2;
        ArrayList arrayList = new ArrayList();
        Context applicationContext = getApplicationContext();
        int i = apmh.a;
        if (apmy.k(applicationContext)) {
            googleSettingsItem = new GoogleSettingsItem(apmh.x(), 6, apmy.j(applicationContext) ? applicationContext.getString(R.string.cast_sender_options) : applicationContext.getString(R.string.cast_options), aqlc.CAST_MEDIA_ITEM, auiq.DEFAULT_CAST);
            googleSettingsItem.j = true;
            googleSettingsItem.l = true;
            googleSettingsItem.m = "CastSettingsChimeraActivity";
            googleSettingsItem.e = false;
        } else {
            googleSettingsItem = null;
        }
        Context applicationContext2 = getApplicationContext();
        if (apmy.j(applicationContext2)) {
            googleSettingsItem2 = new GoogleSettingsItem(apmy.b(), 6, apmy.k(applicationContext2) ? applicationContext2.getString(R.string.cast_receiver_options) : applicationContext2.getString(R.string.cast_options), aqlc.CHROMECAST_MEDIA_ITEM, auiq.DEFAULT_CAST);
            googleSettingsItem2.j = true;
            googleSettingsItem2.l = true;
            googleSettingsItem2.m = "CastSettingsChimeraActivity";
            googleSettingsItem2.e = false;
        } else {
            googleSettingsItem2 = null;
        }
        GoogleSettingsItem googleSettingsItem3 = foqo.a.lK().b() ? new GoogleSettingsItem(apmy.a("CastDebugSettingsPref"), 2, getApplicationContext().getString(R.string.cast_settings_debug), aqlc.CAST_DEBUG_ITEM, auiq.DEFAULT_CAST) : null;
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
            googleSettingsItem4.o = auri.b(this).a();
            googleSettingsItem4.p = getString(R.string.cast_settings_page_description);
        }
        return arrayList;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}
