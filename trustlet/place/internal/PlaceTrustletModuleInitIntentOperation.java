package com.google.android.gms.trustlet.place.internal;

import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PlaceTrustletModuleInitIntentOperation extends anya {
    static final String[] a;

    static {
        asot.b("Trustlet_Place", asej.TRUSTLET_PLACE);
        a = new String[]{"com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity"};
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        int i2 = i & 4;
        Context applicationContext = getApplicationContext();
        if (i2 == 0 && (i & 8) == 0) {
            return;
        }
        String[] strArr = a;
        int length = strArr.length;
        asng.H(applicationContext, strArr[0], true);
    }
}
