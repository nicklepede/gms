package com.google.android.gms.ads.cache;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m extends fgri implements fgta {
    public static final m a;
    private static volatile fgtg f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        m mVar = new m();
        a = mVar;
        fgri.J(m.class, mVar);
    }

    private m() {
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
            return new fgtk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "e"});
        }
        if (i2 == 3) {
            return new m();
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
        fgtg fgtgVar2 = f;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (m.class) {
            fgtgVar = f;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                f = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
