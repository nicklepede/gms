package com.google.android.gms.people.sync.coreui;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asno;
import defpackage.fqzp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsSyncCoreSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!fqzp.r()) {
            return null;
        }
        Intent className = new Intent().setClassName(this, "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
        className.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.settings").build());
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 4, R.string.people_google_contacts_sync_title, aojj.CONTACTS_SYNC_ITEM, asno.b(this));
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
