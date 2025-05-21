package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feeq;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class r extends fecp implements feeh {
    public static final r a;
    private static volatile feen c;
    public fedh b = feeq.a;

    static {
        r rVar = new r();
        a = rVar;
        fecp.J(r.class, rVar);
    }

    private r() {
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
            return new feer(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", q.class});
        }
        if (i2 == 3) {
            return new r();
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
        feen feenVar2 = c;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (r.class) {
            feenVar = c;
            if (feenVar == null) {
                feenVar = new feck(a);
                c = feenVar;
            }
        }
        return feenVar;
    }
}
