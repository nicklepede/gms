package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgrk;
import defpackage.fgru;
import defpackage.fgsn;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class p extends fgri implements fgta {
    public static final p a;
    private static volatile fgtg y;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public int f;
    public String g;
    public String h;
    public String i;
    public int j;
    public fgru k;
    public int l;
    public int m;
    public long n;
    public int o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public int x;

    static {
        p pVar = new p();
        a = pVar;
        fgri.J(p.class, pVar);
    }

    private p() {
        fgrk fgrkVar = fgrk.a;
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = fgsn.a;
        this.p = "";
        this.q = "";
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = "";
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
            return new fgtk(a, "\u0004\u0017\u0000\u0000\u0001/\u0017\u0000\u0001\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0019%\"\u0002/\f", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "k", "e", "x"});
        }
        if (i2 == 3) {
            return new p();
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
        fgtg fgtgVar2 = y;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (p.class) {
            fgtgVar = y;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                y = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
