package com.google.android.gms.ads.internal.clearcut;

import defpackage.fgrc;
import defpackage.fgrd;
import defpackage.fgri;
import defpackage.fgru;
import defpackage.fgsn;
import defpackage.fgta;
import defpackage.fgtg;
import defpackage.fgtk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i extends fgri implements fgta {
    public static final i a;
    private static volatile fgtg g;
    public int b;
    public String c = "";
    public fgru d = fgsn.a;
    public j e;
    public h f;

    static {
        i iVar = new i();
        a = iVar;
        fgri.J(i.class, iVar);
    }

    private i() {
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
            return new fgtk(a, "\u0004\u0004\u0000\u0001\n\u0015\u0004\u0000\u0001\u0000\nဈ\u0001\u000e\u0015\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new i();
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
        fgtg fgtgVar2 = g;
        if (fgtgVar2 != null) {
            return fgtgVar2;
        }
        synchronized (i.class) {
            fgtgVar = g;
            if (fgtgVar == null) {
                fgtgVar = new fgrd(a);
                g = fgtgVar;
            }
        }
        return fgtgVar;
    }
}
