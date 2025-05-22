package com.google.android.gms.ads.cache;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class s extends fgri implements fgta {
    public static final s a;
    private static volatile fgtg h;
    public int b;
    public m d;
    public r e;
    public q f;
    public String c = "";
    public String g = "";

    static {
        s sVar = new s();
        a = sVar;
        fgri.J(s.class, sVar);
    }

    private s() {
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
            return new fgtk(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new s();
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
        fgtg fgtgVar2 = h;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (s.class) {
            fgtgVar = h;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                h = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
