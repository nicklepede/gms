package com.google.android.gms.personalsafety.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cxze;
import defpackage.eluo;
import defpackage.iri;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AdvancedProtectionIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.google.android.gms.advancedprotection.service.AAPM_CHANGED")) {
            ((eluo) ((eluo) cxze.a.j()).ai((char) 8627)).x("Received wrong action for advanced protection, bailing out.");
        } else {
            int i = iri.a;
            ((eluo) ((eluo) cxze.a.j()).ai((char) 8626)).x("Not running Android Baklava despite receiving AAPM callback, bailing out.");
        }
    }
}
