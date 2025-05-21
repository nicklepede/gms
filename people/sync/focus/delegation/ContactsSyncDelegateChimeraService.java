package com.google.android.gms.people.sync.focus.delegation;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.cuey;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ContactsSyncDelegateChimeraService extends TracingIntentService {
    public ContactsSyncDelegateChimeraService() {
        super("FSA2_ContactsSyncDelegateService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        cuey.f("FSA2_ContactsSyncDelegateService", "Sync coordinator disabled. Bailing out");
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i2, i2);
        return 2;
    }
}
