package com.google.android.gms.auth.api.phone.operation;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aboa;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auid;
import defpackage.auri;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fnkl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AutofillSettingsIntentOperation extends apzq {
    private static final ausn a = ausn.b("AutofillSettingsIntentOperation", auid.AUTOFILL);

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (fnkl.e()) {
            if (!aboa.b(this)) {
                ((eluo) a.h()).x("Don't create settings item, since device doesn't have telephony feature");
                return null;
            }
        } else if (fnkl.d() && !aboa.c(this)) {
            if (fnkl.i()) {
                ((eluo) a.h()).x("Don't create settings item, since device doesn't support messaging");
            }
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS"), 8, getString(R.string.sms_code_autofill_settings_title_for_settings_under_autofill_subcategory), aqlc.SMS_CODE_AUTOFILL_ITEM, auri.b(this));
        googleSettingsItem.p = getString(R.string.sms_code_autofill_settings_page_description);
        return googleSettingsItem;
    }
}
