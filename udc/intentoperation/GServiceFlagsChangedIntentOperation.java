package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.GServiceFlagsChangedIntentOperation;
import defpackage.auua;
import defpackage.djgp;
import defpackage.djgz;
import defpackage.dtlr;
import defpackage.dtrf;
import defpackage.ekww;
import defpackage.eqcy;
import defpackage.fvll;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GServiceFlagsChangedIntentOperation extends IntentOperation {
    private final ekww a;
    private final ekww b;

    static {
        auua.f("com.google.android.gms.udc");
    }

    public GServiceFlagsChangedIntentOperation() {
        this.a = new ekww() { // from class: djji
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.g(GServiceFlagsChangedIntentOperation.this);
            }
        };
        this.b = new ekww() { // from class: djjj
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.d(GServiceFlagsChangedIntentOperation.this);
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.udc".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (fvll.a.lK().Y()) {
                if (fvll.w()) {
                    ((dtrf) this.b.lK()).b().b(djgp.FLAG_CHANGE);
                }
                try {
                    ((eqcy) ((dtlr) this.a.lK()).e(djgz.SYNC_ID_CUSTOM_CACHE)).u();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
            ((eqcy) ((dtlr) this.a.lK()).f()).u();
        }
    }

    GServiceFlagsChangedIntentOperation(ekww ekwwVar) {
        this.a = ekwwVar;
        this.b = new ekww() { // from class: djjh
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.d(GServiceFlagsChangedIntentOperation.this);
            }
        };
    }
}
