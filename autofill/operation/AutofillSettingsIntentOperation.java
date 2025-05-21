package com.google.android.gms.autofill.operation;

import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asqh;
import defpackage.fldt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (asqh.c() && fldt.a.a().D()) {
            return new GoogleSettingsItem(f("com.google.android.gms.autofill.ACTION_SETTINGS"), 8, R.string.autofill_label, aojj.AUTOFILL_WITH_GOOGLE_ITEM, asew.DEFAULT_AUTOFILL);
        }
        return null;
    }
}
