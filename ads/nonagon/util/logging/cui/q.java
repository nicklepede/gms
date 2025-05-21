package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class q extends fecp implements feeh {
    public static final q a;
    private static volatile feen d;
    public int b;
    public p c;

    static {
        q qVar = new q();
        a = qVar;
        fecp.J(q.class, qVar);
    }

    private q() {
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
            return new feer(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a});
        }
        if (i2 == 3) {
            return new q();
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
        feen feenVar2 = d;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (q.class) {
            feenVar = d;
            if (feenVar == null) {
                feenVar = new feck(a);
                d = feenVar;
            }
        }
        return feenVar;
    }
}
