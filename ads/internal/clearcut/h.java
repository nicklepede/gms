package com.google.android.gms.ads.internal.clearcut;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtj;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h extends fgri implements fgta {
    public static final h a;
    private static volatile fgtg b;

    static {
        h hVar = new h();
        a = hVar;
        fgri.J(h.class, hVar);
    }

    private h() {
        fgtj fgtjVar = fgtj.a;
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
            return new fgtk(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new h();
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
        fgtg fgtgVar2 = b;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (h.class) {
            fgtgVar = b;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                b = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
