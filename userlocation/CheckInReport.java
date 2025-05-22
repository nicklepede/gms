package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dkea;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CheckInReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkea();
    public final long a;
    public final String b;
    public final Position c;
    public final int d;
    public final byte[] e;
    public final byte[][] f;

    public CheckInReport(long j, String str, Position position, int i, byte[] bArr, byte[][] bArr2) {
        atzb.s(str);
        this.a = j;
        this.b = str;
        this.c = position;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 5, this.d);
        atzr.i(parcel, 6, this.e, false);
        atzr.A(parcel, 7, this.f);
        atzr.c(parcel, a);
    }
}
