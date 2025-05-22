package com.google.android.gms.trustlet.place.internal;

import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PlaceTrustletModuleInitIntentOperation extends apzs {
    static final String[] a;

    static {
        ausn.b("Trustlet_Place", auid.TRUSTLET_PLACE);
        a = new String[]{"com.google.android.gms.trustlet.place.ui.TrustedPlacesSettingsActivity"};
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        int i2 = i & 4;
        Context applicationContext = getApplicationContext();
        if (i2 == 0 && (i & 8) == 0) {
            return;
        }
        String[] strArr = a;
        int length = strArr.length;
        aura.H(applicationContext, strArr[0], true);
    }
}
