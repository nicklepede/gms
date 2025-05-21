package com.google.android.gms.ads.cache;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class s extends fecp implements feeh {
    public static final s a;
    private static volatile feen h;
    public int b;
    public m d;
    public r e;
    public q f;
    public String c = "";
    public String g = "";

    static {
        s sVar = new s();
        a = sVar;
        fecp.J(s.class, sVar);
    }

    private s() {
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
            return new feer(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new s();
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
        feen feenVar2 = h;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (s.class) {
            feenVar = h;
            if (feenVar == null) {
                feenVar = new feck(a);
                h = feenVar;
            }
        }
        return feenVar;
    }
}
