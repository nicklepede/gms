package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.GServiceFlagsChangedIntentOperation;
import defpackage.asqg;
import defpackage.dgvj;
import defpackage.dgvt;
import defpackage.drbj;
import defpackage.drgx;
import defpackage.eijr;
import defpackage.enpf;
import defpackage.fspw;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GServiceFlagsChangedIntentOperation extends IntentOperation {
    private final eijr a;
    private final eijr b;

    static {
        asqg.f("com.google.android.gms.udc");
    }

    public GServiceFlagsChangedIntentOperation() {
        this.a = new eijr() { // from class: dgyc
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.g(GServiceFlagsChangedIntentOperation.this);
            }
        };
        this.b = new eijr() { // from class: dgyd
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.d(GServiceFlagsChangedIntentOperation.this);
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.udc".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (fspw.a.a().Y()) {
                if (fspw.w()) {
                    ((drgx) this.b.a()).b().b(dgvj.FLAG_CHANGE);
                }
                try {
                    ((enpf) ((drbj) this.a.a()).e(dgvt.SYNC_ID_CUSTOM_CACHE)).u();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
            ((enpf) ((drbj) this.a.a()).f()).u();
        }
    }

    GServiceFlagsChangedIntentOperation(eijr eijrVar) {
        this.a = eijrVar;
        this.b = new eijr() { // from class: dgyb
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.d(GServiceFlagsChangedIntentOperation.this);
            }
        };
    }
}
