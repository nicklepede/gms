package com.google.android.gms.backup.common.util.session;

import android.os.Parcelable;
import defpackage.euyc;
import defpackage.euym;
import defpackage.euyn;
import defpackage.evmr;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.wij;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class ParcelableSession implements Parcelable {
    public static ParcelableSession b() {
        fgrc v = euyc.a.v();
        fgrc v2 = euym.a.v();
        euyn a = wij.a();
        if (!v2.b.L()) {
            v2.U();
        }
        euym euymVar = (euym) v2.b;
        a.getClass();
        euymVar.c = a;
        euymVar.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        euyc euycVar = (euyc) v.b;
        euym euymVar2 = (euym) v2.Q();
        euymVar2.getClass();
        euycVar.c = euymVar2;
        euycVar.b |= 1;
        return new AutoValue_ParcelableSession(((euyc) v.Q()).r());
    }

    protected abstract byte[] a();

    public final evmr c() {
        try {
            byte[] a = a();
            fgri y = fgri.y(evmr.a, a, 0, a.length, fgqp.a());
            fgri.M(y);
            return (evmr) y;
        } catch (fgsd unused) {
            return evmr.a;
        }
    }
}
