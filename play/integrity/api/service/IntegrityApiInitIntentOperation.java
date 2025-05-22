package com.google.android.gms.play.integrity.api.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cyta;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class IntegrityApiInitIntentOperation extends apzs {
    static {
        ausn.b("PlayIntegrityApiModuleInit", auid.PLAY_INTEGRITY_API);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        cyta.a(getApplicationContext());
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
    }
}
