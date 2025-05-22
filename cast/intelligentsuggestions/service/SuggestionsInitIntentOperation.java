package com.google.android.gms.cast.intelligentsuggestions.service;

import android.content.Context;
import android.content.Intent;
import defpackage.aoyl;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SuggestionsInitIntentOperation extends apzs {
    private static final ausn a = ausn.b("device_suggestions", auid.CAST_INTELLIGENT_DEVICE_SUGGESTIONS);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.cast.intelligentsuggestions.SuggestionsProviderChimeraService");
        fxxm.e(className, "setClassName(...)");
        Context applicationContext = getApplicationContext();
        fxxm.e(applicationContext, "getApplicationContext(...)");
        aoyl.a(applicationContext);
        ((eluo) a.h()).x("Device suggestions feature is unavailable.");
        stopService(className);
    }
}
