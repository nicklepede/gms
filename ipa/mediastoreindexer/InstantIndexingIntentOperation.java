package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bonp;
import defpackage.bope;
import defpackage.bopo;
import defpackage.boqq;
import defpackage.boqr;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fpgv;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InstantIndexingIntentOperation extends IntentOperation {
    private static final asot a = asot.b("GmscoreIpa", asej.PLATFORM_DATA_INDEXER);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ((ejhf) a.h()).x("Starting mediastore instant index");
        bonp bonpVar = new bonp();
        boqq boqqVar = new boqq(3);
        enss d = new bope(new bopo(getApplicationContext(), bonpVar, boqqVar)).a.d();
        boqr boqrVar = new boqr(d, boqqVar);
        Executor executor = bopo.b;
        ensj.t(d, boqrVar, executor);
        ensj.q(d, fpgv.a.a().y(), TimeUnit.SECONDS, bopo.a);
        bonpVar.c(d, executor);
    }
}
