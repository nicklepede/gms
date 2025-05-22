package com.google.android.gms.wallet.dynamite.logging;

import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhub;
import defpackage.fhuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class c {
    public static void a(a aVar, int i, int i2, String str) {
        fgrc v = fhuf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fhuf fhufVar = (fhuf) v.b;
        fhufVar.e = 5;
        fhufVar.b |= 1;
        fgrc v2 = fhub.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        fhub fhubVar = (fhub) fgriVar;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        fhubVar.c = i3;
        fhubVar.b |= 2;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        fhub fhubVar2 = (fhub) fgriVar2;
        fhubVar2.d = i2 - 1;
        fhubVar2.b |= 4;
        if (str != null) {
            if (!fgriVar2.L()) {
                v2.U();
            }
            fhub fhubVar3 = (fhub) v2.b;
            fhubVar3.b |= 8;
            fhubVar3.e = str;
        }
        fhub fhubVar4 = (fhub) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fhuf fhufVar2 = (fhuf) v.b;
        fhubVar4.getClass();
        fhufVar2.d = fhubVar4;
        fhufVar2.c = 5;
        aVar.a(v);
    }

    public static void b(a aVar, int i, String str) {
        fgrc v = fhuf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fhuf fhufVar = (fhuf) v.b;
        fhufVar.e = 4;
        fhufVar.b |= 1;
        fgrc v2 = fhub.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        fhub fhubVar = (fhub) fgriVar;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        fhubVar.c = i2;
        fhubVar.b |= 2;
        if (str != null) {
            if (!fgriVar.L()) {
                v2.U();
            }
            fhub fhubVar2 = (fhub) v2.b;
            fhubVar2.b |= 8;
            fhubVar2.e = str;
        }
        fhub fhubVar3 = (fhub) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fhuf fhufVar2 = (fhuf) v.b;
        fhubVar3.getClass();
        fhufVar2.d = fhubVar3;
        fhufVar2.c = 5;
        aVar.a(v);
    }

    public static void c(a aVar, int i) {
        a(aVar, 2, i, null);
    }
}
