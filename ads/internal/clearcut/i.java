package com.google.android.gms.ads.internal.clearcut;

import defpackage.fecj;
import defpackage.feck;
import defpackage.fecp;
import defpackage.fedb;
import defpackage.fedu;
import defpackage.feeh;
import defpackage.feen;
import defpackage.feer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i extends fecp implements feeh {
    public static final i a;
    private static volatile feen g;
    public int b;
    public String c = "";
    public fedb d = fedu.a;
    public j e;
    public h f;

    static {
        i iVar = new i();
        a = iVar;
        fecp.J(i.class, iVar);
    }

    private i() {
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
            return new feer(a, "\u0004\u0004\u0000\u0001\n\u0015\u0004\u0000\u0001\u0000\nဈ\u0001\u000e\u0015\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"b", com.google.android.gms.wallet.dynamite.util.c.a, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new i();
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
        feen feenVar2 = g;
        if (feenVar2 != null) {
            return feenVar2;
        }
        synchronized (i.class) {
            feenVar = g;
            if (feenVar == null) {
                feenVar = new feck(a);
                g = feenVar;
            }
        }
        return feenVar;
    }
}
