package com.google.android.gms.people.sync.coreui;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auri;
import defpackage.fttk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsSyncCoreSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!fttk.r()) {
            return null;
        }
        Intent className = new Intent().setClassName(this, "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
        className.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.settings").build());
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 4, R.string.people_google_contacts_sync_title, aqlc.CONTACTS_SYNC_ITEM, auri.b(this));
        googleSettingsItem.e = true;
        googleSettingsItem.p = getString(R.string.people_google_contacts_sync_page_description);
        if (g()) {
            googleSettingsItem.j = true;
            googleSettingsItem.m = "SyncCore";
            googleSettingsItem.l = true;
            for (String str : getResources().getStringArray(R.array.people_contacts_sync_core_settings_search_keywords)) {
                googleSettingsItem.a(str);
            }
        }
        return googleSettingsItem;
    }
}
