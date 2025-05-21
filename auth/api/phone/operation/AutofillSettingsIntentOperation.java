package com.google.android.gms.auth.api.phone.operation;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asej;
import defpackage.asno;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fktk;
import defpackage.zoa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AutofillSettingsIntentOperation extends anxy {
    private static final asot a = asot.b("AutofillSettingsIntentOperation", asej.AUTOFILL);

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (fktk.e()) {
            if (!zoa.b(this)) {
                ((ejhf) a.h()).x("Don't create settings item, since device doesn't have telephony feature");
                return null;
            }
        } else if (fktk.d() && !zoa.c(this)) {
            if (fktk.i()) {
                ((ejhf) a.h()).x("Don't create settings item, since device doesn't support messaging");
            }
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS"), 8, getString(R.string.sms_code_autofill_settings_title_for_settings_under_autofill_subcategory), aojj.SMS_CODE_AUTOFILL_ITEM, asno.b(this));
        googleSettingsItem.p = getString(R.string.sms_code_autofill_settings_page_description);
        return googleSettingsItem;
    }
}
