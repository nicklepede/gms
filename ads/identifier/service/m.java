package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import com.android.volley.NoConnectionError;
import com.google.android.gms.ads.eventattestation.internal.AnningUserDataDeletionAttestationTokenParcel;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.ads.identifier.settings.t;
import com.google.android.gms.common.api.Status;
import defpackage.asmb;
import defpackage.bxgi;
import defpackage.bxhb;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fkah;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m extends bxgi {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final com.google.android.gms.ads.eventattestation.internal.j b;

    public m(com.google.android.gms.ads.eventattestation.internal.j jVar, int i) {
        super(216, "FetchUserDataDeletionAttestationAsync");
        this.b = jVar;
        this.a = i;
    }

    @Override // defpackage.bxgi
    protected final void f(Context context) {
        throw new AssertionError("execute() should never be called");
    }

    @Override // defpackage.bxgi
    public final enss fw(final Context context, ExecutorService executorService) {
        return enox.g(enps.g(enox.g(ensi.h(com.google.android.gms.ads.eventattestation.internal.m.c(context, executorService)).i(fkah.a.a().a(), TimeUnit.MILLISECONDS, new asmb(1, 9)), TimeoutException.class, new enqc() { // from class: com.google.android.gms.ads.identifier.service.j
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                int i = m.c;
                throw new c((TimeoutException) obj);
            }
        }, executorService), new enqc() { // from class: com.google.android.gms.ads.identifier.service.k
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                m mVar = m.this;
                try {
                    mVar.b.b(new AnningUserDataDeletionAttestationTokenParcel(ac.a(context).e(mVar.a)));
                    return ensj.i(new bxhb(Status.b));
                } catch (t e) {
                    mVar.b.a(e.a, e.b);
                    return ensj.i(new bxhb(Status.d));
                }
            }
        }, executorService), Throwable.class, new enqc() { // from class: com.google.android.gms.ads.identifier.service.l
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof c;
                m mVar = m.this;
                Context context2 = context;
                if (z) {
                    Throwable cause = th.getCause();
                    if (cause instanceof TimeoutException) {
                        com.google.android.gms.ads.identifier.settings.d.c(context2, "deviceIntegrityTokenError", th);
                        mVar.b.a(3, "Timed out waiting for device integrity token.");
                        return ensj.i(new bxhb(Status.e));
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
                return ensj.i(new bxhb(Status.d));
            }
        }, executorService);
    }

    @Override // defpackage.bxgi
    public final void j(Status status) {
        this.b.a(1, status.j);
    }
}
