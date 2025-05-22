package com.google.android.gms.update.phone;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auad;
import defpackage.aura;
import defpackage.djqk;
import defpackage.djuz;
import defpackage.ftoc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PhoneModuleInitIntentOperation extends apzs {
    private static final auad a = djuz.h("PhoneModuleInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (!djqk.b(this)) {
            a.h("Disabling the system update activity since it's not the main profile.", new Object[0]);
            aura.H(this, "com.google.android.gms.update.OtaSuggestionSummaryProvider", false);
            aura.H(this, "com.google.android.gms.update.SystemUpdateActivity", false);
            aura.H(this, "com.google.android.gms.update.UpdateFromSdCardActivity", false);
            return;
        }
        aura.K("com.google.android.gms.update.OtaSuggestionSummaryProvider", true);
        aura.K("com.google.android.gms.update.SystemUpdateActivity", true);
        if (ftoc.c()) {
            aura.K("com.google.android.gms.update.UpdateFromSdCardActivity", true);
        }
    }
}
