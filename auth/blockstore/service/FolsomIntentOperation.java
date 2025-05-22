package com.google.android.gms.auth.blockstore.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.service.FolsomIntentOperation;
import defpackage.accc;
import defpackage.acey;
import defpackage.acgm;
import defpackage.aupz;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.eqfo;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.fnmw;
import defpackage.fnne;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomIntentOperation extends IntentOperation {
    public static final ausn a = accc.b("FolsomIntentOperation");
    private final eqfo b = new acey();
    private final eqgo c = new aupz(Integer.MAX_VALUE, 10);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!ausj.c(fnmw.d())) {
            ((eluo) a.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        if (!"com.google.android.gms.auth.folsom.SUCCESSFUL_RECOVERY".equals(intent.getAction())) {
            ((eluo) a.h()).x("Not an intent event that Blockstore needs to handle. Skipping.");
            return;
        }
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).x("FOLSOM_SUCCESSFUL_RECOVERY_INTENT received");
        final long longExtra = intent.getLongExtra("com.google.android.gms.auth.folsom.EXTRA_SOURCE_ANDROID_ID", 0L);
        if (!fnne.g() || !fnne.a.lK().q()) {
            ((eluo) ausnVar.h()).x("feature flags not enabled, skipping restore.");
        } else {
            if (longExtra == 0) {
                ((eluo) ausnVar.j()).x("No source android id found from Folsom broadcast.");
                return;
            }
            eqgo eqgoVar = this.c;
            final acgm b = acgm.b();
            eqgc.t(eqgb.h(eqgoVar.submit(new Callable() { // from class: acex
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ausn ausnVar2 = FolsomIntentOperation.a;
                    acgn a2 = acgp.a();
                    a2.b(longExtra);
                    a2.c(acgo.SINGLE_DEVICE);
                    a2.b = 2;
                    return Integer.valueOf(acgm.this.a(a2.a()));
                }
            })), this.b, eqgoVar);
        }
    }
}
