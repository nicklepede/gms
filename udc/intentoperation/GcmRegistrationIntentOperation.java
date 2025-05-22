package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.GcmRegistrationIntentOperation;
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
public class GcmRegistrationIntentOperation extends IntentOperation {
    private final ekww a;
    private final ekww b;

    public GcmRegistrationIntentOperation() {
        this.a = new ekww() { // from class: djjk
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.d(GcmRegistrationIntentOperation.this);
            }
        };
        this.b = new ekww() { // from class: djjl
            @Override // defpackage.ekww
            public final Object lK() {
                return djlr.g(GcmRegistrationIntentOperation.this);
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            return;
        }
        if (fvll.w()) {
            ((dtrf) this.a.lK()).b().b(djgp.PUSH_REGISTRATION);
        }
        try {
            ((eqcy) ((dtlr) this.b.lK()).e(djgz.SYNC_ID_CUSTOM_CACHE)).u();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    GcmRegistrationIntentOperation(final dtrf dtrfVar, final dtlr dtlrVar) {
        this.a = new ekww() { // from class: djjm
            @Override // defpackage.ekww
            public final Object lK() {
                return dtrf.this;
            }
        };
        this.b = new ekww() { // from class: djjn
            @Override // defpackage.ekww
            public final Object lK() {
                return dtlr.this;
            }
        };
    }
}
