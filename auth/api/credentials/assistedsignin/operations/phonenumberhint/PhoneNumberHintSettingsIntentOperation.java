package com.google.android.gms.auth.api.credentials.assistedsignin.operations.phonenumberhint;

import android.telephony.TelephonyManager;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneNumberHintSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (((TelephonyManager) getSystemService("phone")).isVoiceCapable()) {
            return new GoogleSettingsItem(f("com.google.android.gms.auth.api.credentials.PHONE_NUMBER_HINT_SETTINGS"), 8, getString(R.string.credentials_phone_number_hint_settings_title), aojj.PHONE_NUMBER_SHARING_ITEM, asew.DEFAULT_AUTH_CREDENTIALS_BASE);
        }
        return null;
    }
}
