package com.google.android.gms.ads.cache.policy;

import defpackage.arwb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m {
    public static final com.google.android.gms.ads.internal.js.function.c a = new l();
    public final b b;

    public m(b bVar) {
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return arwb.b(this.b, ((m) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
