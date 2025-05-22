package com.google.android.gms.firebase.fpnv.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.bhks;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FpnvIntentOperation extends IntentOperation {
    private static final ausn a;

    static {
        int i = bhks.a;
        a = bhks.a("FpnvIntentOperation");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        ((eluo) a.h()).B("Received intent: %s", intent);
    }
}
