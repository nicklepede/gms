package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhst;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CheckInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhst();
    public final byte[][] a;

    public CheckInResponse(byte[][] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.A(parcel, 1, this.a);
        arxc.c(parcel, a);
    }
}
