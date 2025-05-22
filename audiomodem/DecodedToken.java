package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.whi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DecodedToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new whi();
    public final byte[] a;
    public final int b;

    public DecodedToken(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, bArr, false);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
