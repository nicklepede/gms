package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import com.android.volley.NoConnectionError;
import com.google.android.gms.ads.eventattestation.internal.AnningUserDataDeletionAttestationTokenParcel;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.ads.identifier.settings.t;
import com.google.android.gms.common.api.Status;
import defpackage.aupv;
import defpackage.bzoy;
import defpackage.bzpr;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fmqm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m extends bzoy {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final com.google.android.gms.ads.eventattestation.internal.j b;

    public m(com.google.android.gms.ads.eventattestation.internal.j jVar, int i) {
        super(216, "FetchUserDataDeletionAttestationAsync");
        this.b = jVar;
        this.a = i;
    }

    @Override // defpackage.bzoy
    protected final void f(Context context) {
        throw new AssertionError("execute() should never be called");
    }

    @Override // defpackage.bzoy
    public final eqgl fJ(final Context context, ExecutorService executorService) {
        return eqcq.g(eqdl.g(eqcq.g(eqgb.h(com.google.android.gms.ads.eventattestation.internal.m.c(context, executorService)).i(fmqm.a.lK().a(), TimeUnit.MILLISECONDS, new aupv(1, 9)), TimeoutException.class, new eqdv() { // from class: com.google.android.gms.ads.identifier.service.j
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                int i = m.c;
                throw new c((TimeoutException) obj);
            }
        }, executorService), new eqdv() { // from class: com.google.android.gms.ads.identifier.service.k
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                m mVar = m.this;
                try {
                    mVar.b.b(new AnningUserDataDeletionAttestationTokenParcel(ac.a(context).e(mVar.a)));
                    return eqgc.i(new bzpr(Status.b));
                } catch (t e) {
                    mVar.b.a(e.a, e.b);
                    return eqgc.i(new bzpr(Status.d));
                }
            }
        }, executorService), Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.identifier.service.l
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof c;
                m mVar = m.this;
                Context context2 = context;
                if (z) {
                    Throwable cause = th.getCause();
                    if (cause instanceof TimeoutException) {
                        com.google.android.gms.ads.identifier.settings.d.c(context2, "deviceIntegrityTokenError", th);
                        mVar.b.a(3, "Timed out waiting for device integrity token.");
                        return eqgc.i(new bzpr(Status.e));
                    }
                    if (cause instanceof NoConnectionError) {
                        mVar.b.a(3, "Couldn't fetch device integrity token because of no network.");
                    } else {
                        mVar.b.a(3, "Error getting device integrity token.");
                    }
                } else {
                    mVar.b.a(1, "Error getting user data deletion attestation token.");
                    com.google.android.gms.ads.identifier.settings.d.c(context2, "deletion-attestation", th);
                }
                return eqgc.i(new bzpr(Status.d));
            }
        }, executorService);
    }

    @Override // defpackage.bzoy
    public final void j(Status status) {
        this.b.a(1, status.j);
    }
}
