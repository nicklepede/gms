package com.google.android.gms.recaptchabase.api.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RecaptchaBaseModuleInitIntentOperation extends apzs {
    private final String a = "RecaptchaBaseModuleInit";

    public RecaptchaBaseModuleInitIntentOperation() {
        ausn.b("RecaptchaBaseModuleInit", auid.RECAPTCHABASE);
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
    }
}
