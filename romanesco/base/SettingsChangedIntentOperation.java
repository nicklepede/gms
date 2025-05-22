package com.google.android.gms.romanesco.base;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.czvj;
import defpackage.czys;
import defpackage.fume;
import defpackage.fumq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SettingsChangedIntentOperation extends apzs {
    static {
        ausn.b("ROM_SettingsChangeOp", auid.ROMANESCO);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent, boolean z) {
        if (fumq.a.lK().k()) {
            czvj.b(this).a.j();
        }
        if (fume.d()) {
            czys.b(getApplicationContext());
        }
    }
}
