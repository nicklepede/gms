package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ulj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DecodedToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ulj();
    public final byte[] a;
    public final int b;

    public DecodedToken(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
