package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqvf;
import defpackage.bqwu;
import defpackage.bqxe;
import defpackage.bqyg;
import defpackage.bqyh;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fsah;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InstantIndexingIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("GmscoreIpa", auid.PLATFORM_DATA_INDEXER);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ((eluo) a.h()).x("Starting mediastore instant index");
        bqvf bqvfVar = new bqvf();
        bqyg bqygVar = new bqyg(3);
        eqgl d = new bqwu(new bqxe(getApplicationContext(), bqvfVar, bqygVar)).a.d();
        bqyh bqyhVar = new bqyh(d, bqygVar);
        Executor executor = bqxe.b;
        eqgc.t(d, bqyhVar, executor);
        eqgc.q(d, fsah.a.lK().y(), TimeUnit.SECONDS, bqxe.a);
        bqvfVar.c(d, executor);
    }
}
