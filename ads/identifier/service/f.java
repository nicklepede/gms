package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import com.google.android.gms.ads.eventattestation.internal.AnningUserDataDeletionAttestationTokenParcel;
import com.google.android.gms.ads.identifier.settings.ac;
import com.google.android.gms.ads.identifier.settings.t;
import com.google.android.gms.common.api.Status;
import defpackage.bxgi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f extends bxgi {
    private final int a;
    private final com.google.android.gms.ads.eventattestation.internal.j b;

    public f(com.google.android.gms.ads.eventattestation.internal.j jVar, int i) {
        super(216, "FetchAnningUserDataDeletionAttestationToken");
        this.b = jVar;
        this.a = i;
    }

    @Override // defpackage.bxgi
    public final void f(Context context) {
        try {
            this.b.b(new AnningUserDataDeletionAttestationTokenParcel(ac.a(context).e(this.a)));
        } catch (t e) {
            this.b.a(e.a, e.b);
        }
    }

    @Override // defpackage.bxgi
    public final void j(Status status) {
        this.b.a(1, status.j);
    }
}
