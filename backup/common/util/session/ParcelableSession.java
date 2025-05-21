package com.google.android.gms.backup.common.util.session;

import android.os.Parcelable;
import defpackage.esin;
import defpackage.esix;
import defpackage.esiy;
import defpackage.esxb;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.umk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public abstract class ParcelableSession implements Parcelable {
    public static ParcelableSession b() {
        fecj v = esin.a.v();
        fecj v2 = esix.a.v();
        esiy a = umk.a();
        if (!v2.b.L()) {
            v2.U();
        }
        esix esixVar = (esix) v2.b;
        a.getClass();
        esixVar.c = a;
        esixVar.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        esin esinVar = (esin) v.b;
        esix esixVar2 = (esix) v2.Q();
        esixVar2.getClass();
        esinVar.c = esixVar2;
        esinVar.b |= 1;
        return new AutoValue_ParcelableSession(((esin) v.Q()).r());
    }

    protected abstract byte[] a();

    public final esxb c() {
        try {
            byte[] a = a();
            fecp y = fecp.y(esxb.a, a, 0, a.length, febw.a());
            fecp.M(y);
            return (esxb) y;
        } catch (fedk unused) {
            return esxb.a;
        }
    }
}
