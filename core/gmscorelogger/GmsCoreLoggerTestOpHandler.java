package com.google.android.gms.core.gmscorelogger;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asej;
import defpackage.asot;
import defpackage.atsq;
import defpackage.biot;
import defpackage.brcc;
import defpackage.brfa;
import defpackage.brgt;
import defpackage.ejhf;
import defpackage.fmvs;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class GmsCoreLoggerTestOpHandler extends IntentOperation {
    public static final asot a = asot.b("GmsLoggerTestOpHandler", asej.CONTAINER);
    private brcc b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new brfa(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fmvs.U()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 3294)).x("Received FINALIZE_AGGREGATED_LOGS but ignoring as no metric is enabled");
            return;
        }
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.gms.core.gmscorelogger.FINALIZE_AGGREGATED_LOGS")) {
            ((ejhf) ((ejhf) a.i()).ah((char) 3292)).B("Unknown action: %s", action);
            return;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 3293)).x("Received FINALIZE_AGGREGATED_LOGS");
        aqxt aqxtVar = this.b;
        final int[] iArr = {brgt.FACET_USAGE.a()};
        arcy arcyVar = new arcy();
        arcyVar.c = new Feature[]{biot.c};
        arcyVar.b = false;
        arcyVar.a = new arco() { // from class: brew
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = brfa.a;
                ((breq) ((brcd) obj).H()).c(iArr);
                ((dfau) obj2).b(null);
            }
        };
        ((aqxo) aqxtVar).iN(arcyVar.a()).y(new atsq());
    }
}
