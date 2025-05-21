package com.google.android.gms.ads.nonagon.util.logging.cui;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.fecr;
import defpackage.fedb;
import defpackage.fedu;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class p extends fecp implements feeh {
    public static final p a;
    private static volatile feen y;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public int f;
    public String g;
    public String h;
    public String i;
    public int j;
    public fedb k;
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
        fecp.J(p.class, pVar);
    }

    private p() {
        fecr fecrVar = fecr.a;
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = fedu.a;
        this.p = "";
        this.q = "";
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = "";
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
            return new feer(a, "\u0004\u0017\u0000\u0000\u0001/\u0017\u0000\u0001\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0019%\"\u0002/\f", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "k", "e", "x"});
        }
        if (i2 == 3) {
            return new p();
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
        feen feenVar2 = y;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (p.class) {
            feenVar = y;
            if (feenVar == null) {
                feenVar = new feck(a);
                y = feenVar;
            }
        }
        return feenVar;
    }
}
