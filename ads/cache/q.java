package com.google.android.gms.ads.cache;

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
public final class q extends fecp implements feeh {
    public static final q a;
    private static volatile feen k;
    public int b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public int h;
    public int j;
    public fedh c = feeq.a;
    public long i = -1;

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
            return new feer(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဇ\u0003\u0006င\u0004\u0007ဂ\u0005\b᠌\u0006", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, p.class, "d", "e", "f", "g", "h", "i", "j", n.a});
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
        feen feenVar2 = k;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (q.class) {
            feenVar = k;
            if (feenVar == null) {
                feenVar = new feck(a);
                k = feenVar;
            }
        }
        return feenVar;
    }
}
