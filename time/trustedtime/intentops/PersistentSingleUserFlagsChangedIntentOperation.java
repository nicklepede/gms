package com.google.android.gms.time.trustedtime.intentops;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asot;
import defpackage.asqg;
import defpackage.dghq;
import defpackage.dgii;
import defpackage.dgil;
import defpackage.dgim;
import defpackage.dgiy;
import defpackage.dgja;
import defpackage.dgjb;
import defpackage.dgjd;
import defpackage.dupg;
import defpackage.duut;
import defpackage.duuw;
import defpackage.ejhf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PersistentSingleUserFlagsChangedIntentOperation extends IntentOperation {
    private static final duut a = new duuw("PersistentSingleUserFlagsChangedIntentOperation");
    private static final String b = asqg.f("com.google.android.gms.time");
    private final dgja c;
    private final dgja d;

    public PersistentSingleUserFlagsChangedIntentOperation() {
        this(dgjd.a, dgii.b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!dgjb.b()) {
            ((ejhf) ((ejhf) dgiy.a.j()).ah(11407)).B("[%s] TrustedTime is not enabled, ignoring call.", a);
            return;
        }
        if (!((Boolean) this.c.b()).booleanValue()) {
            asot asotVar = dgiy.a;
            return;
        }
        if (intent != null) {
            if ((Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.COMMITTED") || b.equals(intent.getAction())) && intent.hasExtra("com.google.android.gms.phenotype.PACKAGE_NAME") && Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.time")) {
                dgii dgiiVar = (dgii) this.d.b();
                asot asotVar2 = dgiy.a;
                ((ejhf) ((ejhf) asotVar2.h()).ah((char) 11405)).x("Phenotype flag values for time module updated");
                synchronized (dgiiVar.c) {
                    if (dgiiVar.d) {
                        dgim dgimVar = dgiiVar.e;
                        synchronized (dgimVar.a) {
                            dghq a2 = dghq.a();
                            dupg dupgVar = new dupg("onConfigUpdatedInternal");
                            if (!dgimVar.b.equals(a2)) {
                                ((ejhf) ((ejhf) asotVar2.h()).ah((char) 11460)).x("onConfigUpdated configuration changed, updating");
                                dgimVar.b = a2;
                                dgimVar.h.d(dgimVar.b);
                                dgimVar.d.b(dgimVar.b);
                                int i = dgimVar.f().a;
                                if (i == 1) {
                                    dgimVar.e.a(new dupg("State machine expected to be initialized but was in STATE_UNINITIALIZED"));
                                } else if (i == 2 || i == 3) {
                                    if (!dgimVar.b.p) {
                                        dgimVar.h(dgimVar.f().d, dupgVar);
                                    }
                                } else if (i != 4) {
                                    if (i != 5) {
                                        dgimVar.e.a(dupg.a(new dupg("Unexpected state enum "), dgil.b(i)));
                                    } else {
                                        ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11461)).B("Received config updates in FAILED state, ignoring updates: %s", new duuw(dupgVar));
                                    }
                                } else if (dgimVar.b.p) {
                                    dgimVar.j();
                                    dgimVar.h(dgimVar.f().d, dupgVar);
                                }
                            }
                        }
                    } else {
                        dgiiVar.a(new dupg("onTimeModuleConfigUpdated"));
                    }
                }
            }
        }
    }

    public PersistentSingleUserFlagsChangedIntentOperation(dgja dgjaVar, dgja dgjaVar2) {
        this.c = (dgja) Objects.requireNonNull(dgjaVar);
        this.d = (dgja) Objects.requireNonNull(dgjaVar2);
    }
}
