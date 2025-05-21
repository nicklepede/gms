package com.google.android.gms.auth.api.phone.operation;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqh;
import defpackage.eiuu;
import defpackage.ejfg;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SmsRetrieverModuleInitIntentOperation extends anya {
    private static final asot c = asot.d();
    static final eiuu a = eiuu.K("com.google.android.gms.auth.api.phone.ui.AutofillSettingsActivity", "com.google.android.gms.auth.api.phone.ui.AutofillConsentActivity");
    static final eiuu b = eiuu.K("com.google.android.gms.auth.api.phone.ui.AutofillSettingsActivity", "com.google.android.gms.auth.api.phone.ui.BrowserConsentActivity");

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (asqh.e()) {
            ((ejhf) c.h()).x("enable sms code autofill feature components");
            ejfg listIterator = a.listIterator();
            while (listIterator.hasNext()) {
                asng.H(this, (String) listIterator.next(), true);
            }
        }
        ((ejhf) c.h()).x("enable sms code browser feature components");
        ejfg listIterator2 = b.listIterator();
        while (listIterator2.hasNext()) {
            asng.H(this, (String) listIterator2.next(), true);
        }
    }
}
