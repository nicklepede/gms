package com.google.android.gms.ads.cache;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class r extends fecp implements feeh {
    public static final r a;
    private static volatile feen e;
    public int b;
    public String c = "";
    public long d;

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
            return new feer(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d"});
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
        feen feenVar2 = e;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (r.class) {
            feenVar = e;
            if (feenVar == null) {
                feenVar = new feck(a);
                e = feenVar;
            }
        }
        return feenVar;
    }
}
