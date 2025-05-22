package com.google.android.gms.fido;

import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.fqrg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LinkedDevicesSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        AppContextProvider.a();
        if (fqrg.c()) {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.fido.fido2.ui.hybrid.LINKED_DEVICES_SETTINGS"), 6, getString(R.string.fido_hybrid_linked_devices_google_settings_title), aqlc.LINKED_DEVICES_ITEM, auiq.DEFAULT_FIDO);
            googleSettingsItem.j = true;
            googleSettingsItem.p = getString(R.string.fido_linked_devices_page_description);
            return googleSettingsItem;
        }
        GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(f("com.google.android.gms.fido.fido2.ui.hybrid.LINKED_DEVICES_SETTINGS"), 6, getString(R.string.fido_linked_devices_google_settings_title), aqlc.LINKED_DEVICES_ITEM, auiq.DEFAULT_FIDO);
        googleSettingsItem2.j = true;
        googleSettingsItem2.p = getString(R.string.fido_linked_devices_page_description);
        return googleSettingsItem2;
    }
}
