package com.google.android.gms.core.gmscorelogger;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import defpackage.atad;
import defpackage.atai;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auid;
import defpackage.ausn;
import defpackage.avwt;
import defpackage.bkti;
import defpackage.btjt;
import defpackage.btmr;
import defpackage.btok;
import defpackage.eluo;
import defpackage.fpnq;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class GmsCoreLoggerTestOpHandler extends IntentOperation {
    public static final ausn a = ausn.b("GmsLoggerTestOpHandler", auid.CONTAINER);
    private btjt b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new btmr(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fpnq.U()) {
            ((eluo) ((eluo) a.h()).ai((char) 3298)).x("Received FINALIZE_AGGREGATED_LOGS but ignoring as no metric is enabled");
            return;
        }
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.gms.core.gmscorelogger.FINALIZE_AGGREGATED_LOGS")) {
            ((eluo) ((eluo) a.i()).ai((char) 3296)).B("Unknown action: %s", action);
            return;
        }
        ((eluo) ((eluo) a.h()).ai((char) 3297)).x("Received FINALIZE_AGGREGATED_LOGS");
        atai ataiVar = this.b;
        final int[] iArr = {btok.FACET_USAGE.a()};
        atfn atfnVar = new atfn();
        atfnVar.c = new Feature[]{bkti.c};
        atfnVar.b = false;
        atfnVar.a = new atfd() { // from class: btmn
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = btmr.a;
                ((btmh) ((btju) obj).H()).c(iArr);
                ((dhma) obj2).b(null);
            }
        };
        ((atad) ataiVar).jc(atfnVar.a()).y(new avwt());
    }
}
