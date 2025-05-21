package com.google.android.gms.update.phone;

import android.content.Intent;
import defpackage.anya;
import defpackage.arxo;
import defpackage.asng;
import defpackage.dhfe;
import defpackage.dhjt;
import defpackage.fqug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PhoneModuleInitIntentOperation extends anya {
    private static final arxo a = dhjt.h("PhoneModuleInitIntentOperation");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (!dhfe.b(this)) {
            a.h("Disabling the system update activity since it's not the main profile.", new Object[0]);
            asng.H(this, "com.google.android.gms.update.OtaSuggestionSummaryProvider", false);
            asng.H(this, "com.google.android.gms.update.SystemUpdateActivity", false);
            asng.H(this, "com.google.android.gms.update.UpdateFromSdCardActivity", false);
            return;
        }
        asng.K("com.google.android.gms.update.OtaSuggestionSummaryProvider", true);
        asng.K("com.google.android.gms.update.SystemUpdateActivity", true);
        if (fqug.c()) {
            asng.K("com.google.android.gms.update.UpdateFromSdCardActivity", true);
        }
    }
}
