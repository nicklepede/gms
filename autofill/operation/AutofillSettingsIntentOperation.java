package com.google.android.gms.autofill.operation;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.auub;
import defpackage.fnvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (auub.c() && fnvd.a.lK().D()) {
            return new GoogleSettingsItem(f("com.google.android.gms.autofill.ACTION_SETTINGS"), 8, R.string.autofill_label, aqlc.AUTOFILL_WITH_GOOGLE_ITEM, auiq.DEFAULT_AUTOFILL);
        }
        return null;
    }
}
