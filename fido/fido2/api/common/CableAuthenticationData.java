package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbsu;
import defpackage.feay;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbsu();
    public final long a;
    private final feay b;
    private final feay c;
    private final feay d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        arwm.s(bArr);
        feay w = feay.w(bArr);
        arwm.s(bArr2);
        feay w2 = feay.w(bArr2);
        arwm.s(bArr3);
        feay w3 = feay.w(bArr3);
        this.a = j;
        this.b = w;
        this.c = w2;
        this.d = w3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationData)) {
            return false;
        }
        CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
        return this.a == cableAuthenticationData.a && arwb.b(this.b, cableAuthenticationData.b) && arwb.b(this.c, cableAuthenticationData.c) && arwb.b(this.d, cableAuthenticationData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.i(parcel, 2, this.b.M(), false);
        arxc.i(parcel, 3, this.c.M(), false);
        arxc.i(parcel, 4, this.d.M(), false);
        arxc.c(parcel, a);
    }
}
