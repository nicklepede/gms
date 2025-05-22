package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkeb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CheckInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkeb();
    public final byte[][] a;

    public CheckInResponse(byte[][] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.A(parcel, 1, this.a);
        atzr.c(parcel, a);
    }
}
