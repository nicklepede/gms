package com.google.android.gms.auth.api.phone.operation;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.elhz;
import defpackage.elsn;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SmsRetrieverModuleInitIntentOperation extends apzs {
    private static final ausn c = ausn.d();
    static final elhz a = elhz.K("com.google.android.gms.auth.api.phone.ui.AutofillSettingsActivity", "com.google.android.gms.auth.api.phone.ui.AutofillConsentActivity");
    static final elhz b = elhz.K("com.google.android.gms.auth.api.phone.ui.AutofillSettingsActivity", "com.google.android.gms.auth.api.phone.ui.BrowserConsentActivity");

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (auub.e()) {
            ((eluo) c.h()).x("enable sms code autofill feature components");
            elsn listIterator = a.listIterator();
            while (listIterator.hasNext()) {
                aura.H(this, (String) listIterator.next(), true);
            }
        }
        ((eluo) c.h()).x("enable sms code browser feature components");
        elsn listIterator2 = b.listIterator();
        while (listIterator2.hasNext()) {
            aura.H(this, (String) listIterator2.next(), true);
        }
    }
}
