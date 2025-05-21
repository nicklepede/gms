package com.google.android.gms.cast.intelligentsuggestions.service;

import android.content.Context;
import android.content.Intent;
import defpackage.amxa;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SuggestionsInitIntentOperation extends anya {
    private static final asot a = asot.b("device_suggestions", asej.CAST_INTELLIGENT_DEVICE_SUGGESTIONS);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.cast.intelligentsuggestions.SuggestionsProviderChimeraService");
        fvbo.e(className, "setClassName(...)");
        Context applicationContext = getApplicationContext();
        fvbo.e(applicationContext, "getApplicationContext(...)");
        amxa.a(applicationContext);
        ((ejhf) a.h()).x("Device suggestions feature is unavailable.");
        stopService(className);
    }
}
