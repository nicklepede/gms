package com.google.android.gms.setupservices;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auad;
import defpackage.aura;
import defpackage.fuuz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SetupServicesInitIntentOperation extends apzs {
    private static final auad a = new auad("SetupServices", new String[0]);

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (fuuz.a.lK().ab()) {
            a.d("Enabling component com.google.android.gms.setupservices.GoogleServicesActivity", new Object[0]);
            aura.H(this, "com.google.android.gms.setupservices.GoogleServicesActivity", true);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
    }
}
