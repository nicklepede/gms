package com.google.android.gms.personalsafety.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cvpo;
import defpackage.ejhf;
import defpackage.ips;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AdvancedProtectionIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.google.android.gms.advancedprotection.service.AAPM_CHANGED")) {
            ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8629)).x("Received wrong action for advanced protection, bailing out.");
        } else {
            int i = ips.a;
            ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8628)).x("Not running Android Baklava despite receiving AAPM callback, bailing out.");
        }
    }
}
