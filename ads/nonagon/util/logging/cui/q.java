package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class q extends fgri implements fgta {
    public static final q a;
    private static volatile fgtg d;
    public int b;
    public p c;

    static {
        q qVar = new q();
        a = qVar;
        fgri.J(q.class, qVar);
    }

    private q() {
    }

    @Override // defpackage.fgri
    public final Object iQ(int i, Object obj) {
        fgtg fgtgVar;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgtk(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a});
        }
        if (i2 == 3) {
            return new q();
        }
        if (i2 == 4) {
            return new fgrc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        fgtg fgtgVar2 = d;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (q.class) {
            fgtgVar = d;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                d = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
