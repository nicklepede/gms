package com.google.android.gms.fido;

import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.fnze;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LinkedDevicesSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        AppContextProvider.a();
        if (fnze.c()) {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.fido.fido2.ui.hybrid.LINKED_DEVICES_SETTINGS"), 6, getString(R.string.fido_hybrid_linked_devices_google_settings_title), aojj.LINKED_DEVICES_ITEM, asew.DEFAULT_FIDO);
            googleSettingsItem.j = true;
            googleSettingsItem.p = getString(R.string.fido_linked_devices_page_description);
            return googleSettingsItem;
        }
        GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(f("com.google.android.gms.fido.fido2.ui.hybrid.LINKED_DEVICES_SETTINGS"), 6, getString(R.string.fido_linked_devices_google_settings_title), aojj.LINKED_DEVICES_ITEM, asew.DEFAULT_FIDO);
        googleSettingsItem2.j = true;
        googleSettingsItem2.p = getString(R.string.fido_linked_devices_page_description);
        return googleSettingsItem2;
    }
}
