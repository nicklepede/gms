package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.intentoperation.GcmRegistrationIntentOperation;
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
public class GcmRegistrationIntentOperation extends IntentOperation {
    private final eijr a;
    private final eijr b;

    public GcmRegistrationIntentOperation() {
        this.a = new eijr() { // from class: dgye
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.d(GcmRegistrationIntentOperation.this);
            }
        };
        this.b = new eijr() { // from class: dgyf
            @Override // defpackage.eijr
            public final Object a() {
                return dhal.g(GcmRegistrationIntentOperation.this);
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            return;
        }
        if (fspw.w()) {
            ((drgx) this.a.a()).b().b(dgvj.PUSH_REGISTRATION);
        }
        try {
            ((enpf) ((drbj) this.b.a()).e(dgvt.SYNC_ID_CUSTOM_CACHE)).u();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    GcmRegistrationIntentOperation(final drgx drgxVar, final drbj drbjVar) {
        this.a = new eijr() { // from class: dgyg
            @Override // defpackage.eijr
            public final Object a() {
                return drgx.this;
            }
        };
        this.b = new eijr() { // from class: dgyh
            @Override // defpackage.eijr
            public final Object a() {
                return drbj.this;
            }
        };
    }
}
