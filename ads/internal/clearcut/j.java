package com.google.android.gms.ads.internal.clearcut;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class j extends fgri implements fgta {
    public static final j a;
    private static volatile fgtg e;
    public int b;
    public boolean c;
    public int d;

    static {
        j jVar = new j();
        a = jVar;
        fgri.J(j.class, jVar);
    }

    private j() {
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
            return new fgtk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d"});
        }
        if (i2 == 3) {
            return new j();
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
        fgtg fgtgVar2 = e;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (j.class) {
            fgtgVar = e;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                e = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
