package com.google.android.gms.fitness.service.sync;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.bhny;
import defpackage.bjen;
import defpackage.bjev;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SyncIntentOperation extends IntentOperation {
    private static final ausn a = bjev.a();

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("sync_server", false);
        bhny b = bhny.b(intent.getIntExtra("sync_source", 0));
        String stringExtra = intent.getStringExtra("account");
        if (stringExtra == null) {
            ((eluo) a.j()).x("SyncIntentOperation should never be triggered with null account");
        } else if (booleanExtra) {
            bjen.a(this, stringExtra, b);
        } else {
            bjen.c(this, stringExtra, b);
        }
    }
}
