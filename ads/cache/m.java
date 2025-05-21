package com.google.android.gms.ads.cache;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m extends fecp implements feeh {
    public static final m a;
    private static volatile feen f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        m mVar = new m();
        a = mVar;
        fecp.J(m.class, mVar);
    }

    private m() {
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
            return new feer(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "e"});
        }
        if (i2 == 3) {
            return new m();
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
        feen feenVar2 = f;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (m.class) {
            feenVar = f;
            if (feenVar == null) {
                feenVar = new feck(a);
                f = feenVar;
            }
        }
        return feenVar;
    }
}
