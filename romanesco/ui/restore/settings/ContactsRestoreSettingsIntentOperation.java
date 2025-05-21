package com.google.android.gms.romanesco.ui.restore.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsRestoreSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.romanesco.restore.settings.ContactsRestoreSettingsActivity"), 7, R.string.romanesco_contacts_restore_title, aojj.CONTACTS_RESTORE_ITEM, asew.DEFAULT_ROMANESCO);
        googleSettingsItem.e = true;
        googleSettingsItem.j = true;
        googleSettingsItem.p = getString(R.string.romanesco_contacts_restore_page_description);
        return googleSettingsItem;
    }
}
