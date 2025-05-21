package com.google.android.gms.crisisalerts.state;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.axdg;
import defpackage.eiif;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingsChangeIntentOperation extends IntentOperation {
    public static final AtomicReference a;

    static {
        axdg.a("SetChng");
        a = new AtomicReference(Optional.empty());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !eiif.b(intent.getAction()).equals("com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SETTINGS_CHANGED")) {
            return;
        }
        AtomicReference atomicReference = a;
        ((Optional) atomicReference.get()).isPresent();
        if (((Optional) atomicReference.get()).isPresent()) {
            ((Runnable) ((Optional) atomicReference.get()).get()).run();
        }
    }
}
