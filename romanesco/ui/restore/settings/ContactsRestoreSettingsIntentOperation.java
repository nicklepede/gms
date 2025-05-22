package com.google.android.gms.romanesco.ui.restore.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsRestoreSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.romanesco.restore.settings.ContactsRestoreSettingsActivity"), 7, R.string.romanesco_contacts_restore_title, aqlc.CONTACTS_RESTORE_ITEM, auiq.DEFAULT_ROMANESCO);
        googleSettingsItem.e = true;
        googleSettingsItem.j = true;
        googleSettingsItem.p = getString(R.string.romanesco_contacts_restore_page_description);
        return googleSettingsItem;
    }
}
