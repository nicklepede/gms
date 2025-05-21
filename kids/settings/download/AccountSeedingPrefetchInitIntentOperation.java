package com.google.android.gms.kids.settings.download;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.fvbo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AccountSeedingPrefetchInitIntentOperation extends IntentOperation {
    static {
        asot.b("AccountSeedingPrefetchInitIntentOperation", asej.KIDS);
    }

    public AccountSeedingPrefetchInitIntentOperation() {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
    }
}
