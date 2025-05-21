package com.google.android.gms.location.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cacp;
import defpackage.eswq;
import defpackage.esxb;
import defpackage.esys;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SetGoogleLocationAccuracyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cacp();
    public final boolean a;
    public final eswq b;
    public final esys c;
    public final esxb d;

    public SetGoogleLocationAccuracyRequest(boolean z, int i, byte[] bArr, byte[] bArr2) {
        esys esysVar;
        this.a = z;
        eswq b = eswq.b(i);
        arwm.s(b);
        this.b = b;
        esxb esxbVar = null;
        if (bArr != null) {
            try {
                fecp y = fecp.y(esys.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                esysVar = (esys) y;
            } catch (fedk e) {
                throw new BadParcelableException(e);
            }
        } else {
            esysVar = null;
        }
        this.c = esysVar;
        if (bArr2 != null) {
            fecp y2 = fecp.y(esxb.a, bArr2, 0, bArr2.length, febw.a());
            fecp.M(y2);
            esxbVar = (esxb) y2;
        }
        this.d = esxbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.o(parcel, 2, this.b.m);
        esys esysVar = this.c;
        arxc.i(parcel, 3, esysVar == null ? null : esysVar.r(), false);
        esxb esxbVar = this.d;
        arxc.i(parcel, 4, esxbVar != null ? esxbVar.r() : null, false);
        arxc.c(parcel, a);
    }
}
