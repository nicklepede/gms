package com.google.android.gms.ads.cache;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtj;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class q extends fgri implements fgta {
    public static final q a;
    private static volatile fgtg k;
    public int b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public int h;
    public int j;
    public fgsa c = fgtj.a;
    public long i = -1;

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
            return new fgtk(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဇ\u0003\u0006င\u0004\u0007ဂ\u0005\b᠌\u0006", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, p.class, "d", "e", "f", "g", "h", "i", "j", n.a});
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
        fgtg fgtgVar2 = k;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (q.class) {
            fgtgVar = k;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                k = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
