package com.google.android.gms.ads.internal.clearcut;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feeq;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class h extends fecp implements feeh {
    public static final h a;
    private static volatile feen b;

    static {
        h hVar = new h();
        a = hVar;
        fecp.J(h.class, hVar);
    }

    private h() {
        feeq feeqVar = feeq.a;
    }

    @Override // defpackage.fecp
    public final Object iB(int i, Object obj) {
        feen feenVar;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new feer(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new h();
        }
        if (i2 == 4) {
            return new fecj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        feen feenVar2 = b;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (h.class) {
            feenVar = b;
            if (feenVar == null) {
                feenVar = new feck(a);
                b = feenVar;
            }
        }
        return feenVar;
    }
}
