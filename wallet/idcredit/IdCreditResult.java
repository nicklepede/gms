package com.google.android.gms.wallet.idcredit;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlct;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IdCreditResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlct();
    public final byte[] a;

    public IdCreditResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }
}
