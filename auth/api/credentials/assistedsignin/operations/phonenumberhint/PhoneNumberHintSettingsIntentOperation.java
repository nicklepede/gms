package com.google.android.gms.auth.api.credentials.assistedsignin.operations.phonenumberhint;

import android.telephony.TelephonyManager;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneNumberHintSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (((TelephonyManager) getSystemService("phone")).isVoiceCapable()) {
            return new GoogleSettingsItem(f("com.google.android.gms.auth.api.credentials.PHONE_NUMBER_HINT_SETTINGS"), 8, getString(R.string.credentials_phone_number_hint_settings_title), aqlc.PHONE_NUMBER_SHARING_ITEM, auiq.DEFAULT_AUTH_CREDENTIALS_BASE);
        }
        return null;
    }
}
