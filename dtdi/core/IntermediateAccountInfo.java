package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycv;
import defpackage.fvbo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class IntermediateAccountInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycv();
    public final byte[] a;
    public final List b;
    public final byte[] c;

    public IntermediateAccountInfo(byte[] bArr, List list, byte[] bArr2) {
        fvbo.f(bArr, "accountId");
        fvbo.f(list, "supportedIntentActions");
        fvbo.f(bArr2, "additionalMetadata");
        this.a = bArr;
        this.b = list;
        this.c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IntermediateAccountInfo)) {
            return false;
        }
        IntermediateAccountInfo intermediateAccountInfo = (IntermediateAccountInfo) obj;
        return Arrays.equals(this.a, intermediateAccountInfo.a) && fvbo.n(this.b, intermediateAccountInfo.b) && Arrays.equals(this.c, intermediateAccountInfo.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.x(parcel, 3, this.b, false);
        arxc.i(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
