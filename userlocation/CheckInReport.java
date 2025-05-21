package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.dhss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CheckInReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhss();
    public final long a;
    public final String b;
    public final Position c;
    public final int d;
    public final byte[] e;
    public final byte[][] f;

    public CheckInReport(long j, String str, Position position, int i, byte[] bArr, byte[][] bArr2) {
        arwm.s(str);
        this.a = j;
        this.b = str;
        this.c = position;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 5, this.d);
        arxc.i(parcel, 6, this.e, false);
        arxc.A(parcel, 7, this.f);
        arxc.c(parcel, a);
    }
}
