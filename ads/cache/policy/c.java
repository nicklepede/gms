package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.s;
import defpackage.arwb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c implements e {
    private final s a;

    public c(s sVar) {
        this.a = sVar;
    }

    @Override // com.google.android.gms.ads.cache.policy.e
    public final void a(com.google.android.gms.ads.cache.a aVar) {
        aVar.a.f(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return arwb.b(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        s sVar = this.a;
        if (sVar.L()) {
            return sVar.s();
        }
        int i = sVar.bH;
        if (i != 0) {
            return i;
        }
        int s = sVar.s();
        sVar.bH = s;
        return s;
    }
}
