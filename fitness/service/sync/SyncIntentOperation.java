package com.google.android.gms.fitness.service.sync;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asot;
import defpackage.bfji;
import defpackage.bgzx;
import defpackage.bhaf;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SyncIntentOperation extends IntentOperation {
    private static final asot a = bhaf.a();

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("sync_server", false);
        bfji b = bfji.b(intent.getIntExtra("sync_source", 0));
        String stringExtra = intent.getStringExtra("account");
        if (stringExtra == null) {
            ((ejhf) a.j()).x("SyncIntentOperation should never be triggered with null account");
        } else if (booleanExtra) {
            bgzx.a(this, stringExtra, b);
        } else {
            bgzx.c(this, stringExtra, b);
        }
    }
}
