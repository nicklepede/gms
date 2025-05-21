package com.google.android.gms.wallet.dynamite.logging;

import defpackage.fecj;
import defpackage.fecp;
import defpackage.fffd;
import defpackage.fffh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class c {
    public static void a(a aVar, int i, int i2, String str) {
        fecj v = fffh.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fffh fffhVar = (fffh) v.b;
        fffhVar.e = 5;
        fffhVar.b |= 1;
        fecj v2 = fffd.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        fffd fffdVar = (fffd) fecpVar;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        fffdVar.c = i3;
        fffdVar.b |= 2;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        fffd fffdVar2 = (fffd) fecpVar2;
        fffdVar2.d = i2 - 1;
        fffdVar2.b |= 4;
        if (str != null) {
            if (!fecpVar2.L()) {
                v2.U();
            }
            fffd fffdVar3 = (fffd) v2.b;
            fffdVar3.b |= 8;
            fffdVar3.e = str;
        }
        fffd fffdVar4 = (fffd) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fffh fffhVar2 = (fffh) v.b;
        fffdVar4.getClass();
        fffhVar2.d = fffdVar4;
        fffhVar2.c = 5;
        aVar.a(v);
    }

    public static void b(a aVar, int i, String str) {
        fecj v = fffh.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fffh fffhVar = (fffh) v.b;
        fffhVar.e = 4;
        fffhVar.b |= 1;
        fecj v2 = fffd.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        fffd fffdVar = (fffd) fecpVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        fffdVar.c = i2;
        fffdVar.b |= 2;
        if (str != null) {
            if (!fecpVar.L()) {
                v2.U();
            }
            fffd fffdVar2 = (fffd) v2.b;
            fffdVar2.b |= 8;
            fffdVar2.e = str;
        }
        fffd fffdVar3 = (fffd) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fffh fffhVar2 = (fffh) v.b;
        fffdVar3.getClass();
        fffhVar2.d = fffdVar3;
        fffhVar2.c = 5;
        aVar.a(v);
    }

    public static void c(a aVar, int i) {
        a(aVar, 2, i, null);
    }
}
