package com.google.android.gms.ads.nonagon.util.logging.cui;

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
public final class r extends fgri implements fgta {
    public static final r a;
    private static volatile fgtg c;
    public fgsa b = fgtj.a;

    static {
        r rVar = new r();
        a = rVar;
        fgri.J(r.class, rVar);
    }

    private r() {
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
            return new fgtk(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", q.class});
        }
        if (i2 == 3) {
            return new r();
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
        fgtg fgtgVar2 = c;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (r.class) {
            fgtgVar = c;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                c = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
