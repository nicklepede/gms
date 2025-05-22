package com.google.android.gms.kids.settings.download;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.fxxm;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class AccountSeedingPrefetchInitIntentOperation extends IntentOperation {
    static {
        ausn.b("AccountSeedingPrefetchInitIntentOperation", auid.KIDS);
    }

    public AccountSeedingPrefetchInitIntentOperation() {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
    }
}
